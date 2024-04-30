import java.util.Scanner;

class Lpu{
    public static void main(String args[]){
        String name = "Hello";
        System.out.println(name);


        int a = 5;
        float b = 56838.368292f;
        System.out.printf("Int is: %d and Float(with 2 decimal places and 8 spaces in front) : %8.2f",a,b);
        System.out.println("   ");

        // Input a string;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.println("Your String is: "+str);
    }
}