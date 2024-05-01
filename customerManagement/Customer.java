package customerManagement;
import java.time.*;
public class Customer {
	
	


	private int customerId;
	private String FirstName;
	private String LastName;
	private String emailId;
	private String password;
	private double  registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	
	public Customer(int customerId, String firstName, String lastName, String emailId, String password,
			double registrationAmount, LocalDate dob, ServicePlan plan) {
		this.customerId = customerId;
		FirstName = firstName;
		LastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}
	public Customer(String emailId, LocalDate dob) {
		super();
		this.emailId = emailId;
		this.dob = dob;
	}


	public int getCustomerId() {
		return customerId;
	}


	public String getFirstName() {
		return FirstName;
	}


	public String getLastName() {
		return LastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public String getPassword() {
		return password;
	}


	public double getRegistrationAmount() {
		return registrationAmount;
	}


	public LocalDate getDob() {
		return dob;
	}


	public ServicePlan getPlan() {
		return plan;
	}
	public Customer(String emailId) {
		super();
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "customerId=" + customerId + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", emailId=" + emailId + ", password=" + password + ", registrationAmount=" + registrationAmount
				+ ", dob=" + dob + ", plan=" + plan ;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Customer) {
		return this.emailId==((Customer)o).emailId;
	}
		return false;

	}
	
}
