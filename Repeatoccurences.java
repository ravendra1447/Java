package JAVA;

import java.util.Map;
import java.util.HashMap;
//import java.util.Map;

public class Repeatoccurences {

	public static void main(String[] args) {
		
		String str = "hello";
		
		Map<Character, Integer> map = new HashMap();
		
		char [] chars = str.toCharArray();
		
		
		for(char ch :chars) {
			if(!map.containsKey(ch)) 
			{
				map.put(ch, 1);
			}else {
				int value = map.get(ch);
				map.put(ch, value+1);
			}
		}//end of loop 
		
		System.out.println(map);
		

	}

}
