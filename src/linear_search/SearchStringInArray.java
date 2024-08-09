package linear_search;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class SearchStringInArray {
    public int searchStringArray()
    {
        Scanner inp=new Scanner(System.in);
        String[] arr= {"hai","how","virat","India","iphone","music"};

        System.out.println("The array is ");

        for (String item:arr)
        {
            System.out.print(item+" ");
        }

        System.out.print("\nEnter the string to check if present in the array");
        String check=inp.nextLine();
        int pos=-1;
        for (String item:arr)
        {
            pos+=1;
            if(item.equals(check))
            {
                return pos;
            }

        }

        return -1;


    }



}
