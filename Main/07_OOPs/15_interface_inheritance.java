// class implements class
// class implements interface
// interface extends interface

interface A{
    void print();
}

interface B extends A{
    void show();
}

class C implements A{
    public void print(){
        System.out.println("From print");
    }

    public void show(){
        System.out.println("From show");
    }
}

class LPU{
    public static void main(String args[]){
        C obj = new C();

        obj.print();
        obj.show();
    }
}
