import javax.swing.JTable;
import java.sql.*;
import Main.ConnectionProvider;
import net.proteanit.sql.DbUtils;
public class CustomerDetails extends javax.swing.JFrame {

    
    public CustomerDetails() {
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        printBtn = new javax.swing.JButton();
        closeLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/customer Details.png"))); // NOI18N
        jLabel1.setText("Customer Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 16, 380, 71));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 93, 765, 10));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 32, 69, 43));

        table.setAutoCreateRowSorter(true);
        table.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        table.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.setPreferredSize(new java.awt.Dimension(300, 175));
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(0, 0, 0));
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 150, 1210, 333));

        printBtn.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        printBtn.setText("Print");
        printBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });
        getContentPane().add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 565, 159, 62));

        closeLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        closeLabel.setText("X");
        getContentPane().add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1327, 10, 30, 38));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try 
        {
            table.print(JTable.PrintMode.NORMAL);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Homepage page = new Homepage();
        page.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       try 
       {
           Connection con = ConnectionProvider.getConn();
           Statement stm = con.createStatement();
           
           ResultSet rst = stm.executeQuery("select * from Customer");
           table.setModel(DbUtils.resultSetToTableModel(rst));
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton printBtn;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    
}
