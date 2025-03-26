package JAVA;

class countVowel{
    
    public static int vowelCount(String str){
        int count = 0;
        
        char[] chars = {'a', 'e','i', 'o', 'u', 'A', 'E', 'I','O','U'};
        
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            for(int j= 0; j<chars.length;j++){
                if(ch == chars[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    
    public static void main(String [] args){
        String str = "Ravendra";
        System.out.println("The Number of Vowels is : " + vowelCount(str));
    }
}
