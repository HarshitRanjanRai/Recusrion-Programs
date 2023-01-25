import java.util.*;
class sortingBubble{
    public static void main(String[] args) {
        int[] arr={1,4,3,56,43,46,42,87};
        sort(arr,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int index)
    {
if(index==0)
return;

for(int i=0;i<index-1;i++)
{
if(arr[i]>arr[i+1])
{
    int temp=arr[i];
    arr[i]=arr[i+1];
    arr[i+1]=temp;
}

}
sort(arr,index-1);
    }
}
