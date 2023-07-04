// Ans 01: 
public class prg2 {
    static class Ans {
        int i;
        int j;
    }
    static int count = 0;

    public static void findIndex(int[] arr, int low, int high, Ans ans) {
        if(low <= high) {
            int mid = low + (high - low)/2;

            // if(count == 2)
            //     return;
            if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                ans.i = mid;
                count++;    
            }
            if(arr[mid] < arr[mid+1] && arr[mid] < arr[mid-1]) {
                ans.j = mid;
                count++;
            }

            findIndex(arr, low, mid-1, ans);
            findIndex(arr, mid+1, high, ans);
        }
    }

    public static void swapArray(int[] arr, int low, int high) {
        Ans ans = new Ans();
        findIndex(arr, low+1, high-1, ans);
        System.out.println(ans.i + "  " + ans.j);

        if(arr[0] > arr[1])
            ans.i = 0;
        if(arr[arr.length-1] < arr[arr.length-2])
            ans.j = arr.length-1;

        // swap 
        int temp = arr[ans.i];
        arr[ans.i] = arr[ans.j];
        arr[ans.j] = temp;
    }

    public static void main(String[] args) {
        // int[] arr = {3, 8, 6, 7, 5, 9, 10};
        int[] arr = {0, 1, 5, 3, 4, 2, 6, 7, 8, 9, 10, 11, 12};
        swapArray(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        } 
    }
}
