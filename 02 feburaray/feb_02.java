// ans 1 = for int value is 0, for character UTF 16 value is 0, for float value is 0.0, for string value is null, for boolean value is also null


// ans 2 = No, we can't pass negative no to array


// ans 3 = array is store in Heap memory


// ans 4 = array size is fixed at compile time, in run time we can not change it's value'


// ans 5 = array without a name is called anonymous array, this type of array is created just for instance use

// ans 7 = length is a property of array and length() is a method of String class

class Calc {
    public int mul(int nums[]){
        int result = 0;
        for (int n : nums) {
            result = result * n;
        }
        return result;
    }
} 
public class feb_02 {
    public static void main(String[] args) {
        // ans 1   
        int arr[] = new int[6];
        char arr1[] = new char[6];
        float arr2[] = new float[6];
        String arr3[] = new String[6];
        Boolean arr4[] = new Boolean[6];
        System.out.println(arr[0] + "  " + (int)arr1[0] + "  " + arr2[0] + "  " + arr3[0] + "  " + arr4[0]);

        // ans 2
        // int ar[-3];
        // int ar[] = new int[-3];
        

        // ans 5
        // anonymous array: used only one time
        Calc obj = new Calc();
        int result = obj.mul(new int[]{1, 2, 1, 3});
        System.out.println(result);


        // ans 6 = 
        int arra[] = {5, 8, 7, 1, 2};
        System.out.println(arra[0]);
        System.out.println(arra[1]);
        for (int i = 0; i < 5; i++) {
            System.out.print(arra[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < arra.length; i++) {
            System.out.print(arra[i] + "  ");
        }
        System.out.println();
        for (int i : arra) {
            System.out.print(i + "  ");
        }


        // ans 7 
        int nums[] = {5, 4, 7, 8};
        System.out.println("\n" + nums.length);
        int num1[][] = {{4, 2, 1, 6},
                        {9, 0, 1, 2},
                        {5, 4, 7, 0}}; 
        System.out.println(num1.length + "  " + num1[0].length+ "  " + num1[1].length+ "  " + num1[2].length);
        String names = "Neeraj";
        System.out.println(names.length());
    }    
}
