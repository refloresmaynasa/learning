class AddMatrices {
	public static void main(String[] args) {
		int[][] matrixA = generateMatrix(10,10,1);
		int[][] matrixB = generateMatrix(10,9,9);
		printMatrix(matrixA, "A");
		printMatrix(matrixB, "B");
		
		int[][] result = addMatrices(matrixA, matrixB);
		printMatrix(result, "Result");
	}
	
	// Answer to point 6
	private static boolean equalDimensions(int[][] a, int[][] b) {
		if(a.length>0 && b.length>0) {
			if(a.length==b.length && a[0].length==b[0].length) {
				return true;
			}
		}
		return false;
	}
	
	private static int[][] addMatrices(int[][] a, int[][] b) {
		if(equalDimensions(a,b)) {
			int[][] result = new int[a.length][a[0].length];
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a[i].length;j++) {
					result[i][j]=a[i][j]+b[i][j];
				}
			}
			return result;
		} else {
			System.out.println("ERROR: The matrices must have equal dimensions for adding them.");
			return new int[0][0];
		}
	} 
	
	private static void printMatrix(int[][] matrix, String matrixName) {
		System.out.println("-------------------------");
		System.out.println("Matrix: " + matrixName);
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] generateMatrix(int rows, int columns, int initial) {
		int[][] matrix = new int[rows][columns];
		int value = initial;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix[i][j] = value++;
			}
		}
		return matrix;
	}
}
