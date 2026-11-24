package com.tahaseen.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CollectionCls {
	
	public void IterableMethodsDemo() {
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
	
	public void CollectionMethodsDemo() {
		System.out.println("In Collection Methods Demo:");
		
		List<Integer> numbers = new ArrayList<>();
		List<Integer> newList =  new ArrayList<>();
		numbers.add(1);
		numbers.add(1, 0);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		if(!numbers.isEmpty() && numbers.size()>0) {
			Iterator<Integer> ite  = numbers.iterator();
			while(ite.hasNext()) {
				newList.add(ite.next());
				if(newList.contains(0)) {
					newList.remove(Integer.valueOf(0));//to remove element 0
//					newList.remove(0); //removes element at index 0
				}
			}
		}
		Iterator<Integer> itr = newList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		
		Stack<Integer> st = new Stack<>();
		st.addAll(numbers);
		
		itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()+ " ");
		}
		if(st.equals(numbers)) {
			System.out.println("stack and list have same elements");
		}
		st.removeAll(numbers);
		if(st.isEmpty()) {
			System.out.println("All elements of list removed from stack");
		}
		
		numbers.clear();
		System.out.println("After clear() size is :"+ numbers.size() );
	}

}
