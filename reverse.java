package JAVA;

public class reverse {

	public static void main(String[] args) {
		
		
		String s = "ravendra kumar";
		
		char [] chAr = s.toCharArray();
		//aproach-1 
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(chAr[i]);
		}
		
		
		System.out.println();
		//Approch-2
		
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
