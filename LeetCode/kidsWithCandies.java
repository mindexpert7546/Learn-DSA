class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        int resCandies[] = new int[candies.length];

        int j=0;
        for(int i=0; i<candies.length; i++){
            resCandies[j++] = candies[i]+extraCandies;
        }

        int maxNum = maxNumber(candies);
        for(int i=0;i<candies.length; i++){
            if(resCandies[i]>=maxNum){
              list.add(true);  
            } else{
                list.add(false);
            }
        }

        return list;
    }

    static int maxNumber(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int a:arr){
            if(a>max)max=a;
        }
        return max;
    }
}
