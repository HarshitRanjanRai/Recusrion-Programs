import java.util.*;
class sol{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter Number\n");
        int n=sc.nextInt();
System.out.println(call(n));
    }
    static int call(int n)
    {
        if(n==0)
        return 1;
        int num=call(n-1);
int ans=num*n;
return ans;
    }
}