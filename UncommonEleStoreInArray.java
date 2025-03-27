package project;

import java.util.Arrays;

public class UncommonEleStoreInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4};
		int arr2[]= {4,5,6,7};
		int arr3[]=new int[arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++) {
			boolean uncom=true;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					uncom=false;
				}}
			if(uncom) {
				arr3[k++]=arr1[i];
			
			}
		}
		for(int i=0;i<arr2.length;i++) {
			boolean uncom=true;
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr2[j]) {
					uncom=false;
				}}
				if(uncom) {
					arr3[k++]=arr2[i];
				}
			
		}
		int[] uncom1 = Arrays.copyOf(arr3, k);
		System.out.print(Arrays.toString(uncom1));

	}

}
