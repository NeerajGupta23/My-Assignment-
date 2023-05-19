// Ans 01: 
// import java.util.Scanner;
// public class prg1 {
//     public static int linearSearch(int[] arr, int key) {
//         for (int i = 0; i < arr.length; i++) {
//             if (key == arr[i])
//                 return i;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         System.out.print("Enter the number of elements you want to add : ");
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int[] numberArray = new int[size];
//         System.out.print("Enter the elements of the array : ");
//         for (int i = 0; i < size; i++) {
//             numberArray[i] = sc.nextInt();
//         }

//         System.out.print("Enter the elements to be searched in array : ");
//         int key = sc.nextInt();

//         // Linear Search
//         int value = linearSearch(numberArray, key);
//         if (value != -1) {
//             System.out.println(value);
//         } else {
//             System.out.println("Element not found in array");
//         }
//         sc.close();
//     }
// }




// Ans 02: 
// public class prg1 {
//     public static int lastOccurence(int[] arr, int target) {
//         int left = 0, right = arr.length-1;
//         int resultantIndex = -1;

//         while (left <= right) {
//             int mid = left + (right-left)/2; // to avoid overflow of integer

//             if (target == arr[mid]) {
//                 resultantIndex = mid;
//                 left = mid + 1;
//             }
//             else if (target < arr[mid]) {
//                 right = mid -1;
//             }
//             else if (target > arr[mid]) {
//                 left = mid + 1;
//             }
//         }
//         return resultantIndex;
//     }

//     public static void main(String[] args) {
//         // int[] arr = {1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6};
//         int[] arr = {2, 2, 2, 6, 6, 18, 29, 30, 30, 30}; 
//         // int target = 4; 
//         int target = 15;
        
        
//         System.out.println(lastOccurence(arr, target)); 
//     }    
// }



// Ans 03: 
// public class prg1 {
//     // Time Complexity = O(log(base 2)n)
//     // Space Complexity = O(1)

//     public static int firstOccurenceOfOne(int[] arr) {
//         int indexOfOne = -1;
//         int left = 0, right = arr.length - 1;

//         while (left <= right) {
//             int mid =  left + (right-left)/2;

//             if(arr[mid] == 1) {
//                 indexOfOne = mid;
//                 right = mid - 1;
//             } 
//             else if (arr[mid] < 1) {
//                 left = mid + 1;
//             }
//         }

//         return indexOfOne;
//     }

//     public static void main(String[] args) {
//         int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1};
//         // int[] arr = {0, 0, 0, 0, 0, 1, 1};

//         int firstIndexOfOne = firstOccurenceOfOne(arr);
//         if(firstIndexOfOne != -1)
//             System.out.println(arr.length - firstIndexOfOne);
//         else 
//             System.out.println(0);
//     }
// }




// Ans 04: 
// Time Complexity = O(log(base 2)n)
// Space Complexity = O(1)
// public class prg1 {
//     public static int firstOccurrence(int[] arr, int target) {
//         int indexOfTarget = -1;
//         int left = 0, right = arr.length-1;

//         while (left <= right) {
//             int mid = left + (right-left)/2;
//             if (target == arr[mid]) {
//                 indexOfTarget = mid;
//                 right = mid - 1;
//             }
//             else if (target < arr[mid]) {
//                 right = mid -1;
//             }
//             else if (target > arr[mid]) {
//                 left = mid + 1;
//             }
//         }

//         return indexOfTarget;
//     }
//     public static int lastOccurrence(int[] arr, int target) {
//         int indexOfTarget = -1;
//         int left = 0, right = arr.length-1;

//         while (left <= right) {
//             int mid = left + (right-left)/2;
//             if (target == arr[mid]) {
//                 indexOfTarget = mid;
//                 left = mid + 1;
//             }
//             else if (target < arr[mid]) {
//                 right = mid -1;
//             }
//             else if (target > arr[mid]) {
//                 left = mid + 1;
//             }
//         }

//         return indexOfTarget;
//     }
//     public static void main(String[] args) {
//         int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
//         int target = 5;
//         // int target = 6;


//         int firstOccurrenceOfTarget = firstOccurrence(arr, target);
//         int lasttOccurrenceOfTarget = lastOccurrence(arr, target);
        
//         if (firstOccurrenceOfTarget != -1)
//             System.out.println("Target " + target + " occurs " +(lasttOccurrenceOfTarget - firstOccurrenceOfTarget + 1) + " times"); // fromula = last - first + 1
//         else 
//             System.out.println("given target not found");
//     }    
// }



// Ans 05: 
// Time Complexity = O(log(base 2)n)
// Space Complexity = O(1)
// public class prg1 {
//     public static boolean isPerfectSquare(int traget) {
//         int left = 1, right = traget;

//         while (left <= right) {
//             int mid = left + (right - left)/2;
//             if((mid*mid) == traget) {
//                 return true;
//             }
//             else if ((mid*mid) < traget) {
//                 left = mid + 1;
//             }
//             else if ((mid * mid) > traget) {
//                 right = mid -1;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int target = 625;
//         System.out.println(isPerfectSquare(target));
//     }    
// }