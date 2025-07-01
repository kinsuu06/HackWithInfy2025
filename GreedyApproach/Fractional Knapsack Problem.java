import java.util.*;

public class Fractional_Knapsack_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        Arrays.sort(arr, (a,b) -> Double.compare((double)b[0]/b[1], (double)a[0]/a[1]));

        for(int i=0; i<n; i++){
            if(arr[i][0] <= w){
                ans += arr[i][0]*arr[i][1];
                w -= arr[i][0];
            }else{
                ans += w * arr[i][1];
                break;
            }
        }
        System.out.println(ans);
    }
}
