/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    mother m=new mother();
	    m.show(); //calls mother class fn
	    child c=new child();
	    c.show(); //calls child show() due to Overriding
	}
}
