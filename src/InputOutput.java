import java.math.BigInteger;
import java.util.Scanner;

public class InputOutput {
    public static void main()
    {
//        int a =5;
//        int b = 20;
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the first number : ");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value for the second number : ");
        int secondNum = sc.nextInt();
        int ans  = firstNum + secondNum;
        System.out.println("Answer is : " + ans);
        System.out.println("Enter the biginteger value");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("Biginteger:" +bg);

        System.out.println("Enter the flag value");
        boolean flag = sc.nextBoolean();
        System.out.println("Answer is : " + flag);
        System.out.println("Enter the short value");
        short shortVal = sc.nextShort();
        System.out.println("Answer is : " + shortVal);
        System.out.println("Enter the float value");
        float floatVal = sc.nextFloat();
        System.out.println("Answer is : " + floatVal);
    }
}
