package searchingaAndSorting;

import java.util.ArrayList;

public class ArrayIntersection {

    public static void main(String[] args) {
        int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        System.out.println(intersection(ar3,ar1,ar2));
    }

    public static ArrayList<Integer> intersection(int[] array1, int[] array2, int[] array3){
        ArrayList<Integer> common = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        int arr2Index=0,arr3Index=0;
        for(int i=0; i<array1.length;i++){
            int k = array1[i];
            while (array2.length>arr2Index && array2[arr2Index]<=k){
                if(k==array2[arr2Index]) common.add(k);
                arr2Index++;
            }
        }

        for(int i=0; i<common.size();i++){
            int k = common.get(i);
            while ( array3.length>arr3Index && array3[arr3Index]<=k ) {
                if(k==array3[arr3Index]) res.add(k);
                arr3Index++;
            }
        }
        return res;
    }


}
