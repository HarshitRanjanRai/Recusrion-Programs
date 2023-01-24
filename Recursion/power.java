import java.util.*;
class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base");
        int b=sc.nextInt();
        System.out.println("Enter Power");
        int p=sc.nextInt();
       System.out.println(call(b,p));
    }
    static  int call(int b,int p)
    {
        if(p==0)
        return 1;

        int ans=call(b,p-1);
        int fn=b*ans;
        return fn;
    }
}
