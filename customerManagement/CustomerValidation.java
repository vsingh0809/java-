package customerManagement;


import java.time.LocalDate;
import java.util.List;

public class CustomerValidation {

	
	public static Customer validInputs(int customerId, String firstName, String lastName, String emailId, String password,
			double registrationAmount, String dob,String servicplan, List<Customer> customers )throws customerException {
		duplicateCustomer(emailId,customers);
		duplicateCustomer(emailId,dob,customers);
		ServicePlan plan=parseAndValidatePlan(servicplan);
		LocalDate date=parseDate(dob);
		return new Customer(customerId,firstName,lastName,emailId,password,registrationAmount,date ,plan);
		}
	
	private static LocalDate parseDate(String dob) {
		
		return LocalDate.parse(dob);
	}

	
	

	public static ServicePlan parseAndValidatePlan(String servicplan) {
		return ServicePlan.valueOf(servicplan.toUpperCase());
	}
	public static void duplicateCustomer(String emailId, List<Customer> cust1) throws customerException {
       Customer c2=new Customer(emailId);
		if(cust1.contains(c2))
				throw new customerException("duplicate value");
			
		}

	
	public static void duplicateCustomer(String emailId,String date,List<Customer> cust2) throws customerException {
	       Customer c2=new Customer(emailId,LocalDate.parse(date));
			 if(cust2.contains(c2))
					throw new customerException("duplicate value");
				
			}
	
	
	
	
	
	

		}

