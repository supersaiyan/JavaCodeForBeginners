import java.util.Scanner;
public class ScannerDemo {

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int a;
        float b;
        double d;
        String l;
        
        System.out.println("Enter an int");
        a=obj.nextInt();
        System.out.println("Enet a float");
        b=obj.nextFloat();
        System.out.println("Enter a double");
        d=obj.nextDouble();
        System.out.println("Enter a String");
        l=obj.nextLine();
        System.out.println(a+b+d+l);
        
    }
}
