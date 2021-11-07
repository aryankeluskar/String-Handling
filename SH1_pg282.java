//Longest word of 10 words
import java.util.*;
class SH1_pg282
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int b =0;
        String s1 = "";
        for (int i = 0;i<10;i++)
        {
            System.out.println("Input a word");
            String s = sc.nextLine();
            int a  = s.length();
            if(a>b)
            {
                b=a;
                s1= s;
            }
        }
        System.out.println("The Longest word is = "+s1);
        System.out.println("Length of the word is = "+b);
    }
}
