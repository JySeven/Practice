package com.example.practice.Node;

/**
 * 遍历二叉树
 */
public class NodeTest {
    public static void main(String[] args) {
        Node node1=new Node("a",null,null);
        Node node2=new Node("b",null,null);
        Node node3=new Node("c",node1,null);
        Node node=new Node("d",node3,node2);
        NodeTest nodeTest=new NodeTest();
       // nodeTest.preSearch(node);
        nodeTest.midSearch(node);
        //nodeTest.afterSearch(node);
    }

    /**
     * 先序遍历二叉树
     * @param root
     */
    void preSearch(Node root){
        if (root!=null){
            System.out.printf("%-4s",root.data);
            preSearch(root.left);
            preSearch(root.right);
        }
    }

    /**
     * 中序遍历
     * @param root
     */
    void midSearch(Node root){
        if (root!=null){
            midSearch(root.left);
            System.out.printf("%-4s",root.data);
            midSearch(root.right);
        }
    }

    void afterSearch(Node root){
        if (root!=null){
            afterSearch(root.left);
            afterSearch(root.right);
            System.out.printf("%-4s",root.data);
        }
    }

    static class Node{
        Object data;
        Node left=null;
        Node right=null;

        public Node(Object data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
