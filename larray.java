import java.util.*;
public class larray {
    public static void main(String[] args)
    {
        int a;
        System.out.println("Enter total length of array");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("Enter elements of array");
        for (int i = 0; i < a; i++)
        {
            arr[i] = sc.nextInt();
        }
        int b=arr[0];
        for(int i=0;i<a;i++)
        {
            if(arr[i]>b)
            {
                b=arr[i];
            }
        }
        System.out.println("Largest element is " + b);
    }
    
}
