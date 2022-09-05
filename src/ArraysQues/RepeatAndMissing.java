package ArraysQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepeatAndMissing {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);a.add(2);
        System.out.println(repeatedNumber(a));
    }
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();

        Collections.sort(A);
        int n = A.size();
        int rep = -1;
        int miss;
        int sum = A.get(0);

        for (int i = 1; i < n; i++) {
            if (A.get(i).equals(A.get(i - 1))) {
                rep = A.get(i);
            }
            sum += A.get(i);
        }

        miss = ((n * (n + 1)) / 2 - sum + rep);

        res.add(rep);
        res.add(miss);

        return res;
    }
}
