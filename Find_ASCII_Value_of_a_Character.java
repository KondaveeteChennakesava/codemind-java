import java.util.Scanner;
class ASCII
{
    public static void main(String args[])
    {
        char a;
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        int asciiValue =a;
        System.out.println(+asciiValue);
        sc.close();
    }
}