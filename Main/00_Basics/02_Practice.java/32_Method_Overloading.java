class LPU{

    static void foo(){
        System.out.println("Good Morning!");
    }
    static void foo(int a){
        System.out.println("Good Morning! "+a);
    }
    // Here a and b are parameters
    static void foo(int a , int b){
        System.out.println("Good Morning! "+a+" "+b);
    }

    //This can not be made in method overloading only by changing void to int or viceversa
    // static int foo(int a , int b){
    //     System.out.println("Good Morning! "+a+" "+b);
    // }

    public static void main(String args[]){
    foo();
    foo(1);
    // Here values of a and b are arguments like a=1 , b=3
    foo(1,3);

    }
}