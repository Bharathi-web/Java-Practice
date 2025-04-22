package project;

import java.util.Arrays;

public class UncommonElementsInArray {

	public static void main(String[] args) {
		 int arr[] = {1, 2, 6, 4, 5};
	        int arr1[] = {2, 3, 5, 7, 7};

	        System.out.println("Common Elements:");
	        for (int i = 0; i < arr.length; i++) {
	        	boolean found=false;
	            for (int j = 0; j < arr1.length; j++) {
	                if (arr[i] == arr1[j]) { 
	                	found =true;// Corrected comparison
	                    break;  // Stop checking once found to avoid duplicates
	                }
	            }
	            if(!found) {
                    System.out.print(arr[i]+" ");

	            	
	            }
	        }
	        for (int i = 0; i < arr1.length; i++) {
	        	boolean found=false;
	            for (int j = 0; j < arr.length; j++) {
	                if (arr1[i] == arr[j] && Arrays.asList(arr1).contains(arr1)) {
	                	found =true;// Corrected comparison
	                    break;  // Stop checking once found to avoid duplicates
	                }
	            }
	            if(!found) {
	            	System.out.print(arr1[i]+" ");
	            }
	        }

	}

}
