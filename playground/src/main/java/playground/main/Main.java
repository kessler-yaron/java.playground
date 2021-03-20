/**
 * @author kessler Yaron
 * @nickname Jron :)
 */

package playground.main;

import playground.core.A00_playground_core;

public class Main {

/* 
 * constructor()
 */
	public Main() {
		new A00_playground_core();
	}

/*
 * main()
 */

	/********************
	 *
	 *  main Method/functions - first method that run inside a class.
	 *  
	 * 	public - anyone can access it
	 * 	static - method that can run without creating an "instance of the class"
	 * 	void - method do not return value (when done execute)
	 * 	main - first method executed (need one in every java program)	
	 *  String[] args - Argument Array object.
	 *  
	 ********************/
	
	public static void main(String[] args) {
		new Main();

	}

}
