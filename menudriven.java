import java.util.*;
class demo{
	public static void main(String[] args){
		
		Stack<Integer> stk=new Stack<Integer>();
		Scanner sc=new Scanner(System.in);
		
		while(true){
			
		System.out.println("1.push");
		System.out.println("2.pop");
		System.out.println("3.peek");
		System.out.println("4.display");
		System.out.println("5.Quit");
		
		System.out.println("enter your choice");
		
			int ch=sc.nextInt();
			switch(ch){
				case 1:
				System.out.println("Enter stack Element");
				int ele=sc.nextInt();
				stk.push(ele);
				System.out.println("pushed on stack");
				break;
				case 2:
				if(stk.empty()){
					System.out.println("stack is empty");
				}else{
					ele=stk.pop();
					System.out.println("pop : "+ele);
				}
				break;
				case 3:
				if(stk.empty()){
					System.out.println("stack is empty");
				}else{
					ele=stk.peek();
					System.out.println("peek : "+ele);
				}
				break;
				case 4:
				if(stk.empty()){
					System.out.println("stack is empty");
				}else{
					
					System.out.println("stack "+stk);
				}
				break;
				case 5:
				System.exit(1);
				
				default:
				System.out.println("invalid choice");
				
			}
		}
	}
}