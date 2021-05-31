package com.nt.arrays;

class Employee {
}

public class VarArgRules {
	// Rule 1
//	int... ia;
	void m2(int... ia) {
	}

	void m2(String... ia) {
	}

	void m2(Integer... ia) {
	}

	void m2(Thread... ia) {
	}

	void m2(Employee... ia) {
	}

	void m2(Object... ia) {
	}

	void m2(Class... ia) {
	}

	// Rule 2
	void m1(int... ia) {
	}
//	void m1(int.. ia) {}
//	void m1(int.... ia) {}

	// Rule 3
	void m3(int... ia) {
	}

	void m4(int... ia) {
	}

//	void m5(int ia...) {}
//	void m5(...int ia) {}
	void m6(int... ia) {
	}

	// Rule 4
//	void m7(int... ia) {}
//	void m7(int...... ia) {}
	void m7(int[]... ia) {
	}

	void m7(int[][]... ia) {
	}

//	void m7(int...[] ia) {}
//	void m7(int[]...[] ia) {}
	void m8(int[] ia[]) {
	}
//	void m7(int[]ia...) {}

	// Rule 5
//	static void m10(int... ia, int a, int b) {}
//	static void m10(int a, int... ia, int b) {}
	static void m10(int a, int b, int... ia) {
		System.out.println("\na :" + a);
		System.out.println("b :" + b);
		System.out.println("ia : " + java.util.Arrays.toString(ia));
	}

	// Rule 6
//	static void m11(int... a, int... b) {}
//	static void m11(int... a, String... b) {}

	// Rule 7
	static void m12() {
		System.out.println("no-param method");
	}

	static void m12(int a) {
		System.out.println("int param method");
	}

	static void m12(int... a) {
		System.out.println("int var arg method");
	}

	// Rule 8
	static void m13(int... a) {
		System.out.println("int var arg param method");
	}

	static void m13(long... a) {
		System.out.println("long var arg param method");
	}

	static void m13(float... a) {
		System.out.println("float var arg param method");
	}

	static void m14(int... a) {
		System.out.println("int var arg param method");
	}

	static void m14(boolean... a) {
		System.out.println("boolean var arg param method");
	}

	// Rule 9
	static void m15(int... a) {
		System.out.println("int var arg method");
	}

	static void m15(float... a) {
		System.out.println("float var arg method");
	}

	// Rule 10
	static void m16(int a) {
		System.out.println("int arg method");
	}

	static void m16(int... a) {
		System.out.println("int var arg method");
	}

	// Rule 11
	static void m17(int[] a) {
		System.out.println("int[] arg method");
	}

	static void m18(int... a) {
		System.out.println("int var arg method");
	}

	// Rule 12
//	static void m19(int[] a) {
//		System.out.println("int[] arg method");
//	}
	static void m19(int... a) {
		System.out.println("int[] arg method");
	}

	public static void main(String[] args) {
//		m10();
//		m10(5);
		m10(5, 6);
		m10(5, 6, 7);
		System.out.println();
		m12();
		m12(5);
		m12(5, 6);
		m12(5, 6, 7);
		System.out.println();
		m13();
		m13(5);
		m13(5L);
		m13(5F);
		m13(5, 5L);
		m13(5, 5L, 5F);
		System.out.println();
		// m14();
		m14(5);
		m14(true);
		System.out.println();
		m15();
		m15(5);
		m15(5L);
		System.out.println();
		m16(5);
		m16(new int[] { 5 });
		System.out.println();
//		m17();
//		m17(5);
		m17(new int[0]);
		m17(new int[] { 5 });
		System.out.println();
		m18();
		m18(5);
		m18(new int[0]);
		m18(new int[] { 5 });

	}

}