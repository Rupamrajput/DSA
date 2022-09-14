package StringsQues;

public class RemoveConsecutiveChars {
    public String removeConsecutiveCharacter(String S){
        int n = S.length();
        if(n==0) return "";
        String result = "";
        char last = S.charAt(0);
        result += last;
        for(int i=1;i<n;i++){
            if(S.charAt(i)!=last) result += S.charAt(i);
            last = S.charAt(i);
        }
        return result;
    }
}
