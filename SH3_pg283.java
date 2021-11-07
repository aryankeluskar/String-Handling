//no of palindrome words in a string
import java.util.*;
class SH3_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("input a string");
        String s = sc.nextLine();

        s = s.toLowerCase();
        int a = 0;
        int count =0;

        for(int i = 1;i<s.length()-1;i++)
        {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);

            if(ch==32&&ch1==32)
            {
                a++;
                continue;
            }
            if(ch==32||i==s.length()-1)
            {
                String w = s.substring(a,i);
                if(i==s.length()-1)
                    w =s.substring(a);
                a=i+1;
                String s1 = "";
                for(int j =w.length()-1;j>=0;j--)
                {
                    char ch2 = w.charAt(j);
                    s1+=ch2;

                }
                if(w.equals(s1))
                    count++;
            }
        }
        System.out.println(count);
    }
}