package UserInterface;

import AvlTree.AvlTree;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

public class MainUi extends javax.swing.JFrame {

    /**
     * Creación del formulario MainUi
     */
    public MainUi() {        
        initComponents();
    }
    
    /**
     * Creación de una instancia del objeto AvlTree
     */
    AvlTree tree = new AvlTree();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDfs = new javax.swing.JButton();
        btnBfs = new javax.swing.JButton();
        btnInOrder = new javax.swing.JButton();
        btnPreOrder = new javax.swing.JButton();
        btnPostOrder = new javax.swing.JButton();
        btnIsFull = new javax.swing.JButton();
        btnIsComplete = new javax.swing.JButton();
        btnGetHeight = new javax.swing.JButton();
        btnCountLeaves = new javax.swing.JButton();
        btnCountNodes = new javax.swing.JButton();
        btnGetParent = new javax.swing.JButton();
        btnGetAncestors = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaLog = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaResults = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ÁRBOL BINARIO DE BÚSQUEDA AVL");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("NanumBarunGothic", 0, 18)); // NOI18N
        jLabel1.setText("OPCIONES");

        btnInsert.setBackground(new java.awt.Color(132, 243, 196));
        btnInsert.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnInsert.setText("INSERTAR");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(132, 243, 196));
        btnDelete.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnDelete.setText("ELIMINAR");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(132, 243, 196));
        btnSearch.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnSearch.setText("BUSCAR");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDfs.setBackground(new java.awt.Color(132, 243, 196));
        btnDfs.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnDfs.setText("DFS");
        btnDfs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDfsActionPerformed(evt);
            }
        });

        btnBfs.setBackground(new java.awt.Color(132, 243, 196));
        btnBfs.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnBfs.setText("BFS");
        btnBfs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBfs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBfsActionPerformed(evt);
            }
        });

        btnInOrder.setBackground(new java.awt.Color(132, 243, 196));
        btnInOrder.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnInOrder.setText("INORDER");
        btnInOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrderActionPerformed(evt);
            }
        });

        btnPreOrder.setBackground(new java.awt.Color(132, 243, 196));
        btnPreOrder.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnPreOrder.setText("PREORDER");
        btnPreOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPreOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrderActionPerformed(evt);
            }
        });

        btnPostOrder.setBackground(new java.awt.Color(132, 243, 196));
        btnPostOrder.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnPostOrder.setText("POSTORDER");
        btnPostOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPostOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrderActionPerformed(evt);
            }
        });

        btnIsFull.setBackground(new java.awt.Color(132, 243, 196));
        btnIsFull.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnIsFull.setText("ES LLENO");
        btnIsFull.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIsFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsFullActionPerformed(evt);
            }
        });

        btnIsComplete.setBackground(new java.awt.Color(132, 243, 196));
        btnIsComplete.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnIsComplete.setText("ES COMPLETO");
        btnIsComplete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIsComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIsCompleteActionPerformed(evt);
            }
        });

        btnGetHeight.setBackground(new java.awt.Color(132, 243, 196));
        btnGetHeight.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnGetHeight.setText("ALTURA");
        btnGetHeight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetHeightActionPerformed(evt);
            }
        });

        btnCountLeaves.setBackground(new java.awt.Color(132, 243, 196));
        btnCountLeaves.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnCountLeaves.setText("NÚMERO DE HOJAS");
        btnCountLeaves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCountLeaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountLeavesActionPerformed(evt);
            }
        });

        btnCountNodes.setBackground(new java.awt.Color(132, 243, 196));
        btnCountNodes.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnCountNodes.setText("NÚMERO DE NODOS");
        btnCountNodes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCountNodes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountNodesActionPerformed(evt);
            }
        });

        btnGetParent.setBackground(new java.awt.Color(132, 243, 196));
        btnGetParent.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnGetParent.setText("PADRE DE UN NODO");
        btnGetParent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetParent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetParentActionPerformed(evt);
            }
        });

        btnGetAncestors.setBackground(new java.awt.Color(132, 243, 196));
        btnGetAncestors.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnGetAncestors.setText("ANCESTROS DE UN NODO");
        btnGetAncestors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetAncestors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAncestorsActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(132, 243, 196));
        btnReset.setFont(new java.awt.Font("NanumBarunGothic", 0, 14)); // NOI18N
        btnReset.setText("RESETEAR");
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDfs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBfs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnInOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPreOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPostOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIsFull, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnIsComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGetHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCountLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCountNodes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGetParent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGetAncestors, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDfs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBfs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPreOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPostOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIsFull, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIsComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCountLeaves, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCountNodes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetParent, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGetAncestors, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("NanumBarunGothic", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESULTADOS");

        jLabel2.setFont(new java.awt.Font("NanumBarunGothic", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONSOLA");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        textAreaLog.setEditable(false);
        textAreaLog.setColumns(20);
        textAreaLog.setRows(5);
        textAreaLog.setAutoscrolls(false);
        textAreaLog.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(textAreaLog);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        textAreaResults.setColumns(20);
        textAreaResults.setRows(5);
        jScrollPane3.setViewportView(textAreaResults);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(215, 215, 215))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap(438, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * btnInsertActionPerformed(java.awt.event.ActionEvent evt) 
     * Responde al evento click sobre el botón insertar,
     * Realiza un llamado al evento insertar del objeto AvlTree
     * @param evt 
     */
    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String dataTxt = JOptionPane.showInputDialog(
                null, "Ingrese el dato a insertar", JOptionPane.INFORMATION_MESSAGE
        );
        if(!dataTxt.equals("")){
            try {
                int data = Integer.parseInt(dataTxt);
                String message = tree.insertData(data);
                textAreaResults.setText(textAreaResults.getText() + "\n" + message);
            } catch (NumberFormatException e) {
                textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
            }
        }else {
            textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
        }        
    }//GEN-LAST:event_btnInsertActionPerformed
    
     /**
     * btnSearchActionPerformed(java.awt.event.ActionEvent evt) 
     * Responde al evento click sobre el botón buscar, 
     * Realiza un llamado al método searchData(data) del objeto AvlTree
     * @param evt 
     */
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String dataTxt = JOptionPane.showInputDialog(
                null, "Ingrese el dato a eliminar", JOptionPane.INFORMATION_MESSAGE
        );
        if(!dataTxt.equals("")){
            try {
                int data = Integer.parseInt(dataTxt);
                String message = tree.searchData(data);
                textAreaResults.setText(textAreaResults.getText() + "\n" + message);
            } catch (NumberFormatException e) {
                textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
            }
        }else {
            textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
        }        
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * btnDeleteActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón eliminar, 
     * Realiza un llamado al método deleteData(data) del objeto AvlTree
     * @param evt 
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       String dataTxt = JOptionPane.showInputDialog(
                null, "Ingrese el dato a eliminar", JOptionPane.INFORMATION_MESSAGE
        );
        if(!dataTxt.equals("")){
            try {
                int data = Integer.parseInt(dataTxt);
                String message = tree.deleteData(data);
                textAreaResults.setText(textAreaResults.getText() + "\n" + message);
            } catch (NumberFormatException e) {
                textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
            }
        }else {
            textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
        }        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    /**
     * btnDfsActionPerformed(java.awt.event.ActionEvent evt) 
     * Responde al evento click sobre el botón DFS, 
     * Realiza un llamado al método getDepthFirstSearch() del objeto AvlTree
     * @param evt 
     */
    private void btnDfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDfsActionPerformed
        String message = tree.getDepthFirstSearch();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnDfsActionPerformed
    
   /**
     *  btnBfsActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón BFS, 
     * Realiza un llamado al método getBreadthFirstSearch() del objeto AvlTree
     * @param evt 
     */
    private void btnBfsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBfsActionPerformed
        String message = tree.getBreadthFirstSearch();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnBfsActionPerformed

    /**
     *  btnInOrderActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón inorder, 
     * Realiza un llamado al método getInOrder() del objeto AvlTree
     * @param evt 
     */
    private void btnInOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrderActionPerformed
        String message = tree.getInOrder();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnInOrderActionPerformed

    /**
     *btnPreOrderActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón preorder, 
     * Realiza un llamado al método getPreOrder() del objeto AvlTree
     * @param evt 
     */
    private void btnPreOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrderActionPerformed
        String message = tree.getPreOrder();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnPreOrderActionPerformed

    /**
     * btnPostOrderActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón postorder, 
     * Realiza un llamado al método getPostOrder() del objeto AvlTree
     * @param evt 
     */
    private void btnPostOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrderActionPerformed
        String message = tree.getPostOrder();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnPostOrderActionPerformed

    /**
     * btnIsFullActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Es lleno, 
     * Realiza un llamado al método getIsFullTree() del objeto AvlTree
     * @param evt 
     */
    private void btnIsFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsFullActionPerformed
         String message = tree.getIsFullTree();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnIsFullActionPerformed

    /**
     * btnIsCompleteActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Es completo, 
     * Realiza un llamado al método getIsCompleteTree() del objeto AvlTree
     * @param evt 
     */
    private void btnIsCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIsCompleteActionPerformed
         String message = tree.getIsCompleteTree();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnIsCompleteActionPerformed

    /**
     * btnGetHeightActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Altura, 
     * Realiza un llamado al método getTreeHeight() del objeto AvlTree
     * @param evt 
     */
    private void btnGetHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetHeightActionPerformed
         String message = tree.getTreeHeight();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnGetHeightActionPerformed

    /**
     * btnCountLeavesActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Número de hojas, 
     * Realiza un llamado al método getCountLeaves() del objeto AvlTree
     * @param evt 
     */
    private void btnCountLeavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountLeavesActionPerformed
         String message = tree.getCountLeaves();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnCountLeavesActionPerformed

    /**
     *btnCountNodesActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Número de nodos, 
     * Realiza un llamado al método getNumberNodes() del objeto AvlTree
     * @param evt 
     */
    private void btnCountNodesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountNodesActionPerformed
         String message = tree.getNumberNodes();
        textAreaResults.setText(textAreaResults.getText() + "\n" + message);
    }//GEN-LAST:event_btnCountNodesActionPerformed

    /**
     * btnGetParentActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Padre de un nodo, 
     * Realiza un llamado al método getNodeParent(data) del objeto AvlTree
     * @param evt 
     */
    private void btnGetParentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetParentActionPerformed
        String dataTxt = JOptionPane.showInputDialog(
                null, "Ingrese el dato cuyo padre quieres hayar", JOptionPane.INFORMATION_MESSAGE
        );
        if(!dataTxt.equals("")){
            try {
                int data = Integer.parseInt(dataTxt);
                String message = tree.getNodeParent(data);
                textAreaResults.setText(textAreaResults.getText() + "\n" + message);
            } catch (NumberFormatException e) {
                textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
            }
        }else {
            textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
        }        
    }//GEN-LAST:event_btnGetParentActionPerformed

    /**
     * btnGetAncestorsActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Ancestros de un nodo, 
     * Realiza un llamado al método getNodeAncestors(data) del objeto AvlTree
     * @param evt 
     */
    private void btnGetAncestorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAncestorsActionPerformed
       String dataTxt = JOptionPane.showInputDialog(
                null, "Ingrese el dato cuyos ancestros quieres hayar", JOptionPane.INFORMATION_MESSAGE
        );
        if(!dataTxt.equals("")){
            try {
                int data = Integer.parseInt(dataTxt);
                String message = tree.getNodeAncestors(data);
                textAreaResults.setText(textAreaResults.getText() + "\n" + message);
            } catch (NumberFormatException e) {
                textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
            }
        }else {
            textAreaLog.setText(textAreaLog.getText() + "\n" + "Debe ingresar un valor válido");
        }        
    }//GEN-LAST:event_btnGetAncestorsActionPerformed

    /**
     * btnResetActionPerformed(java.awt.event.ActionEvent evt)
     * Responde al evento click sobre el botón Resetear, 
     * Realiza un llamado al método resetTree() del objeto AvlTree
     * @param evt 
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       textAreaLog.setText("");
       textAreaResults.setText("");
       tree.resetTree();
    }//GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBfs;
    private javax.swing.JButton btnCountLeaves;
    private javax.swing.JButton btnCountNodes;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDfs;
    private javax.swing.JButton btnGetAncestors;
    private javax.swing.JButton btnGetHeight;
    private javax.swing.JButton btnGetParent;
    private javax.swing.JButton btnInOrder;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnIsComplete;
    private javax.swing.JButton btnIsFull;
    private javax.swing.JButton btnPostOrder;
    private javax.swing.JButton btnPreOrder;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textAreaLog;
    private javax.swing.JTextArea textAreaResults;
    // End of variables declaration//GEN-END:variables
}
