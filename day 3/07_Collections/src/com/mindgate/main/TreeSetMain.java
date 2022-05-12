package com.mindgate.main;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMain {
public static void main(String[] args) {
	SortedSet<String> nameSortedSet = new TreeSet<String>();
	nameSortedSet.add("Shubham");
	nameSortedSet.add("Pawan");
	nameSortedSet.add("Pradip");
	nameSortedSet.add("Yogesh");
	nameSortedSet.add("Tejas");
	nameSortedSet.add("Shubham");
	System.out.println(nameSortedSet);
}
}
