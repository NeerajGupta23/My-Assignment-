public class feb_05_5 {
    public static void main(String[] args) {
        // ans 5: 
        // Anagram => keep => peek, School master => The classroom, tom marvolo riddle
        // => I am lord Voldemort;
        Boolean flag = false;
        String str1 = "Tom Marvolo Riddle";
        String str2 = "I am lord Voldemort";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') {
                arr1[str1.charAt(i) - 65]++;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') {
                arr2[str2.charAt(i) - 65]++;
            }
        }


        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                flag = true;
            }
        }
        if (flag == true) {
            System.out.println("Not Anagram");
        } else {
            System.out.println("Anagram");
        }
    }
}
