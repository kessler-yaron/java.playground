/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A06_Variable_Math_prefix {

	public A06_Variable_Math_prefix() {
		
		System.out.println("");		
		System.out.println("---[ prefix ]------------");
		
		System.out.println("");
		System.out.println("---[ prefix -and- increment ]------------");
		int a = 10;
		System.out.println("a == " + a);
		
		int b = ++a;
		System.out.println("b = ++a");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		

		System.out.println("");
		System.out.println("---[ prefix -and- decrement ]------------");
		a = 20;
		System.out.println("a == " + a);
		b = --a;
		System.out.println("b = --a");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
}
