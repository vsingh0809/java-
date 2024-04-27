package day3;

public class address {
	private String city;
	private String pincode;
	
	public address(String city,String pincode) {
		this.city=city;
		this.pincode=pincode;
	
	}
    @Override
	public String toString() {
		
		return "city:" +city +"pincode" + pincode;
	}
	
	
}
