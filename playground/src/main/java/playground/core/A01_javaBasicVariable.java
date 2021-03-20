/**********
 * package 
 * A package is a "namespace" that organizes a set of related classes and interfaces. 
 * (like folder/directory to files)
 ***********/
package playground.core;


/**********
 * class
 * A "class" is the blueprint from which individual objects are created.
 * class: every line of code in java need to be inside a "Class".
 ***********/
public class A01_javaBasicVariable {

	
/**********
 * attributes (global variable)
 * attributes / variable declaration 
 * (variable inside a class is an "attributes")
 *  
 * access Modifiers attributes: private/ public/ default/ protected
 * 
 * private: accessible only within the declared class itself.
 * public: accessible from any other class
 * default: no access control modifier available to any other class in the same package
 * protected: like "default" + "subclasses" can access protected variable/method of the superclass
 * 
 ***********/
		
//// variable type: boolean, char, byte, short, int, long, float, double, 
private	 boolean  flag            = false;
private  char     charIcon        = 'A';
private  char     charIconNumber  = 67;
private  byte     byteNumber      = 127;
private  short    shortNumber     = 32767; 
private  int      intNumber       = 2147483647;
private  long     longNumber      = 923372037;
private  float    floatNumber     = (float) 3.4028235E38;
private  double   doubleNumber    = 1.7976931348623157E308;


////static - static variable/method belongs to the class.
public static int intCount = 0;	
private static final double PI = 3.1415929; //final is a constant,(we cannot change the value)

// object ?
private String Describe;	// String sequence of characters.

	
/**********
 * 	
 * constructors - 
 * 
 * constructor - is special methods invoked when an object is created.
 * constructor name must be same as its class name (with no "return" option)
 * (Constructor is used to create a new Instance of the Class)
 * 
 ***********/	
	public A01_javaBasicVariable() {
		
		System.out.println("---[ variable  type and value ]------------");
		System.out.println("boolean  " + flag);
		System.out.println("char Icon  " + charIcon);
		System.out.println("char Icon Number  " + charIconNumber);
		
	} // constructors

} // class
