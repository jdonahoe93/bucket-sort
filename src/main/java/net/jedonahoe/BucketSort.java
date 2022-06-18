package net.jedonahoe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Bucket Sort!
 *
 */
public class BucketSort 
{
    public static void main( String[] args )
    {
        float[] array = new float[7];
        Random rand = new Random();
        for (int i = 0; i < 7; i++)
            array[i] = rand.nextFloat();

        System.out.println("Unsorted Array:");
        for (float i : array) 
           System.out.print(String.format("%.2f", i) + " ");
        System.out.println("");

        BucketSort.bucketSort(array);

        System.out.println("Sorted Array");
        for (float i : array) 
            System.out.print(String.format("%.2f", i) + " ");
        System.out.println("");
    }

    public static void bucketSort(float[] arr) {
        if (arr.length <= 0)
          return;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] bucket = new ArrayList[arr.length];
    
        // Create empty buckets
        for (int i = 0; i < arr.length; i++)
          bucket[i] = new ArrayList<Float>();
    
        // Add elements into the buckets
        for (int i = 0; i < arr.length; i++) {
          int bucketIndex = (int) arr[i] * arr.length;
          bucket[bucketIndex].add(arr[i]);
        }
    
        // Sort the elements of each bucket
        for (int i = 0; i < arr.length; i++) {
          Collections.sort((bucket[i]));
        }
    
        // Get the sorted array
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0, size = bucket[i].size(); j < size; j++) {
            arr[index++] = bucket[i].get(j);
          }
        }
      }
}
