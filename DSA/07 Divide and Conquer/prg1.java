// Ans 01:
public class prg1 {
    public static int partition(int[] arr, int low, int high) {
        int randomIndex = low + ((int)Math.random() % (high - low + 1));

        // swap 
        int temp = arr[low];
        arr[low] = arr[randomIndex];
        arr[randomIndex] = temp;

        int pivot = arr[low];
        
        int i = low;
        for (int j = low+1; j <= high; j++) {
            if (arr[j] <= pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }

    public static int quickSelect(int[] arr, int low, int high, int k) {
        int p = partition(arr, low, high);
        if(k == p)  
            return arr[p];

        if(k < p)
            return quickSelect(arr, low, p-1, k);

        return quickSelect(arr, p+1, high, k);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 5, 6, 7};
        // int[] arr = {4, 3, 3, 2, 1};
        int k = 3;

        System.out.println(quickSelect(arr, 0, arr.length-1, arr.length-k));
    }    
}




// Ans 02:
// Time Complexity of quick Select algorithm: b.) O(n*logn)



// Ans 03: 
// d.) Stack



