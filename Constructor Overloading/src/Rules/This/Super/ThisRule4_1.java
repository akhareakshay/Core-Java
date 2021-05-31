package Rules.This.Super;

public class ThisRule4_1 {
	public ThisRule4_1() {
		this(10);
		System.out.println("no arg");
	}
	ThisRule4_1(int a){
		this("abc");
		System.out.println("int arg");
	}
	ThisRule4_1(String s){
	//	this();//in object creation, we are not allowed to call same constructor 
		//than once.. violation it leads CE :: recursive constructor invocation..
		//but we are allowed to call it again in another object creation
		System.out.println("String arg");
	}

}
