public class feb_05_1 {
    public static void main(String[] args) {
        // ans 1:
        String str1 = "Neeraj Gupta";
        String str2 = "";
        int flag = 0;
        int length = str1.length();

        for (int i = 0; i < length; i++) {
            flag = 0;
            for (int j = 0; j < i; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                str2 = str2 + str1.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
