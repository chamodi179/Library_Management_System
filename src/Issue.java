
//import java.time.LocalDate;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Issue extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public Issue() {
        super("Issue Book");
        initComponents();
        conn = JavaConnect.connectDb();
    }

    public void clear() {
        bookIdbox.setText("");
        bookNameBox.setText("");
        editionBox.setText("");
        publisherBox.setText("");
        priceBox.setText("");
        pagesBox.setText("");
        studentIdBox.setText("");
        studentNameBox.setText("");
        fathersNameBox.setText("");
        courseBox.setText("");
        branchBox.setText("");
        yearBox.setText("");
        semesterBox.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        publisherBox = new javax.swing.JTextField();
        bookIdbox = new javax.swing.JTextField();
        bookNameBox = new javax.swing.JTextField();
        editionBox = new javax.swing.JTextField();
        priceBox = new javax.swing.JTextField();
        pagesBox = new javax.swing.JTextField();
        bookDetailsSearchBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fathersNameBox = new javax.swing.JTextField();
        studentDetailsSearchBtn = new javax.swing.JButton();
        studentIdBox = new javax.swing.JTextField();
        studentNameBox = new javax.swing.JTextField();
        courseBox = new javax.swing.JTextField();
        branchBox = new javax.swing.JTextField();
        yearBox = new javax.swing.JTextField();
        semesterBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        issueBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        issueDateBox = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3), "Book Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Book ID :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Edition :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Publisher :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Price :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Pages :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        publisherBox.setEditable(false);
        jPanel2.add(publisherBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, -1));

        bookIdbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdboxActionPerformed(evt);
            }
        });
        jPanel2.add(bookIdbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 150, -1));

        bookNameBox.setEditable(false);
        jPanel2.add(bookNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, -1));

        editionBox.setEditable(false);
        editionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editionBoxActionPerformed(evt);
            }
        });
        jPanel2.add(editionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 150, -1));

        priceBox.setEditable(false);
        jPanel2.add(priceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 150, -1));

        pagesBox.setEditable(false);
        jPanel2.add(pagesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 150, -1));

        bookDetailsSearchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\search.png")); // NOI18N
        bookDetailsSearchBtn.setText("Search");
        bookDetailsSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookDetailsSearchBtnActionPerformed(evt);
            }
        });
        jPanel2.add(bookDetailsSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 350, 350));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3), "Student Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Student ID :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Name :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Father's Name: ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Course :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Branch :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Year :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Semester :");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        fathersNameBox.setEditable(false);
        jPanel3.add(fathersNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 150, -1));

        studentDetailsSearchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\search.png")); // NOI18N
        studentDetailsSearchBtn.setText("Search");
        studentDetailsSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDetailsSearchBtnActionPerformed(evt);
            }
        });
        jPanel3.add(studentDetailsSearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, -1, -1));
        jPanel3.add(studentIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 150, -1));

        studentNameBox.setEditable(false);
        jPanel3.add(studentNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, -1));

        courseBox.setEditable(false);
        jPanel3.add(courseBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 150, -1));

        branchBox.setEditable(false);
        jPanel3.add(branchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 150, -1));

        yearBox.setEditable(false);
        jPanel3.add(yearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 150, -1));

        semesterBox.setEditable(false);
        jPanel3.add(semesterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 150, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 380, 350));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Date of Issue :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        issueBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\issue book2.png")); // NOI18N
        issueBtn.setText("Issue");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        jPanel1.add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, -1, -1));

        issueDateBox.setDateFormatString("yyyy-mm-dd");
        jPanel1.add(issueDateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        setSize(new java.awt.Dimension(795, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        String sql = "INSERT INTO Issue (BookId,BookName,Edition,Publisher,Price,Pages,StudentId,StudentName,FathersName,Course,Branch,Year,Semester,issueDate)"
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, bookIdbox.getText());
            pst.setString(2, bookNameBox.getText());
            pst.setString(3, editionBox.getText());
            pst.setString(4, publisherBox.getText());
            pst.setString(5, priceBox.getText());
            pst.setString(6, pagesBox.getText());
            pst.setString(7, studentIdBox.getText());
            pst.setString(8, studentNameBox.getText());
            pst.setString(9, fathersNameBox.getText());
            pst.setString(10, courseBox.getText());
            pst.setString(11, branchBox.getText());
            pst.setString(12, yearBox.getText());
            pst.setString(13, semesterBox.getText());
            pst.setString(14, ((JTextField)issueDateBox.getDateEditor().getUiComponent()).getText());
            pst.execute();

            JOptionPane.showMessageDialog(null, "A book issued.");
            clear();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_issueBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Home homePage = new Home();
        homePage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void bookDetailsSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookDetailsSearchBtnActionPerformed
        try {
            String sql = "SELECT * FROM Book WHERE bookId=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, bookIdbox.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String bookName = rs.getString("Name");
                bookNameBox.setText(bookName);
                String Edition = rs.getString("Edition");
                editionBox.setText(Edition);
                String Publisher = rs.getString("Publisher");
                publisherBox.setText(Publisher);
                var Price = rs.getString("Price");
                priceBox.setText(Price);
                String Pages = rs.getString("Pages");
                pagesBox.setText(Pages);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_bookDetailsSearchBtnActionPerformed

    private void editionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editionBoxActionPerformed

    private void bookIdboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdboxActionPerformed

    private void studentDetailsSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDetailsSearchBtnActionPerformed
        try {
            String sql = "SELECT * FROM Student WHERE studentId=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, studentIdBox.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                String studentName = rs.getString("Name");
                studentNameBox.setText(studentName);
                String Father = rs.getString("Father");
                fathersNameBox.setText(Father);
                String course = rs.getString("Course");
                courseBox.setText(course);
                var branch = rs.getString("Branch");
                branchBox.setText(branch);
                String year = rs.getString("Year");
                yearBox.setText(year);
                String semester = rs.getString("Semester");
                semesterBox.setText(semester);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_studentDetailsSearchBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookDetailsSearchBtn;
    private javax.swing.JTextField bookIdbox;
    private javax.swing.JTextField bookNameBox;
    private javax.swing.JTextField branchBox;
    private javax.swing.JTextField courseBox;
    private javax.swing.JTextField editionBox;
    private javax.swing.JTextField fathersNameBox;
    private javax.swing.JButton issueBtn;
    private com.toedter.calendar.JDateChooser issueDateBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField pagesBox;
    private javax.swing.JTextField priceBox;
    private javax.swing.JTextField publisherBox;
    private javax.swing.JTextField semesterBox;
    private javax.swing.JButton studentDetailsSearchBtn;
    private javax.swing.JTextField studentIdBox;
    private javax.swing.JTextField studentNameBox;
    private javax.swing.JTextField yearBox;
    // End of variables declaration//GEN-END:variables
}
