package mulriplication;

public class Multiplication {

	private static int NUMBER = 12;

	/**
	 * multiply the number passed in parameter with values from 1 to 12 and prints
	 * the result
	 * 
	 * @param num
	 */
	public static void multiply(int num) {
		System.out.println("----------------------------------- Multiplication table by " + num
				+ " -----------------------------------");
		for (int i = 1; i <= NUMBER; i++) {
			System.out.println(i + " x " + num + " = " + (i * num));
		}
		System.out.println("");
	}

	/**
	 * 
	 * @param till
	 */
	public static void multiplyTill(int till) {
		System.out.println("*********************************** Multiplication tables by 1 - " + till
				+ " ***********************************\n");
		for (int i = 1; i <= till; i++) {
			multiply(i);
		}
	}

	public static void setNUMBER(int nUMBER) {
		NUMBER = nUMBER;
	}
}
