package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveNegative {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveNegative(new int[] { -12, 11, -13, -5, 6, -7, 5, -3, -6 }, 9)));
    }

    public static int[] moveNegative(int[] array, int n){
        List<Integer> negative = new ArrayList<>();
        for(int ele : array){
           if(ele <0 ) negative.add(ele);
        }
        int positiveIndex = 0;
        for(int i =0; i< n ; i++){
            if(array[i]>0){
                array[positiveIndex] = array[positiveIndex] ^ array[i] ^ (array[i] = array[positiveIndex]);
                positiveIndex++;
            }
        }
        int j =0;
        for(int i= n-negative.size();i<n;i++){
            array[i] = negative.get(j);
            j++;
        }
        return array;
    }
}
