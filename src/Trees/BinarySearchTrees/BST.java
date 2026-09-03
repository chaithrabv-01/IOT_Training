package Trees.BinarySearchTrees;

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


public class BST {
    Node root;
    BST(){
        root=null;
    }
    private Node insertRec(Node root,int key){
        if(root==null){
            Node n=new Node(key);
            return n;
        }
        if(key<root.data){
            root.left=insertRec(root.left,key);
        }else if(key>root.data){
            root.right=insertRec(root.right,key);
        }
        return root;

    }
    void insert(int key){
        root=insertRec(root,key);
    }

    private boolean searchRec(Node root,int key){
        if(root==null){   //last node
            return false;
        }
        if(key==root.data){   //found
            return true;
        }else if(key<root.data){
            return searchRec(root.left,key);
        }
        return searchRec(root.right,key);
    }

    boolean search(int key){
        return searchRec(root,key);
    }

    void InDFS(Node root){
        if(root==null){
            return;
        }
        InDFS(root.left);
        System.out.print(root.data +" " );
        InDFS(root.right);
    }

    private Node removeRec(Node root,int key){
        if(root==null){
            return null;
        }if(key<root.data){   //check left
            root.left=removeRec(root.left,key);
        }else if(key>root.data){   //check right
            root.right=removeRec(root.right,key);
        }else{  ///here key==root.data
             //case 1:when node has 0 or 1 child
            if(root.left==null){
                return root.right;
            } else if (root.right==null) {
                return root.left;

            }

            //case 2:if the root node has 2 child's
            Node successor=FindSuccesor(root.right);   //here we are moving the root to root.right
            root.data=successor.data;
            root.right=removeRec(root.right,key);
        }
        return root;
    }

    private Node FindSuccesor(Node node){
        while(node.left!=null){
            node=node.left;
        }return node;
    }
    void remove(int key){

        root=removeRec(root,key);
    }

}

class Driver{
    public static void main(String[] args) {
        BST b=new BST();
        b.insert(100);
        b.insert(50);
        b.insert(150);
        b.insert(30);
        b.insert(60);
        b.insert(55);
        b.insert(120);
        b.insert(180);
        b.insert(110);
        b.insert(130);


        System.out.println(b.search(30));
        b.InDFS(b.root);     //sorting

        b.remove(150);
    }
}
