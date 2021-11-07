//vowel censor
import java.util.*;
class SH12_pg284
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a sentence");
        String s = sc.nextLine();
        s.toLowerCase();
        String s1= "";
        for (int j= 0;j<s.length();j++)
        {
            char ch = s.charAt(j);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='O'||ch=='E'||ch=='U')
            s1 +='*';
            else
            s1 +=ch;
        }
        System.out.println(s1);
    }
}