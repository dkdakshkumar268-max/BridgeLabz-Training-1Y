package com.gla.wrapperclasses;

public class InputConversionUtility
{
    public static int safeParseInt(String input)
    {
        try
        {
            return Integer.parseInt(input);
        } catch (NumberFormatException e)
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        String[] testInputs = {"123", "abc", "45.6", "0"};
        for (int i = 0; i < testInputs.length; i++)
        {
            int result = safeParseInt(testInputs[i]);
            System.out.println("Input: " + testInputs[i] + " -> Output: " + result);
        }
    }
}
