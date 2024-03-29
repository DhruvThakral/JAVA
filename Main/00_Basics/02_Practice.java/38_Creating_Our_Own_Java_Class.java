// class Employee {
//     int id;
//     int salary;
//     String name;
//     public int getSalary(){
//         return salary;
//     }
//     public void PrintDetails(){
//         System.out.println("My id is: "+id);
//         System.out.println("My name is "+name);
//         System.out.println("My salary is : "+getSalary());
//     }
// }

// class LPU{
//     public static void main(String args[]){
//         Employee Ham = new Employee();

//         Ham.id = 2;
//         Ham.salary = 34;
//         Ham.name = "Hammy";
//         Ham.PrintDetails();


//     }
// }



// class Employee{
//     int salary;
//     String name;

//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name = n;
//     }
// }

// class LPU{
//     public static void main(String args[]){
//         Employee A = new Employee();
//         A.name = "Aman";
//         A.salary = 34;
//         System.out.println(A.getSalary());
//         System.out.println(A.getName());
//         A.setName("Ayush");
//         System.out.println(A.getName());
//     }
// }


// class Employee {
//     private int salary ;
//     private String name;
   
//     public Employee(int S , String N){
//         salary = S;
//         name = N;
//     }

//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         this.name = n;
//     }
//     public int getSalary(){
//         return salary;
//     }
//     public void setSalary(int s){
//         this.salary = s;
//     }
// }

// class LPU{
//     public static void main(String args[]){
//         Employee A = new Employee(2222,"Aam");
//         // A.getSalary();
//         // A.getName();
//         System.out.println(A.getSalary());
//         System.out.println(A.getName());
//     }
// }


// class Base {
//     int x ;
//     public int getX(){
//         return x;
//     }
//     public void setX(int m){
//         System.out.println("I am in Base and setting x now.");
//         this.x=m;
//     }
// }

// class Derived extends Base{
//     int y;
//     public int getY(){
//         return y;
//     }
//     public void setY(int b){
//         System.out.println("I am in Derived and setting y now.");
//         this.y=b;
//     }
// }

// class LPU{
//     public static void main(String args[]){
//         Derived Ham = new Derived();
        
//         Ham.setX(4);
//         System.out.println(Ham.getX());

//         Ham.setY(5);
//         System.out.println(Ham.getY());

//     }
// }

class Base {
    Base(){
        System.out.println("I am a base class constructor");
    }
    Base(int x){
        System.out.println("I am a base class constructor "+ x);
    }
}

class Derived extends Base {
    Derived(){
        super(56);
        System.out.println("I am a derived class constructor");
    }
    Derived(int x , int y){
        // super(x);
        System.out.println("I am a derived class constructor "+x+" "+y);
    }
}

class LPU{
    public static void main(String args[]){
        Derived A = new Derived( );

    }
}