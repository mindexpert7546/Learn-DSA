
/*
input : 
arr = { 7,1,5,3,6,4}

output: 5
*/
package Arrays;

public class StockSellBuy {
    public static void main(String[] args) {
        int[] arr = { 7,1,5,3,6,4};
        System.out.println(sellBuy(arr));

    }
    public static int sellBuy(int[] arr){
        int buyMax = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            if(buyMax <arr[i]){
                int profit = arr[i]-buyMax;
                maxProfit = Math.max(maxProfit, profit);
            }
            else {
                buyMax = arr[i];
            }
        }
        return maxProfit;
    }
}
