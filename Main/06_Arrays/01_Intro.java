// Array stores similar type of data types in contigous memory allocation
// Index starts from 0 and so on
// All addresses are known to us , we can go to any index
// Array will be of fixed size , we can not grow it dynamically

// class LPU {
// public static void main(String args[]) {
// int arr[] = { 1, 2, 3, 4, 5, 6 }; // This array is taking space of 6 X 4 = 24
// bytes
// // []int arr = {1,2,3,4,5,6};
// // int []arr= {1,2,3,4,5,6};
// System.out.println(arr[3]);
// }
// }

// class LPU {
// public static void main(String args[]) {
// int arr[] = new int[5]; // new keyword creates an array of 5 items having by
// default value of zero .

// arr[0] = 10;
// arr[4] = 100;

// System.out.println(arr[0]);
// System.out.println(arr[3]);
// System.out.println(arr[4]);

// System.out.println("Length of Array: " + arr.length);

// }
// }

// ------------>Iterating the array
// class LPU {
// public static void main(String args[]) {
// int arr[] = { 1, 2, 3, 4, 5, 6 };

// Method : 1
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);
// }
// Method : 2 Using for each method.
// for(int num : arr){
// System.out.println(num);
// }
// }
// }

// Question: Create an array containing roll numbers of your 10 friends , all
// the friends having even roll number will be printed on console and ignore the
// odd roll numbers.
// class LPU {
// public static void main(String args[]) {
// int arr[] = { 10, 22, 13, 41, 52, 66, 27, 81, 19, 88 };
// for (int num : arr) {
// if (num % 2 != 0)
// continue;
// {
// System.out.println(num);
// }
// }
// }
// }

// Create an array of 5 floats and calculate their sum and print
// class LPU {
// public static void main(String args[]){
// float arr[] = {10.2f,10.5f,22.65f,38.97f,89.98f};
// float sum =0;
// for(int i=0;i<arr.length;i++){
// sum = sum + arr[i];
// }
// System.out.println("Sum: "+ sum);
// }
// }

// ----------------Multi dimensional Arrays   
//             0    1     2  
//             |    |     |
//    0 ->  |  5 |  3  |  9 |
//    1 ->  |  7 |  8  |  2 |
//    2 ->  |  1 |  6  |  4 |
// class LPU {
//     public static void main(String args[]) {
//         int arr[][] = { { 5, 3, 9 }, { 7, 8, 2 }, { 1, 6, 4 } };
//         System.out.println((arr[2][2]));
//     }
// }

// Iterating the multi dimensional Array
// class LPU{
//     public static void main(String args[]){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//         for(int row = 0; row < arr.length; row++){
//             for(int col = 0; col<arr[0].length; col++ ){
//                 System.out.print(arr[row][col] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//Printing only first and last row of matrix
// class LPU{
//     public static void main(String args[]){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//             for(int row=0; row< arr.length;row++){
//                 for(int col = 0; col<arr[0].length;col++)
//                 if(row==0 || row == arr.length-1){
//                         System.out.print(arr[row][col] + " ");
//                 }
//                 System.out.println(); }      
//         }
//     }

//Printing only border elements of matrix and in place of inner elements you have to print space.
// class LPU{
//     public static void main(String args[]){
//         int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//             for(int row=0; row< arr.length;row++){
//                 for(int col = 0; col<arr[0].length;col++)
//                 if(row==0 || row == arr.length-1 || col==0 || col == arr.length-1 ){
//                     System.out.print(arr[row][col] + " ");
//                 }else{
//                     System.out.print("  ");
//                 }
//                 System.out.println(); }      
//         }
//     }

//Print elements of diagonal and below it and rest print space
// class LPU{
//         public static void main(String args[]){
//             int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
//                 for(int row=0; row< arr.length;row++){
//                     for(int col = 0; col<arr[0].length;col++)
//                     if(row>=col){
//                         System.out.print(arr[row][col] + " ");
//                     }else{
//                         System.out.print("  ");
//                     }
//                     System.out.println(); }      
//             }
//         }

// Replace all the negative elements by zero
// class LPU{
//         public static void main(String args[]){
//             int arr[][] = {{3,-5,9},{-1,2,7},{-8,-7,1}};
//                 for(int row=0; row< arr.length;row++){
//                     for(int col = 0; col<arr[0].length;col++)
//                     if((arr[row][col] <0 ) ){
//                         System.out.print("0 ");
//                     }else{
//                         System.out.print(arr[row][col] + " ");
//                     }
//                     System.out.println(); }      
//             }
//         }

//Print sum of each row
// class LPU {

//     public static void main(String args[]) {
//         int arr[][] = { { 3, -5, 9 }, { -1, 2, 7 }, { -8, -7, 1 } };

//         for (int row = 0; row < arr.length; row++) {
//             int sum = 0;
//             for (int col = 0; col < arr[0].length; col++) {

//                 sum = sum + arr[row][col];

//             }
//             System.out.println(sum);
//         }
//     }
// }

//Print minimum number of each row
class LPU {

    public static void main(String args[]) {
        int arr[][] = { { 3, -5, 9 }, { -1, 2, 7 }, { -8, -7, 1 } };

        for (int row = 0; row < arr.length; row++) {
            int temp = arr[row][0];
            for (int col = 0; col < arr[0].length; col++) {

                if (arr[row][col] < temp) {
                    temp = arr[row][col];
                }

            }
            System.out.println(temp);
        }
    }
}
