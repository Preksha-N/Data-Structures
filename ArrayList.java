/*************************************************************************/
/*Arraylist class implements List interface and it is based on an Array data structure. It is widely used because of the functionality and flexibility it offers. */

import java.util.*;
public class Initialization {
   public static void main(String args[]) {
	   ArrayList<String> obj = new ArrayList<String>(
		Arrays.asList("Apple", "Mango", "Pears","Cherry));
	  System.out.println("Elements are:"+obj);
   }
}

/*************************************************************************/

import java.util.ArrayList;
public class Details
{
    public static void main(String [] args)
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        System.out.println("Initial size: "+ar.size());
        ar.add(1);
        ar.add(2);
        ar.add(3);
        al.add(4);
        
        System.out.println("Size after four additions: "+ar.size());
        ar.remove(1);
        ar.remove(2);
        System.out.println("Size after remove operations: "+ar.size());
        System.out.println("Final size ");
        for(int number: ar){
            System.out.println(number);
        }
   }
}