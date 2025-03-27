package project;

import java.util.ArrayList;
import java.util.Arrays;

public class UncommonElementInAnotherList {

	public static void main(String[] args) {
		String arr[]= {"Bharathi","Vasanth","Yoga","Vishnu"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList("Vasanth","Saran","Hari","John","Bharathi"));
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<>();
		for(String s:arr) {
			if(!al.contains(s)) {
				al2.add(s);
			}
		}
		for(String s:al) {
			if(!Arrays.asList(arr).contains(s)) {
				al2.add(s);
			}
		}
		System.out.println(al2);
		
		
		}

	}


