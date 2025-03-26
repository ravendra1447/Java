package JAVA;

public class removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "programming";
		
		//Aproach-1 
		
		StringBuilder sb1 = new StringBuilder();
		s.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
		
		
		
		//Aproach-2 
		StringBuilder sb2 = new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			int idx = s.indexOf(ch, i+1);
			if(idx ==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		
		//Aproach -3
		char[] arr = s.toCharArray();
		
		StringBuilder sb3 = new StringBuilder();
		for(int i=0; i<s.length();i++) {
			boolean repet = false;
			
			for(int j= i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					repet =true;
					break;
				}
			}
			if(!repet) {
				sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
		

	}

}
