import java.util.*;
class fire{
    public static void main(String args[])
    {
        int a[]={11,2,3,4,5};
        int s=0;
        for(int i=0;i<a.length;i++)
        {
            s+=a[i];
            int res=s/(i+1);
            a[i]=res;
        }
        System.out.println(Arrays.toString(a));
    }
}