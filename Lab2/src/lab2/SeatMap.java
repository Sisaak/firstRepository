package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SeatMap 
{
	//this is the 2D array for the elements of names.dat
	private String[][] seat;
	//this creates the file object
	File input;
	//this is supposed to create the squareSides variable which holds the length and width of the array
	private int squareSides;
	//this method reads the input file, and is supposed to count how many lines
	//the file is, and then change the length and width of the array
	//to be specific to the file length
	//could not figure out how to get the length of the files. 
	public void readFile() throws FileNotFoundException
	{
		input = new File("names.dat");
		Scanner in = new Scanner(input);
		int count = 0;
		//ArrayList<String> arr = new ArrayList<String>();
		//while(in.hasNextLine())
		//{
		//	arr.add((String) in.nextLine());
		//}
		//count = (int) arr.size();
		
		//long size = input.length();
		//count = (int) size;
		
		while(in.hasNextLine())
		{
			count++;
		}//end while
		System.out.println(count);
		int squareRoot = (int) Math.sqrt(count);
		squareSides =  squareRoot + 1;
		System.out.println(squareRoot);
		seat = new String[squareSides][squareSides];
	}//end method
	//this method is meant to populate the array with the elements
	//by moving through the array and populating the rows first and then columns
	public void populateArray() throws FileNotFoundException
	{
		Scanner inputReader = new Scanner(input);
		
		for(int row = 0; row < squareSides; row++)
		{
			for(int column = 0; column < squareSides; column++)
			{
				if(inputReader.hasNext())
				{
					seat[column][row] = inputReader.nextLine();	
				}
				else
				{
					break;
				}//end if	
			}//end for
		}//end for
	}//end method
	//this method returns the String at the position row1, column1
	public String getSeat(int row1, int column1)
	{
		return(seat[row1][column1]);
	}//end method
	//the main method is used here to test the methods 
	public static void main(String[] args)
	{
		SeatMap seating = new SeatMap();
		try 
		{
			seating.readFile();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		try 
		{
			seating.populateArray();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		System.out.println(seating.getSeat(1,2));
		
	}//end main

}
