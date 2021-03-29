/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A08_Variable_Math_Arithmetic_Operators_Shorthand {

	public A08_Variable_Math_Arithmetic_Operators_Shorthand() {

		int number = 10;
		
		System.out.println("\nJava Arithmetic Operators Short hand\n");
		System.out.println("number = " + number);
		
		// +=
		System.out.println(" += ");
		System.out.println(" number ("+ number +") += 2 ==> " + (number += 2));
		
		// -=
		System.out.println(" number ("+ number +") -= 3 ==> " + (number -= 3));

		// *=
		System.out.println(" number ("+ number +") *= 2 ==> " + (number *= 2));		

		// /=
		System.out.println(" number ("+ number +") /= 5 ==> " + (number /= 5));
		
		// %=
		System.out.println(" number ("+ number +") %= 2 ==> " + (number %= 2));
		
		//\n
		System.out.print("\n");
		

		
		float flNumber = 0;
		int num1 = 10, num2 = 5;
		System.out.println("---------");
		System.out.println("*** modulo int to int ==> " + num1 + " / " + num2 + " === " + (num1 / num2 ) );
		System.out.println("*** modulo int to float ==> " + num1 + " / " + num2 + " === " + (flNumber = num1 / num2 ) );
		

	}
}
