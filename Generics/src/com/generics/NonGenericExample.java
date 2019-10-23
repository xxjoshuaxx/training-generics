package com.generics;

class NonGenericExample { 
	  Object obj;  
	   
	  NonGenericExample(Object o) { 
	    obj = o; 
	  } 
	 
	  // Return object. 
	  Object getobj() { 
	    return obj; 
	  } 
	 
	  // Show type of T. 
	  void showType() { 
	    System.out.println("Type of T is " + 
	    		obj.getClass().getName()); 
	  } 
	} 

