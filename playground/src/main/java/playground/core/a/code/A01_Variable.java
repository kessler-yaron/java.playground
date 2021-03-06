/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A01_Variable {

	private boolean flag = false;
	private char charIcon = 'A';
	private char charIconNumber = 67;
	private byte byteNumber = 67;
	private short shortNumber = 32767;
	private int intNumber = 2147483647;
	private long longNumber = 923372037;
	private float floatNumber = 3.2F;
	private double doubleNumber = 332343234D;

	private static final double PI = 3.1415929; // constant
	public static int intCount = 0; // class variable

	private String Describe = "String is an Object and not a primitive variable. ";

	public A01_Variable() {
		System.out.println("");
		System.out.println("---[ variable type and value ]------------");
		System.out.println("");
		System.out.println("boolean  " + flag);
		System.out.println("char Icon:  " + charIcon);
		System.out.println("char Icon Number " + byteNumber + " equal to charIcon: " + charIconNumber);
		System.out.println("byteNumber: " + byteNumber);
		System.out.println("shortNumber: " + shortNumber);
		System.out.println("intNumber: " + intNumber);
		System.out.println("longNumber: " + longNumber);
		System.out.println("floatNumber: " + floatNumber);
		System.out.println("doubleNumber: " + doubleNumber);
		System.out.println("PI: " + PI);
		System.out.println("intCount: " + intCount);
		System.out.println("Describe: " + Describe);
		System.out.println("");
	}
}
