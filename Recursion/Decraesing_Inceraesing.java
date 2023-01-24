import java.util.*;
class solution{
    public static void main(String[] args) {
        System.out.println("enter: ");
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
System.out.println(n);
call(n-1);
System.out.println(n);
    }
}