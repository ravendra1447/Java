package JAVA;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Nonrepeatchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "ABCDABC";
		
		for(int i =0; i<str.length(); i++) {
			
			boolean unique = true;
			for(int j=0;j<str.length();j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique= false;
					
				}
			}
			if(unique) {
				System.out.println("Non repeat : "+str.charAt(i));
				break;
			}
		}
		
		//Aproach-2
		
		Map<Character, Integer> map = new HashMap();
		
		for(int i = 0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
		
		for(java.util.Map.Entry<Character, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
				
			}
		}
//		
//
	}

}
