package com.bridgelabz.designpatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.management.RuntimeErrorException;

class EagerInitialization
{
	private static EagerInitialization instance = new EagerInitialization();

	private EagerInitialization() {
		// TODO Auto-generated constructor stub
	}

	public static EagerInitialization getInstance()
	{
		return instance;
	}
}

class StaticBlockInitialization
{
	static StaticBlockInitialization instance ;

	private StaticBlockInitialization()
	{

	}
	static {
		try 
		{
			instance = new StaticBlockInitialization();
		}
		catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}

	}
	static public StaticBlockInitialization getInstance()
	{
		return instance;
	}
}

class LazyInitialization
{
	static LazyInitialization instance;
	private LazyInitialization()
	{

	}
	public static LazyInitialization getInstance()
	{
		if(instance == null)
		{
			instance= new LazyInitialization();
		}
		return instance;

	}
}

class ThreadSafe
{
	static ThreadSafe instance;
	private ThreadSafe()
	{

	}
	public static synchronized ThreadSafe getInstance()
	{
		if(instance == null)
		{
			instance = new ThreadSafe();
		}
		return instance;
	}
}

class BillPugh 
{
	private BillPugh () {}
	private static class SingletonHelper
	{
		private static BillPugh instance = new BillPugh();
	}
	public static BillPugh getInstance()
	{
		return SingletonHelper.instance;
	}
}

enum EnumSingleton
{
	Instance;
	public static EnumSingleton getInstance()
	{
		return Instance;
	}
}


class SerializedSingleton implements Serializable{

   // private static final long serialVersionUID = 60476693201773335L;

    private SerializedSingleton(){}
    
    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }
    
    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    protected Object readResolve() {
        return getInstance();
    }
}

class Reflection
{
	private Reflection()
	{
		if(Helper.instance != null)
		{
			throw new IllegalArgumentException("Creating multiple instances");
		}
	}
	private static class Helper
	{
		private static final Reflection instance = new Reflection();
	}
	public static Reflection getInstance()
	{
		return Helper.instance;
	}
}



public class Singleton {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		EagerInitialization obj1 = EagerInitialization.getInstance();

		StaticBlockInitialization obj2 = StaticBlockInitialization.getInstance();

		LazyInitialization obj3 = LazyInitialization.getInstance();

		ThreadSafe obj4 = ThreadSafe.getInstance();

		BillPugh obj5 = BillPugh.getInstance();
		
		EnumSingleton obj6 = EnumSingleton.getInstance();

		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();

		//deserialize from file to object
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();

		System.out.println("instanceOne hashCode="+instanceOne.hashCode());
		System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
	
		Reflection obj7 = Reflection.getInstance();
		System.out.println(obj7);
		
	/*	Reflection obj8 = null;
		Constructor [] constructors = Reflection.class.getDeclaredConstructors();
		for(Constructor constructor : constructors)
		{
			constructor.setAccessible(true);
			obj8 = (Reflection) constructor.newInstance();
			break;
		}
		*/
	}
}
