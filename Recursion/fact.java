 import java.util.*;
 class fact {
    public static void main(String[] args) {
        System.out.println("enter value: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    static int fact(int var)
    {
        if(var==0)
        {
            return 1;
        }
        return var*fact(var-1);
    }
}
