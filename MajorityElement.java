package Practice;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,2,2,3,3,5};
		int n=arr.length;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int num:arr) {
			if(hm.containsKey(num)) {
				hm.put(num,hm.get(num)+1);
			}
			else {
				hm.put(num, 1);
			}
		}
		boolean found=false;
		for(int num: hm.keySet()) {
			if(hm.get(num)>n/2) {
				System.out.println(num);
				found=true;
			}
		}
		if(!found) {
			System.out.println("No majority element");
		}

	}

}
