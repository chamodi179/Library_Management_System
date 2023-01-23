
import java.awt.HeadlessException;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Student extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public Student() {
        super("Login");
        initComponents();
        conn = JavaConnect.connectDb();
        random();
    }
    
    public void random(){
        Random random1 = new Random();
        studentIdBox.setText(""+random1.nextInt(1000+1));
    } 

    public void clear(){
        studentIdBox.setText("");
        nameBox.setText("");
        fathersNameBox.setText("");
        courseBox.setSelectedIndex(0);
        branchBox.setText("");
        yearBox.setSelectedIndex(0);
        semesterBox.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        studentIdBox = new javax.swing.JTextField();
        nameBox = new javax.swing.JTextField();
        fathersNameBox = new javax.swing.JTextField();
        courseBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        semesterBox = new javax.swing.JComboBox<>();
        registerBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        branchBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setPreferredSize(new java.awt.Dimension(450, 400));
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3), "New Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 450));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Student ID :");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Father's Name :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Course :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Branch :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Year :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Semester :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        studentIdBox.setEditable(false);
        studentIdBox.setToolTipText("");
        jPanel3.add(studentIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 180, -1));

        nameBox.setToolTipText("");
        jPanel3.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 180, -1));

        fathersNameBox.setToolTipText("");
        fathersNameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fathersNameBoxActionPerformed(evt);
            }
        });
        jPanel3.add(fathersNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 180, -1));

        courseBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B Tech", "BCA", "BBA", "BSC", "MBA" }));
        jPanel3.add(courseBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, -1));

        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jPanel3.add(yearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 180, -1));

        semesterBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        jPanel3.add(semesterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, -1));

        registerBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\register.png")); // NOI18N
        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        jPanel3.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel3.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, -1));
        jPanel3.add(branchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, -1));
        branchBox.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 410));

        setSize(new java.awt.Dimension(507, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fathersNameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fathersNameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fathersNameBoxActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Home homePage = new Home();
        homePage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {
            String sql = "INSERT INTO Student(StudentId,Name,Father,Course,Branch,Year,Semester) Values(?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, studentIdBox.getText());
            pst.setString(2, nameBox.getText());
            pst.setString(3, fathersNameBox.getText());
            pst.setString(4, courseBox.getSelectedItem().toString());
            pst.setString(5, branchBox.getText());
            pst.setString(6, yearBox.getSelectedItem().toString());
            pst.setString(7, semesterBox.getSelectedItem().toString());
            pst.execute();
            JOptionPane.showMessageDialog(null, "The new Student registered Successfully!");
            clear();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField branchBox;
    private javax.swing.JComboBox<String> courseBox;
    private javax.swing.JTextField fathersNameBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameBox;
    private javax.swing.JButton registerBtn;
    private javax.swing.JComboBox<String> semesterBox;
    private javax.swing.JTextField studentIdBox;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
