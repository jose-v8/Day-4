package binarysearch;

import java.util.Scanner;

public  class BinarySearchInSortedArray {

    static int findElement(int[] arr,int target)
    {
        int low=0,high=(arr.length)-1;

        while(low<=high)
        {
            int mid =low +(high-low)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            if (arr[mid]<target)
            {
                low=mid+1;
            }
            if (arr[mid]>target)
            {
                high=mid-1;
            }

        }

        return -1;
    }

    public static void binarySearch()
    {
        System.out.print("Enter the number of elements present in the array : ");
        Scanner inp=new Scanner(System.in);

        int[] arr={2,3,5,8,12,15,17};

        for (int item:arr)
        {
            System.out.print(item+" ");
        }
        System.out.print("Enter the element to be searched : ");
        int target=inp.nextInt();
        System.out.println("\nThe element searching is found at "+ findElement(arr,target));


    }

    public static void firstAndLastOccuranceOfElement()
    {
//        System.out.print("Enter the number of elements present in the array : ");
        Scanner inp=new Scanner(System.in);

        int[] arr={2,4,5,7,12,12,12,12};

        for (int item:arr)
        {
            System.out.print(item+" ");
        }
        System.out.print("\nEnter the element to search for its first and last occurance of element  : ");
        int target=inp.nextInt();

        int index=findElement(arr,target);

        int minindex=index,maxindex=index;

        while(minindex>0&&maxindex<arr.length-1&&(arr[index]==arr[maxindex+1]||arr[index]==arr[minindex-1]))
        {

            if (arr[index]==arr[maxindex+1])
                ++maxindex;


            if (arr[index]==arr[minindex-1])
                --minindex;

        }

        System.out.println("the min index is "+minindex+" the max index is "+maxindex);


    }

    public static void smallestAndLargesttElementGreaterOrEqualToTarget()
    {

        Scanner inp=new Scanner(System.in);
        int []arr={1,2,2,3,5,8,9,9,10,21,34};

        System.out.print("The array is : ");

        for (int item:arr) {
            System.out.print( item+" ");

        }

        System.out.print("\nselect the number to Find the Smallest and Largest Element Greater than or Equal to the Target: ");
        int target=inp.nextInt();


        int index=findElement(arr,target);

        int minindex=index,maxindex=index;

        while(minindex>0&&maxindex<arr.length-1&&(arr[index]==arr[maxindex+1]||arr[index]==arr[minindex-1]))
        {

            if (arr[index]==arr[maxindex+1])
                ++maxindex;


            if (arr[index]==arr[minindex-1])
                --minindex;

        }
        maxindex=maxindex< arr.length-1?maxindex+1:maxindex;
        minindex=minindex>0?minindex-1:minindex;

        System.out.println("The smallest element that is greater than or equal to the target is "+arr[maxindex]);
        System.out.println("The largerst element that is smaller than or equal to the target is "+arr[minindex]);

    }


   static int search(int[] arr,int target)
    {
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if (arr[mid]==target)
                return mid;
            if (arr[mid]>=arr[low])
            {
//                    present in the left part

                if (target<arr[mid])
                {
                    high=mid-1;
                }
                else
                    low =mid+1;


            }
            else
            {
                if (target>arr[mid] && target<arr[high] )
                {
                    low=mid+1;
                }
                else {
                    high=mid-1;
                }
            }

        }
        return -1;
    }

    public static void targetElementInRotatedArray()
    {


        System.out.print("The array is :");
        int[] arr={6,7,8,9,1,2,3,4,5};

        for (int item:arr)
        {
            System.out.print(item+" ");
        }

        Scanner inp= new Scanner(System.in);
        System.out.print("Enter the number to check : ");
        int target=inp.nextInt();
        int pos=search(arr,target);
        System.out.println("\nThe position of the element found is "+pos);



    }


}
