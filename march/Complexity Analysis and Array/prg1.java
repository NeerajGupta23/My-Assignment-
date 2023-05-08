// Question 1. Analyze the time complexity of the following Java code and suggest a way to improve it: 
// int sum = 0; 
// for(int i = 1; i <= n; i++) { 
//  for(int j = 1; j <= i; j++) { 
//  sum++; 
//  } 
// }

// Ans: for i = 1, j run 1 time, for i = 2, j run 2 times .... for i = n, j runs n times so if we add those value(ie. 1+2+....+n) then we get n*(n+1)/2 so we can decrease the time complexity from O(n*i) to O(1), we know that sum is executed n*(n+1)/2 times so we can directly calculate that, ie. 
// int sum = 0;
// sum = n*(n+1)/2;
// public class prg1 {
//     public static void main(String[] args) {
//         int sum = 0, n = 5;
//         int sum1 = 0;
//         for (int i = 1; i <= n; i++) { // Time Complexity = O(n*i)
//             for (int j = 1; j <= i; j++) {
//                 sum++;
//             }
//         }
//         sum1 = n*(n+1)/2; // Time Complexity O(1)
//         System.out.println(sum);
//         System.out.println(sum1);
//     }
// }



// Question 2: Find the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n, given that T(0) = 5
// Ans: T(2) = 3*T(1) + 12*2
// => T(2) = 3*(3*T(0) + 12*1) + 12*2
// => T(2) = 3*(3*5 + 12) + 24
// => T(2) = 105



// Question 3: Given a recurrence relation, solve it using a substitution method. 
//  Relation : T(n) = T(n - 1) + c 
// Ans: let complexity is O(n) then 
// T(n) = T(n-1) + c 
// T(n) <= c*n + c 
// therefore T(n) <= c*n
// => O(n) 



// Question 4: Given a recurrence relation: 
//  T(n) = 16T(n/4) + n2logn 
//  Find the time complexity of this relation using the master theorem. 
// Ans: Masters Therom => T(n) = a*T(n/b) + Theta(n^k * (logn)^p), after comparing these two equation we get => a = 16, b = 4, k = 2, p = 1 so here a = b^k and p > -1 therefore Time complexity is Theta(n^2 * (logn)^2) 



// Question 5: Solve the following recurrence relation using recursion tree method T(n) = 2T(n/2) + n
// Ans : T(n) -> T(n/2) + T(n/2) + n, where T(n/2) -> T(n/4) + T(n/4) + n/2
// so => each level of tree will contribute n complexity and it goes till log(base 2)n (these will find by genralizing our equation to k terms and taking the value of k by putting n/2^k = 1) so this series is AP so sum is total_length*(first_element + last_element)/2 => log(base 2)n*(n+n)/2 => n*log(base 2)n
// therefore Time Complexity is O(n*log(base 2)n) 



// Question 6. T(n) = 2T(n/2) + K, Solve using Recurrence tree method. 
// Ans: T(n) -> T(n/2) + T(n/2) + k, where T(n/2) -> T(n/4) + T(n/4) + k ans so on , therefore we get (2^0)k, (2^0 + 2^1)k, (2^0 + 2^1 + 2^2)k , ... till kth term , where the value of k is log(base 2)n by putting n/2^k = 1 so we get the gp series as  (2^0)k + (2^0 + 2^1)k + (2^0 + 2^1 + 2^2)k + ... + (2^0 + 2^1 + ... + 2^(k-1))k => so for worst time complexity we will take only last term ie. (2^0 + 2^1 + ... + 2^(k-1))k here putting the value of k here then we get, (2^0 + 2^1 + ... + 2^(log(base 2)n-1))*log(base 2)n => (2^(log(base 2)n - 1))*log(base 2)n by using sum of gp series after solving these we get (n-1)*log(base 2)n => O(n*log(base 2)n)