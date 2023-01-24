import java.util.*;
public class increasing {
    public static void main(String[] args) {
        System.out.println("Enter Number:\n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        call(n);
        

    }
    static void call(int n)
    {
        if(n==0)
        {
            return;
        }
        call(n-1);
        System.out.println(n);
    }
}
