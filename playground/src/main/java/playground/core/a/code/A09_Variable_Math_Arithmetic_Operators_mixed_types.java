/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A09_Variable_Math_Arithmetic_Operators_mixed_types {

	public A09_Variable_Math_Arithmetic_Operators_mixed_types() {

		int intResult = 0, intNum1 = 10, intNum2 = 4;
		float fltResult = 0, fltNum1 = 10, fltNum2 = 2;
		
		System.out.println("");	
		System.out.println("---[ Java Arithmetic - Assignment Operators - mixed types ]------------");
		System.out.println("");

		intResult = (intNum1 / intNum2);
		System.out.println("(intResult = int / int)  ==>  ( intResult = " + intNum1 + " / " + intNum2 + " )  =  " + intResult );
		
		intResult = (intNum1 / (int)fltNum2);
		System.out.println("(intResult = int / (int)float)  ==>  ( intResult = " + intNum1 + " / " + fltNum2 + " )  =  " + intResult );
	
		fltResult = (intNum1 / intNum2);
		System.out.println("(float = float / float) ==> ( fltResult = " + intNum1 + " / " + intNum2 + ")  =  " + fltResult);
		
		intResult = (int)fltNum1 / (int)fltNum2;
		System.out.println("(it = (int)float / (int)float) ==> ( intResult = " + fltNum1 + " / " + fltNum2 + ")  =  " + intResult);

		// TODO
//		System.out.println("\n Casting... (upcasting / DownCasting ");
//		System.out.println("\n Path Here... ");
	}
}
