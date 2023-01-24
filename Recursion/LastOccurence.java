import java.util.*;
class LastOccurence {
    public static void main(String[] args) {
       int[] arr={1,7,6,7,4,33,44,55,5,6,43,7,5};
System.out.println(li(arr,0,7));

    }





    static int li(int[] arr,int index,int tr)
    {
        if(index==arr.length)
        return -1;
       int val=  li(arr,index+1,tr);
        if(val==-1)
        {
            if(arr[index]==tr)
            return index;
            else
            return -1;
        }
        else return val;
    }
}
