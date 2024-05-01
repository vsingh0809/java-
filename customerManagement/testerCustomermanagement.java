package customerManagement;

import static customerManagement.CustomerValidation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testerCustomermanagement {

	public static void main(String []args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			boolean exit = false;
			System.out.println("customer entry");
			List<Customer> cust= new ArrayList<>(100);
			
			while(!exit) {
				System.out.println("choose the options");
			     System.out.println("1.Sign up (customer registration)");
			     System.out.println("2.Sign in (login)");
			      System.out.println("3.Change password");
			      System.out.println("4.unsbscribe");
			      System.out.println("5.display all customer");
			      
				switch (sc.nextInt()) {
				case 1:
					System.out.println("enter values");
					Customer custInfo=validInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),sc.next(), cust);
				
					System.out.println("you have signed up successfully");
					
				
					
					break;
                 case 2:
                	 
					
					break;
                 case 3:
	
	                break;
                 case 4:
 					
 					break;
                 case 5:for (Customer c:cust) {
						if(c!=null) {
							System.out.println(c);
					}
					}
 					
 					break;
                 case 0:
                	 exit = true;
					break;
				}
				
				
				
				
			}
			
			
			
		} catch(Exception e) {
			System.out.println("invalid details");
			
			
			
		}
		
		
		
		
		
		
		
		
	}

	
}
