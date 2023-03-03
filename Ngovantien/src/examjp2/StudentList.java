/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class StudentList {
    ArrayList<Student> sl;

	public StudentList() {
		sl = new ArrayList<>();
	}
	public StudentList(ArrayList<Student> sl) {
		this.sl = sl;
	}
	
	public void add(Student st) {
		sl.add(st);
	}
	
	public void render() {
		System.out.println("EnrolID\t\tFull Name\t\tAge" );
		System.out.println("------------------------------------------------------------" );
		for (Student st : sl) {
			st.display();
		}
	}
	
	public void writeFile(File f) {
		try {
			OutputStream os = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			for (Student st : sl) {
				oos.writeObject(st);
			}
			oos.flush();
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readFile(File f) {
		try {
			InputStream is = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(is);
			while(is.available()>0) {
				Student st = (Student) ois.readObject();
				if(st!=null) {
					sl.add(st);
				}
			}

			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
