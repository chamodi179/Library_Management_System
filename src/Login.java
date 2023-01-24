import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Login extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public Login() {
        super("Login");
        initComponents();
        conn = JavaConnect.connectDb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernamebox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        signupbtn = new javax.swing.JButton();
        fpasswordbtn = new javax.swing.JButton();
        troublelogin = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 350));
        setPreferredSize(new java.awt.Dimension(400, 350));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("UserName :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        usernamebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameboxActionPerformed(evt);
            }
        });
        jPanel1.add(usernamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 170, -1));

        passwordbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordboxActionPerformed(evt);
            }
        });
        jPanel1.add(passwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, -1));

        loginbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\login.png")); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        signupbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\signup.png")); // NOI18N
        signupbtn.setText("SignUp");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });
        jPanel1.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        fpasswordbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\forgotPassword.png")); // NOI18N
        fpasswordbtn.setText("Forgot Password");
        fpasswordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fpasswordbtnActionPerformed(evt);
            }
        });
        jPanel1.add(fpasswordbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        troublelogin.setForeground(new java.awt.Color(255, 0, 0));
        troublelogin.setText("Trouble Login.....!");
        jPanel1.add(troublelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\lock.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 20));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\key.png")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setSize(new java.awt.Dimension(416, 308));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameboxActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        try {
            String sql = "SELECT * FROM account WHERE Username=? AND Password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, usernamebox.getText());
            pst.setString(2, passwordbox.getText());
            rs = pst.executeQuery();
            
            if(rs.next()){
                rs.close();
                pst.close();
                
                setVisible(false);
                Loading loadingPage = new Loading();
                loadingPage.setUpLoading();
                loadingPage.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
            }
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        setVisible(false);
        SignUp signUp1 = new SignUp();
        signUp1.setVisible(true);
    }//GEN-LAST:event_signupbtnActionPerformed

    private void passwordboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordboxActionPerformed

    private void fpasswordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fpasswordbtnActionPerformed
        setVisible(false);
        ForgotPassword forgotpsw = new ForgotPassword();
        forgotpsw.setVisible(true);
    }//GEN-LAST:event_fpasswordbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fpasswordbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JButton signupbtn;
    private javax.swing.JLabel troublelogin;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables
}
