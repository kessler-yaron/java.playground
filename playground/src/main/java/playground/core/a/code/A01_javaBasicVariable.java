/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A01_javaBasicVariable {

	private boolean flag = false;
	private char charIcon = 'A';
	private char charIconNumber = 67;
	private byte byteNumber = 127;
	private short shortNumber = 32767;
	private int intNumber = 2147483647;
	private long longNumber = 923372037;
	private float floatNumber =  3.2F;
	private double doubleNumber = 332343234D;

	private static final double PI = 3.1415929;
	public static int intCount = 0;

	private String Describe;

	public A01_javaBasicVariable() {
		System.out.println("---[ variable  type and value ]------------");
		System.out.println("boolean  " + flag);
		System.out.println("char Icon  " + charIcon);
		System.out.println("char Icon Number  " + charIconNumber);
	}
}
