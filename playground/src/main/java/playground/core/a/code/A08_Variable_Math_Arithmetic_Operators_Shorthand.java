/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A08_Variable_Math_Arithmetic_Operators_Shorthand {

	public A08_Variable_Math_Arithmetic_Operators_Shorthand() {

		int number = 10;
		
		System.out.println("");	
		System.out.println("---[ Java Arithmetic - Assignment Operators - Short hand ]------------");
		System.out.println("");
		
		System.out.println(" (number == "+ number +") ==> (number = number + 2) ==>   (number += 2) = " + (number += 2));
		System.out.println(" (number == "+ number +") ==> (number = number - 3) ==>   (number -= 3) = " + (number -= 3));
		System.out.println(" (number == "+ number +") ==> (number = number * 4) ==>   (number *= 4) = " + (number *= 4));
		System.out.println(" (number == "+ number +") ==> (number = number / 3) ==>   (number /= 3) = " + (number /= 3));
		System.out.println(" (number == "+ number +") ==> (number = number % 5) ==>   (number %= 4) = " + (number %= 5));		
	}
}
