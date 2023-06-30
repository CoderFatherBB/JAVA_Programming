// Max and Min number in array with linear search

public class Ans4 {
    public static void main(String[] args){
        int[] a1= {10,20,30,50,70,90};   
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < a1.length; i++){    
            if (min > a1[i])
                min = a1[i];
            if (max < a1[i])
                max = a1[i];
        }

        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }    
}
