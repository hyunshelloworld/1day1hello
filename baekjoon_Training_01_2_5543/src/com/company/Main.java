package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int burger = 2001;
        int drink = 2001;

        Scanner stdin = new Scanner(System.in);

        for(int i = 0; i < 3 ; i++){
            int value = stdin.nextInt();
            if(value < burger && value >= 100)
                burger=value;
        }

        for(int i = 0; i<2; i++){
            int value = stdin.nextInt();
            if(value < drink && value >= 100)
                drink = value;
        }
        System.out.println(burger+drink-50);
    }
}