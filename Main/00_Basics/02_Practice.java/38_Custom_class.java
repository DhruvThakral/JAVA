class Employee{
    int id;
    int salary;
    String name;

    public void getDetails(){
        System.out.println("My name is: "+name+" and my id with salary is : "+id+" "+salary);
    }
}

class LPU{
    public static void main(String args[]){
        Employee h = new Employee();
        h.id = 1;
        h.salary = 23;
        h.name = "HariOm";

        h.getDetails();

    }
}