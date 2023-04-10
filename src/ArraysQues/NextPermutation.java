package ArraysQues;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};
        nextPermutation(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void swap (int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int i, int n){
        int j = n-1;
        for(;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void nextPermutation(int[] arr){
        int n=arr.length;
        if(n<=1) return;
        boolean dec = false;
        int decElementIndex = 0;
        for(int i=n-2;i>=0;i--){
            if(arr[i+1]>arr[i]){
                dec = true;
                decElementIndex = i;
                break;
            }
        }
        if(!dec){
            reverse(arr,0,n);
            return;
        }
        int maxIndex = decElementIndex;
        for(int i=decElementIndex;i<n;i++){
            if(arr[i]>=arr[maxIndex]){
                maxIndex = i;
            }
            if(arr[i]>arr[decElementIndex] && arr[i]<arr[maxIndex]){
                maxIndex = i;
            }
        }
        swap(arr, decElementIndex, maxIndex);
        reverse(arr, decElementIndex + 1, n);
    }
}
