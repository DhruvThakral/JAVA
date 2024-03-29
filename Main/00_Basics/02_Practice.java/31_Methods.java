//Functions used inside the class are methods


class LPU{

//Method
static int logic(int x , int y){
    int z;
    if(x>y){
        z = x+y;
    }
    else{
        z = (x+y)*5;
    }
    return z;
}

// If we are not using static keyword in method then we have to call this method by making object in main class.
    public static void main(String args[]){
        int a = 5;
        int b = 7;
        int c = logic(a,b);
        System.out.println(c);

        int a1 = 7;
        int b1 = 5;
        int c1 = logic(a1,b1);
        System.out.println(c1);
    }
}