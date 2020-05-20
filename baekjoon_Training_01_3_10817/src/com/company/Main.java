package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] num = new int [3];
        int temp = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<num.length; i++){
            num[i] = sc.nextInt();
        }

        for (int i = 0; i <num.length ; i++) {
            for (int j = 0; j <num.length-1 ; j++) {
                if(num[j]>num[j+1]){
                    temp = num[j+1];
                    num[j+1] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(num[1]);
    }
}
