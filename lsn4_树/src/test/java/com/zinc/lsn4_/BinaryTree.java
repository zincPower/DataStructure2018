package com.zinc.lsn4_;

public class BinaryTree {
    final Node<String> root;

    public BinaryTree(String data) {
        root = new Node<>(data, null, null);
    }

    public void createTree() {
        Node<String> nodeB = new Node<String>("B", null, null);
        Node<String> nodeC = new Node<String>("C", null, null);
        Node<String> nodeD = new Node<String>("D", null, null);
        Node<String> nodeE = new Node<String>("E", null, null);
        Node<String> nodeF = new Node<String>("F", null, null);
        Node<String> nodeG = new Node<String>("G", null, null);
        Node<String> nodeH = new Node<String>("H", null, null);
        Node<String> nodeJ = new Node<String>("J", null, null);
        Node<String> nodeI = new Node<String>("I", null, null);
        root.leftChild = nodeB;
        root.rightChild = nodeC;
        nodeB.leftChild = nodeD;
        nodeC.leftChild = nodeE;
        nodeC.rightChild = nodeF;
        nodeD.leftChild = nodeG;
        nodeD.rightChild = nodeH;
        nodeE.rightChild = nodeJ;
        nodeH.leftChild = nodeI;

    }

    /**
     * 节点
     */
    public class Node<T> {
        T data;
        Node<T> leftChild;
        Node<T> rightChild;

        public Node(T data, Node<T> leftChild, Node<T> rightChild) {
            this.data = data;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    //========================================  遍历树  ============================================

    /**
     * DLR 先处理节点数据，再访问左，再右
     *
     * @param node
     */
    public void preOrderTraverse(Node node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + "  ");
        preOrderTraverse(node.leftChild);
        preOrderTraverse(node.rightChild);

    }

    /**
     * LDR 先访问左节点，再访问数据节点，再访问右节点
     *
     * @param node
     */
    public void midOrderTraverse(Node node) {
        if (node == null) {
            return;
        }

        midOrderTraverse(node.leftChild);
        System.out.print(node.data + "  ");
        midOrderTraverse(node.rightChild);

    }

    /**
     * LRD 先访问左节点，再访问右节点，再访问数据节点
     *
     * @param node
     */
    public void postOrderTraverse(Node node) {
        if (node == null) {
            return;
        }

        postOrderTraverse(node.leftChild);
        postOrderTraverse(node.rightChild);
        System.out.print(node.data + "  ");

    }

    //==============================================================================================

}