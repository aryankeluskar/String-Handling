import java.util.*;
class SH9_pg283
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine(); 

        int a=0; 
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
                
                s1 += w +" ";
                
            } 
        }
        System.out.println(s1);
    } 
} 
