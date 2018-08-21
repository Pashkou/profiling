package siarhei.pashkou.constructor;

public class TestClass {
	String a;
	String b;
	String c;
	
	TestClass(String a, String b){
		this(a,b,"");
	}
	
	TestClass(String a, String b, String c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
}
