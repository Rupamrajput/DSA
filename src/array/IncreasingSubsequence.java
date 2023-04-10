package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IncreasingSubsequence {

  public static void main(String[] args) {

  }

  static int[] array;
  public static Set<List<Integer>> hashset = new HashSet<>();
  public static List<List<Integer>> findSubsequence(int[] arr){
    array = arr;
    List<Integer> arraylist = new ArrayList<>();
    helper(arraylist,0);
    List<List<Integer>> result = new ArrayList<>(hashset);
    return result;
  }

  public static void helper(List<Integer> arraylist, int index){
    if(arraylist.size()>=2) hashset.add(arraylist);

    for(int i=index; i<array.length;i++){
      if(arraylist.size() == 0 || arraylist.get(arraylist.size()-1)<=array[i]){
        arraylist.add(array[i]);
        helper(arraylist,i+1);
        arraylist.remove(arraylist.size()-1);
      }
    }
  }
}
