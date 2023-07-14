// Answer 01: 
// import java.util.Stack;
// public class StacksQues {
//     public int largestRectangleArea(int[] arr) {
//         Stack<Integer> st = new Stack<>();
//         int maxArea = Integer.MIN_VALUE;
//         int n = arr.length;

//         // step 01
//         for (int i = 0; i < n;) {
//             if (st.isEmpty()) {
//                 st.push(i);
//                 i++;
//             } else if (arr[st.peek()] < arr[i]) {
//                 st.push(i);
//                 i++;
//             } else if (arr[st.peek()] == arr[i]) {
//                 st.pop();
//                 st.push(i);
//                 i++;
//             } else {
//                 int temp = st.pop();
//                 int area;
//                 if (st.isEmpty())
//                     area = arr[temp] * (i - (-1) - 1);
//                 else
//                     area = arr[temp] * (i - st.peek() - 1);

//                 if (maxArea < area)
//                     maxArea = area;
//             }
//         }

//         while (!st.isEmpty()) {
//             int temp = st.pop();
//             int area;
//             int i = n;

//             if (st.isEmpty())
//                 area = arr[temp] * (i - (-1) - 1);
//             else
//                 area = arr[temp] * (i - st.peek() - 1);

//             if (maxArea < area)
//                 maxArea = area;
//         }

//         return maxArea;
//     }

//     public int maximalRectangle(char[][] arr) {

//         int maxArea = Integer.MIN_VALUE;
//         int[] temp = new int[arr[0].length];

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[0].length; j++) {
//                 if (i - 1 >= 0) {
//                     temp[j] = (arr[i][j] == '1') ? 1 + (arr[i - 1][j] - 48) : 0;
//                     if(arr[i][j] == '1')
//                         arr[i][j] = (char)(arr[i - 1][j]+1);
//                 } else
//                     temp[j] = (arr[i][j] == '1') ? 1 : 0;
//             }
//             int area = largestRectangleArea(temp);
//             System.out.println(area);
//             if (maxArea < area)
//                 maxArea = area;
//         }

//         return maxArea;
//     }
//     public static void main(String[] args) {
//         StacksQues s = new StacksQues();
//         char[][] arr = { { '0', '0', '1', '0' },
//                 { '0', '0', '1', '0' },
//                 { '0', '0', '1', '0' },
//                 { '0', '0', '1', '1' },
//                 { '0', '1', '1', '1' },
//                 { '0', '1', '1', '1' },
//                 { '1', '1', '1', '1' } };

//         System.out.println(s.maximalRectangle(arr));
//     }
// }





// Answer 02:
// import java.util.Stack;

// public class StacksQues {
//     public String decodeString(String s) {
//         char[] arr = s.toCharArray();
//         Stack<String> st = new Stack<>();

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == ']') {
//                 String str = "";
//                 while (!(st.peek().equals("["))) {
//                     str = (st.pop()) + str;
//                 }
//                 st.pop();

//                 int num = 0;
//                 int pow = 1;
//                 while ((!st.isEmpty()) && st.peek().charAt(0) >= '0' && st.peek().charAt(0) <= '9') {
//                     num = num + Integer.valueOf(st.pop()) * pow;
//                     pow *= 10;
//                 }

//                 for (int j = 0; j < num; j++) {
//                     st.push(str);
//                 }
//             } else {
//                 st.push("" + arr[i]);
//             }
//         }

//         StringBuilder str = new StringBuilder();
//         while (!st.isEmpty()) {
//             str.insert(0, st.pop());
//         }

//         return str.toString();
//     }

//     public static void main(String[] args) {
//         StacksQues r = new StacksQues();
//         System.out.println(r.decodeString("3[a]2[bc]"));
//         System.out.println(r.decodeString("3[a2[c]]"));
//         System.out.println(r.decodeString("2[abc]3[cd]ef"));
//     }
// }






// Answer 03: 
// import java.util.Iterator;
// import java.util.Stack;
// public class StacksQues {
//     public int calPoints(String[] arr) {
//         Stack<Integer> st = new Stack<>();

//         for(int i = 0; i < arr.length; i++) {
//             char ch = arr[i].charAt(0);
//             if(ch == 'C')
//                 st.pop();
//             else if(ch == 'D')
//                 st.push(2*(st.peek()));
//             else if(ch == '+'){
//                 int a = st.pop();
//                 int b = st.peek();
//                 st.push(a);
//                 st.push(a+b);
//             }
//             else {
//                 int num = Integer.valueOf(arr[i]);
//                 st.push(num);
//             }
//         }

//         int ans = 0;
//         Iterator<Integer> itr = st.iterator();
//         while(itr.hasNext())
//             ans += itr.next();
        

//         return ans;
//     }
//     public static void main(String[] args) {
//         StacksQues r = new StacksQues();
//         System.out.println(r.calPoints(new String[]{"5","2","C","D","+"}));
//         System.out.println(r.calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
//         System.out.println(r.calPoints(new String[]{"1","C"}));
//     } 
// }




// Answer 04: 
// import java.util.Iterator;
// import java.util.Stack;
// public class StacksQues {
//     public int[] asteroidCollision(int[] asteroids) {
//         Stack<Integer> st = new Stack<>();

//         for (int i = 0; i < asteroids.length; i++) {
//             if (st.isEmpty())
//                 st.push(asteroids[i]);
//             else if (st.peek() < 0 && asteroids[i] < 0)
//                 st.push(asteroids[i]);
//             else if (st.peek() > 0 && asteroids[i] > 0)
//                 st.push(asteroids[i]);
//             else if (st.peek() < 0 && asteroids[i] > 0)
//                 st.push(asteroids[i]);
//             else if (st.peek() == -asteroids[i])
//                 st.pop();
//             else if (Math.abs(st.peek()) < Math.abs(asteroids[i])) {
//                 st.pop();
//                 while (!st.isEmpty()) {
//                     if (Math.abs(st.peek()) > Math.abs(asteroids[i]))
//                         break;
//                     else if (st.peek() < 0 && asteroids[i] < 0) {
//                         st.push(asteroids[i]);
//                         break;
//                     } else if (st.peek() > 0 && asteroids[i] > 0) {
//                         st.push(asteroids[i]);
//                         break;
//                     } else if (st.peek() < 0 && asteroids[i] > 0) {
//                         st.push(asteroids[i]);
//                         break;
//                     } else if (st.peek() == -asteroids[i])
//                         st.pop();
//                     else if (Math.abs(st.peek()) < Math.abs(asteroids[i]))
//                         st.pop();
//                 }
//                 if (st.isEmpty())
//                     st.push(asteroids[i]);
//             }
//         }

//         int[] ans = new int[st.size()];
//         int k = 0;
//         Iterator<Integer> itr = st.iterator();
//         while (itr.hasNext())
//             ans[k++] = itr.next();

//         return ans;
//     }
//     public static void main(String[] args) {
//         StacksQues q = new StacksQues();
//         int[] arr = q.asteroidCollision(new int[] { -2, -1, 1, -2 });
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + "  ");
//         }
//     }    
// }




// Answer 05: 
// import java.util.Stack;
// public class StacksQues {
//         public int[] dailyTemperatures(int[] temperatures) {
//         Stack<Integer> st = new Stack<>();
//         int[] ans = new int[temperatures.length];

//         for(int i = 0; i < temperatures.length; ) {
//             if(st.isEmpty()) {
//                 st.push(i);
//                 i++;
//             }
//             else if(temperatures[i] <= temperatures[st.peek()]) {
//                 st.push(i);
//                 i++;
//             }
//             else {
//                 int a = st.pop();
//                 ans[a] = i - a;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         StacksQues q = new StacksQues();
//         int[] ans = q.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
//         for (int i = 0; i < ans.length; i++) {
//             System.out.print(ans[i] + "  ");
//         }
//     }    
// }