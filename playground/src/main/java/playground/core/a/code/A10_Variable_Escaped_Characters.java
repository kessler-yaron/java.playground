/**
 * @author kessler Yaron
 * @nickname Jron :)
 */
package playground.core.a.code;

public class A10_Variable_Escaped_Characters {

	// constant + class variable
	private static final char b = '\b'; // backSpace
	private static final char ff = '\f'; // formFeed
	private static final char lf = '\n'; // lineFeed
	private static final char cr = '\r'; // carriageReturn
	private static final char ht = '\t'; // horizontalTab
	private static final char dq = '\"'; // doubleQuote
	private static final char sq = '\''; // singleQuote
	private static final char bs = '\\'; // backSlash

	public A10_Variable_Escaped_Characters() {

		System.out.println("");
		System.out.println("---[ Java Arithmetic - Variable Escaped Characters ]------------");
		System.out.println("");

		System.out.println("backSpace " + b);
		System.out.println("formFeed " + ff);
		System.out.println(lf + "lineFeed before and after current line " + lf);
		System.out.println("carriageReturn / Enter " + cr);
		System.out.println(ht + "horizontalTab" + ht);
		System.out.println(sq + "singleQuote" + sq);
		System.out.println(dq + "doubleQuote" + dq);
		System.out.println(bs + "backSlash" + bs);
	}
}
