import java.util.*;
public class circle {
    public static void circum(int a)
    {
        System.out.println((2*3.14*a));
    }
    public static void main(String[] args)
    {
        int a ;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        circum(a);
    }
}
