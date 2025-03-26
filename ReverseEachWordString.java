package JAVA;

public class ReverseEachWordString {

	public static void main(String[] args) {
		
		String str = "java Code";
		System.out.println("Original String :: " + str);
		
		String output = "";
		String [] words = str.split(" ");
		
		for(String word : words) {
			String revWord = "";
			
			//reverse word
			for(int i = word.length()-1; i>=0; i--) {
				revWord = revWord + word.charAt(i);
				
			}
			output = output + revWord + " ";
			
			
		}
		System.out.println("Reversed String :: " + output.trim());
	}
		

}
