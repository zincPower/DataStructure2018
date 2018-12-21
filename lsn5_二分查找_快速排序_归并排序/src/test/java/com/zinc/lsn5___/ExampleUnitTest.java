package com.zinc.lsn5___;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {

        int[] array = new int[]{1, 2, 4, 5, 6, 7, 9, 10, 11, 14};
        System.out.println(binarySearch(array, 0, array.length, 14));

    }

    /**
     * 二分查找
     *
     * @param array
     * @param fromIndex
     * @param toIndex
     * @param data
     * @return
     */
    public static int binarySearch(int[] array, int fromIndex, int toIndex, int data) {

        int low = fromIndex;
        // 注意这里，要-1，是符合数学的 左闭右开 的理念
        int high = toIndex - 1;

        while (low <= high) {

            // 取中间的值
            int mid = (low + high) / 2;
            int midValue = array[mid];

            // +1 与 -1 是为了避开中间的mid，避免重复的比较，并且缩小范围，让循环能终止
            if (data < midValue) {
                high = mid - 1;
            } else if (data > midValue) {
                low = mid + 1;
            } else {
                return mid;
            }

        }

        // +1 是为了错开0，避免找到下标为零时与找不到的情况混起
        return -(low + 1);

    }


}