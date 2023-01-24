import java.util.*;
class PowerdOUBLE {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter base");
    int b=sc.nextInt();
    System.out.println("Enter Power");
    int p=sc.nextInt();
    System.out.println(call(b,p));
    }
    static int call(int b,int p)
    {
        if(p==0)
        return 1;
        int ans=call(b,p/2);
        int ok=ans*ans;
        if(p%2!=0)
        {
            ok=ans*b;
        }
return ok;
    }
}
