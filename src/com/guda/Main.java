package com.guda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");
        int length = input.nextInt();
        input.nextLine();
        int[] arr = new int[length];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter val["+i+"]");
            arr[i]=input.nextInt();
            input.nextLine();
        }
        while (true){
            System.out.println("1.odd\n" +
                    "2.even\n" +
                    "3.average\n" +
                    "4.asscending sort\n" +
                    "5.descending sort\n");
            int pick = input.nextInt();
            switch (pick){
                case 1:
                    odd(arr);
                    break;
                case 2:
                    even(arr);
                    break;
                case 3:
                    average(arr);
                    break;
                case 4:
                    Arrays.sort(arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                case 5:
                    desSort(arr);
                    break;
            }
        }
    }

    //sorted array descending order
    public static void desSort(int arr[]){
        Arrays.sort(arr);
        int count=0;
        int[] desArr= new int[arr.length];
        for (int i =arr.length-1 ;i>=0;i--){
            desArr[count]=arr[i];
            count++;
        }
        System.out.println(Arrays.toString(desArr));
    }
    //check if odd
    public static void odd(int arr[]){
        int[] odd = new int[arr.length];
        for (int i= 0; i<arr.length;i++){
            if (arr[i]%2!=0){
                odd[i]=arr[i];
            }
            else {
                odd[i]=0;
            }

        }
        System.out.println(Arrays.toString(odd));
    }
    public static void even(int arr[]){
        int[] odd = new int[arr.length];
        for (int i= 0; i<arr.length;i++){
            if (arr[i]%2!=0){
                odd[i]=0;
            }
            else {
                odd[i]=arr[i];
            }

        }
        System.out.println(Arrays.toString(odd));
    }
    public static void average(int[] arr){
        double num=0;
        for (int i = 0; i<arr.length;i++){
            num+=arr[i];
        }
        System.out.println("the average of the array is "+ num/arr.length);
    }

}
