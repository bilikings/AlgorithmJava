/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/8/12 21:35
 */
public class isPrime {
    static boolean numIsPrime(int a){
        int as =(int) Math.sqrt(a);
        for (int i = 2; i < as; i++) {
            if(a%i==0)return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(numIsPrime(923745827));
    }
}
