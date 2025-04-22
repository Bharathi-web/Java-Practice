package project;

import java.util.ArrayList;
import java.util.Arrays;

public class UncommonStoreInArrayList {

	public static void main(String[] args) {
		ArrayList<Character> l=new ArrayList<>(Arrays.asList('a','b','c','d','e'));
		char[]arr= {'a','c','e','f','j'};
		ArrayList<Character> l2=new ArrayList<>();
		for (Character ch : l) {
            boolean found = false;
            for (char ch2 : arr) {
                if (ch == ch2) {
                    found = true;
                    break;
                }
            }
            if (!found && !l2.contains(ch)) {
                l2.add(ch);
            }
        }

        // Step 2: Add elements from arr that are NOT in list
        for (char ch : arr) {
            if (!l.contains(ch) && !l2.contains(ch)) {
                l2.add(ch);
            }
        }
	}

}
