package operations;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public void writefile() {

		try {
			
			Scanner filename = new Scanner(System.in);
			String filename1 = filename.next();

			FileWriter myWriter = new FileWriter("C:\\Users\\Kalyan Sai Tirumani\\LockedMe\\LockedMe\\Files\\" + filename1);

			System.out.println("Enter your message");
			Scanner msg=new Scanner(System.in);
			String msg1=msg.nextLine();
			myWriter.write(msg1);
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} 
		catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}


}