package com.home.main;

import com.home.algo.TwoNumberSum1;

public class Main {

	public static void main(String[] args) {

		TwoNumberSum1 twoNumberSum = new TwoNumberSum1();

		int[] inputArr = new int[]{3, 5, -4, 8, 11, 1, -1, 6};
		int targetSum = 10;
		
		int[] resultArr = twoNumberSum.findTwoNumbers(inputArr, targetSum);
		
		
		for(int i=0; i<resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
