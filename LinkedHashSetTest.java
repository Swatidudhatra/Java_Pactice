package com.Practice.Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;


public class LinkedHashSetTest {

	public static void main(String[] args) {
		
Set<Integer> s1= new HashSet<>();
	s1.add(1);
	s1.add(2);
	s1.add(3);
	s1.add(4);
	s1.add(5);
	s1.add(6);
	s1.add(7);
	
	Set<Integer> s2 = new HashSet();
	Set<Integer> s3 = new HashSet(s1);
	Set<Integer> s1Unions2 = new HashSet(s1);

	Set<Integer> s1Intersections2 = new HashSet(s1);
	Set<Integer> s1Differences2 = new HashSet(s1);
	s2.add(1);
	s2.add(2);
	
	s2.add(3);
//	s2.add(8);
	//s2.add(9);
	//s2.add(10);
	//s2.add(11);
	//s2.add(12);
	
	System.out.println("Elements in the set 1 are:" + s1);
	System.out.println("Size of the set 1 is:" + s1.size());

	System.out.println("Elements in the set 2 are:" + s2);
	System.out.println("Is set 1 equals set 2:" + s1.equals(s2));
	
	s1Unions2.addAll(s2);
	System.out.println("Union of set 1 & set 2 is:" + s1Unions2);
	
	s1Intersections2.retainAll(s2);
	System.out.println("Intersection of set 1 & set 2 is:" + s1Intersections2);

	s1Differences2.removeAll(s2);
	System.out.println("Difference of set 1 & set 2 is:" + s1Differences2);

	System.out.println("Is set 2 is subset of  set12:" + s1.containsAll(s2));

		
		
		
			

	}

}
