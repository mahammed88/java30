package com.hasgh.itera;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapIteration {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=new HashMap<>();
		
		
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 7);
		map.put("e", 1);
		
		
		
		//System.out.println(map);
		
		           
	          
		
	//	Iterator<String> iterator = map.keySet().iterator();
		
		//Iterator<Entry<String, Integer>> entry=map.entrySet().iterator();
		
//		while(entry.hasNext())
//		{
//			Entry<String, Integer> next = entry.next();
//			
//			             String key=  next.getKey();
//			             int value=next.getValue();
//			             
//			             
//			             System.out.print(key+"  ");
//			             System.out.println(value);
//			
//			
//		}
		
		map.forEach((key,value)->{
			
			System.out.print(key+"  ");
			System.out.println(value);
			
		});
		
		
		map.entrySet().stream().forEach(entry->{
			System.out.print(entry.getKey()+"  ");
			System.out.println(entry.getValue());
		});
		
//		for(Map.Entry<String, Integer> m:map.entrySet())
//		{
//			System.out.print(m.getKey()+"  ");
//			System.out.println(m.getValue());
//		}
//		
//		
//		while(iterator.hasNext())
//		{
//			String key=iterator.next();
//			
//			System.out.print(key+"  ");
//			System.out.println(map.get(key));
//		}
//		
//		
		
	}

}
