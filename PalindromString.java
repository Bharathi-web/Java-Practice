package project;

public class PalindromString {

	public static void main(String[] args) {
		String s="Madam";
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		boolean ispalindrom=true;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				ispalindrom= false;
			}
			i++;
			j--;
		}
			if(ispalindrom) {
				System.out.println("Palindrom");
			}
			else {
				System.out.println("Not a palindrom");
			}

		}
		
	}


