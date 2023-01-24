
import java.sql.*;
import javax.swing.JOptionPane;

public class Loading extends javax.swing.JFrame implements Runnable{
    Connection conn;
    int s = 0;
    Thread th;
    
    public Loading() {
        super("Loading");
        initComponents();
        th = new Thread((Runnable)this);
    }

    public void setUpLoading(){
        setVisible(false);
        th.start();
    }
    
    public void run(){
        try {
            for(int i=1; i<=200; i++){
                s = s+1;
                int m = ProgressBar1.getMaximum();
                int v = ProgressBar1.getValue();
                
                if(v<m){
                    ProgressBar1.setValue(ProgressBar1.getValue()+1);
                }else{
                    i = 201;
                    setVisible(false);
                    Home homePage = new Home();
                    homePage.setVisible(true);
                }Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("#Smart Library 1.1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        ProgressBar1.setStringPainted(true);
        jPanel1.add(ProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 240, 20));

        jLabel2.setText("Please wait....");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\java-Project\\LibrabyManagementSystem\\images\\book.gif")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 440));

        setSize(new java.awt.Dimension(610, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
