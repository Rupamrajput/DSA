package stringsQues;

public class MinimumWindow {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }

    public static String minWindow(String s, String t) {
        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        int[] map = new int[256];
        int end = 0;
        int start = 0;
        int min_length = Integer.MAX_VALUE;
        for(int i = 0; i < t_array.length; i++)
            map[t_array[i]] ++;
        int count = t_array.length;
        int min_start = 0;
        while(end < s_array.length)
        {
            if(map[s_array[end]] > 0)
            {
                count--;
            }
            map[s_array[end]] --;
            while(count == 0)
            {
                if((end - start + 1) < min_length)
                {
                    min_length = end - start + 1;
                    min_start = start;
                }
                map[s_array[start]] ++;
                if(map[s_array[start]] > 0){
                    count ++;
                }
                start++;
            }
            end ++;

        }
        if( min_start+min_length > s_array.length)
            return "";
        return s.substring(min_start, min_start+min_length);
    }


//    public static String minWindow(String s, String t) {
//        if(s.length()<t.length()) return "";
//        HashMap<Character,Integer> tMap = new HashMap<>();
//        for(char c : t.toCharArray()){
//            tMap.put(c,tMap.getOrDefault(c,0)+1);
//        }
//        int min = s.length();
//        String res = "";
//        for(int i=0; i<s.length();i++){
//            for(int j=s.length();j>=i;j--){
//                if(minWindow(s.substring(i,j),tMap) && (j-i)<min){
//                    min = j-i;
//                    res = s.substring(i,j);
//                }
//            }
//        }
//        return res;
//    }
//    public static boolean minWindow(String s, HashMap<Character,Integer> tMap){
//        HashMap<Character,Integer> sMap = new HashMap<>();
//        for(char c : s.toCharArray()){
//            sMap.put(c,sMap.getOrDefault(c,0)+1);
//        }
//        for(char c : tMap.keySet()) {
//            if(!sMap.containsKey(c)) return false;
//            else if(tMap.get(c)>sMap.get(c)) return false;
//        }
//        return true;
//    }
}
