public class arrayDisplay {
    public static void main(String[] args) {
        int[] arr={1,2,3,44,1,2,3,4,98,6,5};
    display(arr,0);
    }
    static void display(int[] arr,int index)
    {
if(arr[index]==null)
return;
System.out.println(arr[index]);
display(arr,index+1);
    }
}
