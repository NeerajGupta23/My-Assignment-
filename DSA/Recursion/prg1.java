// Ans 01:
// Time Complexity = O(n)
// Space Complexity = O(n) 
// where n is the total digit of number 
// public class prg1 {
//     public static int sumOfDigit(int n) {
//         int temp = n%10;
//         if(n == 0)
//             return 0;
//         return temp+sumOfDigit(n/10);
//     }
//     public static void main(String[] args) {
//         int n = 1234;
//         System.out.println(sumOfDigit(n));        
//     }    
// }




// Ans 02: 
// Time Complexity = O(n)
// Space Complexity = O(n) 
// public class prg1 {
//     public static int addSubOfNaturalNo(int n) {
//         if(n == 1)
//             return 1;
//         else if((n&1) == 0)
//             return  addSubOfNaturalNo(n-1) - n;
//         else 
//             return addSubOfNaturalNo(n-1) + n;
//     }
//     public static void main(String[] args) {
//         // int n = 5;
//         int n = 10;
//         System.out.println(addSubOfNaturalNo(n));
//     }    
// }





// Ans 03: 
// public class prg1 {
//     public static int printArray(int[] arr, int max, int i) {
//         if (i == arr.length - 1) {
//             if (max > arr[i]) 
//                 return max;
//             else 
//                 return arr[i];
//         } else {
//             max = printArray(arr, max, i+1);
//             if (max > arr[i]) 
//                 return max;
//             else 
//                 return arr[i];
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = { 13, 1, -3, 22, 5 };
//         int max = arr[0];
//         System.out.println(printArray(arr, max, 1));
//     }
// }



// Ans 04: 
// public class prg1 {
//     public static int sumOfArray(int[] arr, int i) {
//         if(i == arr.length-1)
//             return arr[i];
//         else 
//             return arr[i] + sumOfArray(arr, i+1);
//     }
//     public static void main(String[] args) {
//         int[] arr = {92, 23, 15, -20, 10};
//         System.out.println(sumOfArray(arr, 0));
//     }    
// }




// Ans 05: 
// import java.util.Scanner;
// public class prg1 {
//     public static int powerOfElement(int a, int b) {
//         // base case
//         if (b == 1)
//             return a;
//         else {
//             int result = powerOfElement(a, b / 2);
//             result = result * result;
//             if ((b & 1) == 0) { // even
//                 return result;
//             }
//             result = result * a;
//             return result;
//         }
//     }

//     public static int isArmstrong(int num, int pow) {
//         if (num == 0)
//             return 0;
//         else {
//             int temp = num % 10;
//             int power = powerOfElement(temp, pow);
//             return power + isArmstrong(num / 10, pow);
//         }
//     }

//     public static void main(String[] args) {
//         System.out.print("Enter any +ve no: ");
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         // counting digits
//         int num1 = num;
//         int count = 0;
//         while (num1 > 0) {
//             count++;
//             num1 /= 10;
//         }
//         if (num == (isArmstrong(num, count)))
//             System.out.println("Yes");
//         else
//             System.out.println("No");
//         sc.close();
//     }
// }