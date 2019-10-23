package com.generics;

class GenericExampleTwo<T, V> { 
	  T obj1;  
	  V obj2;
	   
	  GenericExampleTwo(T o1, V o2) { 
	    obj1 = o1;
	    obj2 = o2;
	  } 
	 
	  T getobj1() { 
		    return obj1; 
		  } 
	  
	  V getobj2() { 
	    return obj2; 
	  } 
	  
	  void showType() { 
	    System.out.println("Type of T is " + 
	    		obj1.getClass().getName()); 
	    System.out.println("Type of V is " + 
	    		obj2.getClass().getName());
	  } 
} 

