package com.mindgate.pojo;

import java.util.List;

public class ArrayListDemo {
	private List<String> nameList;
	private int arrayLoistId;

	public ArrayListDemo() {
	}

	public ArrayListDemo(List<String> nameList, int arrayLoistId) {
		super();
		this.nameList = nameList;
		this.arrayLoistId = arrayLoistId;
	}

	public List<String> getNameList() {
		return nameList;
	}

	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}

	public int getArrayLoistId() {
		return arrayLoistId;
	}

	public void setArrayLoistId(int arrayLoistId) {
		this.arrayLoistId = arrayLoistId;
	}

	@Override
	public String toString() {
		return "ArrayListDemo [nameList=" + nameList + ", arrayLoistId=" + arrayLoistId + "]";
	}

}
