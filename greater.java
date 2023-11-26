import java.util.*;
public class greater
{
    public static void highest (int a, int b)
    {
        if(a > b)
        {
            System.out.println(a + " is greater");
        }
        else{
            System.out.println(b + " is greater");
        }
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        highest(a,b);
    }
}