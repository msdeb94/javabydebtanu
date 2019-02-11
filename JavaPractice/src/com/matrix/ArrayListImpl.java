package com.matrix;

import java.util.Arrays;

public class ArrayListImpl {
	private Object arr[];
	private int actSize;

	public ArrayListImpl() {
		arr = new Object[10];
	}

	public Object get(int index) {
		if (index < actSize) {
			return arr[index];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void add(Object obj) {
		if (arr.length - actSize <= 5) {
			increaseListSize();
		}
		arr[actSize++] = obj;
	}

	public Object remove(int index) {
		if (actSize > index) {
			int temp = index;
			Object obj = arr[index];
			obj = null;
			while (temp < actSize) {
				arr[temp] = arr[temp + 1];
				arr[temp + 1] = null;
				temp++;
			}
			actSize--;
			return obj;
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	private void increaseListSize() {
		try {
			arr = Arrays.copyOf(arr, arr.length * 2);
		} catch (Exception e) {
			try {
			} catch (Exception e1) {
			}
		}
	}
}
