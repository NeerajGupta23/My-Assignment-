// Ans 01: 
// import java.util.Scanner;

// public class prg3 {
//     public static void main(String[] args) {
//         int row = 0, col = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row: ");
//         row = sc.nextInt();
//         System.out.print("Enter col: ");
//         col = sc.nextInt();

//         // taking input
//         System.out.println("Enter " + row * col + " elements: ");
//         int[][] array = new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }

//         // main calculation
//         int positiveNum = 0;
//         int negativeNum = 0;
//         int oddNum = 0;
//         int evenNum = 0;
//         int zeroNum = 0;
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 int ele = array[i][j];
//                 if (ele > 0)
//                     positiveNum++;
//                 else if (ele < 0)
//                     negativeNum++;
//                 else
//                     zeroNum++;

//                 if ((ele & 1) == 0)
//                     evenNum++;
//                 else
//                     oddNum++;
//             }
//         }
//         // printing output
//         System.out.println("number of positive numbers = " + positiveNum);
//         System.out.println("number of negative numbers = " + negativeNum);
//         System.out.println("number of odd numbers = " + oddNum);
//         System.out.println("number of even numbers = " + evenNum);
//         System.out.println("number of 0 = " + zeroNum);
//         sc.close();
//     }
// }




// Ans 02: 
// import java.util.Scanner;

// public class prg3 {
//     public static void main(String[] args) {
//         System.out.print("Enter order of matrix: ");
//         Scanner sc = new Scanner(System.in);
//         int order = sc.nextInt();


//         int[][] array = new int[order][order];
//         System.out.println("Enter " + order*order + " elements: ");
//         for (int i = 0; i < order; i++) {
//             for (int j = 0; j < order; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < order ; i++) {
//             for (int j = 0; j < order; j++) {
//                 if(i+j < order-1)
//                     System.out.print(array[i][j] + "  ");
//             }
//         }
//         sc.close();
//     }    
// }




// Ans 03: 
// import java.util.Scanner;

// public class prg3 {
//     public static void main(String[] args) {
//         System.out.print("Enter order of matrix: ");
//         Scanner sc = new Scanner(System.in);
//         int order = sc.nextInt();


//         int[][] array = new int[order][order];
//         System.out.println("Enter " + order*order + " elements: ");
//         for (int i = 0; i < order; i++) {
//             for (int j = 0; j < order; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < order ; i++) {
//             for (int j = 0; j < order; j++) {
//                 if((i == j) || (i+j == (order -1)))
//                     System.out.print(array[i][j] + "  ");
//             }
//         }
//         sc.close();
//     }    
// }



// Ans 04: 
// import java.util.Scanner;

// public class prg3 {
//     public static void main(String[] args) {
//         int row = 0, col = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter row: ");
//         row = sc.nextInt();
//         System.out.print("Enter col: ");
//         col = sc.nextInt();

//         // taking input
//         System.out.println("Enter " + row * col + " elements: ");
//         int[][] array = new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }


//         int max = array[0][0];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 if(max < array[i][j])
//                     max = array[i][j];
//             }
//         }
//         System.out.println("Maximum Element is: " + max);
//         sc.close();
//     }    
// }




// Ans 05: 
// import java.util.Scanner;

// public class prg3 {
//     public static void main(String[] args) {
//         System.out.print("Enter order of matrix: ");
//         Scanner sc = new Scanner(System.in);
//         int order = sc.nextInt();


//         int[][] array = new int[order][order];
//         System.out.println("Enter " + order*order + " elements: ");
//         for (int i = 0; i < order; i++) {
//             for (int j = 0; j < order; j++) {
//                 array[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i < order ; i++) {
//             System.out.print(array[i][order/2] + "  ");
//         }
//         for (int i = 0; i < order ; i++) {
//             if(i != order/2)
//                 System.out.print(array[order/2][i] + "  ");
//         }
//         sc.close();
//     }    
// }