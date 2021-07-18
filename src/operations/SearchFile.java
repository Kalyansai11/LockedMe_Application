package operations;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class SearchFile {

	public void search() {


		Scanner filename = new Scanner(System.in);
		String file = filename.nextLine();

		File file1=  new File("C:\\Users\\Kalyan Sai Tirumani\\LockedMe\\LockedMe\\Files\\" +file); 
		if(file1.exists()) {
			System.out.println(file1.getName() + " is found");
		}else {
			System.out.println("The file does not exist");
		}


	}
}