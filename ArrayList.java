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
//Sample program

package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// creating an arraylist with object al
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(11);
        al.add(22);
        al.add(33);
        al.add(44);
        al.add(55);
        al.add(66);

        //Printing all the elements in the arraylist
        System.out.println("Arraylist : "+al);

        //To fetch any element in arraylist
        System.out.println("The second element is :"+al.get(1));

        //To change any element of the arraylist
        al.set(0,00);
        System.out.println("New Arraylist : "+al);

        //To know the size of the arraylist
        al.add(33);
        System.out.println("Arraylist size: "+al.size());

        //To delete an element from the arrraylist
        al.remove(1);
        System.out.println("New Arraylist after removal of element at index 1: "+al);
        System.out.println("Arraylist size after removal of element at index 1: "+al.size());
    }
}}
