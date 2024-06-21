package finalPractice.overrideHashCode.Lesson11.Prob1.src.prob1;
import java.util.*;
public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		//implement
		HashMap<Key,Student> map = new HashMap<>();
		if(students == null) return null;
		for(Student s : students){
			if(s != null){
				Key k = new Key(s.getFirstName(),s.getLastName());
				map.put(k,s);
			}
		}
		return map;
	}
}
