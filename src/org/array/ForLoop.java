package org.array;

import java.util.Iterator;

public class ForLoop {

	public static void main(String[] args) {
	
	int a[] = new int [6];
	a[0] =10;
	a[1] =20;
	a[2] =30;
	a[3] =40;
	a[4] =50;
	a[5] =60;

	System.out.println(a[5]);
	
	int length = a.length;
    System.out.println(length);
    
	for (int i = 0; i < 6; i++) {
		System.out.println(a[i]);
		
	}
	                     
	for (int i : a) {
		System.out.println(i);
	}      
	
	System.out.println("sathya");
	                    
	                     
	                     
	                     
	                     
	                     
	                     
	                     
	                     
	                     
	     
}
}
