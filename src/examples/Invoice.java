package examples;

import static examples.StateMaster.colValue;
import static examples.StateMaster.txtStateCode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Invoice extends javax.swing.JFrame {
    
    private String query = null;
    private ResultSet rs = null;
    SearchTable searchBox = new SearchTable();
    private static int rowCount = 0;

    public Invoice() {
        initComponents();
        FillState();
        FillCurrency();
        dtpInv.setDate(new Date());
        txtCustName.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCustName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInvNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCustAddr = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        cmbState = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtPIN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMobNo = new javax.swing.JTextField();
        cmbCur = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRemarks = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Name");

        jLabel2.setText("Invoice No");

        txtInvNo.setEditable(false);

        jLabel3.setText("Address");

        txtCustAddr.setColumns(20);
        txtCustAddr.setRows(5);
        jScrollPane1.setViewportView(txtCustAddr);

        jLabel4.setText("State");

        cmbState.setEditable(true);
        cmbState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateActionPerformed(evt);
            }
        });

        jLabel5.setText("PIN Code");

        jLabel6.setText("Mob. No.");

        jLabel7.setText("Currency Type");

        jLabel8.setText("Remarks");

        txtRemarks.setColumns(20);
        txtRemarks.setRows(5);
        jScrollPane2.setViewportView(txtRemarks);

        jLabel10.setText("Date");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSearchFocusGained(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustName)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInvNo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(163, 163, 163))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdate))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMobNo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCur, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInvNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMobNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    private void FillState()
    {
        try
        {
            query = null;
            query = "Select StateCode, StateName from StateMaster";
            rs = DatabaseQuery.ExecuteQuery(query);
            while (rs.next())
            {
                cmbState.addItem(rs.getString("StateName"));                
            }
            cmbState.setSelectedIndex(-1);
        }
        catch (Exception e)
        {
        }
    }
    
    private void FillCurrency()
    {
        cmbCur.addItem("INR");
        cmbCur.addItem("USD");
        cmbCur.setSelectedIndex(-1);
    }
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String query = null;
        query = "Select InvoiceNo, CustName, MobileNo, InvoiceDate from InvoiceGen";
        searchBox.List(query);
        searchBox.setVisible(true);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSearchFocusGained
        // TODO add your handling code here:
        colValue = SearchTable.colValue;
        try
        {
            query = null;
            query = "Select InvoiceNo, InvoiceDate, CustName, CustAddress, State, Pin, MobileNo, CurrencyType, Remarks from InvoiceGen where InvoiceNo = " + colValue + "";
            rs = DatabaseQuery.ExecuteQuery(query);
            if (rs.next())
            {
                txtInvNo.setText(rs.getString("InvoiceNo"));
                dtpInv.setDate(rs.getDate("InvoiceDate"));
                txtCustName.setText(rs.getString("CustName"));
                txtCustAddr.setText(rs.getString("CustAddress"));
                txtPIN.setText(rs.getString("Pin"));
                cmbCur.setSelectedIndex(rs.getInt("CurrencyType"));
                txtRemarks.setText(rs.getString("Remarks"));
                txtMobNo.setText(rs.getString("MobileNo"));
                rs = DatabaseQuery.ExecuteQuery("Select StateName from StateMaster where StateCode = " + rs.getInt("State") + "");
                if (rs.next())
                {
                    cmbState.setSelectedItem(rs.getString("StateName"));
                }
            }
            SearchTable.colValue = null;
        }
        catch (Exception e)
        {}
    }//GEN-LAST:event_btnSearchFocusGained

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try
        {
            query = null;
            int Icode;
            String stateCode = null;
            if (txtCustName.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Name");
                txtCustName.requestFocus();
            }
            else if (txtCustAddr.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Customer Address");
                txtCustAddr.requestFocus();
            }
            else if (cmbState.getSelectedIndex() == -1)
            {
                JOptionPane.showMessageDialog(null, "Please Enter State");
                cmbState.requestFocus();
            }
            else if (txtPIN.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter PIN Code");
                txtPIN.requestFocus();
            }
            else if (txtMobNo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null, "Please Enter Mobile No");
                txtMobNo.requestFocus();
            }
            else if (cmbCur.getSelectedIndex() == -1)
            {
                JOptionPane.showMessageDialog(null, "Please Enter Currency Type");
                cmbCur.requestFocus();
            }        
            else
            {
                try
                {
                    Icode = AutoGenInvoiceCode();
                    txtInvNo.setText(Integer.toString(Icode));
                    rs = DatabaseQuery.ExecuteQuery("Select StateCode from StateMaster where StateName = '" + cmbState.getSelectedItem() + "'");
                    if (rs.next())
                    {
                        stateCode = rs.getString("StateCode");
                    }
                    String date = DatabaseQuery.GetDate(dtpInv.getDate());
                    query = "insert into InvoiceGen values (" + DatabaseQuery.CompanyCode + ", '" + DatabaseQuery.BranchCode + "', '" + date + "', '" + txtInvNo.getText() + "', '" + txtCustName.getText() + "', '" + txtCustAddr.getText() + "', " + stateCode + ", " + txtPIN.getText() + ", '" + txtMobNo.getText() + "', " + cmbCur.getSelectedIndex() + ", '" + txtRemarks.getText() + "', '" + DatabaseQuery.CreatedBy + "', '" + DatabaseQuery.CreationDate + "', '" + DatabaseQuery.CreatedBy + "', '" + DatabaseQuery.CreationDate + "')";
                    rowCount = DatabaseQuery.ExecuteUpdate(query);
                    JOptionPane.showMessageDialog(null, "Invoice Code " + txtInvNo.getText() + " is created");
                    ClearForm();
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, "In Save Button");
                    e.printStackTrace();
                }
            }
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        ClearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        ClearForm();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try
        {
            query = null;
            query = "Delete from InvoiceGen where InvoiceNo = " + txtInvNo.getText() + "";
            rowCount = DatabaseQuery.ExecuteUpdate(query);
            JOptionPane.showMessageDialog(null, "Invoice No " + txtInvNo.getText() + " is Deleted");
        }
        catch (Exception e)
        {}
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        query = null;
        String stateCode = null;
        try
        {
            rs = DatabaseQuery.ExecuteQuery("Select StateCode from StateMaster where StateName = '" + cmbState.getSelectedItem() + "'");
            if (rs.next())
            {
                stateCode = rs.getString("StateCode");
            }
            query = "update InvoiceGen set " +
                    "InvoiceDate = '" + DatabaseQuery.GetDate(dtpInv.getDate()) + "', " +
                    "CustName = '" + txtCustName.getText() + "', " +
                    "CustAddress = '" + txtCustAddr.getText() + "', " +
                    "State = " + stateCode + ", " +
                    "Pin = " + txtPIN.getText() + ", " +
                    "MobileNo = '" + txtMobNo.getText() + "', " +
                    "CurrencyType = " + cmbCur.getSelectedIndex() + ", " +
                    "Remarks = '" + txtRemarks.getText() + "' " +
                    "Where InvoiceNo = " + txtInvNo.getText() + "";
            rowCount = DatabaseQuery.ExecuteUpdate(query);
            JOptionPane.showMessageDialog(null, "Invoice No. " + txtInvNo.getText() + " is updated");
            ClearForm();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cmbStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStateActionPerformed

    private void ClearForm()
    {
        txtInvNo.setText("");
        txtCustName.setText("");
        txtCustAddr.setText("");
        cmbState.setSelectedIndex(-1);
        txtPIN.setText("");
        txtMobNo.setText("");
        txtRemarks.setText("");
        cmbCur.setSelectedIndex(-1);
        dtpInv.setDate(new Date());
    }
    
    private void FieldVerification()
    {
    }
    
    private int AutoGenInvoiceCode() throws SQLException
    {
        int InvoiceCode = 0;
        try
        {
            query = "select isnull(max(InvoiceNo), 0) ICode from InvoiceGen";
            rs = DatabaseQuery.ExecuteQuery(query);
            if (rs.next())
            {
                if (rs.getInt("ICode") == 0)
                {
                    InvoiceCode = 1;
                }
                else
                {
                    InvoiceCode = rs.getInt("ICode") + 1;
                }
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "In AutoGenInvoiceCode");
        }
        finally
        {
            return InvoiceCode;
        }
    }
            
/*    public static void main(String args[]) throws SQLException {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        
        // User Code
        //DatabaseQuery.GetConnection();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Invoice().setVisible(true);
            }
        });
    }
*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbCur;
    private javax.swing.JComboBox cmbState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCustAddr;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtInvNo;
    private javax.swing.JTextField txtMobNo;
    private javax.swing.JTextField txtPIN;
    private javax.swing.JTextArea txtRemarks;
    // End of variables declaration//GEN-END:variables
}
