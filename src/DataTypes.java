public class DataTypes {
    public static void main()
    {
        // 1.Numeric DT- short, byte, int, long
        byte num1 = 126;
        System.out.println(num1);

        /*
        byte num2 = 500; // this give error because byte have range is (-128 to 127)
        System.out.println(num1);
        */

        short num2 = 500;
        System.out.println(num2);

        /*
        short num3 = 50000; // This give error because num2 has range -32768 to 32767
        System.out.println(num3);
        */

        int num3 = 43000;
        long num4 = 34000;
        System.out.println(num3);
        System.out.println(num4);


        //2. Floating DT - float, double
        float num5 = 3.141315f;
        System.out.println(num5);

        double num6 = 3.454647484912343456;
        System.out.println(num6);

        //Other - char, boolean
        boolean toVote = true;
        System.out.println(toVote);

        char fitstCharacter = 'a';
        System.out.println("My first character is : " + (fitstCharacter+2));

        //Implicit conversion (small data type stored in big datatype)
        long newNum  = num1;
        System.out.println(newNum);

        //Explicit conversion(big datatype store in the small datatype)
        long value1 = 123456789;
        int value2 = (int)value1;
        System.out.println(value2);

        /* This give error because number is out of range of the int
        long value1 = 12345678999;
        int value2 = (int)value1;
        System.out.println(value2);
        */

    }
}
