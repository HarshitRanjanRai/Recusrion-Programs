 import java.util.*;
 class functionCall {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
call(n);
    }
    static void call(int n)
    {
        if(n==0)
        return;
System.out.println("pre"+n);
call(n-1);
System.out.println("In"+n);
call(n-1);
System.out.println("Post"+n);
    }
}
