package day3;

public class courier {
    private String id;
    private String name;
	private address caddress;
	
	public courier(String id,String name,address caddress) {
		this.id=id;
		this.name=name;
		this.caddress=caddress;
	}
	
public String toString() {
	 return "id:" +id +"name"+"caddress" + caddress;
}
	
}
