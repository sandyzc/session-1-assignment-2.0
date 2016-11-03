package assignments;

public class Assignment3Session1 {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		b=a-- - --a;
		int c = a--; // decrement operator
		int d = a>>2; //bitwise right shift operator
		int e = a & b; //bitwise and operator
		
		System.out.println(" now the value of a is "+a);
		System.out.println(" now the value of b is "+b);
		System.out.println(" now the value of c is "+c);
		System.out.println(" now the value of d is "+d);
		System.out.println(" now the value of e is "+e);

	}

}
