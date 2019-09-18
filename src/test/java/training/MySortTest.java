package training;

import com.training.MySort;
import org.junit.Assert;
import org.junit.Test;

public class MySortTest {
    @Test
    public void bubbleSortArrayLengthTen(){
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] actual = MySort.bubbleSort(new int[] {5,9,2,1,3,6,4,7,0,8});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSortArrayLengthOne(){
        int[] expected = {1};
        int[] actual = MySort.bubbleSort(new int[] {1});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void bubbleSortArrayLengthZero(){
        int[] expected = {};
        int[] actual = MySort.bubbleSort(new int[] {});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void bubbleSortArrayNull(){
        int[] nullArray = null;
        int[] actual = MySort.bubbleSort(nullArray);
    }

    @Test
    public void selectionSortArrayLengthTen(){
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] actual = MySort.selectionSort(new int[] {5,9,2,1,3,6,4,7,0,8});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void selectionSortArrayLengthOne(){
        int[] expected = {1};
        int[] actual = MySort.selectionSort(new int[] {1});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void selectionSortArrayLengthZero(){
        int[] expected = {};
        int[] actual = MySort.selectionSort(new int[] {});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void selectionSortArrayNull(){
        int[] nullArray = null;
        int[] actual = MySort.selectionSort(nullArray);
    }

    @Test
    public void insertionSortArrayLengthTen(){
        int[] expected = {0,1,2,3,4,5,6,7,8,9};
        int[] actual = MySort.insertionSort(new int[] {5,9,2,1,3,6,4,7,0,8});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSortArrayLengthOne(){
        int[] expected = {1};
        int[] actual = MySort.insertionSort(new int[] {1});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void insertionSortArrayLengthZero(){
        int[] expected = {};
        int[] actual = MySort.insertionSort(new int[] {});
        Assert.assertArrayEquals(expected,actual);
    }

    @Test(expected = NullPointerException.class)
    public void insertionSortArrayNull(){
        int[] nullArray = null;
        int[] actual = MySort.insertionSort(nullArray);
    }


}
