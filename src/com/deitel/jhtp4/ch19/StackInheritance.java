package com.deitel.jhtp4.ch19;

public class StackInheritance extends List {
	
	public StackInheritance() {
		super("stack");
	}

	public synchronized void push(Object object) {
		insertAtFront(object);
	}

	public synchronized Object pop() throws EmptyListException {
		return removeFromFront();
	}

}
}
