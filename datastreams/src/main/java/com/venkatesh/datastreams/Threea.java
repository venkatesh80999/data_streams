package com.venkatesh.datastreams;
import java.util.*;
import java.util.stream.Collectors;

public class Threea {
	public static List<Object> search(List<String> list){
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String>list1 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list1.add(in.nextLine());
		}
		System.out.println(search(list1));
		in.close();
	}

}

