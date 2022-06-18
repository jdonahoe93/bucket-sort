package net.jedonahoe;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for Bucket Sort
 */
public class BucketSortTest 
{

    @Test
    public void testBucketSort()
    {
        float[] array = { (float) 0.42, (float) 0.32, (float) 0.33, (float) 0.52, (float) 0.37, (float) 0.47, (float) 0.51 };
        float[] expected = { (float) 0.32, (float) 0.33, (float) 0.37, (float) 0.42, (float) 0.47, (float) 0.51, (float) 0.52 };
        BucketSort.bucketSort(array);
        assertArrayEquals(array, expected, (float) 0.001);
    }

    @Test
    public void testBucketSortNegative()
    {
        float[] array = { (float) -0.31, (float) 0.18, (float) -0.55, (float) 0.81, (float) 0.44, (float) 0.07, (float) 0.91 };
        float[] expected = { (float) -0.55, (float) -0.31, (float) 0.07, (float) 0.18, (float) 0.44, (float) 0.81, (float) 0.91 };
        BucketSort.bucketSort(array);
        assertArrayEquals(array, expected, (float) 0.001);
    }

    @Test
    public void testBUcketSortEmpty() {
        float[] array = {};
        float[] expected = {};
        BucketSort.bucketSort(array);
        assertArrayEquals(array, expected, (float) 0.001);

    }
}
