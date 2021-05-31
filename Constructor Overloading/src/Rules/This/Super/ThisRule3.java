package Rules.This.Super;

public class ThisRule3 {
	ThisRule3(){
		this("abc");
	//	this("abc"); // multiple this() and super() cannot be placed in the same constructor
                     // violation leads to same compilation error
		System.out.println("no args");
	}
	ThisRule3(String s){
		super();
	//	super(); // multiple this() and super() cannot be placed in the same constructor
		         // violation leads to same compilation error
		System.out.println("String arg");
	}

}
