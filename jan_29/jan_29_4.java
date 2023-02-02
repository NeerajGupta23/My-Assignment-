public class jan_29_4 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j <= (n - 1) / 2 - 1 || i == (n - 1) / 2 && j <= (n - 1) / 2 - 1
                        || (j == (n - 1) / 2 && i != 0 && i < n / 2 )) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n-1 || i == j&&i>=n/2 || i+j == n-1&&j<=n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for (int j = 0; j < n; j++) {
                if (i == n/2&&j<n-1&&j > 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\t");
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n/2 || i == n-1)&&(j<= n/2) || j == 0&&i<n/2 || j == n/2&&i>= n/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            for (int j = 0; j < n; j++) {
                if (j == 0 || i+j == n/2 || i-j == n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing I
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n-1) && j<n/1.5 || j == n/3.5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n-1&&j<=n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing L
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n-1&&j<=n/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing S
            for (int j = 0; j < n; j++) {
                if ((i == 0 || i == n/2 || i == n-1)&&(j<= n/2) || j == 0&&i<n/2 || j == n/2&&i>= n/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
