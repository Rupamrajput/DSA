package array;

import java.util.HashSet;
import java.util.Set;

public class DoUnion {
    public static void main(String[] args) {

    }

    public static int doUnion(int[] a, int n, int[] b, int m) {
        Set<Integer> set = new HashSet<>();
        for(int ele : a){
            set.add(ele);
        }
        for (int ele : b){
            set.add(ele);
        }
        return set.size();
    }
}
