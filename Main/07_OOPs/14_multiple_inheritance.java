interface A{
    // void show();
    void display();
}

interface B{
    void show();
}

// class C extends A,B { }  ==> not possible 
class C implements A,B{
    public void show(){
        System.out.println("Showing");
    }
    public void display(){
        System.out.println("Display");
    }
}

class LPU{
    public static void main(String args[]){
        // We cannot create objects of interfaces
        C obj = new C();
        obj.show();
    }
}

