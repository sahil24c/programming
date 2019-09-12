package com.bridegelabz.datastructures;
import com.bridgelabz.utility.Node;

public class StackLinkedListAnagramPrime <T> {
	private T data;
	private Node<T> next;
	private Node<T> prev;
	private Node<T> top;
	private int size;

	public StackLinkedListAnagramPrime() {
		top = null;
		size = 0;
	}

	boolean isempty() {
		return top == null;
	}

	public int getSize() {
		return size;
	}

	public void push(T data) {
		Node<T> tempNode = new Node<T>(data, null);
		if (top == null) {
			top = tempNode;
		} else {
			tempNode.setNext(top);
			top = tempNode;
		}
		size++;
	}

	public T pop() {
		if (isempty()) {
			System.out.println("no elements");
			return null;
		}
		Node<T> tempNode = top;

		top = tempNode.getNext();
		size--;
		return tempNode.getData();
	}
	public T peek()
	{
		if(isempty())
			return null;
		return top.getData();
	}
}
