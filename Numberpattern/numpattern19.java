package Numberpattern;

import java.util.*;
public class numpattern19 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),t=m,i=0;
        for(int p=0;p<n;p++)
        {
        if(m<=0)
        {
            System.out.print("Invalid Input");
        }
        else{
        while(t>0)
        {
            i=i+t;
            t--;
        }
        int l=i;
        for(int k=m;k>0;k--)
        {
            for(int j=k;j>0;j--)
            {
                System.out.print(l+" ");
                l--;
            }
            System.out.println();
        }
        }
        }
    }
}
