import java.util.Scanner;

public class ExerciseOne_Main{
	
	public static void main(String[] args){
		
		Matrix matrix = new Matrix();
	
		matrix.create();
		
		while(true){
			System.out.println("\n1. PRINT");
			System.out.println("2. SEARCH");
			System.out.println("3. EDIT");
			System.out.println("4. REBUILD");
			System.out.println("5. EXIT");
			System.out.print("What do you want to do? (Enter choice number): ");
			String choice = Helper.askNextLine();
			
			switch(choice){
				case "1":
					matrix.display();
					break;
				case "2":
					matrix.search();
					break;
				case "3":
					matrix.edit();
					break;
				case "4":
					matrix.create();
					break;
				case "5":
					System.exit(0);
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}