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
//         Employee hm = new Employee();
//         hm.salary = 24903;
//         hm.name = "Haamu";

//         System.out.println(hm.getSalary());
//         hm.getName();
//         hm.setName("Aam");

//     }
// }



class Square{
    int side;
    public int Perimeter(){
        return 4*side;
    }
    public int Area(){
        return side*side;
    }
}

class LPU{
    public static void main(String args[]){
        Square s = new Square();
        s.side = 3;
        System.out.println(s.Perimeter());
        System.out.println(s.Area());
    }
}