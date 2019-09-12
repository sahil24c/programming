package com.bridgelabz.utility;

public class dequeOp {
	 int front;
	 int rear;
	 int size;
	int arr[];
	private int capacity;

	public void Queue(int qsize)
	{
		System.out.println("size " +qsize);
		this.capacity = qsize;
		front = -1;
		rear = -1;
		arr = new int[this.capacity];
	}

	boolean isfull()
	{    boolean status = false;
	System.out.println("capacity "+ capacity);
	if((front== 0 && rear == capacity-1 )|| front == rear+1) {
		status = true;
	}
	return status;
	}
	
	boolean isempty()
	{    boolean status = false;
	if(front==-1) {

		status = true;
	}
	return status;
	}
	
	public void insertFront(int item) {
		if (isfull()) {
			System.out.println("queue full");
		}
		if (isempty())
		{
			front = 0;
			rear=0;
		}
		else if(front==0)
		{
			front = capacity-1;
		}
		else
			front = front-1;
		arr[front]=item;
		size++;
	}
	public void insertRear(int item)
	{
		if(isfull())
		{
			System.out.println("queue full");
		}
		if(front == -1)
		{
			System.out.println("1st time");
			front=0;
			rear=0;
		}
		else if(rear == capacity-1)
		{
			System.out.println("rear at last");
			rear = 0;
		}
		else 
			{rear= rear+1;
			System.out.println("in between");}
		arr[rear]=item;
		System.out.println("position "+rear+ " item "+item+ " in arr "+ arr[rear]);
		
		size++;
		System.out.println("size "+size);
		
	}
	
	public int delFront()
	{
		int item=0;
		item=arr[front];
		if(isempty()){
			System.out.println("stack empty");
		}
		if (front==rear)
		{
			front=-1;
			rear= -1;
		}
		else if (front == size -1) 
             front = 0; 

         else
             front = front+1; 
		size--;
		System.out.println("my item at front "+item);
		return item;
	}
	
	public int delRear()
	{
		int item=0;
		System.out.println("rear "+rear);
		item=arr[rear];
		if(isempty()){
			System.out.println("stack empty");
		}
		if (front==rear)
		{
			front=-1;
			rear= -1;
		}
		else if (rear==0)
		{
			rear = capacity-1;
		}
		else
			rear = rear-1;
		size--;
		return item;
	}
	public void peek()
	{
		System.out.println("value in front "+ arr[front]+" pos "+front+" rear "+rear + " value at rear "+arr[rear]);
	}
	public int size()
	{
		return size;
	}
}



