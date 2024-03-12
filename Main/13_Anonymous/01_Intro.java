class Calculate{
    int a;
    Calculate(int n){
        a = n;
    }

    void area(){
        int area = a*a;
        System.out.println("Area : "+area);
    }
    void perimeter(int b){
        int peri = 4 * b;
        System.out.println("Perimeter : "+peri);
    }
}

class LPU{
    public static void main(String args[]){
        new Calculate(5).area(); 
        // Creating an object in the heap memory and i dont have any reference to it then that object is anonymous object.
       new Calculate(5).perimeter(100);
    }
}

