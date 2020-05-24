package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        int stamp = 0;

        //값 입력
        for (int i = 0; i < N ; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        //정렬
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N ; j++) {
                if(arr[j-1]>arr[j]){
                    stamp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = stamp;
                }
            }
        }
        System.out.print(arr[0]+" "+arr[N-1]);
    }
}
