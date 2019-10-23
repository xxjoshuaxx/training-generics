package com.generics;

public class NonGenericExample01Demo {
	public static void main(String args[]) { 
	    NonGenericExample integerOb =new NonGenericExample(88); //Changing to Object 
	    integerOb.showType(); 
	    int v = (Integer)integerOb.getobj(); //Cast is required 
	    System.out.println("value: " + v); 	 
	    System.out.println(); 
	 
	    NonGenericExample strOb = new NonGenericExample("Object Test"); //Changing to Object 
	    strOb.showType(); 
	    String str = (String)strOb.getobj(); 
	    System.out.println("value: " + str);
	    
	    int v2 = (Integer)strOb.getobj(); //Throws runtime error
	  } 
}
