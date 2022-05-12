package com.mindgate.main;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
public static void main(String[] args) {
	Map<Integer, String> emplyeeMap= new HashMap<Integer, String>();
	
	emplyeeMap.put(101, "Shubham");
	emplyeeMap.put(102, "Pawan");
	emplyeeMap.put(103, "Nitin");
	emplyeeMap.put(104, "Pradip");
	emplyeeMap.put(105, "Yogesh");
	
	System.out.println(emplyeeMap);
}
}
