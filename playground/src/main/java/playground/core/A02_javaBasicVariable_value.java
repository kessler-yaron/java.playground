//// package 
package playground.core;

//// class
public class A02_javaBasicVariable_value {


//// attributes (global variable)
//// variable type: boolean, char, byte, short, int, long, float, double, 

private	 boolean  flag            = false;
private  char     charIcon        = 'A';

	
//// constructors
	public A02_javaBasicVariable_value() {
		
		System.out.println("char / Character (16 bit / 2 byte)  == " + Character.MIN_VALUE + " <--> " + Character.MAX_VALUE);
		System.out.println("byte (8 bit / 1 byte) == " + Byte.MIN_VALUE + " <--> " + Byte.MAX_VALUE);  
		System.out.println("short (16 bit / 2 byte) == " + Short.MIN_VALUE + " <--> " + Short.MAX_VALUE); 
		System.out.println("int / Integer (32 bit / 4 byte) == " + Integer.MIN_VALUE + " <--> " + Integer.MAX_VALUE);
		System.out.println("long (64 bit / 8 byte)  == " + Long.MIN_VALUE + " <--> " + Long.MAX_VALUE);	
        System.out.println("foat (32 bit / 4 byte) == " + Float.MIN_VALUE + " <--> " + Float.MAX_VALUE);
        System.out.println("double (64 bit / 8 byte) == " + Double.MIN_VALUE + " <--> " + Double.MAX_VALUE);				
	} // constructors

} // class
