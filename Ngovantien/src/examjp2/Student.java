/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjp2;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Student implements Serializable{

    private String enrolId;
    private String firstName;
    private String lastName;
    private double age;

    public Student() {
    }

    public Student(String enrolId, String firstName, String lastName, double age) {
        this.enrolId = enrolId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEnrolId() {
        return enrolId;
    }

    public void setEnrolId(String enrolId) {
        this.enrolId = enrolId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void display() {
        System.out.println(enrolId + "\t\t" + firstName  + lastName + "\t\t\t" + age);
    }

}
