import java.util.Scanner;
class demo{
public static void main(String[] a){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<n;i++)
		{
			if(n%i==0){
			flag=false;
			break;
			}
			
		}if(flag==true){
						System.out.println(n+" number is prime");
					}else{
			System.out.println(n+" number is not prime");
		}
	}
}