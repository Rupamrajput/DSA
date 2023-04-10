

public class DuplicateCharacters {

  public static void main(String[] args) {

  }

  public static void print(String string) {
    int[] array = new int[256];
    for(int i=0; i<string.length();i++){
      array[string.charAt(i)]++;
    }
  }
}
