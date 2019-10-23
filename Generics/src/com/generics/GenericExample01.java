package com.generics;

class GenericExample01<T> { 
	  T obj; // declare an object of type T 
	   
	  // Pass the constructor a reference to  
	  // an object of type T. 
	  GenericExample01(T o) { 
	    obj = o; 
	  } 
	 
	  // Return object. 
	  T getobj() { 
	    return obj; 
	  } 
	 
	  // Show type of T. 
	  void showType() { 
	    System.out.println("Type of T is " + 
	    		obj.getClass().getName()); 
	  } 
	} 

