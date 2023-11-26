import java.util.*;
public class sumo
{ 
    public static void sum (int a )
    {
        int s=0;
        for(int i=1 ; i<=a ; i++)
        {
            
            if(i%2!=0)
            {
                s=s + i;
            }
        }
        System.out.println("Sum of odd numbers is: " + s);
    }
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        sum(a);
    }
}