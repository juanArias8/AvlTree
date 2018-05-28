package UserInterface;

import AvlTree.AvlTree;

public class Main {

    public static void main(String[] args) {
        AvlTree tree = new AvlTree();

        tree.setRoot(tree.insertNode(tree.getRoot(), 9));
        tree.setRoot(tree.insertNode(tree.getRoot(), 5));
        tree.setRoot(tree.insertNode(tree.getRoot(), 10));
        tree.setRoot(tree.insertNode(tree.getRoot(), 0));
        tree.setRoot(tree.insertNode(tree.getRoot(), 6));
        tree.setRoot(tree.insertNode(tree.getRoot(), 11));
        tree.setRoot(tree.insertNode(tree.getRoot(), -1));
        tree.setRoot(tree.insertNode(tree.getRoot(), 1));
        tree.setRoot(tree.insertNode(tree.getRoot(), 2));

        tree.preOrder(tree.getRoot());

        tree.setRoot(tree.deleteNode(tree.getRoot(), 10));

        tree.preOrder(tree.getRoot());

        System.out.println(tree.searchNode(tree.getRoot(), 0).getData());
    }
}

