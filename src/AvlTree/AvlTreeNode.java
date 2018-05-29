
package AvlTree;

public class AvlTreeNode {

    /**
     * Definimos los atributos del objeto, data: valor que almacena el objeto
     * balanceFactor: Factor de balanceo del nodo leftChild: Hijo izquierdo del nodo
     * rightChild: Hijo derecho del nodo
     */
    private int data;
    private int balanceFactor;
    private AvlTreeNode leftChild;
    private AvlTreeNode rightChild;

    /**
     * Constructor del objeto. 
     * inicializa los datos cada que se crea un objeto de la clase
     * @param data, valor que el nodo va a almacenar
     */
    public AvlTreeNode(int data) {
        this.data = data;
        this.balanceFactor = 1;
        this.leftChild = null;
        this.rightChild = null;
    }

    /**
     * Getters y Setters del objeto, 
     * Permiten acceder a los datos privados del objeto (Encapsulamiento)
     */
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getBalanceFactor() {
        return balanceFactor;
    }

    public void setBalanceFactor(int balanceFactor) {
        this.balanceFactor = balanceFactor;
    }

    public AvlTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(AvlTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public AvlTreeNode getRigthChild() {
        return rightChild;
    }

    public void setRigthChild(AvlTreeNode rigthChild) {
        this.rightChild = rigthChild;
    }
}

