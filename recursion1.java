import java.util.*;
class demo1{
	static int count=0;	
	public static void main(String[] args){
		p();
	}
	static void p(){
		
		count++;
		if(count<=10){
		System.out.println("hello "+count);
		p();
		}
	}
}