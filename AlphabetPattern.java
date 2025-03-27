package project;

public class AlphabetPattern {
	    public static void main(String[] args) {
	        int rows = 5;
	        char ch = 'A';

	        for (int i = 1; i <= rows; i++) {
	            char rowChar = ch; // Store the starting character for the row

	            for (int j = 1; j <= i; j++) {
	                // Check conditions for uppercase
	                if (i == j || (i - j) == 2 || i % 2 != 0) {
	                    System.out.print(Character.toUpperCase(rowChar) + " ");
	                } else {
	                    System.out.print(Character.toLowerCase(rowChar) + " ");
	                }
	                rowChar++; // Increment character for column-wise printing
	            }
	            ch++; // Increment starting character for the next row
	            System.out.println();
	        }
	    }
	}
