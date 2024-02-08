class Person{
    public String name;
    public int age;

// I have a method which has the same name as of the class name and does not have any return type and this method is executed when we create an object autometically it will come.
// Why we use this? :==>> Initializing the variables 
public Person(){
    System.out.println("From Constructor method");
    name = "Hello";
    age = 20;
}
// For each object default constructor is called once. 


}

class LPU{
    public static void main(String args[]){

        // Constructors

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        // System.out.println(p1.name); 
        // System.out.println(p2.name);
    }
}