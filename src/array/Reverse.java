package array;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(Arrays.toString(arrayReverse(array)));
    }

    public static int[] arrayReverse(int[] array){
        for(int i = 0,j= array.length-1; i<j;i++,j--){
            array[i] = array[i] ^ array[j] ^ (array[j] = array[i]);
        }
        return array;
    }
}
