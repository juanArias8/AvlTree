package UserInterface;

import AvlTree.AvlTree;

public class Main {

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        try {
            tree.setRoot(tree.insertNode(tree.getRoot(), 9));
            tree.setRoot(tree.insertNode(tree.getRoot(), 5));
            tree.setRoot(tree.insertNode(tree.getRoot(), 10));
            tree.setRoot(tree.insertNode(tree.getRoot(), 0));
            tree.setRoot(tree.insertNode(tree.getRoot(), 6));
            tree.setRoot(tree.insertNode(tree.getRoot(), 11));
            tree.setRoot(tree.insertNode(tree.getRoot(), -1));
            tree.setRoot(tree.insertNode(tree.getRoot(), 1));
            tree.setRoot(tree.insertNode(tree.getRoot(), 2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tree.preOrder(tree.getRoot());

        try {
            tree.setRoot(tree.deleteNode(tree.getRoot(), 10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        tree.preOrder(tree.getRoot());

        try {
            System.out.println(tree.searchNode(tree.getRoot(), 34).getData());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

