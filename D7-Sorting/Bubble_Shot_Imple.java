import java.text.BreakIterator;

public class BubbleShot {

    public void BubblePrint(){
        int[] arr = {12,5,64,76,45,3,9};
        int temp,i,j;
        int n = arr.length;
        boolean br;



        for(i=0; i<n-1; i++)
        {
             br = false;
            for(j=0; j<n-i-1; j++)
            {

                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    br = true;
                }

            }
            if(br==false){
                break;
        }
       
       }
        for(int k=0; k<n-1; k++){
            System.out.print(arr[k] + " ");
        }
        

    }
    public static void main(String[] args) {
        BubbleShot bls = new BubbleShot();
        bls.BubblePrint();
       


    }
}

