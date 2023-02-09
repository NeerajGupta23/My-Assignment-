public class feb_06_4 {
    public static void main(String[] args) {
        String str = "zjhac";
        str = str.toLowerCase();
        char arr[] = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }

        System.out.println(str);
    }
}
