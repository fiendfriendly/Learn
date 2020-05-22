/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 20 - Insertion Sort
 */

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    // TODOd: implement the insertion sort algorithm
    public static void insertionSort(int data[]) {
        for(int i = 1; i < data.length; i++) {
            for(int j = i - 1; j >= 0; j--) {
                if(data[i] >= data[j]) {
                    break;
                } else {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        insertionSort(data);
        System.out.println(Arrays.toString(data));
    }
}
