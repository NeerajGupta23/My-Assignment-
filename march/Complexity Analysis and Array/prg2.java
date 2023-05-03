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
public class prg2 {
    public static void main(String[] args) {
        int[] arr = {34, 21, 54, 65, 43};
        // int[] arr = {4, 3, 6, 7, 1};
        int max = arr[0], max1 = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]) 
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if((max1 < arr[i])) {
                int temp = arr[i];
                if (temp != max) {
                    max1 = arr[i];
                }
            }
        }
        System.out.println(max1);
        Time Complexity = O(n)
        Space Complexity = O(1)
    }    
}