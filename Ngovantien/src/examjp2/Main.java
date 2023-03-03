/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjp2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {
 	public static void main(String[] args) {
		StudentList sl = new StudentList();
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Menu");
			System.out.println("----------------------------");
			System.out.println("1. Add new student");
			System.out.println("2. Display");
			System.out.println("3. Save");
			System.out.println("4. Display book records");
			System.out.println("5. Exit");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1: 
				System.out.println("Enter Enrol ID:");
				String sId = sc.nextLine();
				System.out.println("Enter FirstName:");
				String sFn = sc.nextLine();
				System.out.println("Enter LastName:");
				String SLn = sc.nextLine();
				System.out.println("Enter Age:");
				double sA = sc.nextDouble();
				Student st = new Student(sId, SLn, SLn, sA);
				sl.add(st);
				break;
			case 2: 
				sl.render();
				break;
			case 3: 
				System.out.println("Enter File Path:");
				String file = sc.nextLine();
				File f = new File(file);
				sl.writeFile(f);
				break;
			case 4: 
				System.out.println("Enter File Path:");
				file = sc.nextLine();
				f = new File(file);
				sl.readFile(f);
                                sl.render();
				break;
			case 5: 
				System.out.println("Good bye!!!!");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
			
		} while (ch!=5);
	}
}
