/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 19 - Selection Sort
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
	public static final String DSC = "d";
	public static final String ASC = "a";

    // TODOd: implement the selection sort algorithm
    public static void selectionSort(int data[], String order) {
    	if(order.equals(DSC)) {
		    for(int i = 0; i < data.length; i++) {
			    for(int j = i + 1; j < data.length; j++) {
				    if(data[i] < data[j]) {
					    int temp = data[i];
					    data[i] = data[j];
					    data[j] = temp;
				    }
			    }
		    }
	    } else if(order.equals(ASC)) {
		    for(int i = 0; i < data.length; i++) {
			    for(int j = i + 1; j < data.length; j++) {
				    if(data[i] > data[j]) {
					    int temp = data[i];
					    data[i] = data[j];
					    data[j] = temp;
				    }
			    }
		    }
	    }
     
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String order = in.nextLine();

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        selectionSort(data, order);
        System.out.println(Arrays.toString(data));
    }
}
