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