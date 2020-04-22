class ArrayNMOddValues {
	public static void main(String... args) {
		int[][] matrix = generateArray(9,10);
		System.out.println("Matrix");
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j < matrix[i].length; j++) {
				if(matrix[i][j] % 2 != 0) {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println("");
		}
	}
	
	private static int[][] generateArray(int rows, int columns) {
		if(rows < 10 && columns < 10) {
			int[][] result = new int[rows][columns];
			int value = 1;
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < columns; j++) {
					result[i][j] = value;
					value++;
				}
			}
			return result;
		} else {
			System.out.println("rows and columns lengths must be less than 10");
			return new int[0][0];
		}
	}
}
