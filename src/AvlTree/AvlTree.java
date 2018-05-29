package AvlTree;

public class AvlTree {

    /**
     * 
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
     * @param node, nodo al cuál se le quiere calcular el factor de balance
     * @return factor de balance del nodo
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
     * Obtiene el valor máximo entre dos números posibles
     * @param x
     * @param y
     * @return el menor valor de x e y
     */
    private int getMaxValue(int x, int y) {
        return (x > y) ? x : y;
    }

    /**
     * rightRotation(node)
     * Realiza una rotación a la derecha con base al nodo
     * pasado como parámetro
     * @param nodo, nodo al cual se le quiere aplicar la rotación
     * @return nodo
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
     * @param node, nodo al cual se le quiere aplicar la rotación
     * @return 
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
     * @param node, nodo al cual se le quiere calcular el factor de balance
     * @return factor de balance del nodo
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
     * @param node, nodo raíz del sub-árbol
     * @return nodo menor del sub-árbol
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
     * @param node, nodo raíz del árbol
     * @param data, valor que se quiere insertar en el árbol
     * @return nuevo nodo insertado
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
     * @param root, nodo raíz del árbol
     * @param data, valor que se quiere eliminar del árbol
     * @return nodo eliminado
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
     * busca el nodo cuyo valor coinsida con el pasado por parámetro
     * @param root, nodo raíz del árbol
     * @param data, dato a buscar
     * @return nodo que contiene el dato buscado
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
    
    /**
     * countLeaves(root)
     * Retorna el número de hojas que tiene un árbol
     * @param root, nodo raíz del árbol
     * @return número de hojas del árbol
     */
    private int countLeaves(AvlTreeNode root){
        int leaves = 0;
        if(root != null){
            if(root.getLeftChild() == null && root.getRigthChild() == null){
                leaves += 1;
            } else {
                leaves += countLeaves(root.getLeftChild()) + countLeaves(root.getRigthChild());
            }
        }
        return leaves;
    }
    
    /**
     * countNodes(root)
     * Retorna el número de nodos de un árbol
     * @param root, nodo raíz del árbol
     * @return número de nodos del árbol
     */
    private int countNodes(AvlTreeNode root){
        if(root == null){
            return 0;
        } else {
            return 1 + countNodes(root.getLeftChild()) + countNodes(root.getRigthChild());
        }
    }
    
    /**
     * getTreeHeight(root)
     * Retorna la altura de un árbol
     * @param root, nodo raíz del árbol
     * @return altura del árbol
     */
    private int treeHeight(AvlTreeNode root){
        int leftHeight = 0;
        int rightHeight = 0;
        if(root == null){
            return 0;
        }
        if(root.getLeftChild() != null){
            leftHeight = treeHeight(root.getLeftChild());
        }
        if(root.getRigthChild() != null){
            rightHeight = treeHeight(root.getRigthChild());
        }
        return getMaxValue(leftHeight, rightHeight) + 1;
    }
    
    /**
     * isFullTree(root)
     * Determina si un árbol es lleno
     * @param root
     * @return true si el árbol es lleno, false de lo contrario
     */
    public boolean isFullTree(AvlTreeNode root){
        int treeHeight = treeHeight(root);
        int numberNodes = countNodes(root);
        int full = (int)Math.pow(2, (treeHeight)) - 1;
        if(numberNodes == full){
            return true;
        }
        return false;
    }    
    
    /**
     * inOrder(node) 
     * recorre el árbol bajo el algoritmo inOrden
     * @param node, nodo raíz del árbol 
     */
    private String messageInOrder = "";
    private void inOrder(AvlTreeNode node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            messageInOrder += " [" + node.getData() + "] ";
            inOrder(node.getRigthChild());
        }
    }

    /**
     * preOrder(node) 
     * recorre el árbol bajo el algoritmo preOrder
     * @param node, nodo raíz del árbol
     */
    private String messagePreOrder = "";
    private void preOrder(AvlTreeNode node) {
        if (node != null) {
            messagePreOrder += " [" + node.getData() + "] ";
            preOrder(node.getLeftChild());
            preOrder(node.getRigthChild());
        }
    }
    
     /**
     * postOrder(node) 
     * recorre el árbol bajo el algoritmo postOrder
     * @param node, nodo raíz del árbol
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

    /**
     *  insertNode(data)
     * Hace un llamado al método para insertar un nuevo nodo con el valor data
     * Método accesible desde fuera de la clase
     * @param data, valor a insertar en el árbol
     * @return mensage equivalente al resultado de la operación
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

    /**
     * deleteData(data)
    * Hace un llamado al método para eliminar el nodo que contenga el valor data
    * Método accesible desde fuera de la clase
     * @param data, valor a eliminar del árbol
     * @return mensage equivalente al resultado de la operación
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

    /**
     * searchData(data)
    * Hace un llamado al método para buscar el nodo que contenga el valor data
    * Método accesible desde fuera de la clase
     * @param data, valor a buscar en el árbol
     * @return mensage equivalente al resultado de la operación
     */ 
    public String searchData(int data) {
        String message;
        try {
            int dataResponse = searchNode(getRoot(), data).getData();
            message = "El dato " + dataResponse + " se encuentra en el árbol";
        } catch (Exception e) {
            message = "El dato " + data + " no ha sido encontrado"; 
            System.out.println(e.getMessage());
        }
        return message;
    }
    
    /**
     * getPreorder()
     * Recorre el árbol bajo el algoritmo pre order
     * Método accesible desde fuera de la clase
     * @return mensaje que contiene el recorrido
     */
    public String getPreOrder(){
        messagePreOrder = "";
        preOrder(getRoot());
        return messagePreOrder;
    }   
    
     /**
     * getInOrder()
     * Recorre el árbol bajo el algoritmo in order
     * Método accesible desde fuera de la clase
     * @return mensaje que contiene el recorrido
     */
    public String getInOrder(){
        messageInOrder = "";
        inOrder(getRoot());
        return messageInOrder;
    }   
    
      /**
     * getPostOrder()
     * Recorre el árbol bajo el algoritmo post order
     * Método accesible desde fuera de la clase
     * @return mensaje que contiene el recorrido
     */
    public String getPostOrder(){
        messagePostorder = "";
        preOrder(getRoot());
        return messagePostorder;
    }   
    
    /**
     * getCountLeaves()
     * Hace un llamado al método para contar el número de hojas del árbol
     * @return mensage equivalente al resultado de la operación
     */
    public String getCountLeaves(){
        String message;
        int numerLeaves = 0;
        try {
            numerLeaves = countLeaves(getRoot());
            message = "el número de hojas del árbol es " + numerLeaves;
        } catch (Exception e) {
            message = "Lo sentimos, no se ha podido contar el número de hojas";
            System.out.println(e.getMessage());
        }
        return message;                
    }
    
    /**
     * getTreeHeight()
     * Hace un llamado al método para obtener la altura del árbol
     * @return   mensage equivalente al resultado de la operación
     */
    public String getTreeHeight(){
        String message;
        int treeHeight = 0;
        try {
            treeHeight = treeHeight(getRoot());
            message = "La altura del árbol es " + treeHeight;
        } catch (Exception e) {
            message = "Lo sentimos, no se ha podido hallar la altura del árbol";
            System.out.println(e.getMessage());
        }
        return message;
    }
    
    /**
     * getNumberNodes()
     * Hace un llamado al método para contar el número de nodos del árbol
     * @return   mensage equivalente al resultado de la operación
     */
     public String getNumberNodes(){
        String message;
        int numberNodes = 0;
        try {
            numberNodes = countNodes(getRoot());
            message = "El árbol tiene  " + numberNodes + " nodos";
        } catch (Exception e) {
            message = "Lo sentimos, no se han podido contar los nodos";
            System.out.println(e.getMessage());
        }
        return message;
    }
     
     /**
      * getFullTree()
      * Hace un llamado al método para verificar si el árbol es lleno o no
      * @return  mensage equivalente al resultado de la operación
      */
     public String getFullTree(){
         String message = "";
         boolean isFull = false;
         try {
             isFull = isFullTree(getRoot());
             if(isFull){
                 message  = "El árbol es lleno";
             } else {
                 message = "El árbol no es lleno";
             }
         } catch (Exception e) {
              message = "Lo sentimos, no se ha podido verificar si el árbol es lleno";
              System.out.println(e.getMessage());
         }
         return message;
     }
}
