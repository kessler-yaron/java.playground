/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A07_Variable_Math_postfix {

	public A07_Variable_Math_postfix() {

		System.out.println("");
		System.out.println("---[ postfix ]------------");

		System.out.println("");
		System.out.println("---[ postfix -and- increment ]------------");
		int a = 10;
		System.out.println("a == " + a);

		int b = a++;
		System.out.println("b = a++");
		System.out.println("b = " + b);
		System.out.println("a = " + a);

		System.out.println("");
		System.out.println("---[ postfix -and- decrement ]------------");
		a = 20;
		System.out.println("a == " + a);

		b = a--;
		System.out.println("b = a--");
		System.out.println("b = " + b);
		System.out.println("a = " + a);
	}
}
