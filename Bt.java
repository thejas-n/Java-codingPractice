package tree;

public class Bt {
    node root;
    public void addnode(int value){
    node newNode= new node(value);
        if(root==null) {
            root=newNode;
            }
            else{
                node present=root;
                node parent;

                while(true){
                    parent=present;
                    if(value<present.value){
                        present=present.lc;
                        if (present==null){
                             parent.lc=newNode;
                             return;
                        }
                    }
                    else{
                        present=present.rc;
                        if (present==null){
                            parent.rc=newNode;
                            return;
                    }
                }
            }
        }
    }

    public void inorder(node present) {
        if (present != null) {
            System.out.println(present.value);
            inorder(present.lc);
            inorder(present.rc);
        }
    }


    public static void main(String[] args){
        Bt binarytree= new Bt();
        binarytree.addnode(100);
        binarytree.addnode(30);
        binarytree.addnode(10);
        binarytree.addnode(80);
        binarytree.addnode(150);
        binarytree.addnode(123);
        binarytree.addnode(173);
        binarytree.inorder(binarytree.root);
    }
}
class node{
    int value;
    node lc;
    node rc;

    node(int value){
        this.value=value;
    }
}
