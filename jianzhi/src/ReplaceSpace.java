/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 14:27
 */
public class ReplaceSpace {
    public static String replaceSpace(String s) {
        StringBuilder rs = new StringBuilder();
        for(Character c:s.toCharArray()){
            if(c==' '){
                rs.append("%20");
            }else {
                rs.append(c);
            }
        }
        return rs.toString();
//        return s.replaceAll(" ", "%20"));
    }

    public static void main(String[] args) {

        String a = "momo momo e";
        System.out.println(replaceSpace(a));
    }
}
