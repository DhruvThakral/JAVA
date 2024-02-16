class Office{
    int id;
    String name;

    public void Oinfo(){
        System.out.print(this.id + " ");
        System.out.println(this.name);
    }

    //Non parameterized construstor
    Office(){
        System.out.println("Constructor called");
    }

    //Parameterized Constructor
    Office(int id,String name){
        this.id = id;
        this.name = name;
    }
}

class LPU{
    public static void main(String args[]){
        Office emp1 = new Office();
        Office emp2 = new Office();
        Office emp3 = new Office();
        Office emp4 = new Office(34,"S");

        emp1.id = 1;
        emp1.name = "A";

        emp2.id = 2;
        emp2.name="B";

        emp3.id = 3;
        emp3.name = "C";

        // emp4.id=4;
        // emp4.name="D";


        emp1.Oinfo();
        emp2.Oinfo();
        emp3.Oinfo();
        emp4.Oinfo();


    }
}