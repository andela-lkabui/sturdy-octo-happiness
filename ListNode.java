package com.deitel.jhtp4.ch19;

class ListNode {
	
	Object data;
	ListNode nextNode;

	ListNode(Object object) {
		this(object, null);
	}

	ListNode(Object object, ListNode node) {
		data = object;
		nextNode = node;
	}

	Object getObject() {
		return data;
	}

	ListNode getNext() {
		return nextNode;
	}
}
