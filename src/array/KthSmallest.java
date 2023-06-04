package array;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {

    }

    public static int kthSmallest(int[] arr, int l, int r, int k) {
        if(arr.length == 0 || k>arr.length) return -1;
        int pivotElement = arr[l];
        int pos = findPosition(pivotElement,arr);
        arr[pos] = arr[pos] ^ arr[l] ^ (arr[l] = arr[pos]);
        if (pos + 1 == k) return pivotElement;
        int i = l, j = pos + 1;
        while (i < pos && j <= r) {
            if (arr[i] > pivotElement && arr[j] < pivotElement) {
                arr[i] = arr[i] ^ arr[j] ^ (arr[j] = arr[i]);
                i++;
                j++;
            } else if (arr[i] < pivotElement) {
                i++;
            } else j++;
        }
        if (pos + 1 < k) {
            return kthSmallest(arr, pos + 1, r, k);
        } else {
            return kthSmallest(arr, l, pos - 1, k);
        }
    }

    public static int findPosition(int pivotElement, int[] array){
        int position = 0;
        for (int element: array) {
            if(pivotElement>element) position++;
        }
        return position;
    }
}
