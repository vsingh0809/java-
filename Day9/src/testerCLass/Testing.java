package testerCLass;

	import static utils.StudentCollectionUtils.populateList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;

	import com.app.core.Student;

	public class Testing {
	public static void main(String []args) {
		
		
		//int[] ints= {10,20,300,25,222,655,};
		//Arrays.stream(ints).forEach(i-> System.out.println(i+ " "));
		List<Student>list=populateList();
		/*Arrays.stream(ints).filter(i ->i%2==0)
		.forEach(i-> System.out.println(i+ " "));
		*/
	  
		list.stream().filter(s-> s.getSubject()==s.getSubject().JAVA)
		.forEach(S-> System.out.println(S));


}
	}
	
