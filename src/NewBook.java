import java.awt.HeadlessException;
import java.sql.*;
import java.util.Random;
import javax.swing.JOptionPane;


public class NewBook extends javax.swing.JFrame {
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    
    public NewBook() {
        super("Login");
        initComponents();
        conn = JavaConnect.connectDb();
        random();
    }

    public void random(){
        Random random1 = new Random();
        bookIdBox.setText(""+random1.nextInt(1000+1));
    }
    
    public void clear(){
        bookIdBox.setText("");
        nameBox.setText("");
        editionBox.setSelectedIndex(0);
        publisherBox.setText("");
        priceBox.setText("");
        pagesBox.setText("");
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
        jLabel6 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        bookIdBox = new javax.swing.JTextField();
        nameBox = new javax.swing.JTextField();
        publisherBox = new javax.swing.JTextField();
        priceBox = new javax.swing.JTextField();
        pagesBox = new javax.swing.JTextField();
        editionBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 3), "New Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Book ID :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Edition :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Publisher :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Price :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Pages :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        addBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\add.png")); // NOI18N
        addBtn.setText("Add ");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\LibrabyManagementSystem\\images\\back.png")); // NOI18N
        backBtn.setText("Back ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, -1, -1));

        bookIdBox.setEditable(false);
        bookIdBox.setToolTipText("");
        jPanel1.add(bookIdBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, -1));

        nameBox.setToolTipText("");
        jPanel1.add(nameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 180, -1));

        publisherBox.setToolTipText("");
        jPanel1.add(publisherBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, -1));

        priceBox.setToolTipText("");
        jPanel1.add(priceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 180, -1));

        pagesBox.setToolTipText("");
        jPanel1.add(pagesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, -1));

        editionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        jPanel1.add(editionBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 410));

        setSize(new java.awt.Dimension(504, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        Home homePage = new Home();
        homePage.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            String sql = "INSERT INTO Book(BookId,Name,Edition,Publisher,Price,Pages) Values(?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, bookIdBox.getText());
            pst.setString(2, nameBox.getText());
            pst.setString(3, (String) editionBox.getSelectedItem());
            pst.setString(4, publisherBox.getText());
            pst.setString(5, priceBox.getText());
            pst.setString(6, pagesBox.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Book details added Successfully!");
            clear();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookIdBox;
    private javax.swing.JComboBox<String> editionBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameBox;
    private javax.swing.JTextField pagesBox;
    private javax.swing.JTextField priceBox;
    private javax.swing.JTextField publisherBox;
    // End of variables declaration//GEN-END:variables
}
