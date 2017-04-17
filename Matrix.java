
public class Matrix{
	
	private int row = 0, col = 0;
	private String[][] matrix;
	
	public Matrix(){
		
	}
	
	
	//Asks an x and y input from the user and creates an array[x][y] where each of its elements contain a randomly generated String
	public void create(){
		
		col = Helper.askNumericInput("x");
		row = Helper.askNumericInput("y");
		matrix = new String[col][row];
		
		for(int i=0; i < row; i++){
			for(int j = 0; j < col; j++){
				matrix[i][j] = Helper.generateRandomString(5);
			}
		}
			
		System.out.println("\nNew Matrix Created!");
		display();
	}
	
	//Displays the value of each element in the matrix array
	public void display(){
		
		System.out.println("");
		for(int i=0; i < row; i++){
			for(int j=0; j<col; j++){
				System.out.print((j==0? " [ " : " , ") + matrix[i][j]);
			}
			System.out.println(" ]");
		}
	}
	
	//Asks a user for an x and y input then if x and y are valid changes the value of matrix[x][y] to the value inputed by the user
	public void edit(){
		
		int x = 0, y = 0;
		//check if x and y values won't cause an array out of bounds exception
		while(true){
			
			x = Helper.askNumericInput("x");
			if(!Helper.checkValidIndex(x, col, "x")){
				continue;
			}
			break;
			
		}
		
		while(true){
			
			y = Helper.askNumericInput("y");
			if(!Helper.checkValidIndex(y, row, "y")){
				continue;
			}
			break;
		}
		
		System.out.println("(" + y + "," + x + ")");
		System.out.print("Enter String: ");
		
		matrix[y][x] = Helper.askNextLine();
		
		System.out.println(y + "," + x + " changed into " + matrix[y][x]);
		
	}
	
	/*
		Traverses all elements in an array and checks if an element contains one or more instances of the specified pattern.
		Prints out the x and y location of the element and the number of instances of the pattern in the element
	*/
	public void search(){
		
		String pattern = "";
		
		while(true){
			System.out.print("Enter pattern to be searched: ");
			pattern = Helper.askNextLine().trim();
			if(pattern.length() >= 1 && pattern.length() <= 5){
				break;
			}
		}
		
		System.out.println();
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				int count = Helper.countPatternOccurence(matrix[i][j], pattern);
				if(count > 0){
					System.out.println(i + ", " + j + " with " + count + " instances");
				}
			}
		}
	}
	
	
}
