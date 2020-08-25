package examples;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.tree.DefaultMutableTreeNode;

public class MainWindow extends javax.swing.JFrame {

    JSplitPane splitPane; 
    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        FinTree = new javax.swing.JTree();
        jInternalFrame1 = new javax.swing.JInternalFrame();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jSplitPane1.setBorder(null);
        jSplitPane1.setAutoscrolls(true);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Masters");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("State Master");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Input");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Invoice Generation");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        FinTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        FinTree.setAlignmentX(1.0F);
        FinTree.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FinTree.setMaximumSize(new java.awt.Dimension(100, 32));
        FinTree.setRootVisible(false);
        FinTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                FinTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(FinTree);

        jSplitPane1.setLeftComponent(jScrollPane1);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(new java.awt.FlowLayout());
        jSplitPane1.setRightComponent(jInternalFrame1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try
        {
            DatabaseQuery.CloseConnection();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void FinTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_FinTreeValueChanged
        // TODO add your handling code here:
        try
        {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode)FinTree.getSelectionPath().getLastPathComponent();
            String selectedNodeName = selectedNode.getUserObject().toString();
            if (selectedNodeName.equals("State Master"))
            {
                StateMaster frmStateMaster = new StateMaster(); 
                frmStateMaster.setVisible(true);
            }
            else if (selectedNodeName.equals("Invoice Generation"))
            {
                Invoice frmInvoice = new Invoice();
                frmInvoice.setVisible(true);
                jInternalFrame1.add(frmInvoice);
            }
        }
        catch (Exception e)
        {
            
        }
    }//GEN-LAST:event_FinTreeValueChanged

    public static void main(String args[]) throws SQLException{
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        DatabaseQuery.GetConnection();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree FinTree;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
