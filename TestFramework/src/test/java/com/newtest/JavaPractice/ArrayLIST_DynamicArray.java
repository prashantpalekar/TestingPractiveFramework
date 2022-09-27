package com.newtest.JavaPractice;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class ArrayLIST_DynamicArray<E> {

	/*
	 * Java ArrayList class uses a dynamic array for storing the elements. It
	 * inherits AbstractList class and implements List interface.
	 * 
	 * The important points about Java ArrayList class are:
	 * 
	 * Java ArrayList class can contain duplicate elements. 
	 * We can store any data type value into ArrayList 
	 * Java ArrayList class maintains insertion order.
	 * Java ArrayList class is non synchronized. 
	 * Java ArrayList allows random access because array works at the index basis.
	 * In Java ArrayList class, manipulation is slow because a lot of shifting needs to be occurred if any element is removed from the array list.
	 */
	@Test
	public void dynamicArray()
	{
		ArrayList ar=new ArrayList<E>();
		ar.add(5);
		ar.add(20); //We can add Int value
		
		System.out.println(ar.size()); //To get Size of Array
		System.out.println(ar.get(1)); //To get Value of Array index
		
		ar.add(20); //We can add Duplicate value
		ar.add("Ashok"); //We can add String value
		ar.add('c'); //We can add char value
		ar.add(12.34); //We can add decimal value
		ar.add(true); //We can add boolean value
		System.out.println(ar.size()); //To get Size of Array
		
		for(int i=0; i<=ar.size()-1; i++)
		{
			System.out.println(ar.get(i));
		}
	}
	public void dynamicArray2()
	{
		ArrayList<Integer> arInt=new ArrayList();
		arInt.add(2);
		//arInt.add("abc");  //If we try to add any dataType value other than Above defined dataTYpe. then it will throw error
	}
	
	
}
