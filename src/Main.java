import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) throws NoSuchAlgorithmException {
//    List<BigDecimal> a = new ArrayList<>();
//    List<BigDecimal> b = new ArrayList<>();
//    List<BigDecimal> c = new ArrayList<>();
//    a.add(BigDecimal.valueOf(2));
//    a.add(BigDecimal.valueOf(3));
//    a.add(BigDecimal.valueOf(4));
//    b.add(BigDecimal.valueOf(5));
//    b.add(BigDecimal.valueOf(7));
//    c.add(BigDecimal.valueOf(6));
//    c.add(BigDecimal.valueOf(1));
//    c.add(BigDecimal.valueOf(1));
//    merge(List.of(a,b,c),0,BigDecimal.ZERO);
//    System.out.println(result);

    String input = "gfg";

    MessageDigest t = MessageDigest.getInstance("SHA-1");
    BigInteger b = new BigInteger(1, t.digest(input.getBytes()));
    System.out.println(b.toString(16));

    MessageDigest md = MessageDigest.getInstance("MD5");
    BigInteger md5 = new BigInteger(1, md.digest(input.getBytes()));
    StringBuilder low = new StringBuilder(md5.toString(16));
    if(low.length()<32) low.insert(0,'0');
    MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
    //BigInteger sha = new BigInteger(1, sha1.digest(input.getBytes()));
//    StringBuilder medium = new StringBuilder(sha.toString(16));
//    System.out.println(medium);
    byte[] result = sha1.digest(input.getBytes());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < result.length; i++) {
      sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
    }

    System.out.println(sb);
    //while (medium.length()<32) medium.insert(0,'0');

    MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
    BigInteger sh256 = new BigInteger(1, sha256.digest(input.getBytes()));
    StringBuilder high = new StringBuilder(sh256.toString(16));
    if(high.length()<64) high.insert(0,"0");

  }

  static List<BigDecimal> result = new ArrayList<>();

  public static void merge(List<List<BigDecimal>> lists, int depth,BigDecimal current){
    if(depth==lists.size()){
      result.add(current);
      return;
    }
    for(BigDecimal number:lists.get(depth)){
      merge(lists,depth+1,current.add(number));
    }
  }

}