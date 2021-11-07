import java.util.*;
class SH7_pg283_no
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string");
        String sa=sc.nextLine(); 
        System.out.println("Enter 2nd string");
        String sb=sc.nextLine(); 
        
        String s = sa+" "+sb;
        
        s=s.toUpperCase(); 

        int a=0,wordcount = 0; 
        String s1 = "";

        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i); 
            char ch1=s.charAt(i-1); 

            if(ch==32 && ch1==32) 
            {
                a++;
                continue;
            }

            if(ch==32 ||i==s.length()-1) 
            {
                String w=s.substring(a,i);
                if(i==s.length()-1) 
                    w=s.substring(a);

                a=i+1; 
                wordcount++;

                
            } 
        }
        System.out.println();
    } 
} 
