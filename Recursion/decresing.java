import java.util.*;
class solution{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        call(n);

    }




    static void call(int n)
    {
        if(n==0)
        {
            System.out.println("*********************************");
            return;
        }
System.out.println(n);
call(--n);
System.out.println(n);
    }
}