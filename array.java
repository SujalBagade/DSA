import java.util.*;
public class array 
{
    public static void main(String args[])
    {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Elemnts");
        for (int i = 0; i < n; i++)
        {
            Scanner s = new Scanner(System.in);
            arr[i] = s.nextInt();
        }
        System.out.println("Enter number to be searched");
        int a = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            if (arr[i]==a)
            {
                System.out.println("Found "+a+" at "+i+" index");
                break;
            }
            else{
                System.out.println("Not found");
                break;
            }
        }
    }
    
}
