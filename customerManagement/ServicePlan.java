package customerManagement;

public enum ServicePlan {
	SILVER(1000), 
	GOLD(2000),
	DIAMOND(5000),
	PLATINUM(10000);

	private double subscriptionCharge;
	ServicePlan(double subscriptionCharge ) {
		this.subscriptionCharge=subscriptionCharge;
	}
@Override
public String toString() {
	return "subscriptionCharge:" + subscriptionCharge;
}
public double getSubscriptionCharge() {
	return subscriptionCharge;

}

	
	
}

