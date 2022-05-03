import java.util.Scanner;
class Colour
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'A':
            case 'a':
            case 'I':
            case 'i':
            case 'E':
            case 'e':
            case 'U':
            case 'u':
            case 'O':
            case 'o':
                System.out.println("Vowel");
                break;
           
            default:
                System.out.println("Consonant");
                break;
        }
    }
}