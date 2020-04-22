class MultiplicationTable {
	public static void main(String... args) {
		final int number = 9;
		System.out.println("-------------------------");
		System.out.println(" " + number + "'s Multiplication Table");
		System.out.println("-------------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " X " + number + " = " + (i*number));
		}
	}
}
