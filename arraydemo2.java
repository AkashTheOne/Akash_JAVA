class arraydemo2{
public static void main(String[] args){
	int[] marks={45,21,55,28,45};
	String[] s={"mahesh","akash","ramesh","rashid"};
	/*int sum=0;
	for(int i=0;i<marks.length;i++){
	sum=sum+marks[i];
	if(marks[i]>30){
		System.out.println(marks[i]);
	}
	}
	System.out.println("total marks "+sum);*/
	for(String x:s){
		System.out.println(x);
	}
 }
}