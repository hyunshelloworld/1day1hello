package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N==1) System.out.print("*");

        else{
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N; j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            for (int k = 0; k < N; k++) {
                if (k % 2 != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }}
}

