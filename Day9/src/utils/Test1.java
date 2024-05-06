package utils;

import java.text.CollationKey;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;
import com.app.core.Student;

public class Test1 {

	public static void main(String[] args) {

		// get populated list from utils
		// 1.1 Display all students details

		List<Student> list = populateList();

		list.forEach(s -> System.out.println(s));

		Map<String, Student> map = populateMap(list);
		map.forEach((s, v) -> System.out.println("ss " + s + v.getRollNo() + "  " + v.getGpa()));

		// Display all student details(from the list) sorted as per GPA (desc order)
		// Use custom ordering

		Comparator<Student> studenComp = (s1, s2) -> ((Double) s1.getGpa()).compareTo(s2.getGpa());
		
		
		/*
														 * {
														 * 
														 * if(s1.getGpa()<s2.getGpa()) return 1;
														 * if(s1.getGpa()>s2.getGpa()) return -1; return 0;
														 * 
														 * };
														 */
		
		
		Collections.sort(list,studenComp);
		System.out.println("shorted list");
		list.forEach(s->System.out.println(s));
		
		

		// 4..Remove all failed students from the map n display the map again
		
		 map.values().removeIf((v)-> v.getGpa()<6  );
		 System.out.println();
		 
		 
		 
		 
	}

}
