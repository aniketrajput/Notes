package com.home.bst;

class Node{
	
	int value;
	Node left, right;
}

class BSTMethods{
	
	public static Node createNode(int value) {
		
		Node n = new Node();
		n.value = value;
		n.left = null;
		n.right = null;
		
		return n;
	}	
	
	public static Node insertNode(Node node, int value) {
		
		if(node == null) {
			return createNode(value);
		}
		
		if(value < node.value) {
			node.left = insertNode(node.left, value);
		}
		else {
			node.right = insertNode(node.right, value);			
		}
		
		return node;
	}	
	
	public static void printInOrder(Node node) {
		
		if(node == null) {
			return;
		}
		
		printInOrder(node.left);
		System.out.println(node.value);
		printInOrder(node.right);		
	}
	
	public static int closest = Integer.MAX_VALUE;
	
	public static int findTheClosest(Node node, int target) {
		
		if(node == null) {
			return closest;			
		}
		
		int node_diff = Math.abs(node.value - target);
		int closest_diff = Math.abs(closest - target);
		
		if(closest_diff > node_diff) {
			closest = node.value;
		}
		
		if(target > node.value) {
			findTheClosest(node.right, target);
		}
		else {
			findTheClosest(node.left, target);
		}
		
		return closest;
	}

}


public class BinarySearchTree {
	
	public static void main(String[] args) {
		int[] arr = new int[] { 10, 14, 13, 5, 5, 2, 22, 1, 15 };

		Node root = null;
		
		for(int value : arr) {
			root = BSTMethods.insertNode(root, value);
		}
		
		BSTMethods.printInOrder(root);
		
		int answer = BSTMethods.findTheClosest(root, 9);
		
		System.out.println("Answer : " + answer);
	}
}






