package properties;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import realEstate.Connect;

public class AddFlat extends javax.swing.JFrame {

    //Connection conn = null;
    Statement stmt = null;

    public AddFlat() {
        initComponents();
        //conn = Connect.ConnectDB();

        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        cmbxFloorType = new javax.swing.JComboBox();
        cmbxProjectType = new javax.swing.JComboBox();
        txtSalePrice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        chkWasa = new javax.swing.JCheckBox();
        txtUtilityCost = new javax.swing.JTextField();
        chkElectricity = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        chkInternet = new javax.swing.JCheckBox();
        txtStreet = new javax.swing.JTextField();
        chkCableTv = new javax.swing.JCheckBox();
        txtTotalFloors = new javax.swing.JTextField();
        txtSize = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFloorNumber = new javax.swing.JTextField();
        txtCommonBaths = new javax.swing.JTextField();
        txtParkingCost = new javax.swing.JTextField();
        chkLift = new javax.swing.JCheckBox();
        chkGenerator = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        chkIntercom = new javax.swing.JCheckBox();
        txtBedrooms = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        chkComHall = new javax.swing.JCheckBox();
        txtParkings = new javax.swing.JTextField();
        chkRoofTopGarden = new javax.swing.JCheckBox();
        txtBalconies = new javax.swing.JTextField();
        chkCCTV = new javax.swing.JCheckBox();
        chkGym = new javax.swing.JCheckBox();
        txtAttachBaths = new javax.swing.JTextField();
        chkSwimmingPool = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        chkFireExt = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        chkEmergency = new javax.swing.JCheckBox();
        chkFireAlarm = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        chkGas = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Floor Type:");

        jLabel11.setText("Project Type:");

        jLabel16.setText("Details:");

        txtDetails.setColumns(20);
        txtDetails.setRows(5);
        jScrollPane1.setViewportView(txtDetails);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        cmbxFloorType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbxProjectType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Total Floors:");

        chkWasa.setText("Wasa Connection");

        chkElectricity.setText("Electricity Connection");

        jLabel12.setText("Attached Baths:");

        chkInternet.setText("Internet Connection");

        chkCableTv.setText("Cable Tv connection");

        jLabel13.setText("Sale Price:");

        chkLift.setText("Lift");

        chkGenerator.setText("Generator");

        jLabel14.setText("Utility Cost:");

        jLabel17.setText("Bed Rooms:");

        chkIntercom.setText("Intercom");

        jLabel15.setText("Parking Cost:");

        chkComHall.setText("Community Hall");

        chkRoofTopGarden.setText("Roof Top Garden");

        chkCCTV.setText("CCTV");

        chkGym.setText("Gym");

        chkSwimmingPool.setText("Swiming Pool");

        jLabel1.setText("Country:");

        chkFireExt.setText("Fire Extinguisher");

        jLabel2.setText("City:");

        jLabel3.setText("Street Address:");

        jLabel4.setText("Common Baths:");

        jLabel5.setText("Size in Square Feet:");

        chkEmergency.setText("Emergency Exit");

        chkFireAlarm.setText("Fire Alarm");

        jLabel6.setText("Floor Number:");

        jLabel8.setText("Balconies:");

        jLabel9.setText("Car Parkings:");

        chkGas.setText("Gas Connection");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbxFloorType, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtParkings, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBalconies, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCommonBaths, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalFloors, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtParkingCost, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSize, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSalePrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUtilityCost, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAttachBaths, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFloorNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFireAlarm)
                    .addComponent(chkEmergency)
                    .addComponent(chkFireExt)
                    .addComponent(chkSwimmingPool)
                    .addComponent(chkGym)
                    .addComponent(chkCCTV)
                    .addComponent(chkRoofTopGarden)
                    .addComponent(chkComHall)
                    .addComponent(chkIntercom)
                    .addComponent(chkGenerator)
                    .addComponent(chkLift)
                    .addComponent(chkCableTv)
                    .addComponent(chkInternet)
                    .addComponent(chkElectricity)
                    .addComponent(chkWasa)
                    .addComponent(chkGas))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFloorNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAttachBaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCommonBaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBalconies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParkings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalePrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUtilityCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalFloors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtParkingCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkGas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkWasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkElectricity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkInternet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCableTv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkLift)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkGenerator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkIntercom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkComHall)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkRoofTopGarden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCCTV)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkGym)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkSwimmingPool)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkFireExt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkEmergency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkFireAlarm)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbxProjectType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxFloorType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        Flat f = new Flat();
        try {
            f.cableConnection = chkCableTv.isSelected();
            f.ccTv = chkCCTV.isSelected();
            f.communityHall = chkComHall.isSelected();
            f.gas = chkGas.isSelected();
            f.electricity = chkElectricity.isSelected();
            f.wasa = chkWasa.isSelected();
            f.intercom = chkIntercom.isSelected();
            f.internet = chkInternet.isSelected();
            f.emergencyExit = chkEmergency.isSelected();
            f.fireAlarm = chkFireAlarm.isSelected();
            f.fireExting = chkFireExt.isSelected();
            f.gym = chkGym.isSelected();
            f.swimingPool = chkSwimmingPool.isSelected();
            f.lift = chkLift.isSelected();
            f.roofTopGarden = chkRoofTopGarden.isSelected();
            f.generator = chkGenerator.isSelected();

            f.floorType = cmbxFloorType.getSelectedItem().toString();
            f.projectType = cmbxProjectType.getSelectedItem().toString();
            f.country = txtCountry.getText();
            f.street = txtStreet.getText();
            f.city = txtCity.getText();
            f.description = txtDetails.getText();

            f.salePrice = Integer.parseInt(txtSalePrice.getText());
            f.utilityCost = Integer.parseInt(txtUtilityCost.getText());
            f.parkingCost = Integer.parseInt(txtSalePrice.getText());
            f.floorNo = Integer.parseInt(txtFloorNumber.getText());
            f.Balconies = Integer.parseInt(txtBalconies.getText());
            f.attachedBaths = Integer.parseInt(txtAttachBaths.getText());
            f.beds = Integer.parseInt(txtBedrooms.getText());
            f.commonBaths = Integer.parseInt(txtCommonBaths.getText());
            f.parkings = Integer.parseInt(txtParkings.getText());
            f.totalFloor = Integer.parseInt(txtTotalFloors.getText());
            f.sizeSqft = Integer.parseInt(txtSize.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(AddFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox chkCCTV;
    private javax.swing.JCheckBox chkCableTv;
    private javax.swing.JCheckBox chkComHall;
    private javax.swing.JCheckBox chkElectricity;
    private javax.swing.JCheckBox chkEmergency;
    private javax.swing.JCheckBox chkFireAlarm;
    private javax.swing.JCheckBox chkFireExt;
    private javax.swing.JCheckBox chkGas;
    private javax.swing.JCheckBox chkGenerator;
    private javax.swing.JCheckBox chkGym;
    private javax.swing.JCheckBox chkIntercom;
    private javax.swing.JCheckBox chkInternet;
    private javax.swing.JCheckBox chkLift;
    private javax.swing.JCheckBox chkRoofTopGarden;
    private javax.swing.JCheckBox chkSwimmingPool;
    private javax.swing.JCheckBox chkWasa;
    private javax.swing.JComboBox cmbxFloorType;
    private javax.swing.JComboBox cmbxProjectType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAttachBaths;
    private javax.swing.JTextField txtBalconies;
    private javax.swing.JTextField txtBedrooms;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommonBaths;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtFloorNumber;
    private javax.swing.JTextField txtParkingCost;
    private javax.swing.JTextField txtParkings;
    private javax.swing.JTextField txtSalePrice;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtTotalFloors;
    private javax.swing.JTextField txtUtilityCost;
    // End of variables declaration//GEN-END:variables
}
