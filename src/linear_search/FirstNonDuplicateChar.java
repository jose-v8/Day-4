package linear_search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class FirstNonDuplicateChar {

    public   void firstNonDuplicateChar()
    {
        System.out.println("Input a string to find the first Non Duplicate Character :");
        Scanner inp=new Scanner(System.in);

        String input=inp.nextLine();
        HashMap<Character,Integer> harr =new HashMap<Character,Integer>();

        for (char a: input.toCharArray())
        {
            harr.put(a,harr.getOrDefault(a,0)+1);
        }

        for (char a :input.toCharArray())
        {
            if (harr.get(a)==1) {
                System.out.println(a + " is the first non repeating char");
                return;
            }


        }




    }

}
