class test extends Thread
{
	@Override
	public void run() {
		System.out.println("hello");
	}
}
public class Mythread {

	public static void main(String[] args) {
		
		test t1=new test();
		t1.start();

	}

}
