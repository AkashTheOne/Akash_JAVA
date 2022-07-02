import java.util.Scanner;
class average{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a first number:");
		int x=sc.nextInt();
		System.out.println("Enter a second number:");
		int y=sc.nextInt();
		System.out.println("Enter a third number:");
		int z=sc.nextInt();
		
		int total=x+y+z;
		int average=total/3;
		System.out.println("Total Average is: "+average);
	}
}