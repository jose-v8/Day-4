import java.util.*;

import binarysearch.BinarySearchInSortedArray;
import linear_search.*;
import binarysearch.*;
import sorting_algorithms.*;
import array_list.*;

public class SearchSortArrayList
{
    public static void main(String[] args)
    {
        System.out.println("select the option to execute the program");
        System.out.println("Linear search");
        System.out.println("1). Linear search to find int from array");
        System.out.println("2). Linear search to find string from array");
        System.out.println("3). Find the First Occurrence of a Number");
        System.out.println("4). Find number of occurence of a char in string");
        System.out.println("5). Find maximum number in an array");
        System.out.println("6). Find All Occurrences in a List");
        System.out.println("7). Find the First Non-duplicate Character in a String");

        System.out.println("binary");
        System.out.println("8). Basic Binary Search in Sorted Array");
        System.out.println("9). Find the Position of a Target Element:");
        System.out.println("10).Find the First and Last Occurrence of a Target Element");
        System.out.println("11).Find the Smallest and Largest Element Greater than or Equal to the Target");
        System.out.println("12).Check If a Target Element Exists in a Rotated Sorted Array");
        System.out.println("13).");
        System.out.println("14).");
        System.out.println("15).Bubble sort");
        System.out.println("16).Selection sort");
        System.out.println("17).Insertion sort");
        System.out.println("18).Merge sort");
        System.out.println("19).");
        System.out.println("20).");
        System.out.println("21).");


        System.out.println("22).");
        System.out.println("23).Find the Duplicate Elements:");
        System.out.println("24).Remove Duplicates:");
        System.out.println("25).Rotate arrayList");





        Scanner inp =new Scanner(System.in);

        System.out.print("Enter the option : ");
        int action =inp.nextInt();

        switch (action)
        {
            case 1,3->{BasicLinearSearch p=new BasicLinearSearch();p.findElement();}
            case 2->{SearchStringInArray p=new SearchStringInArray();System.out.print("The position is found at " +p.searchStringArray());}
            case 4->{OccurenceOfCharacterInString p=new OccurenceOfCharacterInString();System.out.print("The char is repeated for "+p.OccurrenceOfCharInString()+" times");}
            case 5->{FindMaxInArray p=new FindMaxInArray();p.MaxIntInArray();}
            case 6->{AllOccurencesInList p=new AllOccurencesInList();p.findAllPosOfOccurence();}
            case 7->{FirstNonDuplicateChar p=new FirstNonDuplicateChar();p.firstNonDuplicateChar();}
            case 8,9->{BinarySearchInSortedArray.binarySearch();}
            case 10->{BinarySearchInSortedArray.firstAndLastOccuranceOfElement();}
            case 11->{BinarySearchInSortedArray.smallestAndLargesttElementGreaterOrEqualToTarget();}
            case 12->{BinarySearchInSortedArray.targetElementInRotatedArray();}
            case 15->{ArraysForSorting.bubbleSort(ArraysForSorting.createArray());}
            case 16->{ArraysForSorting.selectionSort(ArraysForSorting.createArray());}
            case 17->{ArraysForSorting.insertionSort(ArraysForSorting.createArray());}
            case 18->{ArraysForSorting.mergeSort(ArraysForSorting.createArray());}
            case 23->{ArrayListProblems.findDuplicate();}
            case 24->{ArrayListProblems.removeDuplicate();}
            case 25->{ArrayListProblems.rotateArrayList();}
//            case 24->{ArrayListPr}
//            LinkedList


        }


    }
}
