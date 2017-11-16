package BinaryTrees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BSTTester {

	public static void main(String[] args) 
	{
		BinarySearchTree<StudentGPA> listOfStudent = new BinarySearchTree<StudentGPA>();
		File input = new File("students.in");
		Scanner in;
		//catches file not found exception
		try 
		{
			in = new Scanner(input);
			//while there is another line to read in the file, read in that line and process it
			while(in.hasNextLine())
			{
				String str = in.nextLine();
				String[] attributes = str.split(" ");
				int size = attributes.length;
				//if the student has four attributes, then it is a graduate student
				if(size == 4)
				{
					GraduateStudentGPA g = new GraduateStudentGPA(Integer.parseInt(attributes[0]), attributes[1], Double.parseDouble(attributes[2]), attributes[3]);
					listOfStudent.insert(g);
				}
				//otherwise it is an undergraduate student
				else
				{
					StudentGPA s = new StudentGPA(Integer.parseInt(attributes[0]), attributes[1], Double.parseDouble(attributes[2]));
					listOfStudent.insert(s);
				}
			}
			
			in.close();
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		TreeIterator<StudentGPA> iterator = new TreeIterator<StudentGPA>(listOfStudent,0);
		//prints out the students sorted by GPA
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
			
		
	}

}
