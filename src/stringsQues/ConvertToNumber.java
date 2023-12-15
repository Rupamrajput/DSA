package stringsQues;

public class ConvertToNumber {

    public static void main(String[] args) {
        String[] arr = {"2","22","222","3","33","333","4","44","444",
        "5","55","555","6","66","666","7","77","777","7777","8","88",
        "888","9","99","999","9999"};
        System.out.println(convert("yugal batra",arr));

    }

    public static String convert(String input, String[] array){
        String string = "";
        for(int i=0; i<input.length();i++){
            if(input.charAt(i)!=' '){
                string +=array[input.charAt(i)-'a'];
            }
            else string+="0";
        }
        return string;
    }

}
