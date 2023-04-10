package SimbusTech;

public class Interview {
    public static void main(String[] args) {
        System.out.println(checkIfSumOfPrime(27));
    }
    public static boolean checkIfSumOfPrime(int n){
        //5+7 = 12
        for(int i=2;i<n;i++){
            if(isPrime(i) && isPrime(n-i)) return true;
        }
        return false;
    }

    public static boolean isPrime(int n){
        if(n<2) return false;
        if(n==2) return true;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
