package finalPractice.overrideHashCode.Lesson11.Prob1.src.prob1;
import java.util.*;
public class Test {

	public static void main(String[] args) {
//		@SuppressWarnings("serial")
//		List<Student> list = new ArrayList<Student>() {
//			{
//				add(new Student("Joe", "Smith", 3.2, Standing.FRESHMAN));
//				add(new Student("Tom", "Rogers", 3.5, Standing.SENIOR));
//				add(new Student("HeLing", "Wu", 2.9, Standing.JUNIOR));
//				add(new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN));
//				add(new Student("Ihaku", "Tamataku", 3.9, Standing.JUNIOR));
//				add(new Student("Richard", "Wong", 2.8, Standing.SOPHOMORE));
//			}
//		};

		Student s1 = new Student("Joe", "Smith", 3.2, Standing.FRESHMAN);
		Student s2 = new Student("Tom", "Rogers", 3.5, Standing.SENIOR);
		Student s3 = new Student("HeLing", "Wu", 2.9, Standing.JUNIOR);
		Student s4 = new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN);
		Student s5 = new Student("Ihaku", "Tamataku", 3.9, Standing.JUNIOR);
		Student s6 = new Student("Richard", "Wong", 2.8, Standing.SOPHOMORE);

		List<Student> list = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5,s6));
		
		HashMap<Key, Student> map = Admin.processStudents(list);
		boolean[] expectedOutput = {true, false};
		boolean[] results = new boolean[2];
		Student s = new Student("Pierre", "Fromage", 2.8, Standing.FRESHMAN);
		Key pierre = new Key("Pierre", "Fromage");
		Key richard = new Key("Richard", "Fremling");
		results[0] = (map.get(pierre).equals(s));
		results[1] = map.containsKey(richard);
		System.out.println((Arrays.equals(expectedOutput, results) ? "pass" : "fail"));
		
		


	}

}
