package com.bst;

public class BSTNode {
	BSTNode left;
	BSTNode right;
	int data;

	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}

	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	public BSTNode getLeft() {
		return left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
