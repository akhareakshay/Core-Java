package Rules.This.Super;

public class ThisRule4_1_1 {
	public ThisRule4_1_1() {
		this(10);
		System.out.println("no arg");
	}
	ThisRule4_1_1(int a){
		this("abc");
		System.out.println("int arg");
	}
	ThisRule4_1_1(String s){

		System.out.println("String arg");
	}

}
