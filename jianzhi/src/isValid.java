import java.util.Stack;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/8/9 18:13
 */
public class isValid {
    public static boolean isValid(String s) {
        if("".equals(s)){
            return true;
        }
        if(s.length()==1){
            return false;
        }
        Stack<Character> stack =new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp =  s.charAt(i);
            if(temp=='('||temp=='{'||temp=='['){
                stack.push(temp);
            }else {
                char out =stack.pop();
                switch (out){
                    case '(':
                        if(s.charAt(i)!=')'){
                            return false;
                        }
                        break;
                    case '{':
                        if(s.charAt(i)!='}'){
                            return false;
                        }
                        break;
                    case '[':
                        if(s.charAt(i)!=']'){
                            return false;
                        }
                        break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
