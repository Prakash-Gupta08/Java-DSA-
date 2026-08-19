public class PatternPrinting {
    public static void main() {

//        int n =7;
//       for(int i=1; i<=n; i++) {
//           System.out.println("#");
//           if (n == i) {
//               for (int j = 1; j <= n + 2; j++) {
//                   System.out.print("*");
//               }
//               System.out.println();
//           }
//       }


        //Solid square pattern
//        for(int i=1; i<=4; i++){
//            for(int j=1; j<=4; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Right angle triangle
//        for(int i=1; i<=5; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Rombus
//        int n =5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<= n-i; j++){
//
//                System.out.print(" ");
//            }
//            for(int k=1; k<=n; k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Reverse Right-angle triangle
//        for(int i=5; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Solid Pyramid
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=(2*i-1); k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Inverted solid pyramid
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i-1; j++){
//                System.out.print(" ");
//            }
//            for(int k=1; k<=(2*n-2*i +1); k++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


        // L-shape pattern
//        int n =7;
//        for(int i=1; i<=n; i++) {
//            System.out.println("#");
//            if (n == i) {
//                for (int j = 1; j <= n + 2; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }


        //Hollow rectangle
//       int m = 6;
//       for(int i=1; i<=m; i++){
//           for(int j=1; j<=6; j++){
//               if(i==1 || i==m){
//                   System.out.print("*");
//               }
//               else{
//                   if(j==1 || j==6)
//                       System.out.print("*");
//                   else {
//                       System.out.print(" ");
//                   }
//               }
//           }
//           System.out.println();
//       }

        //Hollow Triangle
//        int m = 5;
//        for(int i=1; i<=m; i++) {
//            for (int j=1; j <= m; j++) {
//                if (i == 1) {
//                    System.out.print("*");
//                } else {
//                    if ( j == i|| j==5) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//            }
//            System.out.println();
//        }
        int m = 10;
        for(int i=1; i<=m; i++) {
            if(i==1 || i==2 || i==m){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for(int j=1; j<=(i-2); j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();

        }

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

