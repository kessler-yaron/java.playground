package playground.core.a.code;

public class A00_system_out {

	public A00_system_out() {

		int intNum1 = 10;
		int fltNum2 = 20;

		System.out.println("");
		System.out.println("---[ System.out.   println()  /  printf() ]------------");
		System.out.println("");

		System.out.println("println() output method");
		System.out.println("(" + intNum1 + ") " + fltNum2);
		System.out.println("(" + intNum1 + 99 + ") " + fltNum2 + 99);
		System.out.println("(" + intNum1 + 999 + ") " + fltNum2 + 999);
		System.out.println("(" + intNum1 + 99 + ") " + fltNum2 + 99);
		System.out.println("(" + intNum1 + ") " + fltNum2);

		System.out.printf("\nprintf() format output method");
		System.out.printf("\n(%5d) %5d ", intNum1, fltNum2);
		System.out.printf("\n(%5d) %5d ", intNum1 + 99, fltNum2 + 99);
		System.out.printf("\n(%5d) %5d ", intNum1 + 999, fltNum2 + 999);
		System.out.printf("\n(%5d) %5d ", intNum1 + 99, fltNum2 + 99);
		System.out.printf("\n(%5d) %5d ", intNum1, fltNum2);
	}
}
