
import java.sql.*;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public SignUp() {
        super("Login");
        initComponents();
        conn = JavaConnect.connectDb();
    }

    public void clear(){
        usernameBox.setText("");
        namebox.setText("");
        passwordbox.setText("");
        questionbox.setSelectedIndex(0);
        answerbox.setText("");
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        questionbox = new javax.swing.JComboBox<>();
        usernameBox = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        answerbox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JPasswordField();
        createbtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3), "New Account", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(480, 360));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("UserName :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Security Question :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Answer :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        questionbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "What is your mother toungue?", "What is your nick name?", "What is your first childhood friend?", "What is school name?" }));
        jPanel1.add(questionbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 220, -1));
        jPanel1.add(usernameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 220, -1));

        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });
        jPanel1.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 220, -1));
        jPanel1.add(answerbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 180, -1));
        jPanel1.add(passwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 220, -1));

        createbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\create.png")); // NOI18N
        createbtn.setText("Create");
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });
        jPanel1.add(createbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 360));

        setSize(new java.awt.Dimension(514, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameboxActionPerformed

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        try {
            String sql = "INSERT INTO Account (Username, Name, Password, Sec_Q, Answer) VALUES(?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, usernameBox.getText());
            pst.setString(2, namebox.getText());
            pst.setString(3, passwordbox.getText());
            pst.setString(4, questionbox.getSelectedItem().toString());
            pst.setString(5, answerbox.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Account Created Successfully!");
            clear();
//            rs.close();
            pst.close();
                        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_createbtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Login login1 = new Login();
        login1.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerbox;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namebox;
    private javax.swing.JPasswordField passwordbox;
    private javax.swing.JComboBox<String> questionbox;
    private javax.swing.JTextField usernameBox;
    // End of variables declaration//GEN-END:variables
}
