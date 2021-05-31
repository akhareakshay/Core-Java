package src.Application4;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("MainClass.main()"+m12());
		
	}

	public static int m12() {
		try {
			System.out.println("Try.main()");
			System.exit(0);
		} catch (ArithmeticException ae) {
			return 888;
		} finally {
			System.out.println("Finally.m12()");
			return 999;
		}
	}

}
