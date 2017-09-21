package lab1;
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author Shane Isaak
 * @version Neon
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Lab1b {
    
    // data members
	
    /** Constructor: calls method readFile that reads the doubles
     * contained in the file "<code>filename</code>" and computes the
     * average of the elements.
     @param filename name of the file containing doubles.
    */
    public Lab1b(String filename) {
	readFile(filename);
    }
    	//these are the local variables that are used to calculate the average
    	double total = 0;
    	double count = 0;
    	double element = 0;
    /** Reads double from a file named <code>filename</code> and
     * computes the average of the elements contained in the file 
     * @param filename name of the file containing the doubles 
     */
    public void readFile(String filename) {
	//  this method reads doubles off of a file, computes the average, and prints the result
    try{	
    	File inputFile = new File(filename);
    	Scanner input = new Scanner(inputFile);
    	// this computes the total and counts the number of elements
    	while (input.hasNextDouble()) {
    	    element = input.nextDouble();
    	    total += element;
    		count++;
    	    }//end while
    	//prints the average
    	System.out.println(total/count);
    	input.close();
    }//end try
    catch (IOException e) {
	    System.err.println("IOException in reading input file!!!");
	}	
    
    } //end readFile()
    
    

    /** main : creates a Lab1b Object with the filename passed in
     * argument*/
    public static void main(String args[]) {
	if (args.length == 0)
	    System.err.println("enter the data file name!");
	else
	    new Lab1b(args[0]);
    //	Lab1b lab = new Lab1b("Lab1b.dat");
    } //end main
    
} //end class Lab1b
