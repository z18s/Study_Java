package grokking_algorithms;

import grokking_algorithms.chapter_1.BinarySearch;

public class Main {

    public static void main(String[] args) {

        // Chapter 1
        // BinarySearch
        int[] arr = new int[100];
        for (int i = 0; i <= 99; i++) {
            arr[i] = i;
        }

        int result = BinarySearch.search(49, arr);
        System.out.println(result);
    }
}