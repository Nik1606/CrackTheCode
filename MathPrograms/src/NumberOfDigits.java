import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		// Input Number
		System.out.println("Enter number to check for palindrome");
		Scanner sc=  new Scanner(System.in);
		int num= sc.nextInt();
		if(num<0) num*=-1;
		
		int d=0;
		while(num>0) {
			num/=10;
			++d;
		}
		System.out.println("Number of Digits = "+d);
	}
}
