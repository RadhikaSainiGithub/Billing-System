import java.sql.*;
import Main.ConnectionProvider;
import javax.swing.JOptionPane;
public class UpdateProduct extends javax.swing.JFrame {

    
    public UpdateProduct() {
        setUndecorated(true);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        idTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        activationComboBox = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        updateBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update product.png"))); // NOI18N
        jLabel1.setText("Update Product");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 14, 361, 77));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 97, 918, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Product ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 125, 138, 47));

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 125, -1, 47));

        idTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 125, 168, 39));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 198, 918, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Product Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 236, 175, 38));

        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 226, 255, 45));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Rate");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 328, 120, 39));

        rateTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rateTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(rateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 319, 255, 48));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 411, 154, 48));

        descriptionTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descriptionTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 411, 255, 48));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Activate");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 498, 120, 49));

        activationComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activationComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        activationComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(activationComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 502, 255, 50));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 586, 918, 10));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 628, 187, 77));

        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(771, 628, 164, 77));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1333, 0, 30, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
       setVisible(false);
       new UpdateProduct().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String pid = idTextField.getText();
        String pname = nameTextField.getText();
        String rate = rateTextField.getText();
        String description = descriptionTextField.getText();
        String activate = (String)activationComboBox.getSelectedItem();
        
        try 
        {
            Connection con = ConnectionProvider.getConn();
            Statement stm = con.createStatement();
            String sql = "update products set  pName = '"+pname+"' , rate = '"+rate+"' ,description = '"+description+"' , activate = '"+activate+"' where pId='"+pid+"'";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            setVisible(false);
            new UpdateProduct().setVisible(true);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       setVisible(false);
       new Homepage().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
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
    }//GEN-LAST:event_searchBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activationComboBox;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
