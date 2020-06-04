/*
 * In mathematics a Subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing 
 * the order of the remaining elements. 
 * 
 * example - [5, 1, 22, 25, 6, -1, 8, 10]
 * 			 [1, 6, -1, 10]
 * 
 * This question gives us two arrays of integers and we are told that they are non-empty. 
 * And we need to write a function to determine whether an second arrray is a subsequence of the first array.
 *
 * Output true or false.
 * 
 */

package com.home.algo;

public class ValidateSubsequence3 {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 5, 1, 22, 25, 6, -1, 8, 10};
		int[] arr2 = new int[] { 1, 6, -1, 10 };

		boolean result = isSubsequence(arr1, arr2);

		System.out.println("Result : " + result);
	}

	public static boolean isSubsequence(int[] inputArr, int[] sequenceArr) {
		
		int inputArrIndx = 0;
		int sequenceArrIndx = 0;
		
		while(inputArrIndx < inputArr.length && sequenceArrIndx < sequenceArr.length) {
			
			if(inputArr[inputArrIndx] == sequenceArr[sequenceArrIndx]) {	
				sequenceArrIndx++;
			}
			
			inputArrIndx++;
		}
		
		return sequenceArrIndx == sequenceArr.length;
		
	}
		
}


/*

Explanation =>

1. We will have only one loop as the sequence array will always be smaller than the main input array.

2. We will then have two pointers, pointing to each of the array

3. We will have a condition on loop to check if any of pointer is greater than the respective array length. 
   If any pointer is greater than the array length that means that array has traversed completely and we can break the loop.
   
4. Inside loop we will check if the sequence array element and input array elements are equal, if yes then only we will increment sequence array 
pointer. And input array pointer will increment in any case.
So basically we will increment sequence array pointer only when there is a match.

5. At the end we check of sequence array pointer is equal to its length, if yes then it means that it was traversed completely and all elements 
are present in input array in order.
 
Solution by me =>

	public static boolean isSubsequence(int[] arr1, int[] arr2) {
	
		int j = 0;
		int i = 0;
	
		while (j < arr1.length) {
	
			if (arr2[i] == arr1[j] && i == arr2.length - 1) {
				return true;
			}
			else if(arr2[i] == arr1[j]){
				i++;
			}
	
			j++;
		}
	
		return false;
	}

*/


