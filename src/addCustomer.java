
import java.awt.Color;
import java.sql.*;
import Main.ConnectionProvider;
import javax.swing.JOptionPane;
public class addCustomer extends javax.swing.JFrame {

   
    public addCustomer() {
        setUndecorated(true);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        numberTextField = new javax.swing.JTextField();
        addrressTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add customer.png"))); // NOI18N
        jLabel1.setText("Add Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 34, 330, 81));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Name : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 170, 91, 49));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 121, 850, 12));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Contact No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 254, 156, 52));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Address : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 336, 139, 55));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Email : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 438, 109, 54));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Gender : ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 525, 109, 45));

        nameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameTextField.setForeground(new java.awt.Color(51, 51, 51));
        nameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 170, 419, 49));

        numberTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numberTextField.setForeground(new java.awt.Color(51, 51, 51));
        numberTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        numberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numberTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numberTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(numberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 258, 419, 52));

        addrressTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addrressTextField.setForeground(new java.awt.Color(51, 51, 51));
        addrressTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        addrressTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addrressTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addrressTextFieldFocusLost(evt);
            }
        });
        addrressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrressTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(addrressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 340, 419, 55));

        emailTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(51, 51, 51));
        emailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        emailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailTextFieldFocusLost(evt);
            }
        });
        getContentPane().add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 438, 419, 54));

        genderComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genderComboBox.setForeground(new java.awt.Color(51, 51, 51));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        genderComboBox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 525, 419, 45));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 602, 870, 12));

        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        saveBtn.setText("Save ");
        saveBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 130, 80));

        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 130, 78));

        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 640, 170, 78));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel7.setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1360, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained
        if(nameTextField.getText().equals("Enter Name "))
        {
            nameTextField.setText("");
            nameTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost
        // TODO add your handling code here:
        if(nameTextField.getText().equals(""))
        {
            nameTextField.setText("Enter Name");
            nameTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void numberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberTextFieldFocusGained
        // TODO add your handling code here:
         if(numberTextField.getText().equals("Enter Contact Number "))
        {
            numberTextField.setText("");
            numberTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_numberTextFieldFocusGained

    private void numberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numberTextFieldFocusLost
        // TODO add your handling code here:
        if(numberTextField.getText().equals(""))
        {
            numberTextField.setText("Enter Contact Number");
            numberTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_numberTextFieldFocusLost

    private void addrressTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addrressTextFieldFocusGained
        // TODO add your handling code here:
         if(addrressTextField.getText().equals("Enter Address "))
        {
            addrressTextField.setText("");
            addrressTextField.setForeground(new Color(0,0,0));
        }
        
    }//GEN-LAST:event_addrressTextFieldFocusGained

    private void addrressTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addrressTextFieldFocusLost
        // TODO add your handling code here:
        if(addrressTextField.getText().equals(""))
        {
            addrressTextField.setText("Enter Address");
            addrressTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_addrressTextFieldFocusLost

    private void emailTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusGained
        // TODO add your handling code here:
        if(emailTextField.getText().equals("Enter Email "))
        {
            emailTextField.setText("");
            emailTextField.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailTextFieldFocusGained

    private void emailTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailTextFieldFocusLost
        // TODO add your handling code here:
        if(emailTextField.getText().equals(""))
        {
            emailTextField.setText("Enter Email");
            emailTextField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_emailTextFieldFocusLost

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        Homepage page = new Homepage();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        setVisible(false);
        new addCustomer().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name = nameTextField.getText();
        String contact = numberTextField.getText();
        String mail = emailTextField.getText();
        String address = addrressTextField.getText();
        String gender = (String)genderComboBox.getSelectedItem();
        
        try 
        {
            Connection con = ConnectionProvider.getConn();
            Statement stm = con.createStatement();
            String sql = "INSERT INTO Customer VALUES('"+name+"','"+contact+"','"+address+"','"+mail+"','"+gender+"')";
            stm.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Inserted Successfully");
            setVisible(false);
            new addCustomer().setVisible(true);
        }
        catch(Exception e)
        {
//            JOptionPane.showMessageDialog(null,"Mobile number is already Exist");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void addrressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrressTextFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrressTextField;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
