package threads1;

public class myClass extends  Thread {
	
	
	
	public myClass(String name) {
		super(name);
		
	}
	/*
	
		//mandotary to override the run mathode 
		 *rule-methode  overriding n exception handlinng 
	* overriding from of the methode (sub class version) can not throw
		any new or bordered checked exception
		*/
	@Override
	public void run () {
		System.out.println(getName() +"started");
	//bussiness logic
		try {
		for(int i=0; i<10;i++) {
			
			System.out.println(getName() +"ex. count");
			
				Thread.sleep(5000);}}
			 catch (InterruptedException e) {
			System.out.println(getName()+"got exc" +e);
				e.printStackTrace();
			}
		
		System.out.println(getName() +"over");
	}

}
