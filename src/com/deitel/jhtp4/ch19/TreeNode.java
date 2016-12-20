package com.deitel.jhtp4.ch19;

public class TreeNode {

	TreeNode leftNode;
	int data;
	TreeNode rightNode;

	public TreeNode(int nodeData) {
		data = nodeData;
		leftNode = rightNode = null;
	}

	public synchronized void insert(int insertValue) {
		if (insertValue < data) {
			if (leftNode == null)
				leftNode = new TreeNode(insertValue);
			else
				leftNode.insert(insertValue);
		} else if (insertValue > data) {
			if (rightNode == null)
				rightNode = new TreeNode(insertValue);
			else
				rightNode.insert(insertValue);
		}
	}
}
