package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int stdin = sc.nextInt();
        int count = stdin * 2 - 1;

        //역삼각형
        for (int i = 0; i < stdin ; i++) {

            //공백
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }

            //별찍기
            for (int k = 0; k < count -(2 * i) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //삼각형
        for (int i = 0; i < stdin-1 ; i++) {
            for (int j = 1; j < stdin-1-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+3; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
