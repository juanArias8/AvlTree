package AvlTree;

public class AvlTree {

    /**
     * Raiz del árbol AVL
     */
    private AvlTreeNode root;

    /**
     * Constructor del árbol AVL
     * Inicializa la raíz como vacía
     */
    public AvlTree() {
        root = null;
    }

    /**
     * Getters y Setters de la clase
     * getRoot: Devuelve el nodo raíz del árbol
     * setRoot: Asigna el nodo raíz al árbol
     */
    public AvlTreeNode getRoot() {
        return root;
    }

    public void setRoot(AvlTreeNode node) {
        this.root = node;
    }

    /**
     * *****************************************************************
     ******************* MÉTODOS PRIVADOS **************************
     * *****************************************************************
     */
    
    /**
     * getHeight(node)
     * Obtiene el factor de balance de un nodo determinado
     */
    private int getHeight(AvlTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return node.getBalanceFactor();
        }
    }

    /**
     * getMaxValue(x, y)
     * Obtiene el valor máximo entre dos posibilidades
     */
    private int getMaxValue(int x, int y) {
        return (x > y) ? x : y;
    }

    /**
     * rightRotation(node)
     * Realiza una rotación a la derecha con base al nodo
     * pasado como parámetro
     */
    private AvlTreeNode rightRotation(AvlTreeNode node) {
        AvlTreeNode auxNode1 = node.getLeftChild();
        AvlTreeNode auxNode2 = auxNode1.getRigthChild();

        auxNode1.setRigthChild(node);
        node.setLeftChild(auxNode2);

        node.setBalanceFactor(getMaxValue(
                getHeight(node.getLeftChild()),
                getHeight(node.getRigthChild())
        ) + 1);

        auxNode1.setBalanceFactor(getMaxValue(
                getHeight(auxNode1.getLeftChild()),
                getHeight(auxNode1.getRigthChild())
        ) + 1);

        return auxNode1;
    }

    /**
     * leftRotation(node) 
     * Realiza una rotación a la izquierda con base al nodo
     * pasado como parámetro
     */
    private AvlTreeNode leftRotation(AvlTreeNode node) {
        AvlTreeNode auxNode1 = node.getRigthChild();
        AvlTreeNode auxNode2 = auxNode1.getLeftChild();

        auxNode1.setLeftChild(node);
        node.setRigthChild(auxNode2);

        node.setBalanceFactor(getMaxValue(
                getHeight(node.getLeftChild()),
                getHeight(node.getRigthChild())
        ) + 1);

        auxNode1.setBalanceFactor(getMaxValue(
                getHeight(auxNode1.getLeftChild()),
                getHeight(auxNode1.getRigthChild())
        ) + 1);

        return auxNode1;
    }

    /**
     * getBalance(node) 
     * calcula el factor de balance de un nodo determinado
     */
    private int getBalance(AvlTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return getHeight(
                    node.getLeftChild()) - getHeight(node.getRigthChild()
            );
        }
    }

    /**
     * getMinValue(node) 
     * obtiene el valor mínimo de un subarbol
     */
    private AvlTreeNode getMinValue(AvlTreeNode node) {
        while (node.getLeftChild() != null) {
            node = node.getLeftChild();
        }
        return node;
    }

    /**
     * insertNode(node, data) 
     * Inserta un nuevo nodo en el árbol AVL en caso de
     * que no exista Balancea el ábol de ser necesario luego de la insersión
     * Método privado, sólo puede ser invocado desde el interior de la clase
     */
    private AvlTreeNode insertNode(AvlTreeNode node, int data) {
        if (node == null) {
            return (new AvlTreeNode(data));
        }

        if (data < node.getData()) {
            node.setLeftChild(insertNode(node.getLeftChild(), data));
        } else if (data > node.getData()) {
            node.setRigthChild(insertNode(node.getRigthChild(), data));
        } else {
            return node;
        }

        node.setBalanceFactor(getMaxValue(
                getHeight(node.getLeftChild()),
                getHeight(node.getRigthChild())
        ) + 1);

        int balance = getBalance(node);

        if (balance > 1 && data < node.getLeftChild().getData()) {
            return rightRotation(node);
        }

        if (balance < -1 && data > node.getRigthChild().getData()) {
            return leftRotation(node);
        }

        if (balance > 1 && data > node.getLeftChild().getData()) {
            node.setLeftChild(leftRotation(node.getLeftChild()));
            return rightRotation(node);
        }

        if (balance < -1 && data < node.getRigthChild().getData()) {
            node.setRigthChild(rightRotation(node.getRigthChild()));
            return leftRotation(node);
        }

        return node;
    }

    /**
     * deleteNode(root, data)
     * elimina un nodo deseado del árbol en caso de que
     * exista Balancea el árbol de ser necesario luego de la eliminación Método
     * privado,sólo puede ser invocado desde el interior de la clase
     */
    private AvlTreeNode deleteNode(AvlTreeNode root, int data) {
        if (root == null) {
            return root;
        }

        if (data < root.getData()) {
            root.setLeftChild(deleteNode(root.getLeftChild(), data));
        } else if (data > root.getData()) {
            root.setRigthChild(deleteNode(root.getRigthChild(), data));
        } else {
            if ((root.getLeftChild() == null) || (root.getRigthChild() == null)) {
                AvlTreeNode aux = null;
                if (aux == root.getLeftChild()) {
                    aux = root.getRigthChild();
                } else {
                    aux = root.getLeftChild();
                }

                if (aux == null) {
                    aux = root;
                    root = null;
                } else {
                    root = aux;
                }
            } else {
                AvlTreeNode aux = getMinValue(root.getRigthChild());
                root.setData(aux.getData());
                root.setRigthChild(deleteNode(root.getRigthChild(), aux.getData()));
            }
        }

        if (root == null) {
            return root;
        }

        root.setBalanceFactor(getMaxValue(
                getHeight(root.getLeftChild()),
                getHeight(root.getRigthChild())
        ) + 1);

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.getLeftChild()) >= 0) {
            return rightRotation(root);
        }

        if (balance > 1 && getBalance(root.getLeftChild()) < 0) {
            root.setLeftChild(leftRotation(root.getLeftChild()));
            return rightRotation(root);
        }

        if (balance < -1 && getBalance(root.getRigthChild()) <= 0) {
            return leftRotation(root);
        }

        if (balance < -1 && getBalance(root.getRigthChild()) > 0) {
            root.setRigthChild(rightRotation(root.getRigthChild()));
            return leftRotation(root);
        }

        return root;
    }

    /**
     * searchData(root, data) 
     * busca el nodo cuyo valor coinsida con el pasado
     * por parámetro
     */
    private AvlTreeNode searchNode(AvlTreeNode root, int data) {
        if (root == null) {
            return null;
        } else if (root.getData() == data) {
            return root;
        } else if (data < root.getData()) {
            return searchNode(root.getLeftChild(), data);
        } else {
            return searchNode(root.getRigthChild(), data);
        }
    }
    
      /*
     * inOrder(node) 
     * recorre el árbol bajo el algoritmo inOrden
     */
    private String messageInOrder = "";
    private void inOrder(AvlTreeNode node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            messageInOrder += " [" + node.getData() + "] ";
            inOrder(node.getRigthChild());
        }
    }

    /*
     * preOrder(node) 
     * recorre el árbol bajo el algoritmo preOrder
     */
    private String messagePreOrder = "";
    private void preOrder(AvlTreeNode node) {
        if (node != null) {
            messagePreOrder += " [" + node.getData() + "] ";
            preOrder(node.getLeftChild());
            preOrder(node.getRigthChild());
        }
    }
    
     /*
     * postOrder(node) 
     * recorre el árbol bajo el algoritmo postOrder
     */
    private String messagePostorder = "";
    private void postOrder(AvlTreeNode node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRigthChild());
            messagePostorder += " [" + node.getData() + "] ";
        }
    }

    /**
     * *****************************************************************
     ******************** MÉTODOS PÚBLICOS *************************
     * *****************************************************************
     */
    /*
    * insertNode(data)
    * Inserta el valor de data en el árbol AVL
    * Método accesible desde fuera de la clase
     */
    public String insertData(int data) {
        String message;
        try {
            setRoot(insertNode(getRoot(), data));
            message = "El dato " + data + " ha sido insertado";
        } catch (Exception e) {
            message = "Lo sentimos, no ha sido posible insertar el dato";
            System.out.println(e.getMessage());
        }
        return message;
    }

    /*
    * deleteData(data)
    * elimina el nodo que contenga el valor de data
    * Método accesible desde fuera de la clase
     */
    public String deleteData(int data) {
        String message;
        try {
            setRoot(deleteNode(getRoot(), data));
            message = "El dato " + data + " ha sido eliminado";
        } catch (Exception e) {
            message = "Lo sentimos, no ha sido posible eliminar el dato"; 
            System.out.println(e.getMessage());
        }
        return message;
    }

    /*
    * searchData(data)
    * Busca el nodo que contenga el valor de data
     */
    public String searchData(int data) {
        String message;
        try {
            int dataResponse = searchNode(getRoot(), data).getData();
            message = "El dato " + dataResponse + "Se encuentra en el árbol";
        } catch (Exception e) {
            message = "El dato " + data + " no ha sido encontrado"; 
            System.out.println(e.getMessage());
        }
        return message;
    }
    
    /*
    * getPreorder()
    * Método de accesso público, hace un llamado a preOrder()
    * y almacena los valores del recorrido en la variable messagePreOrder
    */
    public String getPreOrder(){
        messagePreOrder = "";
        preOrder(getRoot());
        return messagePreOrder;
    }   
    
     /*
    * getInOrder()
    * Método de accesso público, hace un llamado a inOrder()
    * y almacena los valores del recorrido en la variable messageInOrder
    */
    public String getInOrder(){
        messageInOrder = "";
        inOrder(getRoot());
        return messageInOrder;
    }   
    
     /*
    * getPostOrder()
    * Método de accesso público, hace un llamado a postOrder()
    * y almacena los valores del recorrido en la variable messagePostorder
    */
    public String getPostOrder(){
        messagePostorder = "";
        preOrder(getRoot());
        return messagePostorder;
    }   
}
