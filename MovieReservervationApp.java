package com.training.cg.dp;

import java.util.Scanner;

public class MovieReservervationApp {
private static int totaltickets;
private static String next;

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("----------1.List of movies and their prices-------------");
	System.out.println("-------2.access and book tickets through theaters-------");
	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	System.out.println("Enter the required num from above");
	int choice=sc.nextInt();
	if(choice== 1)
	{ 
		System.out.println(" you entered the number 1 for movies available");
		System.out.println("movie availble are 1.Radhe shayam,2.RRR,3.bheemalanak,4.uppena ");
	}
		

 
		else if(choice==2)
		{
			System.out.println("enter the number 2 for access and book tickets through theaters");
			System.out.println("***************the threaters available are**************");
			System.out.println("1.inox 2.mall");
			Scanner threatre=new Scanner(System.in);
			System.out.println("enter the required number for inox and mall");
		    int movie=threatre.nextInt();
		    if(movie==1) 
		    {
		       System.out.println("Enter the number for inox movie");
		       System.out.println("inox is having two movies 1.Radhe Shayam 2.RRR");
		       int num=threatre.nextInt();
		       if(num==1)
		    {
		    	   	System.out.println("You selected movie is Radhe Shayam");
		    	   	System.out.println("Enter the number of tickets");
		    	   	int tickets=sc.nextInt();
		    	   	double amount=(tickets*150);
		    	   	System.out.println("Total amount for the tickets is: "+amount);
		    	   	int totaltickets=300;
		    	   	double left=(totaltickets-tickets);
		    	   	System.out.println("Total tickets left at the threatre is: "+left);
		    	   	System.out.println("Thank You for booking for radhe shayam");
			}
		      	
		      if(num==2)	
		    {
		    	  	System.out.println("You selected movie is RRR ");
		    	  	System.out.println("Enter the number of tickets");
		    	  	int tickets=sc.nextInt();
		    	  	double amount=(tickets*150);
		    	  	System.out.println("Total amount for the tickets is: "+amount);
		    	  	int totaltickets=300;
		    	  	double left=(totaltickets-tickets);
		    	  	System.out.println("Total tickets left at the threatre is: "+left);
		    	  	System.out.println("THANK YOU FOR BOOKING!");
		
		    }
		   }
	
			if(movie==2) 
			{
					System.out.println("you selected mall it has two movies");
					System.out.println("1.bheemalnayak 2.uppena");
					System.out.println("Enter the number for above number");
					Scanner threatre2=new Scanner(System.in);
					{
						int numb=threatre2.nextInt();
						if(numb==1) 
						{
							System.out.println("You selected movie is Bheemalanayak");
							System.out.println("Enter the number of tickets");
							int tickets=threatre2.nextInt();
							double amount=(tickets*150);
							System.out.println("Total amount for the tickets is: "+amount);
							int totaltickets=300;
							double left=(totaltickets-tickets);
							System.out.println("Total tickets left at the threatre is: "+left);
						}
					
	
						if(numb==2) 
						{
							System.out.println("You selected movie is uppena ");
							System.out.println("Enter the number of tickets");
										int tickets=threatre2.nextInt();
							double amount=(tickets*150);
							System.out.println("Total amount for the tickets is: "+amount);
							int totaltickets=300;
							double left=(totaltickets-tickets);
							System.out.println("Total tickets left at the threatre is: "+left);
						}
	
		
		
					}
			}

			
			if(choice<=100)
			{
					System.out.println("Please go back and enter the vaild number from above");
			
			}
			
 		 }
		}
}



		


	


