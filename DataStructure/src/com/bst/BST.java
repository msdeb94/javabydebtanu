package com.bst;

public class BST {
	private BSTNode rootnode;

	public BST() {
		rootnode = null;
	}

	private void insert(int data) {
		rootnode = insert(rootnode, data);
	}

	private BSTNode insert(BSTNode node, int data) {
		if (node == null) {
			node = new BSTNode(data);
		} else if (data <= node.getData()) {
			node.left = insert(node.left, data);
		} else {
			node.right = insert(node.right, data);
		}
		return node;
	}

	private boolean search(BSTNode r, int data) {
		boolean found = false;
		while (r != null && !found) {
			int val = r.getData();
			if (val > data) {
				r = r.right;
			} else if (val < data) {
				r = r.left;
			} else {
				found = true;
				break;
			}
		}
		return found;
	}
}
