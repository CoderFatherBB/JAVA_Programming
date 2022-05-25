// Linear Searching for a letter in a string

public class Ans3 {
    public static int linearSearch(String str, char key){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == key){
                return i;
            }
        }
        return -1;
    }    
        public static void main(String[] args) {  
        String s1= "Hello this is Bhavin";
        char key = 'i';
        System.out.println(key + " is found at index: " + linearSearch(s1, key));
    }    
}
