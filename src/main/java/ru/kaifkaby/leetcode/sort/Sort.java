package ru.kaifkaby.leetcode.sort;

public class Sort {

    public static void insertionSort(int[] arr) {
        InsertionSort.sort(arr);
    }

    public static void mergeSort(int[] arr) {
        MergeSort.sort(arr);
    }

    public static void quickSort(int[] arr) {
        QuickSort.sort(arr);
    }

    private static class InsertionSort {

        private static void sort(int[] arr) {
            int i = 1, j;
            for (; i < arr.length; i++) {
                int key = arr[i];
                j = i - 1;
                while (j != -1 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key;
            }
        }
    }

    private static class MergeSort {

        private static void sort(int[] arr) {
            if (arr == null) {
                return;
            }
            sort(arr, arr.length);
        }

        private static void sort(int[] arr, int n) {
            if (n < 2) {
                return;
            }
            int i = 0, j = 0, h = n / 2;
            int[] l = new int[h], r = new int[n - h];
            for (; i != h; i++) {
                l[i] = arr[i];
            }
            for (; i != n; i++, j++) {
                r[j] = arr[i];
            }
            sort(l, h);
            sort(r, j);
            merge(arr, l, r, h, j);
        }

        private static void merge(int[] arr, int[] l, int[] r, int ln, int rn) {
            int i = 0, j = 0, k = 0;
            while (i < ln && j < rn) {
                arr[k++] = l[i] < r[j] ? l[i++] : r[j++];
            }
            while (i < ln) {
                arr[k++] = l[i++];
            }
            while (j < rn) {
                arr[k++] = r[j++];
            }
        }
    }

    private static class QuickSort {

        private static void sort(int[] arr) {

        }
    }
}
