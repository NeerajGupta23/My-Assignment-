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










// Ans 01, 02, 03: 
// public class prg2 {

//     public static void displayArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + "  ");
//         }
//         System.out.println();
//     }

//     public static void bubbleSort(int[] arr) {
//         boolean flag = false;

//         for (int i = 0; i < arr.length-1; i++) {
//             flag = false;
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if(arr[j] < arr[j+1]) {
//                     arr[j] = arr[j] + arr[j+1] - (arr[j+1] = arr[j]);
//                     flag = true;
//                 }
//             }
//             if(!flag) 
//                 break;
//         }
//     }

//     public static void selectionSort(int[] arr) {
//         int max = 0;

//         for (int i = 0; i < arr.length-1; i++) {
//             max = i;
//             for (int j = i+1; j < arr.length; j++) {
//                 if(arr[max] < arr[j]) {
//                     max = j;
//                 }
//             }
//             if(max != i)
//                 arr[max] = arr[i] + arr[max] - (arr[i] = arr[max]);
//         }
//     }


//     public static void insertionSort(int[] arr) {
//         for (int i = 1; i < arr.length; i++) {
//             for (int j = i; j > 0; j--) {
//                 if (arr[j-1] < arr[j]) {
//                     arr[j] = arr[j] + arr[j-1] - (arr[j-1] = arr[j]);
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 5, 1, 6, 0};
//         displayArray(arr);
//         bubbleSort(arr);
//         displayArray(arr);

        
//         System.out.println();
//         int[] arr1 = {3, 5, 1, 6, 0};
//         displayArray(arr1);
//         selectionSort(arr1);
//         displayArray(arr1);


//         System.out.println();
//         int[] arr2 = {3, 5, 1, 6, 0};
//         displayArray(arr2);
//         insertionSort(arr2);
//         displayArray(arr2);  
//     }
// }




// Ans 04: 
// 1 => [3, 5], 1, 6, 0
// 2 => 5, [3, 1], 6, 0
// 3 => 5, 3, [1, 6], 0
// 4 => 5, 3, 6, [1, 0]
// 5 => [5, 3], 6, 1, 0
// 6 => 5, [3, 6], 1, 0
// 7 => 5, 6, [3, 1], 0
// 8 => [5, 6], 3, 1, 0
// 9 => 6, [5, 3], 1, 0 => sorted
// 10 => [6, 5], 3, 1, 0
// => 6, 5, 3, 1, 0



// Ans 05: 
// 1 => [3], [5], 1, 6, 0
// 2 => [5], 3, [1], 6, 0
// 3 => [5], 3, 1, [6], 0
// 4 => [6], 3, 1, 5, [0]
// 5 => 6, [3], [1], 5, 0
// 6 => 6, [3], 1, [5], 0
// 7 => 6, [5], 1, 3, [0]
// 8 => 6, 5, [1], [3], 0
// 9 => 6, 5, [3], 1, [0] => sorted
// 10 => 6, 5, 3, [1], [0]
// = 6, 5, 3, 1, 0 











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