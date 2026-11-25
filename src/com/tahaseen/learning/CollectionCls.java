package com.tahaseen.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Collections;

public class CollectionCls {
	
	public void IterableMethodsDemo(List<Integer> numbers) {
	
		Collections.sort(numbers);
		Iterator<Integer> iterator = numbers.iterator(); //Iterable interface method
		System.out.println("Using Iterator method : sorted list using Collections");
		while(iterator.hasNext()) {
			int num = iterator.next();
			System.out.println(num + " ");
		}
		
		System.out.println("Using forEach method");
		numbers.forEach(val-> System.out.println(val));//Iterable interface method
		
		Collections.reverse(numbers);
		System.out.println("Reversed List:");
		for(Integer num:numbers) {
			System.out.println(num + " ");
		}
		System.out.println("max:" + Collections.max(numbers));
		System.out.println("min:" + Collections.min(numbers));
	}
	
	public void CollectionMethodsDemo(List<Integer> numbers) {
		
		System.out.println("In Collection Methods Demo:");
		
		List<Integer> newList =  new ArrayList<>();
		
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

	public void queueDemo() {
		//Minpriority queue to solve problems of min heap
		PriorityQueue<Integer> minq = new PriorityQueue<>();
		minq.add(5);
		minq.add(2);
		minq.add(8);
		minq.add(1);
		System.out.println("Printing Min Priority Queue Elements:");
		minq.forEach(val->System.out.println(val));
		System.out.println("After Deleting element " + minq.poll());
		minq.forEach(val->System.out.println(val));
		
		//Max priority queue to solve problems of max heap
		PriorityQueue<Integer> maxq = new PriorityQueue<>((a,b)->b-a);
		maxq.add(5);
		maxq.add(2);
		maxq.add(8);
		maxq.add(1);
		System.out.println("Printing Max Priority Queue Elements:");
		maxq.forEach(val->System.out.println(val));
		System.out.println("After Deleting element " + maxq.remove());
		maxq.forEach(val->System.out.println(val));
		
	}
}
