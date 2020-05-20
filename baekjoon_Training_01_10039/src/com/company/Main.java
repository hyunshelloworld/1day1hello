package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int student[] = new int[5];
        int sum = 0;
        int avg = 0;

        Scanner stdin = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {
            student[i] = stdin.nextInt();
            if (student[i] <= 40) student[i] = 40;
            sum += student[i];
        }
        avg = sum/student.length;

        System.out.println(avg);
    }
}
