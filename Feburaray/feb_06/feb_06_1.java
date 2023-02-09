// ans 1:

// mutable string => mutable strings are those strings whose content can be changed without creating a new object
public class feb_06_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Neeraj");
        System.out.println(sb);
        sb.append(" Gupta"); // here no new object is creating
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Neeraj");
        System.out.println(sb1);
        sb1.append(" Gupta"); // here no new object is creating
        System.out.println(sb1);
    }
}