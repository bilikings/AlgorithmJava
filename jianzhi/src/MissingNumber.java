/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/4/30 15:29
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
//        if(nums[0]==1){
//            return 0;
//        }
//        int i = 0;
//        for(;i<nums.length-1;i++){
//            if(nums[i+1]-nums[i]==2){
//                return i+1;
//            }
//        }
//        return i+1;
//二分法
        int low = 0;
        int high = nums.length - 1;
        while (low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid]==mid){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return low;
    }
}
