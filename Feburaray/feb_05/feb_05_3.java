public class feb_05_3 {
    public static void main(String[] args) {
        // ans 3: 
        String str1 = "2552";
        String str2 = "";
        for (int i = str1.length()-1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        if(str1.equals(str2)) {
            System.out.println(str1 + " is a Pallindrome!");
        }
        else {
            System.out.println(str1 + " is not a Pallindrome!");
        }
    }
}
