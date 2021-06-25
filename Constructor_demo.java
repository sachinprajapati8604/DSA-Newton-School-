package com.company;
//no argument constrotor
class Demo{
    int id;
    String name;
    // contructor name is  same as class name219
    Demo(){
        System.out.println("Constructor called ");
    }
    //parameterized constructor
    Demo(int id ,String name){
        this.id=id;
        this.name=name;
    }
}
public class Constructor_demo {
    public static void main(String[] args) {
        // creating object for  no argument constructor
        Demo obj=new Demo();
        System.out.println(obj.name); // it will give null because no argument set
        System.out.println(obj.id); // initial value is 0
        //creating  parameterized cons.
        Demo obj2=new Demo(1,"Sachin Prajapati");
        System.out.println("ID : "+obj2.id+" , Name :"+obj2.name);
    }
}
