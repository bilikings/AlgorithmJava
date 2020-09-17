/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/9/1 9:52
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1  =new Thread(() -> {
            System.out.println("sdf");
            System.out.println("  2342");
        });
    }
}
