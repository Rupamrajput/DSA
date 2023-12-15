package arraysQues;

import java.util.HashMap;

public class ContainsDuplicate{

    public static void main(String[] args) {
        int[] arr = {1,9,2,5,2,6};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        for (int i : nums) {
            if (hashMap.containsKey(i)) return true;
            hashMap.put(i, true);
        }
        return false;
    }
}
