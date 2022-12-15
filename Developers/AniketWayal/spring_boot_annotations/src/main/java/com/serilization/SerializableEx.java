package com.serilization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableEx {
	public static void main (String args[]) {
		Book b=new Book(101,"java");
		try {
			FileOutputStream fos = new FileOutputStream("m.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(b);
			fos.close();
			System.out.println("task completed");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
