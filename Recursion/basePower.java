import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base\n");
        int b=sc.nextInt();
        System.out.println("Enter power\n");
        int p=sc.nextInt();
       
        System.out.println(call(b,p));
 
    }
    
    static int call(int b,int p)
    {
        if(p==0)
        return 1;

       int ans=call(b,p/2);
       int mnn=b*ans;
       if(p%2==1)
       {
        mnn=mnn*b;
       }
       
       return mnn;
    }

}

