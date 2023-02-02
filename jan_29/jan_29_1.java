// printing A, B, C, D, E, F, G, H 
public class jan_29_1 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            // printing A
            for (int j = 0; j < n; j++) {
                if ((i == 0 && (j > 0) && (j <= (n - 1) / 2 - 1)) || (i == (n - 1) / 2 && j <= (n - 1) / 2)
                        || (j == 0 && i > 0) || (j == (n - 1) / 2 && i > 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing B 
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j <=(n-1)/2 -1 ||  i == (n-1)/2&&j <=(n-1)/2 -1 || i == n-1 && j <=(n-1)/2 -1 || (j == (n-1)/2 && i != 0 && i != (n-1)/2 && i != (n-1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing C
            for (int j = 0; j < n; j++) {
                if (i==0&&j > 0&&j <= (n-1)/2 || i==(n-1)&&j>0&&j <= (n-1)/2  || j==0&&i<(n-1)&&i>0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing D
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 && j <=(n-1)/2 -1 || i == n-1 && j <=(n-1)/2 -1 || (j == (n-1)/2 && i != 0 && i != (n-1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing E
            for (int j = 0; j < n; j++) {
                if (i==0&&j > 0&&j <= (n-1)/2 || i==(n-1)/2&&j > 0&&j <= (n-1)/2 || i==(n-1)&&j>0&&j <= (n-1)/2  || j==0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing F
            for (int j = 0; j < n; j++) {
                if (i==0&&j > 0&&j <= (n-1)/2 || i==(n-1)/2&&j > 0&&j <= (n-1)/2 || j==0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing G
            for (int j = 0; j < n; j++) {
                if (i==0&&j > 0&&j <= (n)/2+n/6  || i==(n-1)&&j>0&&j <= (n-1)/2  || j==0&&i<(n-1)&&i>0 || j == (n-1)/2&&(i>(n-1)/2+n/4) || i == ((n-1)/2+n/4)&&j>=((n-1)/2-n/8) && j<= ((n-1)/2+n/6 )|| j ==((n-1)/2+n/6)&&(i>(n-1)/2+n/4) ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // printing H
            for (int j = 0; j < n; j++) {
                if ((i == (n - 1) / 2 && j <= (n - 1) / 2)
                || (j == 0) || j == (n - 1) / 2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
