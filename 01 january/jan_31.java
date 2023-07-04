// ans 1 = array is the group of multiple variable, which consists of similar type of data and from array we can access data randomly by it's index in O(1) time 


// ans 2 = int array_name[array_size]; or int array_name[] = {array_elements};


// ans 3 = No, we can't change the size of array at run time


// ans 4 = Yes, we can declare an array without assigning the size of array.


// ans 5 = default values of array is 0 for integter data type, null for string data type, false for boolean data type etc.


// ans 6 = 1D array is refer to one dimensional array which consist of scalar quantity, for eg int arr[] = {1, 4, 5, 2}; is an one dimension array.


// ans 7 = 
public class jan_31 {
    public static void main(String[] args) {
        // 1D array
        System.out.println("1D array:");
        int arr1[] = { 2, 7, 8, 4, 2 };
        for (int i : arr1) {
            System.out.print(i + "  ");
        }

        System.out.println("\n\n2D array:");
        // 2D array
        int arr2[][] = { { 3, 4, 6, 7 },
                { 2, 3 },
                { 1, 6, 4 },
                { 7 } };    
        for (int i[] : arr2) {
            for (int j : i) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
