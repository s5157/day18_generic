package day18_generic;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(1000);
		arr.add("aaa");
		arr.add(1.111);
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
	}

}
