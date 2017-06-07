package ch.dd.code;

/**
 *  - Describe every lines
 *  - Does it compile? Why?
 *  - What does it show?
 *
 */
public class Interview1 {

	public static void main(String[] args) {
		check(1, 2);
		check(1, 1);
		check(100, 100);
		check(200, 200);
	}

	private void check(int i, int j) {
		Integer u = i;
		Integer v = j;
		System.out.println(i + ": " + (u==v));
	}
	
	

}
