import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Input {
  private static final Random random = new SecureRandom();

  public static void main(String[] args) {
//    System.out.printf("%010d",new BigInteger(29,random));
//    for(int i=0; i<100;i++){
//      find();
//    }
    find();
  }



  public static void find(){
    Set<BigInteger> integers= new HashSet<>();
    for(int i=0; i<100_000_000;i++){
      BigInteger l = new BigInteger(40,random);
      if(integers.contains(l)){
        System.out.println("repetition at "+ integers.size());
        break;
      }
      integers.add(l);
    }
  }
}
