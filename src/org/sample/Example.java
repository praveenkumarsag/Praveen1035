package org.sample;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		List<Object> li= new ArrayList<Object>();
		li.add(10);
		li.add(120);
		li.add(130);
		li.add(180);
		li.add(150);
		li.add(160);
		li.add(399);
		li.add("jgdyg");
		for (int i = 0; i < li.size(); i++) {
			for (int j = 0; j < args.length; j++) {
				System.out.println(li);
			}	
	}
}
}
