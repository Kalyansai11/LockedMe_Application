# LockedMe_Application
LockedMe – Virtual Key for Repositories 

The code for this project is hosted  at https://github.com/Kalyansai11/LockedMe_Application.git
The project is developed by Kalyan Sai Tirumani

Sprints planning and Task completion

Project work divided into 2 Sprint 10 days, Sprint work details are –

1st – Sprint Work Details -

●	 Initializing git repository to track changes as development progresses.
●	 Create Java class to show all the files from the folder in ascending order.
●	 Create Java class for Option to add a user specified file to the application.
●	 Create Java class for Option to search a user specified file from the application with case 
 sensitive.
●	 Create Java class for Option to read a user specified file from the application with case 
 sensitive.

2nd – Sprint Work Details –

●	Create Java class for Option to delete user specified file from the application with case 
             sensitive.
●	Create Main Java class as a welcome class to Navigation option to close the current 
execution context and return to the main context.
●	Welcome Class is the main class to execute all the classes.
●	Test Again All the Java class.
●	Migrate all the Java classes to the welcome class and execute the application.
●	Test applications make the required changes.
●	Push the Java class into the git repository.

Core concepts used in project

Polymorphism, Collections framework, File Handling, Flow Control, Exception Handling, Loops,  Algorithm, etc.

Java Classes to use in project –

1.	WelcomeScreen Class - Used to welcome the user, Main menu and File operation menu. 
2.	ShowFile Class - Used to Show Files names in an ascending order present in the directory.
3.	AddFile Class  - Used to create a  new file, input taken from user for filename and some write up in file.
4.	SearchFile Class - Search a user specified file from the main directory.
5.	DeleteFile Class -Delete a user specified file from the existing directory list.
6.	 WriteFile  Class - Write the content of the file from the existing directory list.

Details of the different classes with the program and output.
1) WelcomeScreen Class:
package userInterface;

import java.util.Scanner;

import operations.AddFile;
import operations.DeleteFile;
import operations.SearchFile;
import operations.ShowAllFiles;
import operations.WriteFile;

public class WelcomeScreen {


	public static void main(String[] args) {

		System.out.println("****************************************************************************");
		System.out.println();
		System.out.println("                      Welcome to LockedMe  Application                      ");
		System.out.println();
		System.out.println("                               Developed by : Kalyan Sai T                  ");
		System.out.println("                           Email Id:tirumanikalyan@gmail.com                ");
		System.out.println();
		System.out.println("****************************************************************************");



		while(true) {


			System.out.println("Enter your Choice ");

			System.out.println("1. Show Files names in an ascending order present in the directory   ");
			System.out.println("2. File Menu options");
			System.out.println("3. Exit");
			System.out.println();


			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();


			if(choice==1) {
				ShowAllFiles sf = new ShowAllFiles();
				sf.show();

			}
			else if(choice==2) {
				while(true) {
					System.out.println(" *********************** FILE MENU OPTION  *********************** ");
					System.out.println();
					System.out.println("a : Add a new File");
					System.out.println("b : write in  a new File");
					System.out.println("c : Delete a file");
					System.out.println("d : Search a file");
					System.out.println("e : Exit (from file menu)");
					System.out.println();
					System.out.println(" ***************************************************************** ");

					String choice1=input.next();

					if(choice1.equals("e")) {
						System.out.println(" Moved to the main menu ");
						System.out.println();
						break;
					}
					switch(choice1) {

					case "a":
						System.out.println(" Enter file name to be added in the folder ");
						AddFile af=new AddFile();
						af.createFile();
						break;

					case "b":
						System.out.println(" Enter file name to be written to the folder ");
						WriteFile wf=new WriteFile();
						wf.writefile();
						break;

					case "c":
						System.out.println(" Enter file name to be deleted from the folder ");
						DeleteFile df= new DeleteFile();
						df.delete();
						break;


					case "d":
						System.out.println(" Enter file name to be seached ");
						SearchFile sf=new SearchFile();
						sf.search();

						break;
						
                     default:
                    	 System.out.println("Please enter a correct choice");
                    	 System.out.println();
                    	 

					}

				}

			}
			else if(choice==3) {
				System.out.println(" Thanks for using Lockedme.com services. ");
				System.out.println();
				break;

			}
			else {
				System.out.println(" Please Enter a Correct Choice "); 
				System.out.println();
			}
		}

	}
}

-> ShowAllFiles Class:
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

Ouput :
****************************************************************************

                      Welcome to LockedMe  Application                      

                               Developed by : Kalyan Sai T                  
                           Email Id:tirumanikalyan@gmail.com                

****************************************************************************
Enter your Choice 
1. Show Files names in an ascending order present in the directory   
2. File Menu options
3. Exit


1
Files names in an ascending order 
 |- arra.txt
 |- begin.txt
 |- hello
 |- second.txt
 |- varun.txt

Enter your Choice 
1. Show Files names in an ascending order present in the directory   
2. File Menu options
3. Exit

2
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
 
 2) AddFile Class:
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

Output:
****************************************************************************

                      Welcome to LockedMe  Application                      

                               Developed by : Kalyan Sai T                  
                           Email Id:tirumanikalyan@gmail.com                

****************************************************************************
Enter your Choice 
1. Show Files names in an ascending order present in the directory   
2. File Menu options
3. Exit

2
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
a
 Enter file name to be added in the folder 
added.txt
File successfully created: added.txt
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
 3) WriteFile Class:
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
Output:
****************************************************************************

                      Welcome to LockedMe  Application                      

                               Developed by : Kalyan Sai T                  
                           Email Id:tirumanikalyan@gmail.com                

****************************************************************************
Enter your Choice 
1. Show Files names in an ascending order present in the directory   
2. File Menu options
3. Exit

2
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
b
 Enter file name to be written to the folder 
beginning
Enter your message
This is for testing purpose.
Successfully wrote to the file.
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
 4) DeleteFile Class:
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

Output:
****************************************************************************

                      Welcome to LockedMe  Application                      

                               Developed by : Kalyan Sai T                  
                           Email Id:tirumanikalyan@gmail.com                

****************************************************************************
Enter your Choice 
1. Show Files names in an ascending order present in the directory   
2. File Menu options
3. Exit

2
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
c
 Enter file name to be deleted from the folder 
added.txt
 You Have Successfully deleted the file added.txt
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
 5) SearchFile Class:
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
Output:
****************************************************************************

                      Welcome to LockedMe  Application                      

                               Developed by : Kalyan Sai T                  
                           Email Id:tirumanikalyan@gmail.com                

****************************************************************************
Enter your Choice 
1. Show Files names in an ascending order present in the directory   
2. File Menu options
3. Exit

2
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
d
 Enter file name to be seached 
beginning
beginning is found
 *********************** FILE MENU OPTION  *********************** 

a : Add a new File
b : write in  a new File
c : Delete a file
d : Search a file
e : Exit (from file menu)

 ***************************************************************** 
Pushing the total files into the github :
1.Initially, use cd <Path_name>
2.Initialize the git using command
    $git init
3.Add the files using the following add command
    $git add .
4.Then, commit the message using command
    $git commit -m "Commit Message"
5.Then to push content into repository use
    $git remote add origin Host_URL(HTTPS/SSH)
    $git branch -M main
    $git push -u origin main
   
Features of the LockedMe Application: 
1. Retrieves the file names in an ascending order
2. Business-level operations:
    − Option to add a user-specified file to the application
    − Option to delete a user-specified file from the application
    − Option to search a user-specified file from the application
    − Navigation option to close the current execution context and return to the main context
3. Option to exit from the application.
    
