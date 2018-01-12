/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shenzhenmiddleschool;

/**
 *
 * @author rainb
 */
public abstract class Student {
    public String name;
    public String gender;
    public int schoolNumber;
    
    Student(String name, String gender, int number){
        this.name = name;
        this.gender = gender;
        this.schoolNumber = number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        if (gender.equals("male") || gender.equals("female")){
            this.gender = gender;
        } else{
            System.out.println("Illegal input");
        }
    }
    
    public void setSchoolNumber(int number){
        if (number < 1000000000 || number > 1000000000){
            System.out.println("Illegal input");
            return;
        } else{
            this.schoolNumber = number;
        }

    }

    public String getName(){
        return this.name;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public int getSchoolNumber(){
        return this.schoolNumber;
    }

    public String toString(){
        return "Name: " + name + "\tGender: " + gender + "\tSchool Number: " + schoolNumber;
    }
}
