
import java.sql.*;
import Main.ConnectionProvider;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.JOptionPane;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import javax.swing.table.DefaultTableModel;

public class Billing extends javax.swing.JFrame {

    public int finalTotal = 0;
    public Billing() {
        setUndecorated(true);
        initComponents();
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel5.setText(dFormat.format(date));
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        jLabel6.setText(dtf.format(now));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        crossLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bNumberTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pNameTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        rateTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        descriptionTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        qtyTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        addBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        paidAmtTextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        returnAmtTextField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing.png"))); // NOI18N
        jLabel1.setText("Billing");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 6, 247, 81));

        crossLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        crossLabel.setText("X");
        crossLabel.setPreferredSize(new java.awt.Dimension(15, 48));
        crossLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crossLabelMouseClicked(evt);
            }
        });
        getContentPane().add(crossLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1316, 6, 30, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 21, 83, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Time :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 74, 70, 31));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 100, 27));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 110, 20));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, 1350, 11));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Customer Details :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 144, 210, 29));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 199, 68, 27));

        bNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        bNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 201, 134, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Conatct No :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 199, 97, 27));

        bNumberTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bNumberTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        bNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNumberTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 199, 152, 28));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 199, 65, 27));

        mailTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mailTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(mailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 199, 166, 28));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Address :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1025, 199, 77, 27));

        addressTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addressTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(addressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1139, 199, 200, 27));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, 1350, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Product Details :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 281, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Product ID :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 32));

        idTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 110, 33));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Product Name :");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 115, 32));

        pNameTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pNameTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        pNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 144, 32));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Rate :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 341, 68, 32));

        rateTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rateTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(rateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 342, 117, 32));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Description :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 350, -1, -1));

        descriptionTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descriptionTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(descriptionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1119, 342, 217, 32));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Quantity :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 72, 32));

        qtyTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qtyTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(qtyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 340, 110, 32));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 440, 1360, 11));

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1194, 387, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Rate", "Qunatity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setRowHeight(30);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 469, 727, 244));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Calculation Details : ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 484, 248, 26));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Total :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 543, 97, -1));

        totalTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        totalTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(totalTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 542, 167, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Paid Amount :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 602, -1, -1));

        paidAmtTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        paidAmtTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        paidAmtTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidAmtTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(paidAmtTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 601, 167, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Return Amount :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 664, -1, -1));

        returnAmtTextField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        returnAmtTextField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        getContentPane().add(returnAmtTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 663, 167, -1));

        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        saveBtn.setText("Save");
        saveBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 528, 81, 47));

        resetBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(102, 102, 102)));
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 633, 90, 53));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BG.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        jLabel23.setText("jLabel23");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNameTextFieldActionPerformed
       String name = bNameTextField.getText();
       try 
       {
           Connection con = ConnectionProvider.getConn();
           Statement stm = con.createStatement();
           ResultSet rst = stm.executeQuery("select * from Customer where Name like '"+name+"%'");
           if(rst.next())
           {
               bNameTextField.setText(rst.getString(1));
               bNumberTextField.setText(rst.getString(2));
               mailTextField.setText(rst.getString(3));
               addressTextField.setText(rst.getString(4));
           }
           else 
           {
               
               bNumberTextField.setText("");
               mailTextField.setText("");
               addressTextField.setText("");
           }
       
                   
       }
       
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_bNameTextFieldActionPerformed

    private void bNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNumberTextFieldActionPerformed
        // TODO add your handling code here:
        String number = bNumberTextField.getText();
       try 
       {
           Connection con = ConnectionProvider.getConn();
           Statement stm = con.createStatement();
           ResultSet rst = stm.executeQuery("select * from Customer where Contact like '"+number+"%'");
           if(rst.next())
           {
               bNumberTextField.setText(rst.getString(2));
               bNameTextField.setText(rst.getString(1));
               mailTextField.setText(rst.getString(3));
               addressTextField.setText(rst.getString(4));
           }
           else 
           {
               
               bNameTextField.setText("");
               mailTextField.setText("");
               addressTextField.setText("");
           }
       
                   
       }
       
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_bNumberTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
       String pid = idTextField.getText();
       try 
       {
           Connection con = ConnectionProvider.getConn();
           Statement stm = con.createStatement();
           ResultSet rst = stm.executeQuery("select * from products where pId = '"+pid+"%'");
           if(rst.next())
           {
               
               pNameTextField.setText(rst.getString(2));
               rateTextField.setText(rst.getString(3));
               qtyTextField.setText("1");
               descriptionTextField.setText(rst.getString(4));
           }
           else 
           {
               pNameTextField.setText("");
               rateTextField.setText("");
               qtyTextField.setText("");
               descriptionTextField.setText("");
           }
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int price = Integer.parseInt(rateTextField.getText());
        int quantity = Integer.parseInt(qtyTextField.getText());
        int total = price * quantity;
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(new Object[]{pNameTextField.getText(),descriptionTextField.getText(),price,quantity,total});
        finalTotal = finalTotal+total;
        String finalTotal1 = String.valueOf(finalTotal);
        totalTextField.setText(finalTotal1);
    
    }//GEN-LAST:event_addBtnActionPerformed

    private void paidAmtTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidAmtTextFieldActionPerformed
       String paidamount = paidAmtTextField.getText();
       int z = Integer.parseInt(paidamount);
       finalTotal = z - finalTotal;
       String finalTotal1 = String.valueOf(finalTotal);
       returnAmtTextField.setText(finalTotal1);
       returnAmtTextField.setEditable(false);
    }//GEN-LAST:event_paidAmtTextFieldActionPerformed

    private void crossLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crossLabelMouseClicked
        Homepage page = new Homepage();
        page.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crossLabelMouseClicked

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        setVisible(false);
        new Billing().setVisible(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
      String name = bNameTextField.getText();
      String number = bNumberTextField.getText();
      String mail = mailTextField.getText();
      String address = addressTextField.getText();
      String path = "C:\\Users\\radhi\\Documents";
      com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
      try 
      {
          PdfWriter.getInstance(doc,new FileOutputStream(path+""+name+" "+jLabel5.getText()+".pdf"));
          doc.open();
          Paragraph paragraph1 = new Paragraph("                                                        Friendly Foodmart\n\n\n");
          doc.add(paragraph1);
          Paragraph paragraph2 = new Paragraph("Date : "+jLabel5.getText()+"\n\n Time : "+jLabel6.getText()+"\n\n Buyer Details:\n Name : "+name+"\nContact Number : "+number+"\nAddress : "+address+"\nEmail : "+mail+"\n\n\n");
          
          doc.add(paragraph2);
          PdfPTable tb1 = new PdfPTable(5);
          tb1.addCell("Name");
          tb1.addCell("Description");
          tb1.addCell("Rate");
          tb1.addCell("Quantity");
          tb1.addCell("Sub Total");
          
          for(int i=0;i<table.getRowCount();i++)
          {
              String n = table.getValueAt(i, 0).toString();
              String d = table.getValueAt(i, 1).toString();
              String r = table.getValueAt(i, 2).toString();
              String q = table.getValueAt(i, 3).toString(); 
              String st = table.getValueAt(i, 4).toString();
              tb1.addCell(n);
              tb1.addCell(d);
              tb1.addCell(r);
              tb1.addCell(q);
              tb1.addCell(st);
          }
          doc.add(tb1);
          Paragraph paragraph3 = new Paragraph("\nTotal : "+totalTextField.getText()+"\nPaid Amount : "+paidAmtTextField.getText()+"\nReturn Amount : "+returnAmtTextField.getText()+"\n\nThanks for Visiting ! Please Come Again");
          doc.add(paragraph3);
          JOptionPane.showMessageDialog(null,"Bill Generated");
          setVisible(true);
          new Billing().setVisible(true);
      }
      catch(Exception e)
      {
          System.out.println(e.getMessage());
      }
      
      doc.close();
      
    }//GEN-LAST:event_saveBtnActionPerformed

    private void pNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameTextFieldActionPerformed
        String name = pNameTextField.getText();
       try 
       {
           Connection con = ConnectionProvider.getConn();
           Statement stm = con.createStatement();
           ResultSet rst = stm.executeQuery("select * from products where pName like '"+name+"%'");
           if(rst.next())
           {
               
               idTextField.setText(rst.getString(1));
               rateTextField.setText(rst.getString(3));
               qtyTextField.setText("1");
               descriptionTextField.setText(rst.getString(4));
           }
           else 
           {
               
               idTextField.setText("");
               rateTextField.setText("");
               qtyTextField.setText("");
               descriptionTextField.setText(rst.getString(4));
           }
       
                   
       }
       
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
      
    }//GEN-LAST:event_pNameTextFieldActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JTextField bNameTextField;
    private javax.swing.JTextField bNumberTextField;
    private javax.swing.JLabel crossLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JTextField pNameTextField;
    private javax.swing.JTextField paidAmtTextField;
    private javax.swing.JTextField qtyTextField;
    private javax.swing.JTextField rateTextField;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField returnAmtTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable table;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables
}
