package edu.neu.csye6200.view;


import edu.neu.csye6200.controller.AlertController;
import edu.neu.csye6200.controller.DB4OUtil;
import edu.neu.csye6200.model.Alert;
import edu.neu.csye6200.model.AlertRecords;
import edu.neu.csye6200.model.DayCare;
import edu.neu.csye6200.model.Student;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.util.List;
import javax.swing.FocusManager;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varun
 */
public class HomePage extends javax.swing.JFrame {

    private DayCare dayCare;
    DB4OUtil db4OUtil;
    DefaultTableModel alertDtm;
    /**
     * Creates new form HomePage
     */
    public HomePage() {
        initComponents();
        db4OUtil = DB4OUtil.getInstance();
        dayCare =db4OUtil.retrieveSystem();
        postInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alertsTable = new javax.swing.JTable();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        teacherMenuButton = new javax.swing.JButton();
        classroomMenuButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        studentMenuButton = new javax.swing.JButton();
        alertsDialogButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel4.setText("Here is what you missed");

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        alertsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Description"
            }
        ));
        jScrollPane1.setViewportView(alertsTable);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Marker Felt", 1, 48)); // NOI18N
        jLabel1.setText("D A Y");

        jLabel2.setFont(new java.awt.Font("Marker Felt", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("C A R E");

        teacherMenuButton.setText("Teacher");
        teacherMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherMenuButtonActionPerformed(evt);
            }
        });

        classroomMenuButton.setText("Classroom");
        classroomMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomMenuButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("PT Serif", 2, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Welcome back,");

        jLabel5.setFont(new java.awt.Font("PT Serif", 2, 13)); // NOI18N
        jLabel5.setText("Daniel Peters");

        studentMenuButton.setText("Student");
        studentMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentMenuButtonActionPerformed(evt);
            }
        });

        alertsDialogButton.setText("Alerts");
        alertsDialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertsDialogButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(49, 49, 49)
                .addComponent(studentMenuButton)
                .addGap(18, 18, 18)
                .addComponent(teacherMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(classroomMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alertsDialogButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 679, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(teacherMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(classroomMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(alertsDialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1480, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1480, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 1480, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentMenuButtonActionPerformed
        jPanel2.removeAll();
        jPanel2.setVisible(false);
        StudentsView s1 = new StudentsView(dayCare.getStudentsList());
        s1.setSize(1480,900);
        s1.setVisible(true);
        jPanel2.setSize(jPanel2.getPreferredSize().height, jPanel2.getPreferredSize().width);
        jPanel2.add(s1);
        jPanel2.setVisible(true);
        db4OUtil.storeSystem(dayCare);
       
        
    }//GEN-LAST:event_studentMenuButtonActionPerformed

    private void alertsDialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertsDialogButtonActionPerformed
        
        jDialog1.pack();
        jDialog1.setSize(jDialog1.getPreferredSize().width*2, jDialog1.getPreferredSize().height*2);
        populateTable();
        jDialog1.setVisible(true);
    }//GEN-LAST:event_alertsDialogButtonActionPerformed

    private void teacherMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherMenuButtonActionPerformed
        jPanel2.removeAll();
        jPanel2.setVisible(false);
        TeachersView t1 = new TeachersView(dayCare.getTeachersList());
        t1.setSize(1480, 900);
        t1.setVisible(true);
        jPanel2.setSize(jPanel2.getPreferredSize().height, jPanel2.getPreferredSize().width);
        jPanel2.add(t1); 
        jPanel2.setVisible(true);
        db4OUtil.storeSystem(dayCare);
    }//GEN-LAST:event_teacherMenuButtonActionPerformed

    private void classroomMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomMenuButtonActionPerformed
        jPanel2.removeAll();
        jPanel2.setVisible(false);
        ClassRoomsView c1 = new ClassRoomsView(dayCare);
        c1.setSize(1480, 900);
        c1.setVisible(true);
        jPanel2.setSize(jPanel2.getPreferredSize().height, jPanel2.getPreferredSize().width);
        jPanel2.add(c1); 
        jPanel2.setVisible(true);
        db4OUtil.storeSystem(dayCare);
    }//GEN-LAST:event_classroomMenuButtonActionPerformed

    public void postInit()
    {
        AlertController.generateTeacherAlerts(dayCare.getTeachersList());
        jFrame1.setVisible(false);
        jFrame1.setUndecorated(true);
        jFrame1.setSize(1920, 1080);
        jFrame1.setVisible(true);
        generateTable();
    }
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }
    
        public void generateTable(){
        
        alertDtm = (DefaultTableModel) alertsTable.getModel();
        jScrollPane1.setVisible(false);
        alertsTable.setAutoCreateRowSorter(true);
        alertsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        alertsTable.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(alertsTable);
        jScrollPane1.setVisible(true);   
        populateTable();
        
}
    
    public void populateTable(){
        
        alertDtm.setRowCount(0);
        int ix = 0; // use ix as an index, i.e. id for object in table
        AlertRecords a = AlertRecords.getInstance();
        List<Alert> alerts= a.getAlerts();
        for (Alert alert : alerts)
        {
            Object[] alertObj = {alert.getDescription()};
            alertDtm.addRow(alertObj);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alertsDialogButton;
    private javax.swing.JTable alertsTable;
    private javax.swing.JButton classroomMenuButton;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton studentMenuButton;
    private javax.swing.JButton teacherMenuButton;
    // End of variables declaration//GEN-END:variables
}
