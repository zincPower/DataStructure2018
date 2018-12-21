package com.zinc.lsn2_;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        LinkedList<Mahjong> list = new LinkedList<Mahjong>();
        list.add(new Mahjong(3, 1));
        list.add(new Mahjong(2, 3));
        list.add(new Mahjong(3, 7));
        list.add(new Mahjong(1, 1));
        list.add(new Mahjong(3, 8));
        list.add(new Mahjong(2, 2));
        list.add(new Mahjong(3, 2));
        list.add(new Mahjong(1, 3));
        list.add(new Mahjong(3, 9));
        System.out.println(list);
        radixSort(list);
        System.out.println(list);
    }

    public void radixSort(LinkedList<Mahjong> list) {
        // 按照点数进行装载
        LinkedList<Mahjong>[] rankList = new LinkedList[9];
        for (int i = 0; i < rankList.length; ++i) {
            rankList[i] = new LinkedList<>();
        }

        // 这里便是图中的第一步
        while (list.size() > 0) {
            Mahjong item = list.remove();
            // 按照点数，装进对应的下标中
            rankList[item.rank - 1].add(item);
        }

        // 将 第一步的数据 进行整理成一个列表
        for (LinkedList<Mahjong> item : rankList) {
            list.addAll(item);
        }

        // 按照花色进行装载
        LinkedList<Mahjong>[] suitList = new LinkedList[3];
        for (int i = 0; i < suitList.length; ++i) {
            suitList[i] = new LinkedList<>();
        }

        // 这里便是图中的第二步
        while (list.size() > 0) {
            Mahjong item = list.remove();
            // 按照花色，装进对应的下标中
            suitList[item.suit - 1].add(item);
        }

        // 将 第二步的数据 进行整理成一个列表
        for (LinkedList<Mahjong> item : suitList) {
            list.addAll(item);
        }
    }

}