package login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import login.erpRecord;
import login.Register_page;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mithun Kumar
 */
public class Register_page extends javax.swing.JFrame {

    /**
     * Creates new form Register_page
     */
//    int std_id=0;
//    public Register_page(int sid) { 
//        std_id = sid;
//        if(std_id != 0)
//        {
//           initComponents();
//           stdId.setText("Login with: "+std_id);
   
//        }
    public Register_page() {
        initComponents();
    }
    public void reset()
    {
        stdName.setText("");
        stdUname.setText("");
        stdCbox.setSelectedItem("selected");
        rgField.setSelectedItem("selected");
        stdMobile.setText("");
        stdPass.setText("");
        stdCpass.setText("");
        stdEmail.setText("");
//        register_phone.setText("");
//        register_address.setText("");
//        register_zip.setText("");
//        register_country.setSelectedIndex(0);
               
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stdName = new javax.swing.JTextField();
        stdUname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stdMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stdPass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        stdCpass = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rgField = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stdCbox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        stdEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(29, 208, 208));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("                     Register for Students and teachetr");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 554, 25));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 95, -1, -1));

        stdName.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        stdName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(stdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 115, 321, 22));

        stdUname.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        stdUname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stdUname.setName("rftgyhjmk"); // NOI18N
        stdUname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdUnameActionPerformed(evt);
            }
        });
        jPanel2.add(stdUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 168, 321, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel3.setText("Username  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 148, -1, -1));

        stdMobile.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        stdMobile.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stdMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdMobileActionPerformed(evt);
            }
        });
        jPanel2.add(stdMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 304, 321, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel4.setText("Mobile :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 284, -1, -1));

        stdPass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        stdPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(stdPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 404, 321, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("Password  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 384, -1, -1));

        stdCpass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        stdCpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(stdCpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 455, 317, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Confirm Password  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Gender :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Register For :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 325, -1, -1));

        rgField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  "Student", "Teacher" }));
        rgField.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.add(rgField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 345, 168, -1));

        btnRegister.setBackground(new java.awt.Color(255, 0, 102));
        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRegister.setText("Submit");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 496, 317, 32));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 67, 397, 10));

        jLabel11.setText("Already have an account? ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 539, -1, -1));

        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText(" Login");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 539, 42, -1));

        stdCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        jPanel2.add(stdCbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 160, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Email Id  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        stdEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        stdEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        stdEmail.setName("rftgyhjmk"); // NOI18N
        stdEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdEmailActionPerformed(evt);
            }
        });
        jPanel2.add(stdEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 321, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 61, -1, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stdUnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdUnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdUnameActionPerformed

    private void stdMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdMobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdMobileActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        
        String p_name = stdName.getText();
        String p_uname = stdUname.getText();
        String p_email = stdEmail.getText();
        
        String p_gender = stdCbox.getItemAt(stdCbox.getSelectedIndex());
        String p_mobile = stdMobile.getText();
        String p_rg = rgField.getItemAt(rgField.getSelectedIndex());
        String p_pass = stdPass.getText();
        String p_cpass = stdCpass.getText();
        
       int i =  erpRecord.setAllDetails(p_name,p_uname,p_email,p_gender,p_mobile,p_rg,p_pass,p_cpass);
       if(i==1)
       {
           JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
       }
       else
       {
           JOptionPane.showMessageDialog(this, "Data not inserted");
       }
        
        reset();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        login_page lg = new login_page();
        lg.setVisible(true);
        lg.pack();
        lg.setLocationRelativeTo(null);
        lg.setDefaultCloseOperation(Register_page.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void stdEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stdEmailActionPerformed

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
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> rgField;
    private javax.swing.JComboBox<String> stdCbox;
    private javax.swing.JTextField stdCpass;
    private javax.swing.JTextField stdEmail;
    private javax.swing.JTextField stdMobile;
    private javax.swing.JTextField stdName;
    private javax.swing.JTextField stdPass;
    private javax.swing.JTextField stdUname;
    // End of variables declaration//GEN-END:variables
}
