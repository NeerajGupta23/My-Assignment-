public class feb_05_8 {
    public static void main(String[] args) {
        // ans 8:
        String str1 = "deppat";
        str1 = str1.toUpperCase();

        int arr[] = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            arr[str1.charAt(i) - 65]++;
        }

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int temp[] = new int[str1.length()];
        int temp1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                temp[temp1++] = i;
            }
        }

        for (int i = 0; i < temp1; i++) {
            System.out.println((char) (temp[i] + 65));
        }
    }
}
