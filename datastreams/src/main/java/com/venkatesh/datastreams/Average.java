package com.venkatesh.datastreams;

import java.util.*;

public class Average {
	public static double average(List<Integer> list){
		return list.stream().mapToInt(i -> i).average().getAsDouble();
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			list1.add(in.nextInt());
		}
		double res=average(list1);
		System.out.println(res);
		in.close();

	}

}
