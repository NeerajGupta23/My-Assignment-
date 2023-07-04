// Ans 03: 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class question03 {
    public static ArrayList<Integer> Swap(ArrayList<Integer> array, int index1, int index2) {
        Integer temp = array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
        return array;
    }

    public static void allCombination(ArrayList<Integer> array, Set<ArrayList<Integer>> ar, int index, int n) {
        if(index == n-1){
            ar.add(new ArrayList<>(array));
            return;
        }
        
        for (int i = index; i < n; i++) {
            array = Swap(array, index, i);
            allCombination(array, ar, index+1, n);
            array = Swap(array, index, i);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(3);
        array.add(1);
        array.add(1);
        array.add(2);
        Set<ArrayList<Integer>> ar = new HashSet<>();
        allCombination(array, ar, 0, array.size());
        System.out.println(ar);
    }
}
