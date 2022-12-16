package com.importutil;

import java.util.*;

public class UtilPackage {

	public static void print(int array[])
    {
 
        System.out.print("Array: { ");
 
        for (int i = 0; i < 5; i++)
            System.out.print(array[i] + " ");
 
        System.out.print("}");
    }
   
    public static void main(String[] args)
    {
        ArrayList<String> arrayList
            = new ArrayList<String>();
 
        arrayList.add("Aniket");
        arrayList.add("navnath");
        arrayList.add("wayal");
 
        int array[] = { 10, 30, 59, 110, 200 };
 
        Arrays.sort(array);
 
        System.out.println("ArrayList: " + arrayList);
 
        print(array);
    }

}