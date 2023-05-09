// Ans 01: 
// public class prg3 {
//     public static void main(String[] args) {
//         // int number = 5;
//         // int number = 10;
//         int number = 64;
//         int result = 0;

//         if ((number & 1) == 0) { // for even numbers 
//             result = 1;
//             while (number > 0) {
//                 int temp = number%2;
//                 result = result*10 + temp;
//                 number /= 2;
//             }
//             result /= 10;
//         }
//         else { // for odd numbers 
//             while (number > 0) {
//                 int temp = number%2;
//                 result = result*10 + temp;
//                 number /= 2;
//             }
//         }


//         System.out.println(result);
//     }
// }




// Ans 02: 
// public class prg3 {
//     public static void main(String[] args) {
//         int n = 8;
//         // int n = 32;
//         int count = 0;


//         while (n > 0) {
//             if (n%2 == 1)
//                 count++;
//             n /= 2; 
//             if (count > 1) {
//                 break;
//             }
//         }

//         if (count == 1) {
//             System.out.println(true);
//         } else {
//             System.out.println(false);
//         }
//     }    
// }



// Ans 03: 
// public class prg3 {
//     public static void main(String[] args) {
//         int input = 8;
//         // int input = 3; 

//         if((input&1) == 0)
//             System.out.println("Even");
//         else
//             System.out.println("Odd");
//     }    
// }



// Ans 04: 
// set bit means 1
// public class prg3 {
//     public static void main(String[] args) {
//         // int n = 8;
//         int n = 31;
//         int count = 0;

//         while (n > 0) {
//             if (n%2 == 1)
//                 count++;
//             n /= 2; 
//         }

//         System.out.println(count);
//     }    
// }



// Ans 05: => important, remember the logic here 
// public class prg3 {
//     public static void main(String[] args) {
//         int[] arr = {4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3};
//         int xorOfArray = 0;
//         for (int i = 0; i < arr.length; i++) {
//             xorOfArray = xorOfArray^arr[i];
//         }
//         System.out.println(xorOfArray);
//     }    
// }