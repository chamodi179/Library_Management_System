
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextField;

public class Return extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public Return() {
        super("Return Book");
        initComponents();
        conn = JavaConnect.connectDb();
    }

    public void delete(){
        String sql = "delete from issue where StudentId = ?;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, studentIdBox.getText());
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void returnUpdate(){
        String sql = "INSERT INTO returnBook(StudentId,studentName,fathersName,course,branch,year,Semester,bookId,bookName,edition,publisher,price,pages,dateOfIssue,DateOfReturn) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            pst = conn.prepareStatement(sql);
            
            pst.setString(1, studentIdBox.getText());
            pst.setString(2, studentNameBox.getText());
            pst.setString(3, fathersNameBox.getText());
            pst.setString(4, courseBox.getText());
            pst.setString(5, branchBox.getText());
            pst.setString(6, yearBox.getText());
            pst.setString(7, semesterBox.getText());
            pst.setString(8, bookIdBox.getText());
            pst.setString(9, bookNameBox.getText());
            pst.setString(10, editionBox.getText());
            pst.setString(11, publisherBox.getText());
            pst.setString(12, priceBox.getText());
            pst.setString(13, pagesBox.getText());
            pst.setString(14, dateOfIssueBox.getText());
            pst.setString(15, ((JTextField)returnDateBox.getDateEditor().getUiComponent()).getText());
            
            pst.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void clear(){
            studentIdBox.setText("");
            studentNameBox.setText("");
            fathersNameBox.setText("");
            courseBox.setText("");
            branchBox.setText("");
            yearBox.setText("");
            semesterBox.setText("");
            bookIdBox.setText("");
            bookNameBox.setText("");
            editionBox.setText("");
            publisherBox.setText("");
            priceBox.setText("");
            pagesBox.setText("");
            dateOfIssueBox.setText("");
            ((JTextField)returnDateBox.getDateEditor().getUiComponent()).setText("");
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fathersNameBox = new javax.swing.JTextField();
        studentNameBox = new javax.swing.JTextField();
        studentIdBox = new javax.swing.JTextField();
        courseBox = new javax.swing.JTextField();
        branchBox = new javax.swing.JTextField();
        yearBox = new javax.swing.JTextField();
        semesterBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dateOfIssueBox = new javax.swing.JTextField();
        bookIdBox = new javax.swing.JTextField();
        bookNameBox = new javax.swing.JTextField();
        editionBox = new javax.swing.JTextField();
        publisherBox = new javax.swing.JTextField();
        priceBox = new javax.swing.JTextField();
        pagesBox = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        returnDateBox = new com.toedter.calendar.JDateChooser();
        returnBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3), "Return Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Student ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Branch :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Father's Name :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));
        jLabel4.getAccessibleContext().setAccessibleDescription("");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Semester :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));
        jLabel5.getAccessibleContext().setAccessibleDescription("");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Year :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        jLabel6.getAccessibleContext().setAccessibleDescription("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Course :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));
        jLabel7.getAccessibleContext().setAccessibleDescription("");

        fathersNameBox.setEditable(false);
        jPanel1.add(fathersNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));

        studentNameBox.setEditable(false);
        jPanel1.add(studentNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));
        jPanel1.add(studentIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        courseBox.setEditable(false);
        jPanel1.add(courseBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, -1));

        branchBox.setEditable(false);
        jPanel1.add(branchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, -1));

        yearBox.setEditable(false);
        jPanel1.add(yearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

        semesterBox.setEditable(false);
        jPanel1.add(semesterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Book ID :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        searchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\search.png")); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Name :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Publisher :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Edition :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Price :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Pages :");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Date of issue :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        dateOfIssueBox.setEditable(false);
        dateOfIssueBox.setToolTipText("");
        jPanel1.add(dateOfIssueBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 150, -1));

        bookIdBox.setEditable(false);
        bookIdBox.setToolTipText("");
        jPanel1.add(bookIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 150, -1));

        bookNameBox.setEditable(false);
        bookNameBox.setToolTipText("");
        jPanel1.add(bookNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 150, -1));

        editionBox.setEditable(false);
        editionBox.setToolTipText("");
        jPanel1.add(editionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 150, -1));

        publisherBox.setEditable(false);
        publisherBox.setToolTipText("");
        jPanel1.add(publisherBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 150, -1));

        priceBox.setEditable(false);
        priceBox.setToolTipText("");
        jPanel1.add(priceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 150, -1));

        pagesBox.setEditable(false);
        pagesBox.setToolTipText("");
        jPanel1.add(pagesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 150, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 770, 360));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Return Date :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));

        returnDateBox.setDateFormatString("yyyy-mm-dd");
        jPanel2.add(returnDateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 150, -1));

        returnBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\return_icon.png")); // NOI18N
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel2.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String sql = "SELECT * FROM Issue WHERE StudentId=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, studentIdBox.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                studentNameBox.setText(rs.getString("StudentName"));
                fathersNameBox.setText(rs.getString("FathersName"));
                courseBox.setText(rs.getString("Course"));
                branchBox.setText(rs.getString("Branch"));
                yearBox.setText(rs.getString("Year"));
                semesterBox.setText(rs.getString("Semester"));
                bookIdBox.setText(rs.getString("BookId"));
                bookNameBox.setText(rs.getString("BookName"));
                editionBox.setText(rs.getString("Edition"));
                publisherBox.setText(rs.getString("Publisher"));
                priceBox.setText(rs.getString("Price"));
                pagesBox.setText(rs.getString("Pages"));
                dateOfIssueBox.setText(rs.getString("issueDate"));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Home homePage = new Home();
        homePage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        delete();
        returnUpdate();
        clear();
        JOptionPane.showMessageDialog(null, "Return details updated successfully!");
    }//GEN-LAST:event_returnBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookIdBox;
    private javax.swing.JTextField bookNameBox;
    private javax.swing.JTextField branchBox;
    private javax.swing.JTextField courseBox;
    private javax.swing.JTextField dateOfIssueBox;
    private javax.swing.JTextField editionBox;
    private javax.swing.JTextField fathersNameBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JTextField pagesBox;
    private javax.swing.JTextField priceBox;
    private javax.swing.JTextField publisherBox;
    private javax.swing.JButton returnBtn;
    private com.toedter.calendar.JDateChooser returnDateBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField semesterBox;
    private javax.swing.JTextField studentIdBox;
    private javax.swing.JTextField studentNameBox;
    private javax.swing.JTextField yearBox;
    // End of variables declaration//GEN-END:variables

    
}
