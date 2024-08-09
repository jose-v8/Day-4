package linear_search;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AllOccurencesInList {
    Scanner inp=new Scanner(System.in);
    List<Integer> occurance;
    int[] arr;
    public void findAllPosOfOccurence()
    {
        System.out.print("Enter the length of the array");
        int size=inp.nextInt();
        arr=new int[size];
        occurance=new ArrayList<>();
        int i=0;
        for(int item : arr)
        {
            i=i+1;
            System.out.print("\nEnter the element in position "+i+" : ");
            arr[i-1]=inp.nextInt();

        }

//        System.out.print("The array is \n");
//        for(int item : arr)
//        {
//
//            System.out.print(item+" ");
//
//
//        }

        System.out.print("\nEnter the number you want to check the occurence of ");
        int check=inp.nextInt();
        i=-1;

        for (int item:arr)
        {
//
            i+=1;
            if (item==check)

            {
                System.out.println("match found "+ item +"at position "+i);

                occurance.add(i,1);
            }
            else {
                occurance.add(i,0);
            }
        }


        System.out.print(occurance);


    }
}
