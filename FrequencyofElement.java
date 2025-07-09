package Practice;

import java.util.HashMap;

public class FrequencyofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,4,4,4,5,5,6,8,2,2};
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int num:arr) {
			if(hm.containsKey(num)) {
				hm.put(num, hm.get(num)+1);
			}
			else {
				hm.put(num, 1);
			}
		}
		System.out.println("Num : Freq");
		for(int num:hm.keySet()) {
			System.out.println(num+"  :  "+ hm.get(num));
		}

	}

}
