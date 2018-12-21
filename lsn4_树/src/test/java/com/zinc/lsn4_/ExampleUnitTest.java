package com.zinc.lsn4_;

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
        BinaryTree binaryTree = new BinaryTree("A");
        binaryTree.createTree();
        System.out.print("前序遍历：");
        binaryTree.preOrderTraverse(binaryTree.root);
        System.out.println();

        System.out.print("中序遍历：");
        binaryTree.midOrderTraverse(binaryTree.root);
        System.out.println();

        System.out.print("后序遍历：");
        binaryTree.postOrderTraverse(binaryTree.root);
    }
}