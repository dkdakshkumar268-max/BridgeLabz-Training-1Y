package com.gla.wrapperclasses;
import java.util.ArrayList;
public class StudentMarksReport
{
    public static void main(String[] args)
    {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc", 76};
        ArrayList<Integer> validMarks = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++)
        {
            try
            {
                if (inputs[i] instanceof Integer)
                {
                    validMarks.add((Integer) inputs[i]);
                }
                else if (inputs[i] instanceof String)
                {
                    String value = (String) inputs[i];
                    if (value.equalsIgnoreCase("null"))
                    {
                        continue;
                    }
                    int num = Integer.parseInt(value);
                    validMarks.add(num);
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input skipped: " + inputs[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < validMarks.size(); i++)
        {
            sum += validMarks.get(i);
        }
        double average = 0.0;
        if (validMarks.size()>0)
        {
            average = (double) sum / validMarks.size();
        }
        System.out.println("Valid Marks: " + validMarks);
        System.out.println("Average Marks: " + average);
    }
}