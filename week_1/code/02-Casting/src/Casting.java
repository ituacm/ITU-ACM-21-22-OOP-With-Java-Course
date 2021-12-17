public class Casting
{
    public static void main(String[] args)
    {
        // Widening Casting

        // Widening casting is done automatically by Java
        byte myByte = 1;
        int myInt = myByte;
        long myLong = myInt;

        System.out.println(myInt);
        System.out.println(myLong);

        // Narrowing Casting

        int myInt2 = 127;
        int myInt3 = 2147483647; // Decimal to binomial -> 0111 1111 1111 1111 1111 1111 1111 1111

        // It will give a compile time error incompatible types
        // byte myByte2 = myInt2;

        // Correct way
        byte myByte2 = (byte) myInt2;
        byte myByte3 = (byte) myInt3; // Conversion out of range

        System.out.println(myByte2);
        System.out.println(myByte3);

    }
}
