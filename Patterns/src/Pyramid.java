import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		
		// User Input
		System.out.println("Enter base of Pyramid");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		int maxColInd = (n*2)-2; // Calculated by using grid like pattern on paper.
		
		for(int row=0; row<n; row++) {
		// starting & Ending column index to print *
			int colStart= (maxColInd/2) - row;
			int colEnd=(maxColInd/2) + row;
			
			
		// Printing space
			for(int i=0; i<(maxColInd/2)-row; i++) {
				System.out.print(" ");
				colStart=i;
			}
			 
		// Printing *
			for(int c= colStart; c<=colEnd; c=c+2) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
