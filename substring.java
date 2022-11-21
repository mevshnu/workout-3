import java.util.Scanner;
public class substring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String n = sc.next();
        int l = n.length();

            for (int i = 0; i < l; i++)
            {
                for (int j = i + 1; j <= l; j++)
                {
                    System.out.println(n.substring(i, j));
                }
            }


    }
}
