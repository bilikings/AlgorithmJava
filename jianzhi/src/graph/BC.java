package graph;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author atom.hu
 * @version V1.0
 * @Package graph
 * @date 2020/9/16 17:22
 */
public class BC {
    static int n;
    static int m;
    static int N = 100010;
    static int M = 200010;
    static int[] h = new int[N];
    static int[] e = new int[M];
    static int[] ne = new int[M];
    static int idx = 0;
    static int[] color = new int[N];//共1和2两种不同的颜色
    static boolean[] st = new boolean[N];
    public static void add(int a,int b)
    {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx ++;
    }
    //dfs(u,c)表示把u号点染色成c颜色，并且判断从u号点开始染其他相连的点是否成功
    public static boolean dfs(int u,int c)
    {
        color[u] = c;
        for(int i = h[u];i != -1;i = ne[i])
        {
            int j = e[i];
            if(color[j] == 0)
            {
                if(!dfs(j,3 - c)) return false;
            }
            else if(color[j] == c) return false;//颜色重复
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        Arrays.fill(h, -1);
        while(m -- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            add(a,b);
            add(b,a);
        }
        boolean flag = true;//标记是否染色成功
        for(int i = 1;i <= n;i++)
        {
            //若未染色
            if(color[i] == 0)
            {
                if(!dfs(i,1))
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
