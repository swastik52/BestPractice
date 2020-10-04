package com.swastik;

/*
 * Swastik Binarytree Even Node Sum of node values
 */

public class BinarytreeEvenNodeSum {
	
	Node root; 

	// Tree Node 
	static class Node { 
		int data; 
		Node left, right; 
		Node(int data) 
		{ 
			this.data = data; 
			this.left = null; 
			this.right = null; 
		} 
	} 
	// Function to insert nodes in level order 
	public Node insertLevelOrder(int[] arr, Node root, 
												int i) 
	{ 
		// Base case for recursion 
		if (i < arr.length) { 
			Node temp = new Node(arr[i]); 
			root = temp; 

			// insert left child 
			root.left = insertLevelOrder(arr, root.left, 
											2 * i + 1 ); 
			// insert right child 
			root.right = insertLevelOrder(arr, root.right, 
											2 * i + 2); 
		} 
		return root; 
	} 
	// Function to print tree nodes in InOrder fashion 
	public void inOrder(Node root) 
	{ 
		if (root != null) { 
			inOrder(root.left); 
			System.out.print(root.data + " "); 
			inOrder(root.right); 
		} 
	} 
	private int countEven(Node root){

          if (root == null)
            return 0;
        
          int val = (root.data%2==1) ? 0 : 1;
        
          return val + countEven(root.left) + countEven(root.right);
    }
	// Driver program to test above function 
	public static void main(String args[]) 
	{ 
		BinarytreeEvenNodeSum t2 = new BinarytreeEvenNodeSum(); 
		int arr[] = { 1, 2, 3, 4, 5 }; 
		t2.root = t2.insertLevelOrder(arr, t2.root, 0); 
		t2.inOrder(t2.root); 
		System.out.println();
		System.out.println(t2.countEven(t2.root)); 
	} 
}
