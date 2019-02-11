package com.bst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	int count = 0;

	public static void main(String[] args) {
		largestNumber("as12df23");
		
		/*
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		List<Integer> list = Arrays.asList(23, 13, 10, 2, 2);// 7 1110,30 1,10 2 40 5 6
		createSort(list);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) >= 7 && list.get(i) <= 11) {

				count++;
			}
			if (list.get(i) >= 10 && list.get(i) <= 30) {

				count1++;
			}
			if (list.get(i) >= 1 && list.get(i) <= 10) {

				count2++;
			}
			if (list.get(i) >= 2 && list.get(i) <= 40) {

				count3++;
			}
			if (list.get(i) >= 5 && list.get(i) <= 6) {

				count4++;
			}
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);

	*/}
	  public static int largestNumber(String inString){
	        // Implement this function
	        // inString is a string
	        // return the largest number
	       
	        int num=0,res=0,fResult=0;
	        for(char c:inString.toCharArray()){
	            if(Character.isDigit(c))
	            {
	            	System.out.println(c+"------"+(c-'0'));
	               num=num*10+(c-'0');
	               System.out.println("--------->"+num);
	            }else{
	                res=Math.max(res,num);
	                num=0;
	            }
	        }
	       
	        fResult=Math.max(res,num);
	        return fResult;
	    }

	private static void createSort(List<Integer> list) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> res = new ArrayList<>();
		int n = 2;
		for (Integer ref : list) {
			if (ref == 2) {
				list1.add(1);
			} else {
				list2.add(ref);
			}
		}
		res.addAll(list1);
		res.addAll(list2);
		System.out.println(res.toString());
		
		System.out.println();
	}
}
