package javaCollcetions;

public class ExampleMultiDimention {
	
	
	public static void main(String[] args) {
								//row col
		String[][] d = new String[3][3];
		d[0][0] = "Names";
		d[0][1] = "City";
		d[0][2] = "Subject";

		d[1][0] = "Arvind";
		d[1][1] = "Bangalore";
		d[1][2] = "Python";

		d[2][0] = "Arun";
		d[2][1] = "Hyd";
		d[2][2] = "Java";

		System.out.println("Rows are : " + d.length);
		System.out.println("Cols are : " + d[0].length);
		int row = d.length;
		// Zerot col 
	 
		// We are passing the index of the row.[0]
		int col = d[1].length;
		//THis loop for row
		for (int rowNum = 0; rowNum < row; rowNum++) {
			//Inner forloop for col
			for (int colNum = 0; colNum < col; colNum++) {
				System.out.print(d[rowNum][colNum] + " | ");

			}
			System.out.println();
		}

		
		
	}

}
