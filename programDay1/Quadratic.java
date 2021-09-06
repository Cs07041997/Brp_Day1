
package com.bridgelabz.programDay1;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		double root1 = 0;
		double root2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a");
		double a = sc.nextDouble();
		System.out.println("Enter value of b");
		double b = sc.nextDouble();
		System.out.println("Enter value of c");
		double c = sc.nextDouble();
        
		double delta = b*b-4*a*c;
		double sqrt = Math.sqrt(delta);
		if(delta>0) {
		root1 = (-b+sqrt)/(2*a);
		root2 = (-b-sqrt)/(2*a);
		System.out.println("root of the quadratic equation firstroot"+root1+ "secondroot"+root2);
		
		}
		else if (delta==0) {
			System.out.println("root are equal"+(-b/(2*a)));
		}
	}
	

}
