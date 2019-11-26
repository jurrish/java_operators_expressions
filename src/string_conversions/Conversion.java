package string_conversions;

import java.util.Scanner;

public class Conversion
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();

        //convert to an int
        int intInput = Integer.parseInt(stringInput);
        System.out.println("Int -> " + intInput);

        //convert back to string
        String stringInputAgain = String.valueOf(intInput);
        System.out.println("String -> " + stringInputAgain);
    }
}
