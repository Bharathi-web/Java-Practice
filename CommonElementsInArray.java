package project;

public class CommonElementsInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {4,5,6,7,3};
		for(int i=0;i<arr.length;i++) {
			boolean bool=true;

			for(int j=0;j<arr1.length;j++) {
			if(arr[i]==arr1[j]) {
				bool=false;
				break;
				}
				
			}
			if(bool==true) {
				System.out.println(arr[i]);

			}
		}
		for (int i = 0; i < arr1.length; i++) {
            boolean bool = true;
            
            for (int j = 0; j < arr.length; j++) {
                if (arr1[i] == arr[j]) {
                    bool = false;
                    break;
                }
            }
            
            if (bool) {
                System.out.println(arr1[i]);
            }
		
	}
	}
}
