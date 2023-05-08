// Q1: Write a program to print the sum of all the elements present on even indices in the given array
// Ans :  
// public class prg2 {
//     public static void main(String[] args) {
//         // int[] arr = {3, 20, 4, 6, 9};
//         int[] arr = {4, 3, 6, 7, 1};
//         int sum = 0;
//         for (int i = 0; i < arr.length; i+=2) {
//             sum += arr[i];
//         }
//         System.out.println(sum);
//         // Time Complexity = O(n)
//         // Space Complexity = O(1)
//     }
// }



// Q2: Write a program to traverse over the elements of the array using for each loop and print all even elements.
// public class prg2 {
//     public static void main(String[] args) {
//         // int[] arr = {34, 21, 54, 65, 43};
//         int[] arr = {4, 3, 6, 7, 1};
//         for (int i : arr) {
//             if((i&1) == 0) {
//                 System.out.print(i + "  ");
//             }
//         }
//     }    
// }



// Q3: Write a program to calculate the maximum element in the array 
// public class prg2 {
//     public static void main(String[] args) {
//         // int[] arr = {34, 21, 54, 65, 43};
//         int[] arr = {4, 3, 6, 7, 1};
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if(max < arr[i]) 
//                 max = arr[i];
//         }
//         System.out.println(max);
//     }    
// }



// Q4: Write a program to find out the second largest element in a given array. 
// public class prg2 {
//     public static void main(String[] args) {
//         int[] arr = {34, 21, 54, 65, 43};
//         // int[] arr = {4, 3, 6, 7, 1};
//         int max = arr[0], max1 = Integer.MIN_VALUE;

//         for (int i = 1; i < arr.length; i++) {
//             if(max < arr[i]) 
//                 max = arr[i];
//         }

        
//         for (int i = 0; i < arr.length; i++) {
//             if((arr[i] != max) && (max1 < arr[i]))
//                 max1 = arr[i];
//         }

//         System.out.println(max1);
//     }    
// }



// Q5:  Given an array. Find the first peak element in the array. A peak element is an element that is greater than its just left and just right neighbor
// public class prg2 {
//     public static void main(String[] args) {
//         int[] arr = {1, 3, 2, 6, 5};
//         // int[] arr = {1, 4, 7, 3, 2, 6, 5}
//         int n = arr.length;

//         if ((1 < n) && arr[0] > arr[1]) {
//             System.out.println(arr[0]);
//         }
//         else if ((n-2 >= 0) && (arr[n-1] > arr[n-2])) {
//             System.out.println(arr[n-1]);
//         }
//         else {
//             for (int i = 1; i < n-1; i++) {
//                 if((arr[i-1] < arr[i]) && (arr[i] < arr[i+1])) {
//                     System.out.println(arr[i]);
//                     break;
//                 }
//             }
//         }
//     }    
// }