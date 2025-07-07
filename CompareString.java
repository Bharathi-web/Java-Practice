package interviews;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Welcome";
		String s2="Welcomes";
		String s3="welcomes";
		if(s1.equals(s2)) {
			System.out.println("Yes the String is Exact Match");
		}
		else if(s1.equalsIgnoreCase(s3)) {
			System.out.println("Yes the String is Partial Match");
		}
		else {
			System.out.println("no match");
		}

	}

}
