public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr={98,78,2,3,5,67,43,2};
        System.out.println(foc(arr,98,0));
    }
static int foc(int[] arr,int s,int index)
{
    if(index==arr.length-1)
    return -1;

    if(arr[index]==s)
    return index;

    return foc(arr,s,index+1);
}
}



// public class FirstOccurence {
//     public static void main(String[] args) {
//         int[] arr={98,78,2,3,5,67,43,2};
//         System.out.println(foc(arr,98,0));
//     }
// static int foc(int[] arr,int s,int index)
// {
//     if(index==arr.length-1)
//     return -1;
//     int ans=foc(arr,s,index+1);
//     if(arr[index]==s)
//     return index;
//     else
//     return ans;

// }
// }
