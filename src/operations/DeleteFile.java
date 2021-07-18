package operations;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class DeleteFile {

	public void delete() {

		Scanner filename = new Scanner(System.in);
		String file = filename.next();

		File file1=  new File("C:\\Users\\Kalyan Sai Tirumani\\LockedMe\\LockedMe\\Files\\" +file); 
		if (file1.delete()) { 
			System.out.println(" You Have Successfully deleted the file " + file1.getName());
		} else {
			System.out.println("File Not Found -FNF .");

		}
	}
}