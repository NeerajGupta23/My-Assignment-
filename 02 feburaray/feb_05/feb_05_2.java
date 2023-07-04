public class feb_05_2 {
    public static void main(String[] args) {
        // ans 2:
        String str1 = "Neeeerrkkkkaaaaraj Guptta";
        String str2 = "";
        int flag = 0;
        int length = str1.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    str2 = str2 + str1.charAt(i);
                }
            }
        }

        String str3 = "";
        int length1 = str2.length();
        for (int i = 0; i < length1; i++) {
            flag = 0;
            for (int j = 0; j < i; j++) {
                if (str2.charAt(i) == str2.charAt(j)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                str3 = str3 + str2.charAt(i);
            }
        }
        System.out.println(str3);
    }
}
