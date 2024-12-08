import java.util.*;
class fire
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==1)
        a-=1;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(i+j==a/2 || j-i==a/2||i-j==a/2 || i+j==a+(a/2) )
                {
                    System.out.print("*"+"");
                }
                else {
                    System.out.print(" "+"");
                }

            }
            System.out.println();
        }
    }
}