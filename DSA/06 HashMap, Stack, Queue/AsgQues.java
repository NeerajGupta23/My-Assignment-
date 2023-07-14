import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Answer 01: 
// public class AsgQues {
//     public static void main(String[] args) {
//         Map<Integer, String> tm = new TreeMap<>();
//         tm.put(5, "Rahul");
//         tm.put(7, "Lakshman");
//         tm.put(1, "Ram");
//         tm.put(4, "Krrish");
//         tm.put(2, "Lakshay");
//         System.out.println(tm);
//     }
// }


// Answer 02: 
// public class AsgQues {
//     public static void main(String[] args) {
//         Map<String, Integer> tm = new TreeMap<>();
//         tm.put("Rahul", 5);
//         tm.put("Lakshman", 7);
//         tm.put("Ram", 1);
//         tm.put("Krrish", 4);
//         tm.put("Lakshay", 2);
//         System.out.println(tm);
//     }
// }



// Answer 03: 
// public class AsgQues {
//     public static void main(String[] args) {
//         // int[] arr = {1, 2, 3, 4};
//         int[] arr = {1, 2, 3, 4, 1};
//         HashMap<Integer, Integer> hm = new HashMap<>();
        

//         int i = 0;
//         for (; i < arr.length; i++) {
//             if(hm.containsKey(arr[i])) {
//                 System.out.println("Yes");
//                 break;
//             }
//             hm.put(arr[i], 0);
//         }
//         if(i == arr.length)
//             System.out.println("No");
//     }    
// }




// Answer 04: 
// public class AsgQues {
//     public static void main(String[] args) {
//         int[] arr = {4, 2, 7, 1, 9};
//         TreeMap<Integer, Integer> hm = new TreeMap<>();
        
//         for (int i = 0; i < arr.length; i++) {
//             hm.put(arr[i], i);
//         }

//         System.out.println(hm);
//         System.out.println("Biggest Element: " + hm.lastKey());
//     }    
// }





// Answer 05: 
// public class AsgQues {
//     public static void main(String[] args) {
//         // String magazine = "b";
//         String magazine = "abcccdd";
//         // String ransomeNote = "a";
//         String ransomeNote = "bcddccaa";
//         HashMap<Character, Integer> hm = new HashMap<>();

//         char[] magazine1 = magazine.toCharArray();
//         for (int i = 0; i < magazine1.length; i++) {
//             if(hm.containsKey(magazine1[i])) {
//                 hm.put(magazine1[i], (hm.get(magazine1[i])+1));
//                 continue;
//             }
//             hm.put(magazine1[i], 1);
//         }

//         char[] ransomeNote1 = ransomeNote.toCharArray();
//         int i = 0;
//         for (; i < ransomeNote1.length; i++) {
//             if(!hm.containsKey(ransomeNote1[i]) || hm.get(ransomeNote1[i]) <= 0) {
//                 System.out.println(false);
//                 break;
//             }
//             hm.put(ransomeNote1[i], hm.get(ransomeNote1[i])-1);
//         }
//         if(i == ransomeNote1.length)
//             System.out.println(true);
//     }
// }