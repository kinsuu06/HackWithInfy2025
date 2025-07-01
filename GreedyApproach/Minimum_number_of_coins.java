import java.util.*;

public class Minimum_Number_of_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int[] coins = {1, 2, 5, 10, 20, 50, 100};

        Arrays.sort(coins);
        int count = 0;
        for(int i=coins.length-1; i>=0; i--){
            while(amount >= coins[i]){
                amount -= coins[i];
                count++;
            }
        }
        System.out.println(count);

    }
}
