package com.linklist.deb;

public class LinkList {
	private ListNode head;
	private int length = 0;

	public void insertAtBeginIndex(int data) {
		ListNode node = new ListNode(data);
		node.setNext(head);
		head = node;
		length++;

	}

	public void insertLlast(int data) {
		ListNode node = new ListNode(data);
		ListNode temp1, temp2;
		if (head == null) {
			head = node;
		} else {
			for (temp1 = head; (temp2 = temp1.getNext()) != null; temp1 = temp2) {
			}
			temp1.setNext(node);
		}

		length++;

	}

	public void insertAtPos(int index, int data) {
		ListNode ref = head;
		for (int i = 1; i < index; i++) {
			ref = ref.getNext();
		}
		ListNode node = new ListNode(data);
		node.setNext(ref.getNext());
		ref.setNext(node);
		length++;

	}

	public static void main(String[] args) {
		LinkList obj = new LinkList();
		// obj.insertAtBeginIndex(30);
		obj.insertAtBeginIndex(10);
		obj.insertAtBeginIndex(20);
		obj.insertAtBeginIndex(30);
		obj.insertAtPos(2, 55);
		System.out.println(obj.toString());
	}

	@Override
	public String toString() {
		String data = "[";
		data = data + head.getData();
		ListNode temp = head.getNext();
		while (temp != null) {
			data = data + "-->" + temp.getData();
			temp = temp.getNext();
		}
		return data + "]";
	}

}
