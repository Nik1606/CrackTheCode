import java.util.Scanner;

public class DownwardLeftTriangle {
	public static void main(String[] args) {
		// User Input
		System.out.println("Enter n");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int row=0; row<n; row++) {
			int temp=0;
			// SPaces
			for(int i=0; i<row; i++) {
				System.out.print("  "); // two spaces
				temp=i+1;              // +1 is imp here
			}
			
			// Stars
			for(int col=temp; col<n; col++) {
				System.out.print("* ");  // Star followed by space
			}
			System.out.println();
		}
	}
}
