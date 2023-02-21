import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		// Input Number
		System.out.println("Enter number to Reverse it");
		Scanner sc=  new Scanner(System.in);
		int num= sc.nextInt();
		
		int numCopy = num;
		if(numCopy < 0)	numCopy *= -1;
		
		int reversedNum=0;
		while(numCopy>0) {
			
			int d= numCopy%10;
			reversedNum = reversedNum*10 +d;
			numCopy /=10;
		}
		
		if(num<0) numCopy*= -1;
		System.out.println("Reversed Number = "+ reversedNum);
	}

}
