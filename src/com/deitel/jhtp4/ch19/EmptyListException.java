package com.deitel.jhtp4.ch19;

public class EmptyListException extends RuntimeException {

	public EmptyListException(String name) {
		super("The " + name + " is empty");
	}

}
