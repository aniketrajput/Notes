/*
 Two Number sum
 
 Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. 
 If any two numbers in the input array sum up to the target sum, the function should return them in an array, in sorted order.
 If no two numbers sum up to the target sum, the function should return an empty array. 
 Assume that there will be at most one pair of numbers summing up to the target sum.
 
 Sample input: [3, 5, -4, 8, 11, 1, -1, 6], 10
 Sample Output: [-1, 10]
  
 */

package com.home.algo;

import java.util.Arrays;
import java.util.HashMap;

public class TwoNumberSum1 {

	public int[] findTwoNumbers(int[] inputArr, int targetSum) {
		
		targetSum = 13;
		
		Arrays.sort(inputArr);
		
		int left = 0;
		int right = inputArr.length - 1;
		
		while (left < right) {
			
			int x = inputArr[left];
			int y = inputArr[right];
			
			int sum = x + y;
			
			if(sum == targetSum) {
				return new int[] {x, y};
			}
			else if(sum < targetSum) {
				left++;
			}
			else {
				right--;
			}			
		}
		
		return new int[0];
	}	
}



/*
 
 Solution 1 =>
 
 Same solution as as ours, just little better.
 
 public int[] findTwoNumbers(int[] inputArr, int targetSum) {
		
		for(int i=0; i<inputArr.length; i++) {
			
			int firstNum = inputArr[i];
			
			for(int j=i+1 ; j<inputArr.length; j++) {
				
				int SecondNum = inputArr[j];
				
				if(firstNum + secondNum == targetSum) {
					
					return firstSum > secondSum ? new int[] {secondNum, firstNum} : new int[] {firstNum, secondNum};
				}
			}
		}
		
		return new int[0];
	}	
 
 This solution is not very optimal from time point of view. 
 
 
 Solution 2 - 
 
 Another solution is we can use HaspMap, it might take extra space but it will make out algorithm faster.
 
 we know, 
 
 Input => [3, 5, -4, 8, 11, 1, -1, 6] , 10
 
 Now, x + y = 10
 	  y = 10 - x
 
 We will traverse the input array and consider each element as x.
 
 [3, 5, -4, 8, 11, 1, -1, 6]
 x ------------------------>
 
 While travelling we will check => if y = 10 - x, is present in the HashMap. 
 
 If yes, then we have found out x and y.
 
 If no then we will store the x value in the HashMap, because that x might become y for futher element.
 
 public int[] findTwoNumbers(int[] inputArr, int targetSum) {
		
		HashMap<Integer, Boolean> tempMap = new HashMap<>();
		
		for(int i=0; i<inputArr.length; i++) {
		
			int x = inputArr[i];
			int y = targetSum - x;
			
			if(tempMap.containsKey(Integer.valueOf(y))) {
				return x > y ? new int[] {y, x} : new int[] {x, y};
			}
			else {
				tempMap.put(Integer.valueOf(x), true);
			}		
		}
		
		return new int[0];
	}	
	
	
 Solution 3 - 
 
 We can get the input array sorted first.
 
 Now we can have a left pointer on the first element and right pointer to the last element.
 
 We then add element at left + right and check if the sum is equal to targetSum.
 If yes, then we have found out to elements.
 If no, then we need to check if the sum > targetSum or sum < targetSum
 If sum < targetSum, then we should increment left pointer, as we need more bigger sum.
 If sum > targetSum, then we should increment right pointer, as we need a lesser sum.
 
 public int[] findTwoNumbers(int[] inputArr, int targetSum) {
		
		targetSum = 13;
		
		Arrays.sort(inputArr);
		
		int left = 0;
		int right = inputArr.length - 1;
		
		while (left < right) {
			
			int x = inputArr[left];
			int y = inputArr[right];
			
			int sum = x + y;
			
			if(sum == targetSum) {
				return new int[] {x, y};
			}
			else if(sum < targetSum) {
				left++;
			}
			else {
				right--;
			}			
		}
		
		return new int[0];
	}	
	
 */









