import java.sql.*;
import Main.ConnectionProvider;
import javax.swing.JOptionPane;
public class DeleteProduct extends javax.swing.JFrame {

    
    public DeleteProduct() {
        setUndecorated(true);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        crossLabel = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        deleteBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        activationComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete product.png"))); // NOI18N
        jLabel1.setText("Delete Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 14, 327, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 92, 1021, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Product ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 118, 130, 40));

        idTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 119, 203, 48));

        searchTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchTextField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchTextField.setText("Search");
        searchTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(searchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(912, 114, 167, 49));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 194, 1021, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Product Name ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 239, -1, 45));

        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 241, 272, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Rate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 343, 105, 33));

        rateTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rateTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(rateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 340, 272, 48));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 420, 142, 37));

        descriptionTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descriptionTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 420, 272, 46));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Activate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 507, 117, 38));

        crossLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        crossLabel.setText("X");
        crossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossLabelMouseClicked(evt);
            }
        });
        getContentPane().add(crossLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1329, 6, 31, 31));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 612, 1021, 10));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, 160, -1));

        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(753, 640, 172, -1));

        activationComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        activationComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(activationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 509, 272, 45));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
       setVisible(false);
       new DeleteProduct().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        String pid = idTextField.getText();
        try 
        {
            Connection con = ConnectionProvider.getConn();
            Statement stm = con.createStatement();
            ResultSet rst = stm.executeQuery("select * from products where pId = '"+pid+"'");
            if(rst.next())
            {
                nameTextField.setText(rst.getString(2));
                rateTextField.setText(rst.getString(3));
                descriptionTextField.setText(rst.getString(4));
                idTextField.setEditable(false);
            }
            else 
            {
                JOptionPane.showMessageDialog(null,"Product ID doesn't exist.");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       String pid = idTextField.getText();
       int a = JOptionPane.showConfirmDialog(null,"Do you want to delete?","select",JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           try 
           {
               Connection con = ConnectionProvider.getConn();
           Statement stm = con.createStatement();
           String sql = "delete from products where pId = '"+pid+"'";
           stm.executeUpdate(sql);
           JOptionPane.showMessageDialog(null,"Product Deleted Successfully");
           setVisible(false);
           new DeleteProduct().setVisible(true);
           
           }
           catch(Exception e)
           {
               System.out.println(e.getMessage());
                       
           }
           
       }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void crossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossLabelMouseClicked
        Homepage page = new Homepage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crossLabelMouseClicked

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
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activationComboBox;
    private javax.swing.JLabel crossLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchTextField;
    // End of variables declaration//GEN-END:variables
}
