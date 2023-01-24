
public class Return extends javax.swing.JFrame {

    
    public Return() {
        initComponents();
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

        fathersNameBox.setEnabled(false);
        jPanel1.add(fathersNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 150, -1));

        studentNameBox.setEnabled(false);
        jPanel1.add(studentNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 150, -1));
        jPanel1.add(studentIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 150, -1));

        courseBox.setEnabled(false);
        jPanel1.add(courseBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, -1));

        branchBox.setEnabled(false);
        jPanel1.add(branchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 150, -1));

        yearBox.setEnabled(false);
        jPanel1.add(yearBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

        semesterBox.setEnabled(false);
        jPanel1.add(semesterBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Book ID :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        searchBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\search.png")); // NOI18N
        searchBtn.setText("Search");
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

        dateOfIssueBox.setToolTipText("");
        dateOfIssueBox.setEnabled(false);
        jPanel1.add(dateOfIssueBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 150, -1));

        bookIdBox.setToolTipText("");
        bookIdBox.setEnabled(false);
        jPanel1.add(bookIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 150, -1));

        bookNameBox.setToolTipText("");
        bookNameBox.setEnabled(false);
        jPanel1.add(bookNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 150, -1));

        editionBox.setToolTipText("");
        editionBox.setEnabled(false);
        jPanel1.add(editionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 150, -1));

        publisherBox.setToolTipText("");
        publisherBox.setEnabled(false);
        jPanel1.add(publisherBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 150, -1));

        priceBox.setToolTipText("");
        priceBox.setEnabled(false);
        jPanel1.add(priceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 150, -1));

        pagesBox.setToolTipText("");
        pagesBox.setEnabled(false);
        jPanel1.add(pagesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 150, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 770, 360));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Return Date :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, -1, -1));
        jPanel2.add(returnDateBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 150, -1));

        returnBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\return_icon.png")); // NOI18N
        returnBtn.setText("Return");
        jPanel2.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backBtn.setText("Back");
        jPanel2.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
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
