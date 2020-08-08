package j2;

public class Main{

    public static int getSmallest(int[] a, int total){
        int temp;
        for (int i=0; i<total; i++)
        {
            for (int k = i+1; k<total; k++)
            {
                if (a[i] > a[k])
                {
                    temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String args[]){
        int a[]={3,6,8,2,7,1};
         System.out.println("Smallest: "+getSmallest(a,6));
     }
}