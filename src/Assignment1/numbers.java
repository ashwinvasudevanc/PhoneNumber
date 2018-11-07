package Assignment1;

import java.util.Scanner;

public class numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       String s="";
	       
	       System.out.println("Enter the num: ");
	      String number=sc.nextLine();                                               //user input
	
	       number = number.replaceAll("[^+0-9]", "");                               //Excluding '+' and '(0-9)', remove everything
	
	       if(number.substring(1,2).equals("4") || number.substring(2,3).equals("4"))  
	       {
	       number = number.replaceAll("^[0]{1,4}", "+");                            //replace starting 0's with + if it already as 49
	       }
	       else
	       {
	           number = number.replaceAll("^[0]{1,4}", "+49");                      //replace starting 0's with +49, if it doesnt have 49
	            
	       }
	    
	      String b=number.substring(3,4);                                           //store the third digit of the number in string b
	    
	      if(b.equals("0"))
	       {
	        number=number.replaceAll("[0]{1,4}","");                               //if 'b' is zero then replace blank
	       }
	   
	      if(!number.substring(0,1).equals("4") && !number.substring(0,1).equals("+") )
	      number="+49"+number;
	      
	          
	    String a=number.substring(3,4);                                            //place the digit occuring after +49(either 1 or others)

	   
	          if(a.equals("1") && number.length()>8)                               //if it is a mobile number and greater than 8
	           {
	               
	              s=number.substring(0,3)+" "+number.substring(3,6)+" "+number.substring(6);  //<country code> <area code> <number> (mobile number)
	           } 
	       else
	       {
	           s=number.substring(0,3)+" "+number.substring(3);                     //<country code> <rest of the no.>
	       }
	       
	        System.out.println("corrected number is: " + s);                       //print the correct number


	}

}
