package array;

public class Sort012 {
    public static void main(String[] args) {

    }
    public static void sort012(int[] arr, int n) {
        int i = 0, j=n-1;
        int zeroIndex = 0, twoIndex=j;
        while (i<n ){
            if(arr[i] == 0 && i == zeroIndex ){
                i++;
                zeroIndex++;
            }
            else if(arr[i] == 0){
                arr[i] = arr[i] ^ arr[zeroIndex] ^ (arr[zeroIndex] = arr[i]);
                zeroIndex++;
            }
            else i++;
        }

        while (j>=zeroIndex){
            if(arr[j] == 2 && j == twoIndex ){
                j--;
                twoIndex--;
            }
            else if (arr[j] == 2 ) {
                arr[j] = arr[j] ^ arr[twoIndex] ^ (arr[twoIndex] = arr[j]);
                twoIndex--;
            }
            else j--;
        }
    }
}
