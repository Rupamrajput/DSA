package array;

public class MinAndMax {

    public static void main(String[] args) {
        System.out.println(minMax(new int[]{1,1,1,1}));
    }

    public static Pair minMax(int[] array){
        Pair pair = new Pair();
        pair.min = Integer.MAX_VALUE;
        pair.max = Integer.MIN_VALUE;
        for (int j : array) {
            if (pair.max < j) {
                pair.max = j;
            }
            if (pair.min > j) {
                pair.min = j;
            }
        }
        return pair;
    }

    public static class Pair{
        int min;
        int max;

        @Override
        public String toString() {
            return "Pair{" +
                "min=" + min +
                ", max=" + max +
                '}';
        }
    }
}
