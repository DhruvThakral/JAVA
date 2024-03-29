class LPU{

    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
// If we want a number that is required in all our outputs
    static int sum1(int x,int ...arr){
    int result = 0;
    for(int a : arr){
        result += a;
    }
    return x+result;
    }
    public static void main(String args[]){
        System.out.println("Sum of Nothing is: "+sum());
        System.out.println("Sum of nothing is: "+sum1(1));
        System.out.println("Sum of 1 and 2 : "+sum(1,2));
        System.out.println("Sum of 1, 2 and 3:"+sum(1,2,3));

    }
}