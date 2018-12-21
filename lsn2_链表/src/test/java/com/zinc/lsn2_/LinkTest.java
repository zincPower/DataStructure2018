package com.zinc.lsn2_;

import org.junit.Test;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/12/11
 * @description
 */
public class LinkTest {

    @Test
    public void test() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(6);
        linkedList.add(10);

        System.out.println("原始数据");
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("插入数据数据（下标0=>1）");
        linkedList.add(0, 1);
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("插入数据数据（下标2=>5）");
        linkedList.add(2, 5);
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("插入数据数据（下标 size=>15）");
        linkedList.add(linkedList.getSize(), 15);
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("验证 (index < 0 || index > size - 1) 条件是否要 -1");
        System.out.print(linkedList.getSize() + ":" + linkedList.get(linkedList.getSize()));

        System.out.println();
        System.out.println("删除（下标 3）");
        linkedList.remove(3);
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("删除（下标 0）");
        linkedList.remove(0);
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("删除（下标 size）");
        linkedList.remove(linkedList.getSize() - 1);
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.print(i + ":" + linkedList.get(i) + "    ");
        }

        System.out.println();
        System.out.println("获取（下标 1）");
        System.out.println("1:" + linkedList.get(1));

    }

}
