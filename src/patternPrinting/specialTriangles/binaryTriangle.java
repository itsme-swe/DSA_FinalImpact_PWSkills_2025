package patternPrinting.specialTriangles;

import java.util.Scanner;

public class binaryTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++ ) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print("1" + " ");
                    }
                    else {
                        System.out.print("0" + " ");
                    }
                }
                else {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            System.out.print("1" + " ");
                        }
                        else {
                            System.out.print("0" + " ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}

/*

    1
    0 1
    1 0 1
    0 1 0 1

*/
