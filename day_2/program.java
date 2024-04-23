package day_2;

public class program {

	private String name;
	private int id;
	private int sal;
	
	public program() {
		name="na";
		id=0;
		sal=0;
	}
	
	public program(String name,int id,int sal){
		
		this.name=name;
		this.id=id;
		this.sal=sal;
		}
	
	@Override
	public String toString() {
		
	return "name:"+name+"id:"+id+"sal:"+sal;	
	}
}
 