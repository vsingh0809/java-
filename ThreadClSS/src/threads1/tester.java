package threads1;

public class tester {
public static void main(String[] args ) throws InterruptedException {
	
	System.out.println(Thread.currentThread());
	// creat multiple child threads
	myClass t1= new myClass("one");
	myClass t2= new myClass("two");
	myClass t3= new myClass("three");
	myClass t4= new myClass("four");
	//myClass t5= new myClass("five");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	
	System.out.println(t1.isAlive()+"  "+ t4.isAlive());
	for(int i=0; i<10;i++) {
		
		System.out.println(Thread.currentThread().getName() +"ex. count");
		
			Thread.sleep(10000);}
	System.out.println(t1.isAlive()+"  "+ t4.isAlive());

}
}
