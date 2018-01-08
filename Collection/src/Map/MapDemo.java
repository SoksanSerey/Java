package Map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map <Integer,String>map=new LinkedHashMap<Integer,String>();
		
		map.put(001, "Soksan");
		map.put(002, "Visal");
		map.put(003, "Makara");
		map.put(004, "Ching");
		map.put(005, "Danilo");
		map.put(006, "Samann");
		map.put(007, "Soksan");
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		System.out.println(keys);
		
		Collection<String>col=map.values();
		System.out.println(col);
	}

}
