package src;/*
 * CS 2050 - Computer Science II - Spring 2020
 * Instructor: Thyago Mota
 * Description: Activity 21 - Merge Sort (solved)
 */

import java.util.Arrays;

public class MergeSortSolved {

    // TODOd: implement the merge portion of merge sort
    public static void merge(int data[], int dividedBegin, int dividedMiddle, int dividedEnd) {
        int beginningTowardMiddle = dividedBegin;
        int middleTowardEnd = dividedMiddle + 1;
        int segmentSize = dividedEnd - dividedBegin + 1;
        int sorted[] = new int[segmentSize];
        int index = 0;
        while (beginningTowardMiddle <= dividedMiddle && middleTowardEnd <= dividedEnd)
            if (data[beginningTowardMiddle] < data[middleTowardEnd])
                sorted[index++] = data[beginningTowardMiddle++];
            else // if the thing on the left side is smaller, sorted array gets thing on left side, otherwise right side
                sorted[index++] = data[middleTowardEnd++];
        while (beginningTowardMiddle <= dividedMiddle) // everything that wasn't filled in from previous loop is
            // filled in from the front toward middle
            sorted[index++] = data[beginningTowardMiddle++];
        while (middleTowardEnd <= dividedEnd) // everything that wasn't filled in from previous loop is
            // filled in from the middle toward end
            sorted[index++] = data[middleTowardEnd++];
        for (beginningTowardMiddle = dividedBegin, index = 0; index < segmentSize; beginningTowardMiddle++, index++)
            data[beginningTowardMiddle] = sorted[index];
    }

    // TODOd: implement the merge sort algorithm
    public static void mergeSort(int data[], int segmentBegin, int segmentEnd) {
        // base case
        if (segmentBegin >= segmentEnd) {
            return;
        } else {
            // divide
            int segmentMiddle = (segmentBegin + segmentEnd) / 2;
            mergeSort(data, segmentBegin, segmentMiddle);
            mergeSort(data, segmentMiddle + 1, segmentEnd);
    
            // conquer (merge)
            merge(data, segmentBegin, segmentMiddle, segmentEnd);
        }
    }

    public static void main(String[] args) {

        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        System.out.println(Arrays.toString(data));
        mergeSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}

