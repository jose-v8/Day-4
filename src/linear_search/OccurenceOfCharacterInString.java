package linear_search;

import java.awt.*;
import java.util.Scanner;

public class OccurenceOfCharacterInString {
    Scanner inp=new Scanner(System.in);
    String input;
    public OccurenceOfCharacterInString()
    {
        System.out.print("Enter the String : ");
        input=inp.nextLine();

    }



    public int findPosOfFirstOccurence()
    {
        System.out.print("Enter the char to check :");
        String check=inp.next();
        char a=check.toCharArray()[0];
        int i=-1;
        if (input==null)
        {
            return -1;
        }
        for(char item:input.toCharArray())
        {
            i+=1;
            if (item==a)
            {
                return i;

            }
        }

        return -1;
    }


    public int OccurrenceOfCharInString()
    {
        System.out.print("Enter the char to check its number of occurence ");
        String x=inp.next();
        char check=x.toCharArray()[0];
        int occurence=0;
        for (char item:input.toCharArray())
        {

            if(item==check)
            {
                occurence+=1;
            }
        }

        return occurence;
    }
}
