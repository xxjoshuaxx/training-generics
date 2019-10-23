package com.generics;

public class BoundedTypeDemo {
	public static void main(String args[]) {  
		 
	    Integer inums[] = { 1, 2, 3, 4, 5 }; 
	    BoundedTypeExample<Integer> iob = new BoundedTypeExample<Integer>(inums);   
	    double v = iob.average(); 
	    System.out.println("iob average is " + v); 
	 
	    Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 }; 
	    BoundedTypeExample<Double> dob = new BoundedTypeExample<Double>(dnums);   
	    double w = dob.average(); 
	    System.out.println("dob average is " + w); 
	}
}
