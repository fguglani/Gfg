import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner input=new Scanner(System.in);
	    int t=input.nextInt();
	    while(t-->0)
	    {
	        int n=input.nextInt();
	        //We can have three approaches for this question
	        //1)->Using sum and sum of squares this will be valid till n<10^6
	        //2)->Using Indexes
	        
	        
	        /*
	        //1)->Using sum
	        long sum=(n*(n+1))/2;
	        long sq_sum=(n*(n+1)*((2*n)+1))/6;
	        //System.out.println(sum+" "+sq_sum);
	        long calc_sum=0;
	        long calc_sq_sum=0;
	        for(int i=0;i<n;i++)
	        {
	            int x=input.nextInt();
	            calc_sum+=x;
	            calc_sq_sum+=(long)Math.pow(x,2);
	        }
	        long b_c=sum-calc_sum;
	        long b_c2=sq_sum-calc_sq_sum;
	        long bc=b_c2/b_c;
	        int mis=(int)((b_c+bc)/2);
	        int rep=(int)(bc-mis);
	        
	        System.out.println(rep+" "+mis);
	        */
	        
	        //2)->Using indexes;
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=input.nextInt();
	        }
	        //Only two numbers will remain positive after this step one will repeating numbers and other with missing number
	        for(int i=0;i<n;i++)
	        {
	            a[Math.abs(a[i])-1]*=-1;
	        }
	        //Lets find both the numbers only their indexes will be positive
	        int rep=-1;
	        int miss=-1;
	        int flag=0;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]>0 && flag==0)
	            {
	                rep=i+1;
	                flag=1;
	            }
	            else if(a[i]>0)
	            {
	                miss=i+1;
	            }
	        }
	        //Check if number we found comes twice in the array
	        int c=0;
	        for(int i=0;i<n;i++)
	        {
	            if(rep==Math.abs(a[i]))
	            {
	                c++;
	            }
	        }
	        //If yes then Hurray we found it
	        if(c==2)
	        {
	            System.out.println(rep+" "+miss);
	        }
	        else//Otherwise the numbers are in reverse order of our expectations
	        {
	            System.out.println(miss+" "+rep);
	        }
	        
	        
	    }
	 }
}