package com.assignment;
public class Cities {

	static void country(String cy) {
		String city =cy;
	switch(city) {
		  
	      case "Mumbai":
		    System.out.println("Financial city");
		    break;
		  case "Kolkata":
	        System.out.println("City of Joy");
			break;
		  case "Delhi":
		    System.out.println("Capital of the country");
	     	break;
		  case "Banglore":
		    System.out.println("Cyber City");
		   	break;
		  default:
		    System.out.println("May be Other Indian City");
		}
	}
	
	public static void main(String[] args) {
	String city="Banglore";
		
		country(city);
	
}
}


