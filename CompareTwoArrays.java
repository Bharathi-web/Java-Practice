package Practice;

import java.util.Arrays;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,5};
		int arr2[]= {4,3,2,1};
		if(arr1.length!=arr2.length) {
			System.out.println("Array is not equal");
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean equal=true;
		for(int i=0;i<arr1.length;i++) {
				if(arr1[i]!=arr2[i]) {
					equal=false;
				break;
				
			}
		}
		if(equal) {
			System.out.println("Array is equal");
		}
		else {
			System.out.println("Array is not equal");
		}

	}

}
