package UserInterface;

import AvlTree.AvlTree;

public class Main {

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        System.out.println(tree.insertData(9));
        System.out.println(tree.insertData(5));
        System.out.println(tree.insertData(10));
        System.out.println(tree.insertData(0));
        System.out.println(tree.insertData(6));
        System.out.println(tree.insertData(11));
        System.out.println(tree.insertData(-1));
        System.out.println(tree.insertData(1));
        System.out.println(tree.insertData(2));

        System.out.println("--");
        System.out.println(tree.getPreOrder());
        System.out.println("--");

        System.out.println(tree.deleteData(10));

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
        System.out.println(tree.getFullTree());
        System.out.println("--");
    }
}
