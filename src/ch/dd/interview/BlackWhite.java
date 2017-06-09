package ch.dd.interview;

/**
 *  - Describe every lines
 *  - Does it compile? Why?
 *  - What does it show?
 *  - Explain differences between B1 and B2 
 *  - which one is better?
 */
public class BlackWhite {
	public class A {
		private final String value = "Hello";
		public String getValue() {
			return value;
		}
	}
	
	public class B1 extends A {};
	
	class B2 {
		A a = new A();
		
	}
	
	public static void main(String[] args) {
		new BlackWhite().run();
	}

	private void run() {
		B1 b1 = new B1();
		B2 b2 = new B2();
	
		System.out.println(b1.getValue());
		System.out.println(b2.getValue());
	}
}
