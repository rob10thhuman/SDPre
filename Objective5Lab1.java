import java.util.Scanner; 

public class Objective5Lab1 {
  public static void main(String[] args) {
    int month = 6;
	String monthName;
	
    switch (month) {
		case 1:	monthName = "January"; 
			break; 
		case 2: monthName = "February"; 
			break; 
		case 3: monthName = "March"; 
			break; 
		case 4: monthName = "April"; 	
			break; 		
		case 5: monthName = "May"; 
			break; 
		case 6: monthName = "June"; 
			break; 
		case 7:	monthName = "July"; 
			break;		
		case 8: monthName = "August"; 
			break; 
		case 9: monthName = "September"; 
			break; 
		case 10: monthName = "October";
			break; 
		case 11: monthName = "November"; 
			break; 
		case 12: monthName = "December";
			break; 					
		default: monthName = "This is not a valid month.";
        	break;
    	}
    switch (month) { 
    	/*case 1: month = 1;
    	case 2: month = 2;
    	case 3: month = 3;
    	case 4: month = 4;
    	case 5: month = 5;
    	case 6: month = 6;
    	case 7: month = 7;
    	case 8: month = 8;
    	case 9: month = 9;
    	case 10:month = 10;
    	case 11:month = 11;
    	case 12:month = 12;*/
	}    	
	
	System.out.println(monthName);      
        
  }
}