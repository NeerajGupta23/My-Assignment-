public class feb_05_4 {
    public static void main(String[] args) {
        // ans 4: 
        String str1 = "ae&&%%hnndj";
        str1 = str1.toLowerCase();
        int countConsonants = 0, countVowels = 0, countSpecial = 0;
        char ch;

        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            if(ch >= 'a' && ch <= 'z') {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowels++;
                }
                else {
                    countConsonants++;
                }
            }
            else {
                countSpecial++;
            }
        }
        System.out.println("No. of consonants are: " + countConsonants + "\nNo. of vowels are: " + countVowels + "\nNo. of special charcater are: " + countSpecial);
    }
}
