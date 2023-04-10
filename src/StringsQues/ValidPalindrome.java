package StringsQues;

public class ValidPalindrome {

    public static boolean isValid(char c){
        return (c>='a' && c<='z') || (c>='0' && c<='9');
    }

    public static boolean palindrome(String str){
        str = str.toLowerCase();
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);
            if(isValid(c1) && isValid(c2) ){
                if(c1!=c2) return false;
                i++;
                j--;
            }
            if(!isValid(c1)) i++;
            if(!isValid(c2)) j--;
        }
        return true;
    }
}
