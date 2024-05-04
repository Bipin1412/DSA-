public class increasingDecresingPattern {
    public static void main(String[] args) {
        patternpirymid(5);
    }

//        static void pattern(int n){
//        for (int row = 0; row <=2* n; row++) {
//            int c=row>n?2*n-row:row;
//            for (int col = 0; col <= c; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//    static void pattern30(int n) {
//        for (int row = 1; row <= n; row++) {
//
//            for (int space = 0; space < n - row; space++) {
//                System.out.print("  ");
//            }
//
//            for (int col = row; col >= 1; col--) {
//                System.out.print(col + " ");
//            }
//            for (int col = 2; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}

//
//    static void pattern34(int n) {
//        //outer loop for number of rows
//        for (int i = 0; i <= n; i++) {
//// inner loop for spaces
//            for (int j = n - i; j > 1; j--) {
//                System.out.print(" ");
//            }
//            //inner loop for number of col
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}
//
//    static void pattern35(int n) {
//        for (int row = 0; row <= n-1; row++) {
//            for (int space = n -row; space > 1; space--) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col <= row-1-row; col++) {
//                System.out.print(" * " + " ");
//            }
//            System.out.println();
//        }
//
//    }
//}
//
//    static void pattern28(int n) {
//        for (int row = 0; row < 2 * n; row++) {
//            int colInrow = row > n ? 2 * n - row - 1 : row;
//            int space = n - colInrow;
//            for (int s = 0; s <= space; s++) {
//                System.out.print(" ");
//            }
//            for (int col = 0; col <= colInrow; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

    static void patternpirymid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
