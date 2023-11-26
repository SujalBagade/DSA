import java.util.*;
public class removeduplicate {
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
        int i=0;
        for(int j=1;j<a;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[i+1]=arr[j];
                i++;
            }
        }
        for(int m=0;m<a;m++)
        {
            System.out.print(arr[m]+" ");
        }
    }
    
}
