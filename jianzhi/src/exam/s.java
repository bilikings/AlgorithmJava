package exam;

/**
 * @author atom.hu
 * @version V1.0
 * @Package exam
 * @date 2020/9/5 22:30
 */
public class s {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int add1 = 0, add2 = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            add1 += mat[i][i];
            add2 += mat[n - 1 - i][i];
        }
        ans = add1 + add2;
        int sub = mat[n / 2][n / 2];
        if ((n & 1) == 1) {
            ans -= sub;
            return ans;
        } else {
            return ans;
        }
    }

    public static int findLengthOfShortestSubarray(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }
        int l = 0, r = arr.length - 1;
        int lp=0,rp = r;
        int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>=arr[i-1]){
                l++;
            }else {
                lp = l;
                break;
            }
        }
        for(int i =arr.length-2;i>=0;i--){
            if(arr[i]<=arr[i+1]){
                r--;
            }else {
                rp= r;
                break;
            }
        }
        if(r==0||l==n) return 0;
        int res = n -rp;
        for (int i = 0; i <=lp; i++) {
            while (rp<n&&arr[rp]<arr[i]) rp++;
            res = Math.max(res,i+1+n-rp);
        }
        return n-res;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{6,3,10,11,15,20,13,3,18,12};
        System.out.println(findLengthOfShortestSubarray(arr));
    }

}
