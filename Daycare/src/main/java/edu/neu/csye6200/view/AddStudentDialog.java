/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package edu.neu.csye6200.view;

import java.util.List;
import javax.swing.JOptionPane;


/**
 * @author SanthoshMaddi
 */
public class AddStudentDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddStudent
     */
    public AddStudentDialog(List<Student> studentsList)//(java.awt.Panel parent, boolean modal) 
            
    {    //super(parent, modal);
        initComponents();
        lblPhoneWarning.setVisible(false);
        this.studentsList = studentsList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblGpa = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblParentName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNum = new javax.swing.JLabel();
        txtGpa = new javax.swing.JTextField();
        txtParentName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnAddStudent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblPhoneWarning = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        lblName.setText("First Name");

        lblAge.setText("Age");

        lblGpa.setText("GPA");

        lblParentName.setText("Parent Name");

        lblAddress.setText("Address");

        lblPhoneNum.setText("Phone No");

        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setText("                        Student Registration");

        lblPhoneWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblPhoneWarning.setText("Invalid Number");

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        lblLastName.setText("Last Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(btnAddStudent)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblParentName)
                            .addComponent(lblName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPhoneNum)
                                    .addComponent(lblAddress))
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLastName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblGpa)
                                            .addComponent(lblAge))
                                        .addGap(2, 2, 2)))
                                .addGap(9, 9, 9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGpa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtParentName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(lblPhoneWarning)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGpa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblParentName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNum)
                    .addComponent(lblPhoneWarning))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnAddStudent)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        
        String firstName = txtName.getText();
        String lastName = txtLastName.getText();
        String age = txtLastName.getText();
        String gpa = txtAge.getText();
        String parentName = txtGpa.getText();
        String address = txtParentName.getText();
        String phoneNumber = txtAddress.getText();
        
        if(firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || gpa.isEmpty() || parentName.isEmpty() || address.isEmpty() || phoneNumber.isEmpty())
        {
            String message = "One or more fields or missing. Please Check";
            JOptionPane.showMessageDialog(this, "Missing Fields", message, 2);
            return;
        }
         
        if ( !phoneNumber.matches("\\d{10}"))
        {
            String message = "Please enter a valid Phine number!!!";
            JOptionPane.showMessageDialog(this, message, "Invalid Phone Number", 2);
            return;
        }
        
        int intAge = Integer.parseInt(age);
        Student student = new Student(firstName,lastName,intAge);
        studentsList.add(student);
        JOptionPane.showMessageDialog(this, "Added Student Successfully..!", "Added Student", 1);
        
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
         if(! txtAddress.getText().matches("\\d{10}"))
        {
            lblPhoneWarning.setVisible(true);
        }
        else{
            lblPhoneWarning.setVisible(false);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

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
            java.util.logging.Logger.getLogger(AddStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                AddStudent dialog = new AddStudent(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
        //</editor-fold>

        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                AddStudent dialog = new AddStudent(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    }

    private List<Student> studentsList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGpa;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParentName;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblPhoneWarning;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
}