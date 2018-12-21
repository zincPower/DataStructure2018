package com.zinc.lsn1_;

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
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSort() {
//        int[] array = new int[]{3, 2, 5, 8, 1, 9, 4, 6, 7};
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
//        bubbleSort(array);
        selectSort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    /**
     * 冒泡排序
     *
     * @param array
     */
    public void bubbleSort(int[] array) {

        for (int j = array.length - 1; j > 0; j--) {

            boolean flag = true;

            for (int i = 0; i < j; ++i) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }

            System.out.print("第" + (array.length - j) + "次： ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println("\n");

            if (flag) {
                break;
            }

        }

    }

    /**
     * 选择排序
     *
     * @param array
     */
    public void selectSort(int[] array) {

        for (int j = 0; j < array.length - 1; ++j) {
            int index = j;

            for (int i = index + 1; i < array.length; i++) {
                if (array[index] > array[i]) {
                    index = i;
                }
            }

            if (index != j) {
                int temp = array[index];
                array[index] = array[j];
                array[j] = temp;
            }

            System.out.print("第" + (j + 1) + "次： ");
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }

    }

    public void te(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            //{1,2,5,8,3,9,4,6,7};
            if (index != i) {//如果已经是最小的，就不需要交换
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }

            System.out.print("第" + (i + 1) + "次： ");
            for (int ss : array) {
                System.out.print(ss + " ");
            }
            System.out.println("\n");
        }

    }

}