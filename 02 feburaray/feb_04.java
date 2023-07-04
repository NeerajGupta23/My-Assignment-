import java.util.Scanner;

public class feb_04 {
    public static void main(String[] args) {
        // ans 1: 
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String str = scan.next();
        System.out.println("Your name is "+ str);



        // ans 2 = we can concatinate two string using + operator or .concate() method
        String s1 = "Pwjava";
        String s2 = s1.concat("skills");
        String aa1 = "pw";
        String aa2 = "pw" + "java";
        System.out.println("\n" + s1 + "  " + s2 + "  " + aa1 + "  " + aa2);



        // ans 3: we can find length of string using inbuilt method name .length(), eg.
        System.out.println( "\n" + s1.length());



        // ans 4 : for compare with referenece we use "==" operator and for comparing only data part of string then we use .equals() method
        System.out.println();
        String ss1 = "pwjava";
        String ss2 = "pwjava";
        String ss3 = "pwJAVA";
        System.out.println((ss1 == ss2) + "  " + (ss1 == ss3) + "  " + (ss2 == ss3));
        System.out.println((ss1.equals(ss2)) + "  " + (ss1.equals(ss3)) + "  " + (ss2.equals(ss3)));
        String a1 = "Pwskills";
        String a2 = new String("Pwskills");
        String a3 = new String("Pwskills");
        System.out.println((a1 == a2) + "  " + (a1 == a3) + "  " + (a2 == a3));
        System.out.println((a1.equals(a2)) + "  " + (a1.equals(a3)) + "  " + (a2.equals(a3)));



        // ans 5: 
        System.out.println();
        String str1 = "refrigerator";
        System.out.println(str1.length());



        // ans 6: 
        System.out.println();
        String love = "Umbrella";
        if(love.indexOf('e') == -1) {
            System.out.println("e is not present in " + love);
        }
        else {
            System.out.println("e is present in " + love);
        }



        // ans 7 : (nice one)
        System.out.println();
        String thankYou = "Hello, have a good day";
        String temp = "";
        thankYou = thankYou.toLowerCase();
        for (int i = 0; i != thankYou.length(); i++) {
            // if (thankYou.charAt(i) != 'a' && thankYou.charAt(i) != 'e' && thankYou.charAt(i) != 'i'
            //         && thankYou.charAt(i) != 'o' && thankYou.charAt(i) != 'u') 
            if ((thankYou.charAt(i) > 'a'&&  thankYou.charAt(i) < 'e') || (thankYou.charAt(i) > 'e' && thankYou.charAt(i) < 'i') || (thankYou.charAt(i) > 'i' && thankYou.charAt(i) < 'o') || (thankYou.charAt(i) > 'o' && thankYou.charAt(i) < 'u') || (thankYou.charAt(i) > 'u' && thankYou.charAt(i) <= 'z')) 
            {
                continue;
            } else {
                temp = temp + thankYou.charAt(i);
            }
        }
        System.out.println((temp));
    }    
}