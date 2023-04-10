package ArraysQues;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        maxAndMin(arr);
    }
    public static void maxAndMin(int[] arr){
        int n= arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
