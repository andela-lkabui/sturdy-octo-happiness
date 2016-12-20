package com.deitel.jhtp4.ch19;

public class StackComposition {

	private List stackList;

	public StackComposition() {
		stackList = new List("stack");
	}

	public synchronized Object pop() throws EmptyListException {
		return stackList.removeFromFront();
	}

	public synchronized boolean isEmpty() {
		return stackList.isEmpty();
	}

	public synchronized void print() {
		return stackList.print();
	}
}
