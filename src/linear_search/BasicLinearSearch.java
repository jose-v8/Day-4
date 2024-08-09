package linear_search;
import java.util.*;

public class BasicLinearSearch {

    public void findElement()
    {
        Random rand=new Random();
        Scanner inp=new Scanner(System.in);

        int size=rand.nextInt(5,10);
        int[] arr=new int[size];
        System.out.println("The array is ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=rand.nextInt(-500,500);
            System.out.println(arr[i]+ " ");
        }
        System.out.println("Enter the element to search if present in the array");
        int find=inp.nextInt();
        int pos=-1,flag=0;
        for (int item:arr)
        {
            pos+=1;

            if (item==find)
            {
                System.out.println("The element is found at the position of "+pos);
                flag=1;
                break;

            }
        }

        if (flag==0)
        {
            System.out.println("The element not found in the array pos -1");

        }
    }


}
