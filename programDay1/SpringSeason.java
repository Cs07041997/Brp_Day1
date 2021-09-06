package com.bridgelabz.programDay1;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		int d;
		int m;
		boolean found = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter month ");
		m = s.nextInt();
		System.out.println("Enter day");
		d = s.nextInt();
		
			for(d=20; d<=31; d++) {
				if(m==3) {
				 found= true;
				 System.out.println("month "+m+" is true for day "+d);
				}
				else {
					System.out.println("False");
				}
		}
			for(d=1; d<=30; d++) {
				if(m==4) {
				 found= true;
				 System.out.println("month "+m+" is true for day "+d);
				}
				else {
					System.out.println("False");
				}
				
			}
			
			for(d=1; d<=31; d++) {
				if(m==5) {
				 found= true;
				 System.out.println("month "+m+" is true for day "+d);
				}
				else {
					System.out.println("False");
				}
			}
			
			for(d=1; d<=20; d++) {
				if(m==6) {
				 found= true;
				 System.out.println("month "+m+" is true for day "+d);
				}
				else {
					System.out.println("False");
				}
			}
			
			
	}

}
