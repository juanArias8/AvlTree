package UserInterface;

import AvlTree.AvlTree;

public class Main {

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        System.out.println(tree.insertData(50));
        System.out.println(tree.insertData(17));
        System.out.println(tree.insertData(9));
//        System.out.println(tree.insertData(4));
//        System.out.println(tree.insertData(14));
//        System.out.println(tree.insertData(23));
//        System.out.println(tree.insertData(19));
//        System.out.println(tree.insertData(24));
//        System.out.println(tree.insertData(2));
//        System.out.println(tree.insertData(21));

        System.out.println("--");
        System.out.println(tree.getPreOrder());
        System.out.println("--");

        //System.out.println(tree.deleteData(10));

        System.out.println("--");
        System.out.println(tree.getPreOrder());
        //System.out.println(tree.preOrder(tree.getRoot()));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.searchData(0));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getCountLeaves());
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getTreeHeight());
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getNumberNodes());
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getIsFullTree());
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getNodeParent(9));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getNodeAncestors(17));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getIsCompleteTree());
        System.out.println("--");
    }
}
