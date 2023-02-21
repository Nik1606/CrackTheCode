import java.util.Scanner;

public class LeftTriangleStar {
	public static void main(String[] args) {
		
		// User Input
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int row=0; row<n; row++) {
			int col=0;
			for(col=0; col<n-1-row; col++) {
				System.out.print("   "); // Remember here number of spaces is 3 bcz in below's for loop, we print 
										// 3 characters --> " ", "*" and " ".

			}
			
			for(int col2=col; col2<n; col2++) {
				System.out.print(" * ");
			}
		System.out.println();
		}
	}

}
