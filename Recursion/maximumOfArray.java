import java.util.*;
 class maximumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      
        
        System.out.println("Max is "+reverseDisplay(arr,0));
    }

    static int reverseDisplay(int[] arr, int index)
    {
        
        if(index==arr.length-1)
        return arr[index];

        int max= reverseDisplay(arr,index+1);
        if(max>arr[index])
        {
            return max;
        }
        else
        return arr[index];

        
    }
}
