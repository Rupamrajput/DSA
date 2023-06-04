package array;

public class RotateByOne {
    public static void main(String[] args) {

    }
    public void rotate(int arr[], int n) {
        for(int i = 0;i<n-1;i++){
            arr[i] = arr[i] ^arr[n-1]^(arr[n-1] = arr[i]);
        }
    }

}
