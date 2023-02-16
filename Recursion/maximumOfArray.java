class maximumOfArray{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,32,45,65,43,21,12,45,87,54,5,3,0};// ID array
        System.out.println("Max Number is: "+max(arr,0));
    }
    static int max(int[] arr,int index)
    {
        if(arr.length==index)
        {
            return 0;
        }
        int max1=max(arr,index+1);
        if(max1>arr[index])
        {
            return max1;
        }
        else return arr[index];
    }
}
