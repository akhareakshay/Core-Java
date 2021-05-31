package Rules.This.Super;

public class ThisRule2 {
	public ThisRule2() {
		this(10);
		System.out.println("no arg constructor");
	}
	ThisRule2(int a){
		this("abc");
	//	super(); //this() and super() must be placed in the same constructor..
		          //becuase both must be placed as first statement in cnstructir
		System.out.println("int param constructor");
	}
	ThisRule2(String s){
		System.out.println("string param constrictor");
	}

}
