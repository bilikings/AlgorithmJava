/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/21 22:06
 */
public class NumReverse {
    public int reverse(int x) {
        long res = 0;
        while (x!=0){
            int temp = x%10;
//            if(res>214748364||(res==14748364 && temp>7)){
//                return 0;
//            }
//            if(res<-214748364|| (res==-214748364 && temp<-8)){
//                return 0;
//            }
            res =res*10+temp;
            x/=10;
        }
        return (int) res==res?(int)res:0;
    }

    public static void main(String[] args) {
        NumReverse nr = new NumReverse();
        System.out.println(nr.reverse(398289459));
    }
}
