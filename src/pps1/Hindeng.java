package pps1;
import java.util.Scanner;

public class Hindeng {
	Scanner Input=new Scanner(System.in);
	Request request=new Request();
	int a;
	 public  void english()
     {
		 int y;
		 a=1;
   	  System.out.println("1:To know your bill press 1");
   	  System.out.println("2:For porting request press 2");
   	  System.out.println("3:To talk to our customer care executive press 3");
   	  System.out.println("4:To go back to previous menu press 9");
   	  System.out.println("5:To exit press 0");
   	  y=Input.nextInt();
   	  switch(y)
   	  {
   	  case 1:
   		request.request1();
   		  break;
      case 2:
    	  request.request2();
    	  break;
      case 3:
    	  request.request3();
    	  break;
      case 4:
    	  request.request4();
    	  break;
      case 5:
    	  request.request5();
    	  break;
   	  default:
   		  System.out.println("you have entered wrong choice");
   		  english();
   		  break;
   	  }
   	  
     }
	       public  void hindi()
     {
	    	   int y;
   	  System.out.println("1:bill ki jaankari ke liye ");
   	  System.out.println("2:request port kane ke liye  ");
   	  System.out.println("3:hamaare customer care executive se baat karne ke liye");
   	  System.out.println("4:picchle menu me waapas jaane ke liye");
   	  System.out.println("5:baahar nikalne ke liye");
   	  a=2;
   	y=Input.nextInt();
 	  switch(y)
 	  {
 	  case 1:
 		request.request1();
 		  break;
    case 2:
  	  request.request2();
  	  break;
    case 3:
  	  request.request3();
  	  break;
    case 4:
  	  request.request4();
  	  break;
    case 5:
  	  request.request5();
  	  break;
 	  default:
 		  System.out.println("Apne galat key enter ki hai");
 		  hindi();
 		  break;
 	  }
     }
}
