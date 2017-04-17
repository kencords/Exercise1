import java.util.Scanner;

public class Helper{
	
	private static Scanner input = new Scanner(System.in);
	
	private Helper(){}
	
	public static String askNextLine(){
		return input.nextLine();	
	}
	
	//Asks for a numeric input from the user
	public static int askNumericInput(String varName){
		
		while(true){
			
			System.out.print("Enter value for " + varName + ": ");
			String tmp = input.nextLine();
			if(!isValidNumericInput(tmp)){
				System.out.println("Invalid " + varName + " input! " + varName + " must be a number.");
				continue;
			}

			return Integer.parseInt(tmp);
			
		}
	}
	
	//Returns the number of occurences of a pattern in a word
	public static int countPatternOccurence(String word, String pattern){
		
		int count = 0;
		
		for(int i = 0; i <= word.length()-pattern.length(); i++){
			if(word.substring(i,i+pattern.length()).equals(pattern))
				count++;
		}
		
		return count;
			
	}
	
	public static  boolean checkValidIndex(int val, int max, String varName){

		
		if(val < 0 || val >= max){
				System.out.println("Invalid " + varName + " value! " + varName + 
							    " must be greater than or equal to 0 and less than or equal to the number of matrix " 
							    + (varName.equals("x")? "columns" : "rows") + " minus 1!");
				return false;
		}
		return true;
		
	}
	
	//Returns a string containing random printable ASCII characters with a specified length
	public static  String generateRandomString(int length){
		
		String tmp = "";
		
		for(int i=0; i<length; i++){
			tmp += (char)(Math.random() * 94 + 33);
		}
		
		return tmp;
	}
	
	//Returns if a String is a valid numeric input or not
	public static boolean isValidNumericInput(String var){
		
		boolean isValid = true;
		for(int i = 0; i < var.length(); i++){
			if(!Character.isDigit(var.charAt(i))){
				isValid = false;
				break;
			}
		}
		
		return isValid;
	}
	
}