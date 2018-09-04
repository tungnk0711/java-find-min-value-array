package com.codegym;

public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 2, 7, 8, 1, 9};

        int index = minValue(arr);

        System.out.println("Min value: " + index);

    }

    public static int minValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}
