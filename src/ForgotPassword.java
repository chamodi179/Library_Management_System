
import java.sql.*;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public ForgotPassword() {
        super("Forgot Password");
        initComponents();
        conn = JavaConnect.connectDb();
    }

    public void search(){
               
        try {
            String searchUserName = usernamebox.getText();
            String sql = "SELECT * FROM account WHERE Username='"+searchUserName+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                namebox.setText(rs.getString(2));
                questionbox.setText(rs.getString(4));
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect username!");
                usernamebox.setText("");
            }
            rs.close();
            pst.close();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void retrieve(){
        try {
            String searchUserName = usernamebox.getText();
            String answer = answerbox.getText();
            String sql = "SELECT * FROM account WHERE Username='"+searchUserName+"'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                String correctAnswer = rs.getString(5);
                
                if(answer.equals(correctAnswer)){
                    passwordbox.setText(rs.getString(3));
                }else{
                  JOptionPane.showMessageDialog(null, "You are wrong.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect username!");
                usernamebox.setText("");
            }
            rs.close();
            pst.close();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        questionbox = new javax.swing.JTextField();
        namebox = new javax.swing.JTextField();
        usernamebox = new javax.swing.JTextField();
        answerbox = new javax.swing.JTextField();
        passwordbox = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        retrievebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3), "Forgot Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("UserName :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Your Security Question :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Answer :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Your Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        questionbox.setEditable(false);
        jPanel1.add(questionbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, -1));

        namebox.setEditable(false);
        jPanel1.add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, -1));
        jPanel1.add(usernamebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, -1));
        jPanel1.add(answerbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 180, -1));

        passwordbox.setEditable(false);
        jPanel1.add(passwordbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, -1));

        searchbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\search.png")); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 100, -1));

        retrievebtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\retrieve.png")); // NOI18N
        retrievebtn.setText("Retrieve");
        retrievebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retrievebtnActionPerformed(evt);
            }
        });
        jPanel1.add(retrievebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 100, -1));

        backbtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 370));

        setSize(new java.awt.Dimension(506, 374));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        setVisible(false);
        Login login1 = new Login();
        login1.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        search();
    }//GEN-LAST:event_searchbtnActionPerformed

    private void retrievebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retrievebtnActionPerformed
        retrieve();
    }//GEN-LAST:event_retrievebtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerbox;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField namebox;
    private javax.swing.JTextField passwordbox;
    private javax.swing.JTextField questionbox;
    private javax.swing.JButton retrievebtn;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField usernamebox;
    // End of variables declaration//GEN-END:variables
}
