package Practice;

import java.util.ArrayList;

public class CommanEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,5,6,2,4};
		int arr2[]= {4,5,2,8,9};
		//int arr3[]=new int[arr1.length+arr2.length];
		//int k=0;
		ArrayList<Integer> al=new ArrayList<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if (arr1[i]==arr2[j]) {
					al.add(arr1[i]);
					//arr3[k++]=arr1[i];
					//System.out.print(arr1[i]+" ");
				}
			}
		}
		System.out.println(al);
		/* for(int i=0;i<k;i++) {
			System.out.println(arr3[i]);
		}*/

	}

}
