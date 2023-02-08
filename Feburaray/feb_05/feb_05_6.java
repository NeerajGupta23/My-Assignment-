public class feb_05_6 {
    public static void main(String[] args) {
        // ans 6: 
        Boolean flag = false;
        String str1 = "THE QUICK BROWN FOX JUMPS OVER LAZY DOG";

        str1 = str1.toUpperCase();
        char ch;
        int ar[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ar[ch - 65]++;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == 0) {
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Pangram!");
        } else {
            System.out.println("not a Pangram!");
        }
    }
}
