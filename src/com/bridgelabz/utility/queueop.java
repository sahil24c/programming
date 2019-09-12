package com.bridgelabz.utility;

public class queueop {
	static int front;
	static int rear;
	static int size;
	int arr[];
	private int capacity;


	public void Queue(int qsize)
	{
		this.capacity = qsize;
		front = size = 0;
		rear = capacity-1;
		arr = new int[this.capacity];
	}

	boolean isfull()
	{    boolean status = false;
	if(size==this.capacity) {

		status = true;
	}
	return status;
	}
	boolean isempty()
	{    boolean status = false;
	if(size==0) {

		status = true;
	}
	return status;
	}
	public void enqueue(int item) {
		if (isfull()) {
			System.out.println("stack full");
		} else {
			rear = (rear + 1) % capacity;
			arr[rear] = item;
			size = size + 1;
		}
	}
	public int dequeue()
	{
		int item=0;
		if(isempty()){
			System.out.println("stack empty");
		}
		else
		{
			item = arr[front];
			front = (front+1)%capacity;
			size = size-1;
		}
		return item;
	}
	public void peek()
	{
		System.out.println("cash in front "+ arr[front]);
	}
}



