import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for Factorial:\n");
        int n=sc.nextInt();
    System.out.println(call(n));    
    
    }
    static int call(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*call(n-1);
    }
}
