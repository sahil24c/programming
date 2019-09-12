package com.bridgelabz.utility;
import java.util.HashMap;
import com.bridgelabz.utility.Node;
public class linkedListAll<T> {
	private Node <T> first;
	private Node<T> last;
	
	linkedListAll()
    {
        T data;
        Node next;
        
        Node (<T> d)
        {
        	data=d;
        }
    }


	public boolean isEmpty(){
		return first==null;
	}
	public void add(T t) {

		Node<T> nd = new Node<T>();
		nd.setData(t);
		if (first == null) {
			first = nd;
			last = nd;
		} else {
			last.setNext(nd);
			last = nd;
		}
	}

	public int print() {

		Node<T> tmp = first;
		int i = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getData()!=null)
			{
				System.out.println(tmp.getData());
				i++;
			}
			tmp = tmp.getNext();
		}
		return i;
	}
	public void clear() {

		Node<T> tmp = first;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getData()!=null)
			{
				tmp.setData(null);
			}
			tmp = tmp.getNext();
		}
	}
	public void printNew() {

		Node<T> tmp = first;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getData()!=null)
			{
				System.out.print(tmp.getData()+" ");
			}
			tmp = tmp.getNext();
		}
	}
	public linkedListAll<Integer> getValue() {

		Node<T> tmp = first;
		linkedListAll<Integer> node=new linkedListAll<Integer>();
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getData()!=null)
			{
				node.add((Integer) tmp.getData());
			}
			tmp = tmp.getNext();
		}
		return node;
	}
	public int size() {

		Node<T> tmp = first;
		int i = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getData()!=null)
			{
				i++;
			}
			tmp = tmp.getNext();
		}
		return i;
	}

	public boolean printValue(int length, String key, linkedListAll<String> li) {
		Node<T> nd2 = first;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if (key.compareToIgnoreCase(String.valueOf(nd2.getData())) == 0) {
				//					int index=li.index(key);
				//					li.remove(index);
				nd2.setData(null);
				return true;
			} 
			nd2 = nd2.getNext();
		}
		li.add(key);
		li.print();
		return false;
	}
	public int index(T data){
		Node<T> curr=first;
		int count=0;
		while(curr!=null){
			if((String.valueOf(curr.getData())).compareToIgnoreCase(String.valueOf(data))==0){
				curr.getNext();
				return count;
			}
			count++;
			curr=curr.getNext();
		}
		assert(false);
		return 0;
	}

	public void remove(int index){
		if(isEmpty())
			return;
		Node<T> temp=first;
		if(index==0){
			first=temp.getNext();
			return;
		}
		for(int i=0;temp!=null && i<index-1;i++){
			temp=temp.getNext();
		}
		if (temp == null || temp.getNext() == null) 
			return; 
		@SuppressWarnings("unused")
		Node<T> next = temp.getNext().getNext(); 

		next=temp.getNext();
	}
	public int [] convInteger(linkedListAll<Integer> li,int len)
	{
		Node<Integer> nd2 = li.first;
		int [] arr=new int[len];
		int i=0;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if(nd2.getData()!=null)
			{
				arr[i++]=(int) nd2.getData();
				//					i++;
			}
			nd2 = nd2.getNext();
		}
		return arr;
	}

	public int[] sortArray(int [] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j]>key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	public boolean findIntegerValue(int length, int key, linkedListAll<Integer> li2) {
		Node<T> nd2 = first;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if (String.valueOf(key).compareToIgnoreCase(String.valueOf(nd2.getData())) == 0) 
			{
				nd2.setData(null);
				return true;
			} 
			nd2 = nd2.getNext();
		}
		li2.add(key);
		length=li2.size();
		int [] arr=li2.convInteger(li2,length);
		int [] arr2=li2.sortArray(arr);
		System.out.println("after sorting:");
		li2.clear();
		for(int i:arr2)
		{
			li2.add(i);
		}
		return false;

	}
	public boolean search(T key){
		Node<T> temp=first;
		while(temp.getNext()!=null){
			if( String.valueOf(key).compareToIgnoreCase(String.valueOf(temp.getData())) == 0){
				return true;
			}
			temp=temp.getNext();
		}
		return false;
	}

	public String [] convString(linkedListAll<T> li,int len)
	{
		Node<T> nd2 = li.first;
		String [] str=new String[len];
		int i=0;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if(nd2.getData()!=null)
			{
				str[i++]=(String) nd2.getData();
				//					i++;
			}
			nd2 = nd2.getNext();
		}
		return str;
	}
	public int [] convertInt(linkedListAll<Integer> li,int len)
	{
		Node<Integer> nd2 = li.first;
		int [] str=new int[len];
		int i=0;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if(nd2.getData()!=null)
			{
				str[i++]=(Integer) nd2.getData();
				//					i++;
			}
			nd2 = nd2.getNext();
		}
		return str;
	}}
