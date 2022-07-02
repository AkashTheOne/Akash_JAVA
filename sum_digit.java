import java.util.Scanner;
class sum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		int sum=0;
		while(x!=0){
			sum+=x%10;
			x=x/10;
		}
		System.out.println("The sum of digit is: "+sum);
	}
}
			