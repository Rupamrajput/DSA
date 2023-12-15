package arraysQues;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,3,5,8};
        arr = reverse(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static int[] reverse(int[] arr){
        int i=0; int j=arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return arr;
    }
}
