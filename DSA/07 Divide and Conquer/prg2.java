// Ans 01: 
// public class prg2 {
//     static class Ans {
//         int i;
//         int j;
//     }
//     static int count = 0;

//     public static void findIndex(int[] arr, int low, int high, Ans ans) {
//         if(low <= high) {
//             int mid = low + (high - low)/2;

//             // if(count == 2)
//             //     return;
//             if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
//                 ans.i = mid;
//                 count++;    
//             }
//             if(arr[mid] < arr[mid+1] && arr[mid] < arr[mid-1]) {
//                 ans.j = mid;
//                 count++;
//             }

//             findIndex(arr, low, mid-1, ans);
//             findIndex(arr, mid+1, high, ans);
//         }
//     }

//     public static void swapArray(int[] arr, int low, int high) {
//         Ans ans = new Ans();
//         findIndex(arr, low+1, high-1, ans);
//         System.out.println(ans.i + "  " + ans.j);

//         if(arr[0] > arr[1])
//             ans.i = 0;
//         if(arr[arr.length-1] < arr[arr.length-2])
//             ans.j = arr.length-1;

//         // swap 
//         int temp = arr[ans.i];
//         arr[ans.i] = arr[ans.j];
//         arr[ans.j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 8, 6, 7, 5, 9, 10};
//         // int[] arr = {0, 1, 5, 3, 4, 2, 6, 7, 8, 9, 10, 11, 12};
//         swapArray(arr, 0, arr.length-1);
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + "  ");
//         } 
//     }
// }



// Ans 02: 
// import java.util.Arrays;

// public class prg2 {
//     public static void main(String[] args) {
//         int[] arr = { 19, -20, 7, -4, -13, 11, -5, 3 };

//         // step 01
//         if (arr[0] > 0) { // +ve
//             int i = 1;
//             while (arr[i] > 0)
//                 i++;

//             // swap
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;
//         }

//         // step 02
//         int positivePointer = 1, negativePointer = 0;
//         while (positivePointer < arr.length) {
//             if (arr[positivePointer] > 0)
//                 positivePointer++;
//             else {
//                 negativePointer++;
//                 // swap
//                 int temp = arr[negativePointer];
//                 arr[negativePointer] = arr[positivePointer];
//                 arr[positivePointer] = temp;
//                 positivePointer++;
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }



// Ans 03: 
// public class prg2 {
//     public static void partition(int[] num, int[] temp, int l, int h) {
//         if (h <= l) {
//             return;
//         }
//         // find midpoint
//         int mid = (l + ((h - l) >> 1));

//         partition(num, temp, l, mid);          // split/merge left half
//         partition(num, temp, mid + 1, h);     // split/merge right half

//         merge(num, temp , l, mid, h);        // join the two half runs
//     }
        
//     public static void merge(int[] num, int[] temp, int l, int mid, int h) {
//             int k = l;
//             // copy negative elements from the left subarray
//             for (int i = l; i <= mid; i++) {
//                     if (num[i] < 0) {
//                             temp[k++] = num[i];
//                     }
//             }
//             // copy negative elements from the right subarray
//             for (int j = mid + 1; j <= h; j++) {
//                     if (num[j] < 0) {
//                             temp[k++] = num[j];
//                     }
//             }
//             // copy positive elements from the left subarray
//             for (int i = l; i <= mid; i++) {
//                     if (num[i] >= 0) {
//                             temp[k++] = num[i];
//                     }
//             }
//             // copy positive elements from the right subarray
//             for (int j = mid + 1; j <= h; j++) {
//                     if (num[j] >= 0) {
//                             temp[k++] = num[j];
//                     }
//             }
//             // copy back to the original array to reflect the relative order
//             for (int i = l; i <= h; i++) {
//                     num[i] = temp[i];
//             }
//     }

//     public static void main(String[] args) {
//         int[] num = { 19, -20, 7, -4, -13 , 11 , -5 , 3};
//         int n = num.length;
//         int[] temp = new int[n];
//         for (int i = 0; i < n; i++) {
//                 temp[i] = num[i];
//         }
//         partition(num, temp, 0, n - 1);
//         for (int i = 0; i < n; i++) {
//                 System.out.print(num[i] + " ");
//         }  
//     }  
// }

// or 

// import java.util.Arrays;
// public class prg2 {
//     public static void main(String[] args) {
//         int[] num = { 19, -20, 7, -4, -13 , 11 , -5 , 3};
//         int[] ans = new int[num.length];

//         // -ve 
//         int k = 0;
//         for (int i = 0; i < num.length; i++) {
//             if(num[i] < 0)
//                 ans[k++] = num[i];
//         }
//         for (int i = 0; i < num.length; i++) {
//             if(num[i] > 0)
//                 ans[k++] = num[i];
//         }
//         System.out.println(Arrays.toString(ans));
//     }    
// }





// ans 04: 
// import java.util.Arrays;
// import java.util.Collections;
// public class prg2 {
//     public static void main(String[] args) {
//         int a[] = {1, 2, 2, 1}; 
//         Integer b[] = { 3, 3, 3, 4 };
//         int k = 5;
//         Arrays.sort(a);
//         Arrays.sort(b, Collections.reverseOrder());

//         int i = 0;
//         for (; i < b.length; i++) {
//             System.out.println(a[i] + " : " + b[i]);
//             if ((a[i] + b[i]) < k) {
//                 System.out.println(false);
//                 break;
//             }
//         }
//         if(i == b.length)
//             System.out.println(true);
//     }    
// }




// Ans 05: 
// public class prg2 {
//     // An interval has start time and end time
//     static class Interval {
//         int start;
//         int end;

//         public Interval(int start, int end) {
//             super();
//             this.start = start;
//             this.end = end;
//         }
//     };

//     static boolean isIntersect(Interval arr[], int n) {

//         int max_ele = 0;

//         // Find the overall maximum element
//         for (int i = 0; i < n; i++) {
//             if (max_ele < arr[i].end)
//                 max_ele = arr[i].end;
//         }

//         // Initialize an array of size max_ele
//         int[] aux = new int[max_ele + 1];
//         for (int i = 0; i < n; i++) {

//             // starting point of the interval
//             int x = arr[i].start;

//             // end point of the interval
//             int y = arr[i].end;
//             aux[x]++;
//             aux[y]--;
//         }
//         for (int i = 1; i <= max_ele; i++) {
//             // Calculating the prefix Sum
//             aux[i] += aux[i - 1];

//             // Overlap
//             if (aux[i] > 1)
//                 return true;
//         }

//         // If we reach here, then no Overlap
//         return false;
//     }

//     public static void main(String[] args) {
//         Interval arr1[] = { new Interval(1, 3), new Interval(7, 9), new Interval(4, 6), new Interval(10, 13) };
//         int n1 = arr1.length;

//         if (isIntersect(arr1, n1))
//             System.out.print("Yes\n");
//         else
//             System.out.print("No\n");
//     }
// }