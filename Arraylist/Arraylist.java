/***********************************************************************/
/*Arraylist class implements List interface and it is based on an Array data structure. It is widely used because of the functionality and flexibility it offers. */

import java.util.*;
public class Arraylist {
   public static void main(String args[]) {
	   ArrayList<String> obj = new ArrayList<String>(
		Arrays.asList("Apple", "Mango", "Pears","Cherry"
       ));
	  System.out.println("Elements are:"+obj);
   }
}

