
// get the result of total possible outcomes of input 
// like input is 34 so at the place of 3 is "ghi" and the place of 4 is "jkl" so total possible outcomes are = [gj, gk, gl, hj, hk, hl, ij, ik, il]

import java.util.*;
class KeyPadCombination{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();//678
        System.out.println(ans(a));
    }
    static String[] codes={",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static ArrayList<String> ans(String n)
    {
        if(n.length()==0)
        {
            ArrayList<String> aisehe=new ArrayList<>();
            aisehe.add("");
            return aisehe;
        }
        char ch=n.charAt(0);
        String ros=n.substring(1);
        ArrayList<String> temp=ans(ros);// Temproary ArrayList For storing the value
      
        ArrayList<String> fans=new ArrayList<>();//Final Answer ArraYLIST
        
        String str1=codes[ch-'0'];
        for(int i=0;i<str1.length();i++)
        {
char tempcharstr1=str1.charAt(i);
for(String hihi: temp)       //i take the random variabe which stores the String value from temp(ArrayList)
{
    fans.add(tempcharstr1+hihi);
}
        }
        return fans;

    }
}
