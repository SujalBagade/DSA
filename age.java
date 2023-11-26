import java.util.*;
public class age {
    public static void calc (int a)
    {
        if(a > 18)
        {
            System.out.println("yes");

        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args)
    {
        int a ;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        calc(a);
    }
}
