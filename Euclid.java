/*
 * University of Central Florida
 * COP 3330 - Fall 2018
 * Authors: Ayla Kovner, Jordan Johnson
 */

public class Euclid {
	
	public static main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Interger.parseInt(args[1]);
	
		int orgA = a; // stores a and b for later
		int orgB = b;

		if (a<b) { // prints out single wrong, swaps a and b
			System.out.println(a + " = 0 ( " + b + " ) + " + a); //prints out single instance
			int temp;
			temp = a; // "empties" value of a
			a = b;    // assigns value of b to value of a
			b = temp; // assigns value of original a to value of b
		}
		
		int q; // initializes quotient
		int r; // initialized remainder
		r = 1; // sets remainder to non-zero value
		
		while(r!=0) {
			q = a/b; // finds quotient
			r = a%b; // finds remainder
			System.out.println(a + " = " + q + " ( " + b + " ) " + r);
			a = b; // old b becomes new a
			if(r!=0)
				b = r; // old remainder becomes new b if it is nonzero
		}
		
		System.out.println("==> gcd ( " + orgA + ", " + orgB + " ) = " + b);
	}
}
