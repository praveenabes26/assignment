package pps1;

import java.util.Scanner;

public class Telecom1 {

	
	 public static void main(String[] args)
     {
          Scanner input=new Scanner(System.in);
          Hindeng hindengObj=new  Hindeng();
          System.out.println("To continue in english, press 1");
          System.out.println("Hindi me jankari ke liye 2 dabaayen");
          int x=input.nextInt();
          switch(x)
          {
          case 1:	  
        	  hindengObj.hindi();
        	  break;
        	  
          case 2:
        	  hindengObj.english();
        	  break;
        	  default:
        		  break;
          }
     } 
	 
}
