import java.util.Scanner;
public class Arrays

{
    public static void main(String[] args)
    {
        Scanner bhavya=new Scanner(System.in);
        String str="java";
        if(str.length()>0)
    {
        System.out.println("string is not empty and length is:"+str.length());
    }
        str="";
        if(str.length()==0){
            System.out.println("string is empty now:"+str.length());
        }
    }
}