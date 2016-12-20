package com.deitel.jhtp4.ch19;

public class QueueInheritance extends List {
	
	public QueueInheritance() {
		super("queue");
	}

	public synchronized void enqueue(Object object) {
		insertAtBack(object);
	}

	public synchronized Object dequeue() throws EmptyListException {
		return removeFromFront();
	}
}
