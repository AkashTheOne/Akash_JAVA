import java.util.Scanner;
class code{
	public static void main(String[] args){
	
	Scanner s=new Scanner(System.in);
	
	System.out.print("Enter a first Number:");
	int x=s.nextInt();
	System.out.print("Enter a second Number:");
	int y=s.nextInt();
	
	System.out.print("Total is: "+(x*y));
	}
}