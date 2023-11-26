import java.util.*;
public class checksort {
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
        int j=1;
        for (int i=1;i<a;i++)
        {
            if(arr[i]>=arr[i-1])
            {
                
            }
            else{
                j=0;
            }
        }
        if(j==1)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}
