package com.pradip;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add("pradip");
		al.add("shyam");
		al.add("shivani");
		
		for(Object o:al) {
			System.out.println(o);
		}
	}

}
