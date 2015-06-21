package pps1;

import java.util.Scanner;
public class Request {
                     Hindeng hindeng=new Hindeng();
                     Scanner inp=new Scanner(System.in);
                     int d;
                     
	public void request1(){
		System.out.println("your bill is 800 Rs.");
		System.out.println("to go back in previous menu,press 9");
		System.out.println("To exit, press 0");
		d=inp.nextInt();
		switch(d){
		case 9:
			if(hindeng.a==1)
				hindeng.english();
				else
					hindeng.hindi();
				break ;
		case 0:
			System.exit(0);
			break;
			default:
				System.out.println("you have entered a wrong choice");
				break ;
		}
		
	}
	public void request2(){
		System.out.println("your porting request is under process");
		System.out.println("to go back in previous menu,press 9");
		System.out.println("To exit, press 0");
		d=inp.nextInt();
		switch(d){
		case 9:
			if(hindeng.a==1)
				hindeng.english();
				else
					hindeng.hindi();
			break;
		case 0:
			System.exit(0);
			break;
			default:
				System.out.println("you have entered a wrong choice");
				break ;
		}
		
	}
	public void request3(){
		System.out.println("All our executives are busy learning Java. Please try again later.");
		System.out.println("to go back in previous menu,press 9");
		System.out.println("To exit, press 0");
		d=inp.nextInt();
		switch(d){
		case 9:
			if(hindeng.a==1)
				hindeng.english();
				else
					hindeng.hindi();
			break;
		case 0:
			System.exit(0);
			break;
			default:
				System.out.println("you have entered a wrong choice");
				break ;
				
		}
	}
	public void request4(){
		System.out.println("to go back in previous menu,press 9");
		d=inp.nextInt();
		switch(d){
		case 9:
			if(hindeng.a==1)
				hindeng.english();
				else
					hindeng.hindi();
			break;
			default:
				System.out.println("you have entered wrong choice");
				break ;
			
		}
		
		
	}
	public void request5(){
		System.out.println("To exit press 0");
		d=inp.nextInt();
		switch(d){
		case 0:
			System.exit(0);
			break;
			default:
				System.out.println("you have entered wrong keyword");
				break;
		}
	
		
	}
}
