// class LPU {
//     public static void main(String args[]){
//         int a =5;
//         int b= 7;
//         if(a>b){
//             System.out.println("a is greater.");
//         }
//         else{
//             System.out.println("b is greater.");
//         }
//     }
// }

//Write a java program that determines if you can skydive. Skydive can be done by a person whose age is greater than or equal to 18 years and less than or equal to 60 years.

// class LPU {
//     public static void main(String args[]){
//         int age = 20;
        
//         if(age >= 18  && age <= 60){
//             System.out.println("Yes, You can skydive.");
//         }
//         else{
//             System.out.println("No, You can't skydive.");
//         }
//     }
// }


class LPU {
    public static void main(String args[]){
        int num = 4;
        // int output = 0;
        
        
        // if(num%2 == 0) System.out.println("Even");
        // else System.out.println("Odd");

//-----------------------------> Ternary Operator 
        // output = num%2 == 0 ? 0 : 1;

        String output = num%2 == 0 ? "Even" : "Odd"; 
        System.out.println(output);
    }
}



