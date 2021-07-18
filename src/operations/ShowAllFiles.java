package operations;

import java.io.File;
import java.util.Arrays;


public class ShowAllFiles {

	public void show() {
		// Creates an array in which we will store the names of files and directories
		String[] pathnames;

		// Creates a new File instance by converting the given pathname string
		// into an abstract pathname
		File f = new File("C:\\Users\\Kalyan Sai Tirumani\\LockedMe\\LockedMe\\Files");

		// Populates the array with names of files and directories
		pathnames = f.list();
		Arrays.sort(pathnames);
		System.out.println("Files names in an ascending order ");
		// For each pathname in the pathnames array
		for (String pathname : pathnames) {
			// Print the names of files and directories

			System.out.println(" |- " + pathname);
			
		}
		System.out.println();
	}
}