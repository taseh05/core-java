package com.tahaseen.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionCls {
	public void Demo() {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1, 2);
		
		Iterator<Integer> iterator = numbers.iterator(); //Iterable interface method
		System.out.println("Using Iterator method");
		while(iterator.hasNext()) {
			int num = iterator.next();
			System.out.println(num + " ");
		}
		
		System.out.println("Using forEach method");
		numbers.forEach(val-> System.out.println(val));//Iterable interface method
	}

}
