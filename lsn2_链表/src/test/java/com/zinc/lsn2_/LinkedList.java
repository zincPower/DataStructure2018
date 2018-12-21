package com.zinc.lsn2_;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/12/10
 * @description
 */
public class LinkedList<E> {

    private static class Node<E> {

        // 节点数据
        E item;
        // 前驱节点
        Node<E> pre;
        // 后继节点
        Node<E> next;

        Node(Node<E> pre, E item, Node<E> next) {
            this.pre = pre;
            this.item = item;
            this.next = next;
        }

    }

    public LinkedList() {
    }

    // 第一个节点
    private Node<E> first;
    // 最后一个节点
    private Node<E> last;
    // 链表长度
    private int size = 0;

    public int getSize() {
        return size;
    }

    // 增

    /**
     * 链表结尾添加元素
     * 考虑情况：1、空链表
     * 2、非空链表
     *
     * @param e 需要添加的元素
     */
    public void add(E e) {
        // 前驱是最后一个节点
        Node<E> newNode = new Node<>(last, e, null);
        // 保存原来最后一个节点
        Node<E> l = last;
        // 将last置为新节点
        last = newNode;

        if (l == null) { //原来的last为空，说明链表为空，则first也为空
            first = newNode;
        } else {
            l.next = newNode;
        }

        // 数量加一
        ++size;
    }


    /**
     * 在指定的下标index 添加元素 e
     * 考虑的情况：
     * 1、添加的下标越界
     * 2、添加在最后一个数据
     * 3、添加在第一个数据
     * 4、添加在中间
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        // index 越界，中断
        if (index < 0 || index > size) {
            throw new RuntimeException("Index Out Of Range.");
        }

        // 最后一个数据
        if (index == size) {
            add(e);
            return;
        }

        Node<E> target = node(index);
        Node<E> newNode = new Node<>(target.pre, e, target);

        if (target.pre == null) {     // target 第一个节点
            first = newNode;
            target.pre = newNode;
        } else {
            target.pre.next = newNode;
            target.pre = newNode;
        }

        ++size;

    }

    // 删

    /**
     * 删除指定下标
     *
     * @param index
     */
    public void remove(int index) {

        if (index < 0 || index > size - 1) {
            return;
        }

        // 需要删除的节点
        Node<E> target = node(index);

        unlinkNode(target);

    }

    /**
     * 删除指定的节点
     * 考虑情况：
     * 1、有前驱节点
     * 2、有后续节点
     * tips：这样考虑的好处是，将问题拆解成两个，否则中共要写四个情况
     * 即：
     * 1、首节点
     * 2、尾节点
     * 3、剩下最后一个姐弟哪
     * 4、中间节点
     *
     * @param node
     */
    private void unlinkNode(Node<E> node) {

        Node<E> pre = node.pre;
        Node<E> next = node.next;

        // 判断是否有前驱节点
        if (pre == null) {   //没有前驱节点
            first = next;
        } else {            //有前驱节点
            pre.next = next;
        }

        // 判断有没后继节点
        if (next == null) {   //没有后继节点
            last = pre;
        } else {              //有后继节点
            next.pre = pre;
        }

        size--;

    }

    // 查

    /**
     * 获取 index 下标的数据
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index > size - 1) {
            return null;
        }
        return node(index).item;
    }

    /**
     * 获取 index 下标的节点
     * 考虑情况：
     * 1、index 大于 size/2，则从后往前找，从last开始
     * 2、index 小于 size/2，则从前往后找，从first开始
     *
     * @param index
     * @return
     */
    private Node<E> node(int index) {
        Node<E> node;
        // 如果 index 大于 size 一半，则从后面开始找
        if (index > (size >> 1)) {
            node = last;
            for (int i = size - 1; i > index; --i) {
                node = node.pre;
            }
        } else {
            node = first;
            for (int i = 0; i < index; ++i) {
                node = node.next;
            }
        }

        return node;
    }
}
