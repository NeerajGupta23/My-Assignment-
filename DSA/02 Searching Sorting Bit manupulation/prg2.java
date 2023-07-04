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