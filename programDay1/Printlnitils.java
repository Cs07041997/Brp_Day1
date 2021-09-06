package com.bridgelabz.programDay1;

public class Printlnitils {
	// Number of lines for the alphabet's pattern
	static int height = 8;
	 
	// Number of character width in each line
	static int width = (2 * height) - 1;
	 
	// Function to find the absolute value
	// of a number D
	static int abs(int d)
	{
	    return d < 0 ? -1 * d : d;
	}

	static void printK()
	{
		
	    
	    int i, j, half = height / 2, dummy = half;
	    for (i = 0; i < height; i++)
	    {
	        System.out.printf("*");
	        for (j = 0; j <= half; j++)
	        {
	            if (j == abs(dummy))
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	        System.out.println(" ");
	        dummy--;
	    }
      }
	
	// Function to print the pattern of 'D'
	static void printD()
	{
	    int i, j;
	    for (i = 0; i < height; i++)
	    {
	        System.out.print("*");
	        for (j = 0; j < height; j++)
	        {
	            if ((i == 0 || i == height - 1)
	                && j < height - 1)
	                System.out.print("*");
	            else if (j == height - 1 && i != 0
	                    && i != height - 1)
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	        System.out.println("  ");
	    }
	}
	
	// Function to print the pattern of 'W'
	static void printW()
	{
	    int i, j, counter = height / 2;
	    for (i = 0; i < height; i++)
	    {
	        System.out.print("*");
	        for (j = 0; j <= height; j++)
	        {
	            if (j == height)
	                System.out.print("*");
	            else if ((i >= height / 2)
	                    && (j == counter
	                    || j == height - counter - 1))
	                System.out.print("*");
	            else
	                System.out.print(" ");
	        }
	        if (i >= height / 2)
	        {
	            counter++;
	        }
	        System.out.println("");
	    }
	}
	    
	    public static void main(String[] args)
	    {
	        printK();
	        printD();
	        printW();
	    }
	    

}
