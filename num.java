import java.util.*;
public class num {
    public static void calc(int a)
    {   
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i = 0; i < a; i++)
        { 
            int b;
            Scanner sc = new Scanner(System.in);
            b=sc.nextInt();

            if(b== 0)
            {
                zero++;
            }
            if(b>0)
            {
                positive++;
            }
            if(b<0){
                negative++;
            }
        }
        System.out.println("positive "+positive+" Negative "+negative +" zero "+ zero);
    }
    public static void main(String[] args)
    {
        int a;
        System.out.println("Enter the number of values to calculate");
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        calc(a);

    }
}
