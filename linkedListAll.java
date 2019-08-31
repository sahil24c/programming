package com.bridgelabz.utility;
import java.util.HashMap;

import com.bridgelabz.utility.LinkedListInsertion.Node;
public class linkedListAll<T> {
	static class Node
    {
        String data;
        Node next;
        Node(String d)
        {data=d;}
    }
	private Node <T> first;
	private Node<T> last;

	public boolean isEmpty(){
		return first==null;
	}
	public void add(T t) {

		Node<T> nd = new Node<T>();
		nd.setValue(t);
		if (first == null) {
			first = nd;
			last = nd;
		} else {
			last.setNextRef(nd);
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
			if(tmp.getValue()!=null)
			{
				System.out.println(tmp.getValue());
				i++;
			}
			tmp = tmp.getNextRef();
		}
		return i;
	}
	public void clear() {

		Node<T> tmp = first;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				tmp.setValue(null);
			}
			tmp = tmp.getNextRef();
		}
	}
	public void printNew() {

		Node<T> tmp = first;
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				System.out.print(tmp.getValue()+" ");
			}
			tmp = tmp.getNextRef();
		}
	}
	public linkedListAll<Integer> getValue() {

		Node<T> tmp = first;
		linkedListAll<Integer> node=new linkedListAll<Integer>();
		while (true) {
			if (tmp == null) {
				break;
			}
			if(tmp.getValue()!=null)
			{
				node.add((Integer) tmp.getValue());
			}
			tmp = tmp.getNextRef();
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
			if(tmp.getValue()!=null)
			{
				i++;
			}
			tmp = tmp.getNextRef();
		}
		return i;
	}

	public boolean printValue(int length, String key, linkedListAll<String> li) {
		Node<T> nd2 = first;
		while (true) {
			if (nd2 == null) {
				break;
			}
			if (key.compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) {
				//					int index=li.index(key);
				//					li.remove(index);
				nd2.setValue(null);
				return true;
			} 
			nd2 = nd2.getNextRef();
		}
		li.add(key);
		li.print();
		return false;
	}
	public int index(T data){
		Node<T> curr=first;
		int count=0;
		while(curr!=null){
			if((String.valueOf(curr.getValue())).compareToIgnoreCase(String.valueOf(data))==0){
				curr.getNextRef();
				return count;
			}
			count++;
			curr=curr.getNextRef();
		}
		assert(false);
		return 0;
	}

	public void remove(int index){
		if(isEmpty())
			return;
		Node<T> temp=first;
		if(index==0){
			first=temp.getNextRef();
			return;
		}
		for(int i=0;temp!=null && i<index-1;i++){
			temp=temp.getNextRef();
		}
		if (temp == null || temp.getNextRef() == null) 
			return; 
		@SuppressWarnings("unused")
		Node<T> next = temp.getNextRef().getNextRef(); 

		next=temp.getNextRef();
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
			if(nd2.getValue()!=null)
			{
				arr[i++]=(int) nd2.getValue();
				//					i++;
			}
			nd2 = nd2.getNextRef();
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
			if (String.valueOf(key).compareToIgnoreCase(String.valueOf(nd2.getValue())) == 0) 
			{
				nd2.setValue(null);
				return true;
			} 
			nd2 = nd2.getNextRef();
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
		while(temp.getNextRef()!=null){
			if( String.valueOf(key).compareToIgnoreCase(String.valueOf(temp.getValue())) == 0){
				return true;
			}
			temp=temp.getNextRef();
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
			if(nd2.getValue()!=null)
			{
				str[i++]=(String) nd2.getValue();
				//					i++;
			}
			nd2 = nd2.getNextRef();
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
			if(nd2.getValue()!=null)
			{
				str[i++]=(Integer) nd2.getValue();
				//					i++;
			}
			nd2 = nd2.getNextRef();
		}
		return str;
	}}
