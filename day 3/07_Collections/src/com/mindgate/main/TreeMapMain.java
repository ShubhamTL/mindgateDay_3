package com.mindgate.main;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeMapMain {
public static void main(String[] args) {
	SortedMap<Integer, String> employeeMap = new TreeMap<Integer, String>();
	employeeMap.put(101, "Shubham");
	employeeMap.put(103, "Pawan");
	employeeMap.put(105, "Nitin");
	employeeMap.put(102, "Pradip");
	employeeMap.put(104, "Tejes");
	 System.out.println(employeeMap);
}
}
