//-----------------------Pattern Printing

// i=0     * * * *   -->4 stars
// i=1     * * * *   -->4 stars
// i=2     * * * *   -->4 stars
// i=3     * * * *   -->4 stars
// Use outer loop for rows and inner loop for columns

// class LPU {
//     public static void main(String args[]){
//         for(int i=0;i<4;i++){
//             for(int j=0;j<4;j++){
//                 System.out.print(" * ");
//             }
//             System.out.print("\n");
//         }

//     }
// }

//i=1      *           j=1
//i=2      * *          j=2
//i=3      * * *        j=3
//i=4      * * * *      j=4
// class LPU {
//     public static void main(String args[]) {
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(" * ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//      0
//      0 1
//      0 1 2 
//      0 1 2 3
//      j ki values print ho rhi hai jitna bhi mera i hai
// class LPU {
//     public static void main(String args[]) {
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// * * * * *
// * * * *
// * * *
// * *
// *
// class LPU {
//     public static void main(String args[]) {
//         for (int i = 5; i > 0; i--) {
//             for (int j = i; j > 0; j--) {
//                 System.out.print(" * ");
//             }
//             System.out.print("\n");
//         }
//     }
// }

//              *           
//          *   *   *
//      *   *   *   *   *
//  *   *   *   *   *   *   *











