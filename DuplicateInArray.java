package Practice;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,7,5,8,3,5,7,6};
		for(int i=0;i<a.length;i++) {
			 boolean alreadyPrinted = false;
	            for (int k = 0; k < i; k++) {
	                if (a[i] == a[k]) {
	                    alreadyPrinted = true;
	                    break;
	                }
	            }
	            if (alreadyPrinted) {
	                continue; // skip this element, already printed
	            }
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] ){
					System.out.println(a[i]);
					break;
				}
			}
		}
	}

}
