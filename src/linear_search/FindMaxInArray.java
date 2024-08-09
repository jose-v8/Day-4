package linear_search;
import java.util.Random;
import java.util.Scanner;
public class FindMaxInArray {
    Random rand=new Random();
    int[] arr;
    public FindMaxInArray()
    {

        int size=rand.nextInt(1,15);
        arr= new int[size];
        System.out.println("The array is ");
        for (int i=0; i<size;i++)
        {
            arr[i]= rand.nextInt(1,100);
            System.out.print(arr[i]+" ");
        }

    }

    public void MaxIntInArray()
    {
        int compare=Integer.MIN_VALUE;

        for(int item: arr)
        {
            if (item>=compare)
            {
                compare=item;
            }
        }

        System.out.println("\nThe maximum value present in the array is "+compare);

    }

}
