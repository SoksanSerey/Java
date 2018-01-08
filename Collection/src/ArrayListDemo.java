import java.util.ArrayList;
import java.util.Collections;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2929);
		al.add(7899);
		al.add(9654);
		al.add(2);
		al.add(789);
		al.add(96);
		al.add(100);
		Collections.sort(al);
		System.out.println(al);
	}

}
