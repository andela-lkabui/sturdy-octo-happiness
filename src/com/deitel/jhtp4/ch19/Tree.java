package com.deitel.jhtp4.ch19;

public class Tree {

	private TreeNode root;
	
	public Tree() {
		root = null;
	}
	
	public synchronized void insertNode(int insertValue) {
		if (root == null)
			root = new TreeNode(insertValue);
		else
			root.insert(insertValue);
	}
	
	public synchronized void preorderTraversal() {
		preorderHelper(root);
	}

	private void preorderHelper(TreeNode node) {
		if (node == null)
			return;

		System.out.print(node.data + " ");

		preorderHelper(node.leftNode);

		preorderHelper(node.rightNode);
	}

	public synchronized void inorderTraversal() {
		inorderHelper(root);
	}

	private void inorderHelper(TreeNode node) {
		if (node == null)
			return;

		inorderHelper(node.leftNode);

		System.out.print(node.data + " ");
		
		inorderHelper(node.rightNode);
	}

	public synchronized void postorderTraversal() {
		postorderHelper(root);
	}

	private void postorderHelper(TreeNode node) {
		if (node == null)
			return;

		postorderHelper(node.leftNode);

		postorderHelper(node.rightNode);

		System.out.print(node.data + " ");
	}
}

