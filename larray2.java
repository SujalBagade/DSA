import java.util.*;
public class larray2 {
    public static void main(String[] args)
    {
        int b;
        int arr[]={1,2,3,4,5,6,7,8,9};
        b=arr[0];
        for(int i=0;i<9;i++)
        {
            if(arr[i]>b)
            {
                b=arr[i];
            }
        }
        System.out.println("Largest is "+b);
        
    }
}
