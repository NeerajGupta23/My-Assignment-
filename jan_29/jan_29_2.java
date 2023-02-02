public class jan_29_2 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2*n-1; j++) {
                if (i+j == n-1 || i ==  n-1 || j-i == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("   ");
            for (int j = 0; j < 2*n-1; j++) {
                if (i+j >= n-1&&j-i <= n-1 || i ==  n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
