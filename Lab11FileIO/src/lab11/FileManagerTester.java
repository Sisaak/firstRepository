package lab11;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class FileManagerTester {

	public static void main(String[] args) throws IOException
	{
	
		Path p1 = Paths.get("\\Users\\shaneisaak\\GoogleDrive\\Eclipse\\Backups\\SPEED\\SPEED_20171102_1of10.txt.txt");
		Path p2 = Paths.get("/Users/shaneisaak/Desktop/Backup/SPEED/");
		File file = p2.toFile();
		File[] list = file.listFiles();
		//sets the path matcher glob
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:/Users/shaneisaak/Desktop/Backup/SPEED/SPEED_20171102_*of10.txt.txt");
		System.out.println(list.length);
		//this for loop iterates through the files in the list checking for matches to the path matcher
		for(int i = 0; i < list.length; i++)
		{
			if(!(matcher.matches(list[i].toPath())))
			{
				list[i].delete();
			}
		}//end for loop
	}

}
