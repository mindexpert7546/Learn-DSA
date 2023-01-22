/**
https://practice.geeksforgeeks.org/problems/triangle-number/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_3
*/

class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=0; i<n; i++){
            int k=1;
            for(int j=0; j<=i; j++){
                
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
