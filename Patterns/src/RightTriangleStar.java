import java.util.Scanner;

public class RightTriangleStar {

	public static void main(String[] args) {
		
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int row=0; row<=n; row++) {
			for(int col=0; col<row; col++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
