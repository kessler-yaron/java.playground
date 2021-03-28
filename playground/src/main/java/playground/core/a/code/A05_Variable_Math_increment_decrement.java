/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A05_Variable_Math_increment_decrement {

	public A05_Variable_Math_increment_decrement() {
		
		int incrementValue = 10;
		int decrementValue = 20;

		System.out.println("");		
		System.out.println("---[ incrementValue / decrementValue ]------------");
		
		System.out.println("");
		System.out.println("Initial value");
		System.out.println("incrementValue:: " + incrementValue + " decrementValue:: " + decrementValue);
		
		System.out.println("");
		System.out.println("incrementValue++ \ndecrementValue--");
		incrementValue++; 
		decrementValue--;
		System.out.println("incrementValue:: " + incrementValue + " decrementValue:: " + decrementValue);
		
		System.out.println("");
		System.out.println("++incrementValue \n--decrementValue");
		++incrementValue;
		--decrementValue;
		System.out.println("incrementValue:: " + incrementValue + " decrementValue:: " + decrementValue);
	}
}
