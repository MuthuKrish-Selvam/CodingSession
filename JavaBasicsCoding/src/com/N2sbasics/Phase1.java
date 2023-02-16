package com.N2sbasics;

import java.text.NumberFormat;
import java.util.Scanner;

public class Phase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello N2 Soultions");
		
		String firstname = null;
		
		Scanner s = new Scanner(System.in);
		System.out.println("User Detail Collection Program ");
		System.out.println("Please Enter Your First Name: " );
		
		 firstname = s.next();
		 
		 System.out.println("Please Enter Your Last Name: " );
			
		 String lastname = s.next();
		 
		 System.out.println("Please Enter Your Phone Number: " );
			
		 long pnumber = s.nextLong();
		 
		 System.out.println("Please Enter Your Email Address: " );
			
		 String email = s.next();
		 
		 
		 System.out.println("Please Enter Your Age: " );
			
		 int age = s.nextInt();
		 
		 System.out.println("The User Name First name is:" +firstname+ "The Users Last Name is:" +lastname+ "The Users Phonr Number is:" +pnumber+ "The Users Email Address is:" +email);
		 
		 
		 
		 
		 
		 //Project to calculate Mortgage
		 
		 final byte MONTHS_IN_YEAR = 12;
	        final byte PERCENT = 100;

	        int principal=0;
	        float annualInterest = 0;
	        float monthlyInterest = 0;
	        int numberOfPayments = 0;
	        byte years;

	        System.out.println("Lets Calculate Your Mortgage");
	        
	        //Principal 
	        
	        while (true) {
	        	
	        	System.out.println("Please Enter The Principal:" +principal);
		        principal=s.nextInt();
	            if (principal >= 1000 && principal <= 1_000_000) {
	                break;
	            }
	        
	            System.out.println("Enter Value Between 1000 & 1Million");
	        }
	        
	        //Interest
	        while (true) {
	        	System.out.println("Please Enter The Interest:" +annualInterest);
		        annualInterest=s.nextFloat();
	            if (annualInterest >= 1 && annualInterest <= 30) {
	                monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
	                break;
	            }
	            System.out.println("Enter Value Between 1 & 30");
	        }
	        
	        //Years
	        
	        while (true) {

		        System.out.println("Please Enter The Years:");
		        years=s.nextByte();
	            if (years >= 1 && years <= 30) {
	                numberOfPayments = years * MONTHS_IN_YEAR;
	                break;
	            }
	            System.out.println("Enter Value between 1 and 30");
	        }
	        
	        //Mortgage Calculation Formula P( r(1 + r)^n  /  ((1 + r)^n) - 1) )
	        
	        double mortgage = principal * (monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
	                / ((Math.pow((1 + monthlyInterest), numberOfPayments) - 1));
	        
	        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
	        System.out.println("Your Mortgage Per Month Is:" + mortgageFormatted);
	        
	        
	        //Grading Assignment Program
	        System.out.print("Enter Grade Between 1 to 100 ");
			int score = s.nextInt();
			int grade = score / 10;
			
			if (grade == 10) {
				System.out.print("Perfect Score");
			}
			else if (grade == 9) {
				System.out.print("Excellent");
			}
			else if (grade == 8) {
				System.out.print("Nice Job");
			}
			else if (grade == 7) {
				System.out.print("Average");
			}
			else {
				System.out.print("Below Average");
			}
	        
			//Enhanced For Assignment
			// for each
	        String[] fruits = {"Mango", "Apple", "Orange"};
	        for (int i = 0; i < fruits.length; i++)
	            System.out.println(fruits[i]);
	        // or
	        for (String fruit : fruits)
	            System.out.println(fruit);
	        
		 s.close();
		 
		
		
	}
	
	public static void details() {
		
		
		
		
		
	}
}


