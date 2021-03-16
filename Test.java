
package com.mycompany.testencapsulation;


public class Test {

 
    public static void main(String[] args) {
        
        //Create a Student object 
        Student s1 = new Student();
        
        //set the age for the student 
//        s1.age = -500; 
//        System.out.println("Age: "+s1.age);

        s1.setAge(-500);
        System.out.println(s1.getAge()); //23 

        
    } //End Main Method
    
} //end Test class 
