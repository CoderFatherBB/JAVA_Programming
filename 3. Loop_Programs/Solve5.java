// Calculate Distance Between Two Points
import java.util.Scanner;

public class Solve5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            int x1,x2,y1,y2;
            double dis;
	
	        System.out.print("Enter x1 point : ");
            x1 = input.nextInt();
	        System.out.print("Enter y1 point : ");
	        y1 = input.nextInt();
 
	        System.out.print("Enter x2 point : ");
            x2 = input.nextInt();
            System.out.print("Enter y2 point : ");
            y2 = input.nextInt();
	  	    
		    dis = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	        System.out.print("Distance between " + "(" + x1 + "," + y1 + "), " + "(" + x2 + "," + y2 + ") ===> " + dis);
 
	
        }
    }
}
