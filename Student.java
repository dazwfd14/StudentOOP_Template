package com.mycompany.testencapsulation;

public class Student {
    
    //instance variables 
    //change the access modifier 
    //from public -> private 
    //encapsulate the instance variable 
    private int age; 
    
    //Setter Method 
    public void setAge(int age)
    {
        //Validate age
        if ((age<0)||(age>120))
        {
            this.age = 12; //default value
        }
        else {
            this.age = age; 
        }
    } //end setter 
    
    //Getter Method
    public int getAge()
    {
        return this.age; 
    }
    
} //end Student Class
