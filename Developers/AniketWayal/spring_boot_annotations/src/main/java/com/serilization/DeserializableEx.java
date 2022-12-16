package com.serilization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializableEx {

	public static void main (String args[]) {
		try {
			ObjectInputStream ois=new ObjectInputStream (new FileInputStream("m.txt"));
			Book b=(Book)ois.readObject();
			System.out.println("book code: "+b.bcode);
			System.out.println("booj name : "+b.bcode);
		} 
		catch(Exception e) {
			System.out.println();
		}
	}
}
