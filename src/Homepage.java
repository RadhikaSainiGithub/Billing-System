
import javax.swing.JOptionPane;



public class Homepage extends javax.swing.JFrame {

    public int z=0;
    public Homepage() {
        setUndecorated(true);
        initComponents();
        customerbtn.setVisible(false);
        updatecustomerbtn.setVisible(false);
        customerdetailsBtn.setVisible(false);
        deletecustomerrButton.setVisible(false);
        addproductBtn.setVisible(false);
        updateproductBtn.setVisible(false);
        productdetailsBtn.setVisible(false);
        deleteproductBtn.setVisible(false);
        billingBtn.setVisible(false);
        logoutBtn.setVisible(false);
        closeBtn.setVisible(false);
        
        addcustomerLabel.setVisible(false);
        updatecustomerLabel.setVisible(false);
        customerdetailsLabel.setVisible(false);
        deletecustomerLabel.setVisible(false);
        addproductLabel.setVisible(false);
        updateproductLabel.setVisible(false);
        productdetailsLabel.setVisible(false);
        deleteproductLabel.setVisible(false);
        billingLabel.setVisible(false);
        logoutLabel.setVisible(false);
        closeLabel.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controlBtn = new javax.swing.JButton();
        customerbtn = new javax.swing.JButton();
        updatecustomerbtn = new javax.swing.JButton();
        customerdetailsBtn = new javax.swing.JButton();
        deletecustomerrButton = new javax.swing.JButton();
        addproductBtn = new javax.swing.JButton();
        updateproductBtn = new javax.swing.JButton();
        productdetailsBtn = new javax.swing.JButton();
        deleteproductBtn = new javax.swing.JButton();
        billingBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        addcustomerLabel = new javax.swing.JLabel();
        updatecustomerLabel = new javax.swing.JLabel();
        customerdetailsLabel = new javax.swing.JLabel();
        deletecustomerLabel = new javax.swing.JLabel();
        addproductLabel = new javax.swing.JLabel();
        updateproductLabel = new javax.swing.JLabel();
        productdetailsLabel = new javax.swing.JLabel();
        deleteproductLabel = new javax.swing.JLabel();
        billingLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        controlBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/control hide and show.png"))); // NOI18N
        controlBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                controlBtnMouseClicked(evt);
            }
        });
        controlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlBtnActionPerformed(evt);
            }
        });
        getContentPane().add(controlBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, 98));

        customerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add customer.png"))); // NOI18N
        customerbtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customerbtnComponentShown(evt);
            }
        });
        customerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(customerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 88, 98));

        updatecustomerbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update customer.png"))); // NOI18N
        updatecustomerbtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updatecustomerbtnComponentShown(evt);
            }
        });
        updatecustomerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatecustomerbtnActionPerformed(evt);
            }
        });
        getContentPane().add(updatecustomerbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 94, 98));

        customerdetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer Details.png"))); // NOI18N
        customerdetailsBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                customerdetailsBtnComponentShown(evt);
            }
        });
        customerdetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdetailsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(customerdetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 99, 98));

        deletecustomerrButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete customer.png"))); // NOI18N
        deletecustomerrButton.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deletecustomerrButtonComponentShown(evt);
            }
        });
        deletecustomerrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletecustomerrButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deletecustomerrButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 103, 98));

        addproductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add product.png"))); // NOI18N
        addproductBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                addproductBtnComponentShown(evt);
            }
        });
        addproductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addproductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 107, 98));

        updateproductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update product.png"))); // NOI18N
        updateproductBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateproductBtnComponentShown(evt);
            }
        });
        updateproductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateproductBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateproductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 109, 98));

        productdetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/details product.png"))); // NOI18N
        productdetailsBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                productdetailsBtnComponentShown(evt);
            }
        });
        productdetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productdetailsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(productdetailsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 102, 98));

        deleteproductBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete product.png"))); // NOI18N
        deleteproductBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deleteproductBtnComponentShown(evt);
            }
        });
        deleteproductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteproductBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteproductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 107, 98));

        billingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing.png"))); // NOI18N
        billingBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                billingBtnComponentShown(evt);
            }
        });
        billingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingBtnActionPerformed(evt);
            }
        });
        getContentPane().add(billingBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1068, 16, 76, 98));

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        logoutBtn.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logoutBtnComponentShown(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1162, 16, 74, 98));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1254, 16, 91, 98));

        addcustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addcustomerLabel.setForeground(new java.awt.Color(255, 255, 255));
        addcustomerLabel.setText("Add Customer");
        getContentPane().add(addcustomerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 24));

        updatecustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatecustomerLabel.setForeground(new java.awt.Color(255, 255, 255));
        updatecustomerLabel.setText("Update Customer");
        getContentPane().add(updatecustomerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 120, 30));

        customerdetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        customerdetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        customerdetailsLabel.setText("Customer Details");
        getContentPane().add(customerdetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 30));

        deletecustomerLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletecustomerLabel.setForeground(new java.awt.Color(255, 255, 255));
        deletecustomerLabel.setText("Delete Customer");
        getContentPane().add(deletecustomerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, 30));

        addproductLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addproductLabel.setForeground(new java.awt.Color(255, 255, 255));
        addproductLabel.setText("Add Product");
        getContentPane().add(addproductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 100, 30));

        updateproductLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateproductLabel.setForeground(new java.awt.Color(255, 255, 255));
        updateproductLabel.setText("Update Product");
        getContentPane().add(updateproductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 109, 30));

        productdetailsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        productdetailsLabel.setForeground(new java.awt.Color(255, 255, 255));
        productdetailsLabel.setText("Product Details");
        getContentPane().add(productdetailsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(829, 134, -1, -1));

        deleteproductLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteproductLabel.setForeground(new java.awt.Color(255, 255, 255));
        deleteproductLabel.setText("Delete Product");
        getContentPane().add(deleteproductLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 134, 105, -1));

        billingLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        billingLabel.setForeground(new java.awt.Color(255, 255, 255));
        billingLabel.setText("Billing");
        getContentPane().add(billingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 132, 60, 24));

        logoutLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutLabel.setText("Log Out");
        getContentPane().add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 132, 70, 24));

        closeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(255, 255, 255));
        closeLabel.setText("Close");
        getContentPane().add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1275, 134, 61, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background2.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1380, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do You really want to logout ? ","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do You really want to Close ? ","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeBtnActionPerformed

    private void controlBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlBtnMouseClicked
        if(z==0)
        {
            try
            {
                Thread.sleep(250);
                customerbtn.setVisible(true);
                addcustomerLabel.setVisible(true);
            }
            catch(Exception ex)
            {
                
            }
        }
        else 
        {
            customerbtn.setVisible(false);
        updatecustomerbtn.setVisible(false);
        customerdetailsBtn.setVisible(false);
        deletecustomerrButton.setVisible(false);
        addproductBtn.setVisible(false);
        updateproductBtn.setVisible(false);
        productdetailsBtn.setVisible(false);
        deleteproductBtn.setVisible(false);
        billingBtn.setVisible(false);
        logoutBtn.setVisible(false);
        closeBtn.setVisible(false);
        
        addcustomerLabel.setVisible(false);
        updatecustomerLabel.setVisible(false);
        customerdetailsLabel.setVisible(false);
        deletecustomerLabel.setVisible(false);
        addproductLabel.setVisible(false);
        updateproductLabel.setVisible(false);
        productdetailsLabel.setVisible(false);
        deleteproductLabel.setVisible(false);
        billingLabel.setVisible(false);
        logoutLabel.setVisible(false);
        closeLabel.setVisible(false);
        z=0;
        }
    }//GEN-LAST:event_controlBtnMouseClicked

    private void customerbtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customerbtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                updatecustomerbtn.setVisible(true);
                updatecustomerLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_customerbtnComponentShown

    private void updatecustomerbtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updatecustomerbtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                customerdetailsBtn.setVisible(true);
                customerdetailsLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_updatecustomerbtnComponentShown

    private void customerdetailsBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_customerdetailsBtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                deletecustomerrButton.setVisible(true);
                deletecustomerLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_customerdetailsBtnComponentShown

    private void deletecustomerrButtonComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deletecustomerrButtonComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                addproductBtn.setVisible(true);
                addproductLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_deletecustomerrButtonComponentShown

    private void addproductBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_addproductBtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                updateproductBtn.setVisible(true);
                updateproductLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_addproductBtnComponentShown

    private void updateproductBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateproductBtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                productdetailsBtn.setVisible(true);
                productdetailsLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_updateproductBtnComponentShown

    private void productdetailsBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_productdetailsBtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                deleteproductBtn.setVisible(true);
                deleteproductLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_productdetailsBtnComponentShown

    private void deleteproductBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteproductBtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                billingBtn.setVisible(true);
                billingLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_deleteproductBtnComponentShown

    private void billingBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_billingBtnComponentShown
        // TODO add your handling code here:
        try
            {
                Thread.sleep(250);
                logoutBtn.setVisible(true);
                logoutLabel.setVisible(true);
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_billingBtnComponentShown

    private void logoutBtnComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logoutBtnComponentShown
       try
            {
                Thread.sleep(250);
                closeBtn.setVisible(true);
                closeLabel.setVisible(true);
                z=1;
            }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_logoutBtnComponentShown

    private void customerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerbtnActionPerformed
      new addCustomer().setVisible(true);
    }//GEN-LAST:event_customerbtnActionPerformed

    private void controlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_controlBtnActionPerformed

    private void updatecustomerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatecustomerbtnActionPerformed
        new updateCustomer().setVisible(true);
    }//GEN-LAST:event_updatecustomerbtnActionPerformed

    private void customerdetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdetailsBtnActionPerformed
        new CustomerDetails().setVisible(true);
    }//GEN-LAST:event_customerdetailsBtnActionPerformed

    private void deletecustomerrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletecustomerrButtonActionPerformed
       new DeleteCustomer().setVisible(true);
    }//GEN-LAST:event_deletecustomerrButtonActionPerformed

    private void addproductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductBtnActionPerformed
      new AddProduct().setVisible(true);
    }//GEN-LAST:event_addproductBtnActionPerformed

    private void updateproductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateproductBtnActionPerformed
        new UpdateProduct().setVisible(true);
    }//GEN-LAST:event_updateproductBtnActionPerformed

    private void productdetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productdetailsBtnActionPerformed
      new ProductDetails().setVisible(true);
    }//GEN-LAST:event_productdetailsBtnActionPerformed

    private void deleteproductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteproductBtnActionPerformed
        new DeleteProduct().setVisible(true);
    }//GEN-LAST:event_deleteproductBtnActionPerformed

    private void billingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingBtnActionPerformed
        new Billing().setVisible(true);
    }//GEN-LAST:event_billingBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addcustomerLabel;
    private javax.swing.JButton addproductBtn;
    private javax.swing.JLabel addproductLabel;
    private javax.swing.JButton billingBtn;
    private javax.swing.JLabel billingLabel;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel closeLabel;
    private javax.swing.JButton controlBtn;
    private javax.swing.JButton customerbtn;
    private javax.swing.JButton customerdetailsBtn;
    private javax.swing.JLabel customerdetailsLabel;
    private javax.swing.JLabel deletecustomerLabel;
    private javax.swing.JButton deletecustomerrButton;
    private javax.swing.JButton deleteproductBtn;
    private javax.swing.JLabel deleteproductLabel;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JButton productdetailsBtn;
    private javax.swing.JLabel productdetailsLabel;
    private javax.swing.JLabel updatecustomerLabel;
    private javax.swing.JButton updatecustomerbtn;
    private javax.swing.JButton updateproductBtn;
    private javax.swing.JLabel updateproductLabel;
    // End of variables declaration//GEN-END:variables
}
