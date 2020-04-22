class ArrayEvenValues {
	static public void main(String[] args) {
		int[] array = generateArray(10);
		for(int value: array) {
			if(value%2 == 0) {
				System.out.println(value);
			}
		}
	}
	
	private static int[] generateArray(int length) {
		int[] result = new int[length];
		for(int i = 0; i<length; i++) {
			result[i] = i + 1;
		}
		return result;
	}
}
