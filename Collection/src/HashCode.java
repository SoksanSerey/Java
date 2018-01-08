import java.util.HashSet;
import java.util.Set;


public class HashCode {

	public static void main(String[] args) {
		Student s1=new Student(100,"ABC");
		Student s2=new Student(100,"ABC");
		Student s3=new Student(100,"ABC");
		Student s4=new Student(100,"ABC");
		
		Set<Student>s=new HashSet<Student>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		if(s1.equals(s2)){
			System.out.println("Equal");
		}
		else{
			System.out.println("Not Equal");
		}
		System.out.println(s);
	}

}
