package com.generics;

public class GenericExampleTwoDemo {
	public static void main(String args[]) { 

		
		GenericExampleTwo<Integer, String> ob;  
	    ob = new GenericExampleTwo<Integer,String>(88,"AAA"); 
	    ob.showType(); 
	    
	    Integer in = ob.getobj1(); 
	    System.out.println("ob1  value: " + in);
	   
	    String str = ob.getobj2(); 
	    System.out.println("ob2 value: " + str);
	    
	   
	  } 
}
