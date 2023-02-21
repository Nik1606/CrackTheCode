import java.util.Scanner;

public class DownwardRightTriangle {
	public static void main(String[] args) {
		// User Input
				System.out.println("Enter n");
				Scanner sc= new Scanner(System.in);
				int n= sc.nextInt();
				
				
				for(int row=0;row<n; row++) {
					for(int col=n-row; col>0; col--) {
						System.out.print("* ");
					}
					System.out.println();
				}
	}

}
