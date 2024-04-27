package day3;


public class client {

	public static void main(String[] args) {
		
	address ad1 = new address("city","411001");
	System.out.println(ad1);
	courier cr1= new courier("21","namm",ad1);
			System.out.println(cr1);
			courier cr2= new courier("21","namm",new address("mmmm","221000"));
			System.out.println(cr2);
	}
	}
