package UserInterface;

import AvlTree.AvlTree;

public class Main {

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        System.out.println(tree.insertData(5));
        System.out.println(tree.insertData(10));
        System.out.println(tree.insertData(15));
        System.out.println(tree.insertData(20));
        System.out.println(tree.insertData(25));
        System.out.println(tree.insertData(30));
        System.out.println(tree.insertData(35));

        System.out.println("--");
        System.out.println(tree.getPreOrder());
        System.out.println("--");

        //System.out.println(tree.deleteData(10));

        System.out.println("--");
        System.out.println(tree.getPreOrder());
        //System.out.println(tree.preOrder(tree.getRoot()));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.searchData(10));
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
        System.out.println(tree.getNodeParent(25));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getNodeAncestors(35));
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getIsCompleteTree());
        System.out.println("--");
        
        System.out.println("--");
        System.out.println(tree.getDepthFirstSearch());
        System.out.println("--");
        
         System.out.println("--");
        System.out.println(tree.getBreadthFirstSearch());
        System.out.println("--");
    }
}
