package threads2;

public class myClass implements Runnable {

	@Override
	public void run() {
		Thread.currentThread().getName();
		try {
		System.out.println(getName() +"   ");
		}catch(Exception e) {
			
		}
	}
	

}
