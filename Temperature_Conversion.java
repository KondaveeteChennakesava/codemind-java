import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        double c,f;
        Scanner sc=new Scanner(System.in);
        c=sc.nextDouble();
        f=32+(c*1.8);
        System.out.printf("%.2f",f);
        sc.close();
    }
}