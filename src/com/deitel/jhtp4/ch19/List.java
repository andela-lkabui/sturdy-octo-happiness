package com.deitel.jhtp4.ch19;

public class List {

	private ListNode firstNode;
	private ListNode lastNode;
	private String name;

	public List (String string) {
		name = string;
		firstNode = lastNode = null;
	}

	public List() {
		this("list");
	}

	public synchronized void insertAtFront(Object insertItem) {
		if ( isEmpty() )
			firstNode = lastNode = new ListNode(insertItem);
		else
			firstNode =  new ListNode(insertItem, firstNode);
	}

	public synchronized void insertAtBack(Object insertItem) {
		if ( isEmpty() )
			firstNode = lastNode = new ListNode(insertItem);
		else
			lastNode = lastNode.nextNode = new ListNode(insertItem);
	}

	public synchronized Object removeFromFront() throws EmptyListException {
		Object removeItem = null;

		if ( isEmpty() ) throw new EmptyListException(name);

		removeItem = firstNode.data;

		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;

		return removeItem;
	}

	public synchronized Object removeFromBack() throws EmptyListException {
		Object removeItem = null;

		if ( isEmpty() )
			throw new EmptyListException(name);

		removeItem = lastNode.data;

		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else {
			ListNode current = firstNode;

			while(current.nextNode != lastNode)
				current = current.nextNode;

			lastNode = current;
			current.nextNode = null;
		}

		return removeItem;
	}

	public synchronized boolean isEmpty() {
		return firstNode == null;
	}

	public synchronized void print() {
		if ( isEmpty() ) {
			System.out.println("Empty " + name);
			return;
		}

		System.out.println("The " + name + " is: ");
		
		ListNode current = firstNode;

		while (current != null) {
			System.out.println(current.data.toString() + " ");
			current = current.nextNode;
		}

		System.out.println("\n");
	}
}
