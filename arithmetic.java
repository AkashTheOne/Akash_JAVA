import java.util.Scanner;
class code{
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a first number:");
		int x=scan.nextInt();
		System.out.println("Enter a Second number:");
		int y=scan.nextInt();
		
		System.out.println("sum is: "+(x+y));
		System.out.println("sub is: "+(x-y));
		System.out.println("multipication is: "+(x*y));
		System.out.println("divide is: "+(x/y));
		System.out.println("modulo is: "+(x%y));

		
	}
}