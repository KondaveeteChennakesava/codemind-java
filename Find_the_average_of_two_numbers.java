import java.util.Scanner;
class avg
{
    public static void main(String args[])
    {
        float a,b;
        double avg;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        avg=(a+b)/2;
        System.out.printf("%.4f",avg);
    }
}