class Student{
    // Untill and Unless it can not create object of  class it will not take any space

    public String name;
    public int id;
    public static String uniName;
// If something is commom in all instances(object) there can be used static keyword 

    public void output(){
        System.out.println(" Name : " + name + " ID : " + id+" University : "+uniName);
    }

    public static void myStaticMethod1(){
        System.out.println("From static method : " + uniName);
    }
    public static void myStaticMethod(Student obj){
        System.out.println("From static method : " + obj.id);
    }
}


class LPU{
    
    //public and static keywords are interchangeable
    static public void main(String args[]){
       
        Student s1 = new Student();

        s1.name = "Dhruv";
        s1.id = 1;
        s1.uniName = "LPU";

        Student s2 = new Student();
        s2.name = "Abc";
        s2.id = 2;
        s2.uniName = "LPU";

        s1.output();
        s2.output();

        Student.myStaticMethod(s2);

    }
}


// Difference between static and instance variables
/*
   - Static variable 
        -It is shared by all the instances of the class
        -Can be accessed directly using class name
        -Only one copy exists regardless the number of instances of the class.
    -Instance Variable
        -Each instance has its own copy
        -Can be accessed through class instance
        -Each object will have its own copy of the instance variable.
 */