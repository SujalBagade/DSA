import java.util.*;
public class secondlargest {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter size of array");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int b=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>b)
            {
                b=arr[i];
            }
        }
        int c=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>c && arr[i]!=b)
            {
                c=arr[i];
            }
        }
        System.out.println("Second largest is "+c);

    }
}
