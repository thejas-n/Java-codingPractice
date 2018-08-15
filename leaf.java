package tree;

public class leaf {
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

    public void printleaf(node present) {
        if(present!=null){
            if (present.lc == null && present.rc == null) {
                System.out.println(present.value + " " + "is a leaf node");
            }
            printleaf(present.lc);
            printleaf(present.rc);
        }
    }



    public static void main(String[] args){
        leaf binarytree= new leaf();
        binarytree.addnode(100);
        binarytree.addnode(100);
        binarytree.addnode(30);
        binarytree.addnode(10);
        binarytree.addnode(80);
        binarytree.addnode(150);
        binarytree.addnode(123);
        binarytree.addnode(173);
        binarytree.printleaf(binarytree.root);
    }
}
