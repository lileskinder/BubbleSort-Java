package com.company;


public class Main {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        bubbleSort(intArray);

        for (int i = 0; i <intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static void bubbleSort(int[] intArray) {
        for (int i = intArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArray[j] > intArray[j+1]) {
                    swap(intArray, j, j+1);
                }
            }
        }
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
