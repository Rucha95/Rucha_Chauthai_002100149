/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javaapplication1.Person;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ruchachauthai
 */
public class CreateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanel
     */
    Person person;
    public CreateJpanel(Person person) {
        initComponents();
        this.person=person;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        addrName = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        phnNo = new javax.swing.JTextField();
        faxNo = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ssn = new javax.swing.JTextField();
        medical = new javax.swing.JTextField();
        health = new javax.swing.JTextField();
        bankacc = new javax.swing.JTextField();
        license = new javax.swing.JTextField();
        vehicleId = new javax.swing.JTextField();
        deviceId = new javax.swing.JTextField();
        linkedin = new javax.swing.JTextField();
        IPAddress = new javax.swing.JTextField();
        biometrics = new javax.swing.JTextField();
        uniqueId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        UploadPhoto = new javax.swing.JButton();
        Errormsg = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("                  Create Person Profile");

        jLabel3.setText("Name");

        jLabel4.setText("Address");

        jLabel5.setText("Date of Birth");

        jLabel6.setText("Phone No.");

        jLabel7.setText("Fax No.");

        jLabel8.setText("EmailId");

        jLabel9.setText("SSN");

        jLabel10.setText("Medical Record No.");

        jLabel11.setText("Bank Account No.");

        jLabel12.setText("License No.");

        jLabel13.setText("Vehicle ID");

        jLabel14.setText("Device ID");

        jLabel15.setText("LinkedIn");

        jLabel16.setText("IP Address");

        jLabel17.setText("Biometric ID");

        jLabel18.setText("Profile Picture");

        jLabel19.setText("Health Plan No.");

        jLabel20.setText("Unique ID");

        txtName.setText("      ");
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        addrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrNameActionPerformed(evt);
            }
        });

        phnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phnNoActionPerformed(evt);
            }
        });
        phnNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phnNoKeyReleased(evt);
            }
        });

        ssn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ssnKeyReleased(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        UploadPhoto.setText("Upload Photo");
        UploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPhotoActionPerformed(evt);
            }
        });

        Errormsg.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel19))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(health)
                    .addComponent(dob)
                    .addComponent(addrName)
                    .addComponent(txtName)
                    .addComponent(phnNo)
                    .addComponent(faxNo)
                    .addComponent(email)
                    .addComponent(ssn)
                    .addComponent(medical))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel11))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IPAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(linkedin)
                            .addComponent(deviceId)
                            .addComponent(vehicleId)
                            .addComponent(license)
                            .addComponent(bankacc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addComponent(jLabel17)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(UploadPhoto)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uniqueId)
                            .addComponent(biometrics))))
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Errormsg, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Errormsg, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bankacc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel4)
                            .addComponent(addrName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(license, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(phnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deviceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15)
                            .addComponent(faxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(linkedin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17)
                            .addComponent(ssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(biometrics, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uniqueId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(health, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(UploadPhoto)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrNameActionPerformed

    private void phnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phnNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phnNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        person.setName(txtName.getText());
        person.setAddress(addrName.getText());
        person.setDob(dob.getText());
        person.setPhnNo(phnNo.getText());
        person.setFaxNo(faxNo.getText());
        person.setEmail(email.getText());
        person.setSsn(ssn.getText());
        person.setMedicalRecNo(medical.getText());
        person.setHealthPlanNo(health.getText());
        person.setBankAccNo(bankacc.getText());
        person.setLicenseNo(license.getText());
        person.setVehicleId(vehicleId.getText());
        person.setDeviceId(deviceId.getText());
        person.setLinkedIn(linkedin.getText());
        person.setIPAddress(IPAddress.getText());
        person.setBiometricID(biometrics.getText());
     //   person.setProfilePic(uniqueId.getText());
        person.setUniqueID(uniqueId.getText());
        
       // JOptionPane.showMessageDialog(this,"Person Profile details saved successfully!");
       JOptionPane.showMessageDialog(null, "Profile Created Successfully!!"); 
    }//GEN-LAST:event_btnSaveActionPerformed

    private void UploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser=new JFileChooser();
        jFileChooser.showSaveDialog(null);

        //jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        person.setProfilePic(jFileChooser.getSelectedFile().getAbsolutePath());

        JOptionPane.showMessageDialog(null, "Image Uploaded Successfully!");
    }//GEN-LAST:event_UploadPhotoActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-zA-Z '/:]+$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(txtName.getText());
        if(!match.matches())
        {
            Errormsg.setText("Name format is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void phnNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnNoKeyReleased
        // TODO add your handling code here:
         String PATTERN = "^[0-9]{0,10}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(phnNo.getText());
        if(!match.matches())
        {
            Errormsg.setText("Phone number is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
    }//GEN-LAST:event_phnNoKeyReleased

    private void ssnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ssnKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^(?!666|000|9\\\\d{2})\\\\d{3}-(?!00)\\\\d{2}-(?!0{4})\\\\d{4}$";
        Pattern pattern = Pattern.compile(PATTERN);
        Matcher match = pattern.matcher(phnNo.getText());
        if(!match.matches())
        {
            Errormsg.setText("Phone number is incorrect!");
        }
        else{
            Errormsg.setText(null);
        }
    }//GEN-LAST:event_ssnKeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Errormsg;
    private javax.swing.JTextField IPAddress;
    private javax.swing.JButton UploadPhoto;
    private javax.swing.JTextField addrName;
    private javax.swing.JTextField bankacc;
    private javax.swing.JTextField biometrics;
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField deviceId;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField faxNo;
    private javax.swing.JTextField health;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField license;
    private javax.swing.JTextField linkedin;
    private javax.swing.JTextField medical;
    private javax.swing.JTextField phnNo;
    private javax.swing.JTextField ssn;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField uniqueId;
    private javax.swing.JTextField vehicleId;
    // End of variables declaration//GEN-END:variables
}
