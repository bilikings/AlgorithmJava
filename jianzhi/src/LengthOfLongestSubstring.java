import java.util.HashMap;
import java.util.Map;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/7/12 11:17
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0){
            return 0;
        }
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        for(int i = 0;i<s.length();i++){
            Character c = s.charAt(i);
            int index = map.getOrDefault(c,-1);
            if(start<=index){
                int cMax = i-start;
                max = Math.max(max, cMax);
                start =index+1;
            }
            map.put(c,i);
        }
        int endStart = s.length()-start;
        max = Math.max(endStart,max);
        return max;
    }
}
