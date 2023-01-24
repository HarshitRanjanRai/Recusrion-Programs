class smallestNumber {
public static void main(String[] args) {
    int[] arr={34,54,8,1,87,23};
    System.out.println(smallNumber(arr,0));
}    
static int smallNumber(int[] arr,int index)
{
    if(index==arr.length)
    return arr[index-1];
    int val=smallNumber(arr,index+1);
    if(arr[index]<val)
    return  arr[index];
    else
    return val;

}
}
