/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package edu.neu.csye6200.view;
import edu.neu.csye6200.model.Student;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


/**
 * @author SanthoshMaddi
 */
public class AddStudentDialog extends javax.swing.JDialog {

    /**
     * Creates new form AddStudent
     */
    public AddStudentDialog(List<Student> studentsList) 
            
    {    //super(parent, modal);
        initComponents();
        lblPhoneWarning.setVisible(false);
        lblValid.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGpa = new javax.swing.JLabel();
        txtGpa = new javax.swing.JTextField();
        lblFatherName = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNum = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        lblPhoneWarning = new javax.swing.JLabel();
        lblValid = new javax.swing.JLabel();
        btnAddStudent = new javax.swing.JButton();
        lblMotherName = new javax.swing.JLabel();
        txtMotherName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add ");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\OOD\\NEU-EDU-CSYE6200-DayCare\\Daycare\\resources\\AddStudent.png")); // NOI18N
        jLabel1.setText("Student Registration Form");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblName.setText("First Name");

        lblLastName.setText("Last Name");

        lblAge.setText("Age");

        lblGpa.setText("GPA");

        txtGpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpaActionPerformed(evt);
            }
        });

        lblFatherName.setText("Father Name");

        lblAddress.setText("Address");

        lblPhoneNum.setText("Phone No");

        txtPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumKeyReleased(evt);
            }
        });

        lblPhoneWarning.setForeground(new java.awt.Color(255, 0, 0));
        lblPhoneWarning.setText("Invalid Phone Number");

        lblValid.setIcon(new javax.swing.ImageIcon("D:\\OOD\\NEU-EDU-CSYE6200-DayCare\\Daycare\\resources\\validInput.png")); // NOI18N
        lblValid.setText("jLabel2");

        btnAddStudent.setBackground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setText("Add Student");
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });

        lblMotherName.setText("Mother Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotherName)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMotherName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFatherName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGpa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGpa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFatherName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblValid, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblPhoneWarning)))
                .addGap(103, 103, 103))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAge)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblGpa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFatherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMotherName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMotherName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(lblAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPhoneNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneWarning))
                .addGap(32, 32, 32)
                .addComponent(btnAddStudent)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblValid.setIcon(new javax.swing.ImageIcon("D:\\OOD\\NEU-EDU-CSYE6200-DayCare\\Daycare\\resources\\validInput.png")); // NOI18N
        lblValid.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed

        String firstName = txtName.getText();
        String lastName = txtLastName.getText();
        String age = txtAge.getText();
        String gpa = txtGpa.getText();
        String fatherName = txtFatherName.getText();
        String motherName = txtMotherName.getText();
        String address = txtAddress.getText();
        String phoneNumber = txtPhoneNum.getText();

        if(firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || gpa.isEmpty() || fatherName.isEmpty() || motherName.isEmpty()||address.isEmpty() || phoneNumber.isEmpty())
        {
            String message = "One or more fields or missing. Please Check";
            JOptionPane.showMessageDialog(this, "Missing Fields", message, 2);
            return;
        }

        if ( !phoneNumber.matches("\\d{10}"))
        {
            String message = "Please enter a valid Phone number!!!";
            JOptionPane.showMessageDialog(this, message, "Invalid Phone Number", 2);
            return;
        }

        int intAge = Integer.parseInt(age);
        Double doubleGpa = Double.parseDouble(gpa);
        Student student = new Student(firstName,lastName, intAge, doubleGpa, fatherName, motherName, address,phoneNumber,  new Date());
        studentsList.add(student);
        JOptionPane.showMessageDialog(this, "Added Student Successfully..!", "Added Student", 1);

    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void txtPhoneNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumKeyReleased
        if(! txtPhoneNum.getText().matches("\\d{10}"))
        {
            lblPhoneWarning.setVisible(true);
            lblValid.setVisible(false);
        }
        else{
            lblPhoneWarning.setVisible(false);
            lblValid.setVisible(true);
        }
    }//GEN-LAST:event_txtPhoneNumKeyReleased

    private void txtGpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpaActionPerformed


    private List<Student> studentsList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFatherName;
    private javax.swing.JLabel lblGpa;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMotherName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblPhoneWarning;
    private javax.swing.JLabel lblValid;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMotherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNum;
    // End of variables declaration//GEN-END:variables
}
