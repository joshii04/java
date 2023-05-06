package lab1;

public class ex11 
{
    public static void main(String[] args)
    {
        String str1 = "abcdef";
        String str2 = "abcdef";
        String str3 = "abc" + str1.substring(3);

        if(str1 == str2)
        {
            System.out.printf("True");
        }
        else
        {
            System.out.printf("False");
        }
        


    }
}
