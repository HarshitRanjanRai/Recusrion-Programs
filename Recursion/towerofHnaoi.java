import java.util.*;
class solution{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of disks");
        int n=sc.nextInt();
        char t1='A',t2='B',t3='C';
        call(n,t1,t2,t3);
    }
    static void call(int n,char t1,char t2,char t3)
    {
        if(n==0)
        return;
call(n-1,t1,t3,t2);
System.out.println(n+"["+t1+" to "+t2+"]");
call(n-1,t3,t2,t1);
    }
}