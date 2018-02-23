import java.util.Scanner;

public class Pascals_triangle {
	
	
	public static void main (String args[]) {
		int b,q,p,r,s;
		b=1; q=0;
		System.out.println("*********************");
		System.out.println("  Modified");
		System.out.println("  Modified on Ma");
		System.out.println("Modified in pascal branch");
		System.out.println(" Modified pascal branch ");
		System.out.println("*********************");
		System.out.println("Enter the no. lines in integer, required to form pascals trianlge");
		Scanner input = new Scanner (System.in);
		p=input.nextInt();
		System.out.println("No. rows in Pascal's Triangle is" +p);
	
		while (q<p) {
		for(r=10-3*q;r>q;r--) {

			for(s=0;s<=q;s++) {
				
				if(s==0||q==0) {
					b=1;
					}
					else
					b=(b*(b-s+1))/s;
				System.out.print(" ");
			
			}
			System.out.print("."+b);
		}
		
		++q;
		
	}
	
	}

}
