import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class HashSetClass {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(50);
		hs.add(100);
		hs.add(150);
		hs.add(200);
		hs.add(250);
		hs.add(300);
		hs.add(350);
		hs.add(400);
		hs.add(450);
		hs.add(500);
		hs.add(550);
		hs.add(600);
		hs.add(650);
		hs.add(700);
		hs.add(750);
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(600);
		lhs.add(700);
		lhs.add(800);
		lhs.add(500);
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(4000);
		ts.add(8000);
		ts.add(2000);
		ts.add(1000);
		
		System.out.println(hs);
		System.out.println(lhs);
		System.out.println(ts);
	}

}
