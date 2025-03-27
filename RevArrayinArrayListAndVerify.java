package project;

import java.util.ArrayList;

public class RevArrayinArrayListAndVerify {

	public static void main(String[] args) {
		char arr1[]= {'A','B','C','D'};
		ArrayList <Character> al=new ArrayList<>();
		for(int i=arr1.length-1;i>=0;i--) {
			al.add(arr1[i]);
		}
	
		System.out.println(al);
		boolean isreverse=true;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=al.get(al.size()-1-i)) {
				isreverse=false;
			}
		}
		if(isreverse) {
			System.out.println("Yes the Arraylist is reversed");
		}
		else {
			System.out.println("Not Reversed");
		}
		}

	}


