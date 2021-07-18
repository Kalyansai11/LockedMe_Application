package operations;

import java.io.File;

import java.io.IOException;
import java.util.Scanner;

public class AddFile {
	public void createFile() {

		try {

			Scanner filename = new Scanner(System.in);
			String filename1 = filename.next();

			File file = new File("C:\\Users\\Kalyan Sai Tirumani\\LockedMe\\LockedMe\\Files\\" + filename1 );
			if (file.createNewFile()) {
				System.out.println("File successfully created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}