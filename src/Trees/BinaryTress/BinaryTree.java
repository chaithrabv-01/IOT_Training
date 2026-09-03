package Trees.BinaryTress;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BinaryTree {
    static Node createNode(int val){
        Node n=new Node(val);
        return n;
    }

    static void PreDFS(Node root){
        if(root==null){    //base case
            return;
        }
        System.out.print(root.data +" " );
        PreDFS(root.left);   //Recursion
        PreDFS(root.right);

    }

    static void InDFS(Node root){
        if(root==null){
            return;
        }
        PreDFS(root.left);
        System.out.print(root.data +" " );
        PreDFS(root.right);
    }

    static void PostDFS(Node root){
        if(root==null){
            return;
        }
        PreDFS(root.left);
        PreDFS(root.right);
        System.out.print(root.data +" " );
    }

    static void BFS(Node root){
        Queue<Node> q=new LinkedList<>();
        q.offer(root);  //push
        while(!q.isEmpty()){
            Node front=q.poll();  //pop
            System.out.print(front.data + " ");
            if(front.left!=null){
                q.offer(front.left);
            }
            if(front.right!=null){
                q.offer(front.right);
            }
        }

    }



    static int heigth(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=heigth(root.left);
        int rightHeight=heigth(root.right);

        return Math.max(leftHeight,rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root=createNode(1);   //level 1
        root.left=createNode(2);   //level 2
        root.right=createNode(3);
        root.left.left=createNode(4);   //level 3
        root.left.right=createNode(5);
        root.right.left=createNode(6);
        root.right.right=createNode(7);
        root.left.right.left=createNode(8);   //level 4
        root.right.left.left=createNode(15);
        root.right.left.right=createNode(9);

        PreDFS(root);
        System.out.println();   //Traversal
        InDFS(root);
        System.out.println();
        PostDFS(root);
        System.out.println();
        BFS(root);

        int height=heigth(root);
        System.out.println(height);
    }
}
