import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CaculateTime {
	
	public static List<String> arl=new ArrayList<String>();
	public static List<String> lkl=new LinkedList<String>();
	
	public static void calculateTiming(List <String>san,String type){
		long start=System.currentTimeMillis();
		for(long i=0;i<10000;i++){
			san.add(0,"Batch3");
		}
		long end=System.currentTimeMillis();
		System.out.println("Time take for "+type+" is "+(end-start));
	}
	public static void main(String[] args) {
		List<String> arl=new ArrayList<String>();
		List<String> lkl=new LinkedList<String>();
		
		calculateTiming(arl, "Array List");
		calculateTiming(lkl, "Linked List");
	}

}
