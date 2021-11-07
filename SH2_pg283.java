//Frequency of vowels
import java.util.*;
class SH2_pg283
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence");
        String s = sc.nextLine();
        s.toLowerCase();
        int a=0,e=0,i=0,o=0,u=0;
        for (int j= 0;j<s.length();j++)
        {
            char ch = s.charAt(j);
            if(ch=='a')
            a++;
            else if(ch=='e')
            e++;
            else if(ch=='i')
            i++;
            else if(ch=='o')
            o++;
            else if(ch=='u')
            u++;
            else
            continue;
        }
        System.out.println("The frequency of a is "+a);
        System.out.println("The frequency of e is "+e);
        System.out.println("The frequency of i is "+i);
        System.out.println("The frequency of o is "+o);
        System.out.println("The frequency of u is "+u);
    }
}
