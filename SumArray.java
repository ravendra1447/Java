package JAVA;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int [] number = {1,2,3,4,5};
        int sum = calculateSum(number);
        System.out.println(sum);
    }
    public static int calculateSum(int [] array){
        int sum = 0;
        for(int i=0; i<array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    

	}

}
