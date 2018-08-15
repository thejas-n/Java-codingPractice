package tree;

import static java.lang.Math.*;

public class printline {
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

    public void line(node root) {
        int h = height(root);
        for (int i=1; i<=h; i++)
        {
            printLevel(root, i);
            System.out.print("");
        }
    }
    void printLevel(node root,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.println(root.value);
        else if (level > 1)
        {
            printLevel(root.lc, level-1);
            printLevel(root.rc, level-1);
        }
    }
    public int height(node root){
        if(root==null){
            return 0;
        }
        else {
        return (1+max(height(root.lc),height(root.rc)));
    }
    }


    public static void main(String[] args){
        printline binarytree= new printline();
        binarytree.addnode(100);
        binarytree.addnode(30);
        binarytree.addnode(10);
        binarytree.addnode(80);
        binarytree.addnode(150);
        binarytree.addnode(123);
        binarytree.addnode(173);
        binarytree.addnode(13);
        binarytree.addnode(193);
        binarytree.height(binarytree.root);
        System.out.print("height:"+binarytree.height(binarytree.root));
        System.out.println();
        binarytree.line(binarytree.root);

    }
}

