package Interview;

import java.util.ArrayList;

public class Emptyfile {

	public static void main(String[] args) {
		ArrayList<Character> l=new ArrayList<>();
		l.add('a');
		l.add('b');
		l.add('c');
		l.add('d');
		l.add('e');
	char[] arr= {'c','d','e','f','g'};
	ArrayList<Character> l2=new ArrayList<>();
	for(char ch: l) {
		boolean found=false;
		for(char ch2: arr) {
			if(ch==ch2) {
				found=true;
				break;
				
			}
			
		}
		if(!found && !l2.contains(ch)) {
			l2.add(ch);
		}
			
	}
	for(char ch: arr) {
		if(!l.contains(ch) && !l2.contains(ch)) {
			l2.add(ch);
		}
	}
	System.out.println(l2);

	}

}
