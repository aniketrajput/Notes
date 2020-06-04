/*
 You are given a BST data structure consisting of BST nodes. 
 Each BST node has an integer value stored in a property called "value" and two children nodes stored in properties called "left" and "right" respectively.
 A node us said to be a BST node if and only if it satisfies the BST property:
 its value is strictly greater than the values of every node to its left;
 its value is less than or equal to the values of every node to its right;
 and both of its children nodes are either BST nodes themselves or Node(null) values.
 You are also given a target integer value; write a function that finds the closest value to that target value contained in the BST. 
 Assume that there will only be one closest value. 
 
 Sample Input:
 
 			10			, 12
 		   /  \
 		  5    15
 		 / \   / \
 		2   5 13  22
 	   / 		\
 	  1         14
 
 Sample Output: 13
 
 Logic - 
 
1. We will start with root node (r). 
 
2. Declare a variable 'closest' which will hold the closest value. Initialize closest = infinity;
 
3. Check => 
			r - target < closest - r		
	
	If this is true then closest = r
	
4. Check =>
			r < target ? ignore the entire left sub-tree, because it will make the difference bigger : ignore the entire right sub-tree because it will make differenc bigger

5. Continue till we get the leaf node.

6. While traversing if we get r - target == 0, then we can straight away return r as this would mean r and target are same.

 */

/* 
 * In order => Ascending/Sorted Order
 * 
 * 
 * */

package com.home.algo;

public class ClosestValueInBST2 {
 
	// refer the file com.home.bst.BinarySearchTree.java for solution.
	
}
















