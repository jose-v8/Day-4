package sorting_algorithms;

import java.util.Random;
import java.util.Scanner;

public class ArraysForSorting {
//    Scanner inp=new Scanner(System.in);
//    Random rand =new Random();

    public static int[] createArray()
    {
        Scanner inp=new Scanner(System.in);
        Random rand =new Random();
        int siz=rand.nextInt(10,15);

         int[] arr=new int[siz];

        for(int i =0;i<siz;i++)
        {
//            System.out.println("Enter the element "+(i+1)+"). for the array");arr[i]=inp.nextInt();
            arr[i]=rand.nextInt(1,100);

        }
        System.out.println("The created array is ");
        for(int item : arr)
        {
            System.out.print(item+" ");
        }
        return arr;
    }


    public static void  bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                    if(arr[j]<arr[i])
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
        }
        System.out.println("\n\nThe array after the bubble sort is ");
        for (int item:arr)
        {

            System.out.print(item+" ");
        }

    }

    public static void selectionSort(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {

            int check=Integer.MAX_VALUE,pos=i;
            for (int j=i;j<arr.length;j++)
            {
                if(arr[j]<check)
                {
                    check=arr[j];
                    pos=j;
                }

            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }

        System.out.println("\nThe elements of the array after sorting is :");
        for (int item:arr)
        {
            System.out.print(item+" ");
        }
//        System.out.print();
    }

    public static void insertionSort(int[] arr)
    {
//        Scanner inp=new Scanner(System.in);
//        System.out.print("\nEnter the number you want to search: ");

        for (int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key )
            {
                arr[j+1]=arr[j];
                j-=1;
            }
            arr[j+1]=key;

        }

        System.out.print("\nThe array after the sorting is \n");
        for (int item:arr)
        {
            System.out.print(item+" ");
        }

    }

    static int[] merge(int[] arr,int l,int m,int h)
    {
        int s1=m-l+1;
        int s2=h-m;

        int[] la=new int[s1];
        int[] ra=new int[s2];

        for (int i=0;i<s1;i++)
        {
            la[i]=arr[l+i];
        }
        for (int j=0;j<s2;j++)
        {
            ra[j]=arr[m+1+j];
        }

        int i=0,j=0,k=l;


        while (i<s1 && j<s2)
        {
            while (i<s1 && j<s2)
            {
                if (la[i]<ra[j])
                {
                    arr[k]=la[i];
                    i++;
                }
                else
                {
                    arr[k]=ra[j];
                    j++;
                }
                k++;
            }
        }
        return arr;


    }
    static int[] sort(int[] arr, int l, int h)
    {
        if(l<h)
        {
            int m=l+(h-l)/2;
            sort(arr,l,m);
            sort(arr,m+1,h);

            merge(arr,l,m,h);
        }
        return arr;
    }

    public static void mergeSort(int[] arr)
    {
        System.out.println("Array after sorting is ");
        for(int item:sort(arr,0,arr.length-1))
            System.out.print(item+" ");


    }
}
