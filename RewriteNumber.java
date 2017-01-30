import java.util.Scanner;

public class RewriteNumber {
	public static void main( String args[] ) {
	    Scanner in = new Scanner( System.in );

	    System.out.println( "Enter an integer between 0 and 9" );
	    int num = in.nextInt();

	    String numString;

	    switch (num) {
	    	case 1: numString = "One";
	    			break;
	    	case 2: numString = "Two";
	    			break;
	    	case 3: numString = "Three";
	    			break;
	    	case 4: numString = "Four";
	    			break;
	    	case 5: numString = "Five";
	    			break;	 
	    	case 6: numString = "Six";
	    			break;	    
	    	case 7: numString = "Seven";
	    			break;	  
	    	case 8: numString = "Eight";
	    			break;	 
	    	case 9: numString = "Nine";
	    			break;	 
	    	default: numString = "Invalid Number";
	    			break;  		   			  						   			
	    }
	    System.out.println( "You entered " + numString );
	}
}
