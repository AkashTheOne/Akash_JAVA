class factorial{
	public static void main(String[] args){
		System.out.println("The value is :"+factorial(10));
	}
	public static int factorial(int val){
		if(val==1)
			return 1;
		else
			return val*factorial(val-1);
	}
}