class A{
    void method1(){
        System.out.println("From B");
    }
}

class B extends A{
   
}

class LPU{
    public static void main(String args[]){
        // Compile Time : Early Binding
        // Run Time : Late Binding


        // Upcasting : If the reference variable of Parent class refers to the object of child class 
        A obj = new B();

        obj.method1();

    }
}

