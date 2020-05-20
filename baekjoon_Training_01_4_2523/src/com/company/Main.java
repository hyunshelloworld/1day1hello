package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        if(count >=1 && count <=100){
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for (int i = count-1; i > 0; i--) { //012
                for (int j = 0; j < i; j++) {//3
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
