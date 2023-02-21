import java.util.Scanner;

public class RightPascalTriangle {
	public static void main(String[] args) {
		
		// User Input
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int row=0; row<n; row++) {
			for(int col=0; col<=row; col++) {				
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int row2=0; row2<n-1; row2++) {
			for(int col2=n-row2-1; col2>0; col2--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
