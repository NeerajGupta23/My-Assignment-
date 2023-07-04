public class feb_05_7 {
    public static void main(String[] args) {
        // ans 7:
        String str1 = "fgh123oaa";
        Boolean flag = false;
        int length = str1.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("String contain all unique characters");
        } else {
            System.out.println("String not contain all unique characters");

        }
    }
}
