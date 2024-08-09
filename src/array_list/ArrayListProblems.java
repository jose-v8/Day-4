package array_list;

//import java.util.Random;
import java.util.*;

public  class ArrayListProblems {

    public  ArrayList<Integer> createArrayList()
    {
        Random rand= new Random();
        int size=rand.nextInt(10,15);

        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        for(int i=0;i<size;i++)
        {
            arr.add(rand.nextInt(1,99));
        }
        return  arr;
    }

    public static void findDuplicate()
    {
        Random rand=new Random();
        int size=rand.nextInt(10,15);
        ArrayList<Integer> arr=new ArrayList<Integer>(size);
        System.out.println("The array is ");
        for (int i=0;i<size;i++)
        {
            arr.add(rand.nextInt(10,15));
            System.out.print(arr.get(i)+" ");
        }
        HashMap<Integer,Integer> harr=new HashMap<Integer,Integer>();
        for (int i=0;i<size;i++)
        {
            harr.put(arr.get(i),harr.getOrDefault(arr.get(i),0)+1);

        }
//        harr.e
        for(Map.Entry item: harr.entrySet())
        {
            if (item.getValue().equals(1))
            {
                continue;
            }
            else
                System.out.println("The value "+item.getKey()+" is found to be duplicated "+item.getValue()+" times");
        }


    }

    public static void removeDuplicate()
    {
        Random rand=new Random();
        int size=rand.nextInt(10,15);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        ArrayList<Integer> narr=new ArrayList<Integer>();
        System.out.println("The array is ");
        for (int i=0;i<size;i++)
        {
            arr.add(rand.nextInt(40,55));
            System.out.print(arr.get(i)+" ");
        }
        HashMap<Integer,Integer> harr=new HashMap<Integer,Integer>();
        for (int i=0;i<size;i++)
        {
            harr.put(arr.get(i),harr.getOrDefault(arr.get(i),0)+1);

        }

//        for(Map.Entry<Integer,Integer> item: harr.entrySet())
//        {
//            System.out.println(item.getKey()+" "+item.getValue());
//        }

        for(Map.Entry<Integer,Integer> item: harr.entrySet())
        {
            if (item.getValue().equals(1))
            {

//                System.out.println(item.getKey()+" "+item.getValue());
                narr.add(item.getKey());
                continue;
            }

        }


//        for (int item:arr)
//        {
//            if (harr.containsKey(item))
//                continue;
//            else
//                arr.remove(item);
//        }

        System.out.println("\nThe array list with the duplicates removed are ");

        for(int item:narr)
        {
            System.out.print(item+" ");

        }



    }

    public static void rotateArrayList()
    {
        ArrayListProblems p=new ArrayListProblems();
        ArrayList<Integer> arr=p.createArrayList();
        System.out.println("The created arraylist is ");
        for (int item:arr)
            System.out.print(item+" ");
        System.out.println("\nEnter the number of times the array to be rotated :");
        Scanner inp=new Scanner(System.in);
        int rot=inp.nextInt();
        int actualRot=rot%arr.size();

        ArrayList<Integer> arr1= new ArrayList<Integer>(actualRot);

        int start=arr.size()-actualRot;

        for (int i=start;i<arr.size();i++)
        {
            arr1.add(arr.get(i));
        }
        for(int i=0;i<start;i++)
            arr1.add(arr.get(i));

        System.out.println("\nThe array after "+rot+" times rotation is ");


        for(int item:arr1)
            System.out.print(item+" ");
    }
}
