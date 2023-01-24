import java.util.*;
public class DisplayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        reverseDisplay(arr,0);
    }
    static void reverseDisplay(int[] arr, int index)
    {
        
        if(index==arr.length)
        return;
        
        reverseDisplay(arr, index+1);
        System.out.println(arr[index]);
    }
}
