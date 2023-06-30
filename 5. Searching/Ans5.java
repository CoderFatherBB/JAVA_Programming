import java.util.Arrays;

// linear search in 2D array

public class Ans5 {
    public static int[] linearSearch(int[][] arr, int key){    
        for(int i = 0; i < 3; i++){    
            for (int j = 0; j < 3; j++) {
                if(arr[i][j] == key){    
                    return new int[]{i,j};    
                }
            }
        }
        return new int[]{-1,-1};    
    }    
        public static void main(String[] args) {  
        int[][] a1= {{10,20,30},{50,70,90},{100,200,300}};   
        int key = 200;    
        System.out.println(key + " is found at index: " + Arrays.toString(linearSearch(a1, key))); 
    }
}
