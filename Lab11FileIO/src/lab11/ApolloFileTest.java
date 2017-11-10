package lab11;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class ApolloFileTest 
{

	public static void main(String[] args) 
	{

		Path p2 = Paths.get("/Users/shaneisaak/Desktop/Backup/APOLLO/");
		File file = p2.toFile();
		File[] list = file.listFiles();
		
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:/Users/shaneisaak/Desktop/Backup/APOLLO/APOLLO_20171102_*of*.txt");
		int size = list.length;
		System.out.println(size);
		char str = ' ';
		int numOfFiles;
		int i = 0;
		//this for loop iterates through the files looking for the file that contains the recommended number of files
		while(i < list.length)
		{
			if((matcher.matches(list[i].toPath())))
			{
				str = list[i].getPath().charAt(list[i].getPath().length() - 5);
			}
			i++;
		}
		numOfFiles = (int)str;
		//this if statement prints the result
		if(numOfFiles == size)
		{
			System.out.println("Correct Number of Files");
		}
		else
		{
			System.out.println("Technicially this is what you want to show up on the screen");
		}
		
		
	}

}
