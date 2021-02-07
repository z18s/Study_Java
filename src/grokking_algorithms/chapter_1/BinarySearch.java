package grokking_algorithms.chapter_1;

public class BinarySearch {

    public static int search(int n, int... arr) {
        int iLow = 0;
        int iHigh = arr.length - 1;
        int iMid;
        int guess;

        int counter = 0;

        while (iLow <= iHigh) {
            iMid = (iLow + iHigh) / 2;
            guess = arr[iMid];

            counter++;

            if (n == guess) {
                System.out.println("Steps: " + counter);
                return iMid;
            } else if (n < guess) {
                iHigh = iMid - 1;
            } else {
                iLow = iMid + 1;
            }
        }
        return -1;
    }
}