package com.generics;

public class BoundedTypeExample<T extends Number> {  
	   
	  T[] nums; // nums is an array of type T 

	  // Pass the constructor a reference to   
	  // an array of type T. 
	BoundedTypeExample(T[] o) {  
	    nums = o;  
	  }  
	  
	  // Return type double in all cases. 
	  double average() {  
	    double sum = 0.0; 
	 
	    for(int i=0; i < nums.length; i++)  
	      sum += nums[i].doubleValue(); // Error!!! 
	 
	    return sum / nums.length; 
	  }  
	}
