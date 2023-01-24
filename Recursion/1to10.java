import java.util.*;
class k1to10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Range: ");
        int n=sc.nextInt();//5
call(n);


    }
    static void call(int var)
    {

        if(var==0)
        {
            return ;
        }
   //change order
    call(var-1);
    System.out.println(var);
    }
    
}
