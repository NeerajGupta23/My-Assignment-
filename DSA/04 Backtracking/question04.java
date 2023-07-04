// ans: 04
public class question04 {

    public static boolean combination(int[] arr, int product, int n, int target, int index) {
        if (product > target)
            return false;

        if (product == target) {
            return true;
        }

        for (int i = index; i < n; i++) {
            if (combination(arr, product * arr[i], n, target, index + 1) == true) {
                System.out.print(arr[i] + "  ");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 2, 5, 4 };
        System.out.println(combination(arr, 1, arr.length, 16, 0));
    }
}