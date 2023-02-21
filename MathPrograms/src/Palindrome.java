import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	
		// Input Number
		System.out.println("Enter number to check for palindrome");
		Scanner sc=  new Scanner(System.in);
		int num= sc.nextInt();
		
		int tempNum=0;
		int numCopy=num;
		
		if(num<0) System.out.println("Number is NOT palindrome");
		else {
			
			while(num>0) {
				int d= num%10;
				tempNum = tempNum*10 + d;
				num/=10;
			}
		}
		
		// return tempNum==numCopy;
		if(tempNum==numCopy) System.out.println("Number is Palindrome number");
		else System.out.println("Number is NOT palindrome"); 
	}
}
