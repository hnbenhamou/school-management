/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class AdmInterface extends javax.swing.JFrame {

    private static final String userdb = "root";
    private static final String passdb = "Ahsat0ut@";
    private static final String connDB = "jdbc:mysql://localhost:3306/ecole_db";
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String username;

    int q, i, id, deleteItem;

    public AdmInterface(String username) {
        initComponents();
        setIconImg();
        setTitle("Administrator Panel");
        this.username = username;
        profDB();
        modDB();
        stDB();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPrenom3 = new javax.swing.JLabel();
        txtPrenom = new javax.swing.JTextField();
        jNom2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jPrenom4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jEmail1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jTele1 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        jAdr1 = new javax.swing.JLabel();
        txtAdr = new javax.swing.JTextField();
        jVille1 = new javax.swing.JLabel();
        txtVille = new javax.swing.JTextField();
        jPays1 = new javax.swing.JLabel();
        txtPays = new javax.swing.JTextField();
        jPrenom5 = new javax.swing.JLabel();
        txtIDm = new javax.swing.JTextField();
        jPrenom6 = new javax.swing.JLabel();
        txtRespo = new javax.swing.JTextField();
        jNom3 = new javax.swing.JLabel();
        txtNomm = new javax.swing.JTextField();
        btnAddm = new javax.swing.JButton();
        btnUpdatem = new javax.swing.JButton();
        btnRemovem = new javax.swing.JButton();
        btnRemoves = new javax.swing.JButton();
        btnAdds = new javax.swing.JButton();
        btnUpdates = new javax.swing.JButton();
        jRID = new javax.swing.JLabel();
        txtRID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPrenom = new javax.swing.JLabel();
        txtPrenomp = new javax.swing.JTextField();
        jNom = new javax.swing.JLabel();
        txtNomp = new javax.swing.JTextField();
        jEmail = new javax.swing.JLabel();
        txtEmailp = new javax.swing.JTextField();
        jTele = new javax.swing.JLabel();
        txtTelep = new javax.swing.JTextField();
        jAdr = new javax.swing.JLabel();
        txtAdrp = new javax.swing.JTextField();
        jVille = new javax.swing.JLabel();
        txtVillep = new javax.swing.JTextField();
        jPays = new javax.swing.JLabel();
        txtPaysp = new javax.swing.JTextField();
        jPrenom1 = new javax.swing.JLabel();
        txtStatusp = new javax.swing.JTextField();
        jNom1 = new javax.swing.JLabel();
        txtSpecialite = new javax.swing.JTextField();
        btnAddp = new javax.swing.JButton();
        Settings = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        txtIDp = new javax.swing.JTextField();
        jPrenom2 = new javax.swing.JLabel();
        btnUpdatep = new javax.swing.JButton();
        btnRemovep = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(237, 247, 246));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "ID Respo", "Responsable"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DID", "LName", "FName", "Email", "Tele", "Adresse", "City", "Country"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("School's modules");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Students list");

        jPrenom3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom3.setText("First Name");
        jPrenom3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jNom2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNom2.setText("Respo");

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });

        jPrenom4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom4.setText("ID");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jEmail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEmail1.setText("Email");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jTele1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTele1.setText("Tele");

        txtTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleActionPerformed(evt);
            }
        });

        jAdr1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jAdr1.setText("Adresse");

        jVille1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jVille1.setText("City");

        txtVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVilleActionPerformed(evt);
            }
        });

        jPays1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPays1.setText("Country");

        txtPays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaysActionPerformed(evt);
            }
        });

        jPrenom5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom5.setText("ID");

        txtIDm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDmActionPerformed(evt);
            }
        });

        jPrenom6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom6.setText("Name");
        jPrenom6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jNom3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNom3.setText("Last Name");

        btnAddm.setBackground(new java.awt.Color(76, 187, 23));
        btnAddm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddm.setText("Add");
        btnAddm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddmActionPerformed(evt);
            }
        });

        btnUpdatem.setBackground(new java.awt.Color(132, 203, 243));
        btnUpdatem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdatem.setText("Update");
        btnUpdatem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdatem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatemActionPerformed(evt);
            }
        });

        btnRemovem.setBackground(new java.awt.Color(255, 51, 0));
        btnRemovem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemovem.setText("Remove");
        btnRemovem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemovem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovemActionPerformed(evt);
            }
        });

        btnRemoves.setBackground(new java.awt.Color(255, 51, 0));
        btnRemoves.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemoves.setText("Remove");
        btnRemoves.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovesActionPerformed(evt);
            }
        });

        btnAdds.setBackground(new java.awt.Color(76, 187, 23));
        btnAdds.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdds.setText("Add");
        btnAdds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddsActionPerformed(evt);
            }
        });

        btnUpdates.setBackground(new java.awt.Color(132, 203, 243));
        btnUpdates.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdates.setText("Update");
        btnUpdates.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatesActionPerformed(evt);
            }
        });

        jRID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jRID.setText("RID");

        txtRID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPrenom3)
                            .addComponent(jPrenom4)
                            .addComponent(jTele1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVille1))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txtTele)
                            .addComponent(txtVille)
                            .addComponent(txtPrenom))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jNom3))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(txtEmail)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jAdr1)
                                    .addComponent(jPays1))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAdr)
                                    .addComponent(txtPays)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(btnAdds, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnUpdates, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnRemoves, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddm, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnUpdatem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnRemovem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPrenom5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIDm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPrenom6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomm, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jNom2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRespo, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRID, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jRID))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIDm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPrenom5)
                        .addComponent(jPrenom6)
                        .addComponent(txtRespo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jNom2)
                        .addComponent(txtNomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddm)
                            .addComponent(btnUpdatem)
                            .addComponent(btnRemovem))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrenom3)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNom3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrenom4)
                    .addComponent(jEmail1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTele1)
                    .addComponent(txtTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAdr1)
                    .addComponent(txtAdr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVille1)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPays1)
                    .addComponent(txtPays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdds)
                    .addComponent(btnUpdates)
                    .addComponent(btnRemoves))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "LName", "FName", "Status", "Specialite", "Email", "Tele", "Adresse", "City", "Country"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Professors list");

        jPrenom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom.setText("First Name");
        jPrenom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jNom.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNom.setText("Last Name");

        txtNomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNompActionPerformed(evt);
            }
        });

        jEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jEmail.setText("Email");

        txtEmailp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailpActionPerformed(evt);
            }
        });

        jTele.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTele.setText("Tele");

        txtTelep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelepActionPerformed(evt);
            }
        });

        jAdr.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jAdr.setText("Adresse");

        jVille.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jVille.setText("City");

        txtVillep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVillepActionPerformed(evt);
            }
        });

        jPays.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPays.setText("Country");

        txtPaysp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayspActionPerformed(evt);
            }
        });

        jPrenom1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom1.setText("Status");

        txtStatusp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatuspActionPerformed(evt);
            }
        });

        jNom1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNom1.setText("Specialite");

        txtSpecialite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpecialiteActionPerformed(evt);
            }
        });

        btnAddp.setBackground(new java.awt.Color(76, 187, 23));
        btnAddp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddp.setText("Add");
        btnAddp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddpActionPerformed(evt);
            }
        });

        Settings.setBackground(new java.awt.Color(0, 0, 204));
        Settings.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Settings.setForeground(new java.awt.Color(255, 255, 255));
        Settings.setText("Settings");
        Settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("_________________________________________________________");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Exit");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(250, 139, 154));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setText("LogOut");
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        txtIDp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDpActionPerformed(evt);
            }
        });

        jPrenom2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPrenom2.setText("ID");

        btnUpdatep.setBackground(new java.awt.Color(132, 203, 243));
        btnUpdatep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdatep.setText("Update");
        btnUpdatep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdatep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatepActionPerformed(evt);
            }
        });

        btnRemovep.setBackground(new java.awt.Color(255, 51, 0));
        btnRemovep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRemovep.setText("Remove");
        btnRemovep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemovep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(192, 192, 192)
                                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPrenom)
                                    .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jAdr)
                                    .addComponent(jPays)
                                    .addComponent(jPrenom2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(btnAddp, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIDp)
                                            .addComponent(txtPrenomp, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(txtEmailp, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(txtAdrp, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(txtPaysp, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jNom)
                                                    .addComponent(jNom1)
                                                    .addComponent(jTele, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jVille))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtSpecialite)
                                                    .addComponent(txtNomp)
                                                    .addComponent(txtTelep)
                                                    .addComponent(txtVillep)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPrenom1)
                                                .addGap(39, 39, 39)
                                                .addComponent(txtStatusp))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnUpdatep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)
                                        .addComponent(btnRemovep, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(103, 103, 103)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrenom)
                    .addComponent(jNom)
                    .addComponent(txtNomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNom1)
                    .addComponent(txtSpecialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrenom2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmail)
                    .addComponent(txtEmailp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTele)
                    .addComponent(txtTelep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAdr)
                    .addComponent(txtAdrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVille)
                    .addComponent(txtVillep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPays)
                    .addComponent(txtPaysp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatusp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPrenom1))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdatep)
                    .addComponent(btnRemovep)
                    .addComponent(btnAddp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut)
                    .addComponent(jButton1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNompActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNompActionPerformed

    private void txtEmailpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailpActionPerformed

    private void txtTelepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelepActionPerformed

    private void txtVillepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVillepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVillepActionPerformed

    private void txtPayspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayspActionPerformed

    private void txtSpecialiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpecialiteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpecialiteActionPerformed

    private void txtStatuspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatuspActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatuspActionPerformed

    private void btnAddpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddpActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("insert into prof(id_prof,nom,prenom,statut,specialite,email,tel,adresse,ville,pays) values(?,?,?,?,?,?,?,?,?,?)");

            pst.setString(1, txtIDp.getText());
            pst.setString(2, txtNomp.getText());
            pst.setString(3, txtPrenomp.getText());
            pst.setString(4, txtStatusp.getText());
            pst.setString(5, txtSpecialite.getText());
            pst.setString(6, txtEmailp.getText());
            pst.setString(7, txtTelep.getText());
            pst.setString(9, txtVillep.getText());
            pst.setString(10, txtPaysp.getText());
            pst.setString(8, txtAdrp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added Successfully!");
            profDB();
            String user=txtNomp.getText()+"."+txtIDp.getText();
            String pass=Account.generatePassword();
            String lastid=Account.findLastIDLogin();
            Account.AccDB(lastid,user,pass,"professeur");
        }
        catch(SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(this, "ID is already taken!");
        }
        catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddpActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        new Settings(username).setVisible(true);
    }//GEN-LAST:event_SettingsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit the program?", "Confirm Exit",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        this.dispose();
        new login().setVisible(true);;
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void txtIDpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDpActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable3.getModel();
        int SelectedRows = jTable3.getSelectedRow();

        txtIDp.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtNomp.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtPrenomp.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtStatusp.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        txtSpecialite.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        txtEmailp.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        txtTelep.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        txtAdrp.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
        txtVillep.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
        txtPaysp.setText(RecordTable.getValueAt(SelectedRows, 9).toString());

    }//GEN-LAST:event_jTable3MouseClicked

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleActionPerformed

    private void txtVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVilleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVilleActionPerformed

    private void txtPaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaysActionPerformed

    private void txtIDmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDmActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
        int SelectedRows = jTable2.getSelectedRow();

        txtIDm.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtNomm.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtRID.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtRespo.setText(RecordTable.getValueAt(SelectedRows, 3).toString());


    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();

        txtID.setText(RecordTable.getValueAt(SelectedRows, 0).toString());
        txtNom.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtPrenom.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtEmail.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        txtTele.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
        txtAdr.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
        txtVille.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        txtPays.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnAddmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddmActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("insert into module values(?,?,?)");

            pst.setString(1, txtIDm.getText());
            pst.setString(2, txtNomm.getText());
            pst.setString(3, txtRID.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Module Added Successfully!");
            modDB();
        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddmActionPerformed

    private void btnUpdatemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatemActionPerformed
     try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB,userdb,passdb);
            pst = sqlConn.prepareStatement("update module set nom=?, id_prof=? where id_mod=?");
           
            
            pst.setString(1,txtNomm.getText());
            pst.setString(2,txtRID.getText());
            pst.setString(3,txtIDm.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Updated Successfully!");
            modDB();           
        }
        catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdatemActionPerformed

    private void btnRemovemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovemActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB,userdb,passdb);
            pst = sqlConn.prepareStatement("delete from module where id_mod=?");
           

            pst.setString(1,txtIDm.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Removed Successfully!");
            modDB();           
        }
        catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemovemActionPerformed

    private void btnRemovesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovesActionPerformed
    try {

            deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete this student", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
                pst = sqlConn.prepareStatement("delete from etudiant where id_doss=?");
                pst.setString(1, txtID.getText());
                pst.executeUpdate();
                pst = sqlConn.prepareStatement("delete from dossier where id_doss=?");
                pst.setString(1, txtID.getText());
                pst.executeUpdate();
                Account.AccDB(txtNom.getText()+"."+txtID.getText());
                JOptionPane.showMessageDialog(this, "Student Is Deleted From your database!");
                stDB();

                txtID.setText("");
                txtNom.setText("");
                txtEmail.setText("");
                txtTele.setText("");
                txtAdr.setText("");
                txtPrenom.setText("");
                txtVille.setText("");
                txtPays.setText("");


            }

        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemovesActionPerformed

    private void btnAddsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddsActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("insert into dossier values(?,?,?,?,?,?,?,?)");

            pst.setString(1, txtID.getText());
            pst.setString(2, txtNom.getText());
            pst.setString(3, txtPrenom.getText());
            pst.setString(4, txtEmail.getText());
            pst.setString(5, txtTele.getText());
            pst.setString(6, txtAdr.getText());
            pst.setString(7, txtVille.getText());
            pst.setString(8, txtPays.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Added Successfully!");
            stDB();
            String user=txtNom.getText()+"."+txtID.getText();
            String pass=Account.generatePassword();
            String lastid=Account.findLastIDLogin();
            Account.AccDB(lastid,user,pass,"etudiant");
            pst = sqlConn.prepareStatement("insert into etudiant values(?,?,?)");
            pst.setString(1, Account.findLastID(2));
            pst.setString(2, txtID.getText());
            pst.setString(3, lastid);
            pst.executeUpdate();

            
        }
        catch(SQLIntegrityConstraintViolationException e){
            JOptionPane.showMessageDialog(this, "ID is already taken!");
        }
        catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddsActionPerformed

    private void btnUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatesActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("update dossier set nom=?,prenom=?,email=?,tel=?,adresse=?,ville=?,pays=? where id_doss=?");

            pst.setString(8, txtID.getText());
            pst.setString(1, txtNom.getText());
            pst.setString(2, txtPrenom.getText());
            pst.setString(3, txtEmail.getText());
            pst.setString(4, txtTele.getText());
            pst.setString(5, txtAdr.getText());
            pst.setString(6, txtVille.getText());
            pst.setString(7, txtPays.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated Successfully!");
            stDB();
        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdatesActionPerformed

    private void btnUpdatepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatepActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("update prof set nom=?,prenom=?,statut=?,specialite=?,email=?,tel=?,adresse=?,ville=?,pays=? where id_prof=?");

            pst.setString(10, txtIDp.getText());
            pst.setString(1, txtNomp.getText());
            pst.setString(2, txtPrenomp.getText());
            pst.setString(3, txtStatusp.getText());
            pst.setString(4, txtSpecialite.getText());
            pst.setString(5, txtEmailp.getText());
            pst.setString(6, txtTelep.getText());
            pst.setString(7, txtAdrp.getText());
            pst.setString(8, txtVillep.getText());
            pst.setString(9, txtPaysp.getText());
            

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Updated Successfully!");
            profDB();
        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnUpdatepActionPerformed

    private void btnRemovepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovepActionPerformed
        try {

            deleteItem = JOptionPane.showConfirmDialog(null, "Confirm if you want to delete this professor", "Warning", JOptionPane.YES_NO_OPTION);
            if (deleteItem == JOptionPane.YES_OPTION) {
                Class.forName("com.mysql.jdbc.Driver");
                sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
                pst = sqlConn.prepareStatement("delete from prof where id_prof=?");
                pst.setString(1, txtIDp.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Professor Is Deleted From your database!");
                profDB();

                txtIDp.setText("");
                txtIDp.requestFocus();
                txtNomp.setText("");
                txtEmailp.setText("");
                txtTelep.setText("");
                txtAdrp.setText("");
                txtPrenomp.setText("");
                txtVillep.setText("");
                txtPaysp.setText("");
                txtStatusp.setText("");
                txtSpecialite.setText("");

            }

        }
        catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnPDFActionPerformed(java.awt.event.ActionEvent evt) {   
    }//GEN-LAST:event_btnRemovepActionPerformed

    private void txtRIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String username) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmInterface(username).setVisible(true);
            }
        });
    }

    private void setIconImg() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../icon/ensa.png")));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Settings;
    private javax.swing.JButton btnAddm;
    private javax.swing.JButton btnAddp;
    private javax.swing.JButton btnAdds;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRemovem;
    private javax.swing.JButton btnRemovep;
    private javax.swing.JButton btnRemoves;
    private javax.swing.JButton btnUpdatem;
    private javax.swing.JButton btnUpdatep;
    private javax.swing.JButton btnUpdates;
    private javax.swing.JLabel jAdr;
    private javax.swing.JLabel jAdr1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jEmail;
    private javax.swing.JLabel jEmail1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNom;
    private javax.swing.JLabel jNom1;
    private javax.swing.JLabel jNom2;
    private javax.swing.JLabel jNom3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPays;
    private javax.swing.JLabel jPays1;
    private javax.swing.JLabel jPrenom;
    private javax.swing.JLabel jPrenom1;
    private javax.swing.JLabel jPrenom2;
    private javax.swing.JLabel jPrenom3;
    private javax.swing.JLabel jPrenom4;
    private javax.swing.JLabel jPrenom5;
    private javax.swing.JLabel jPrenom6;
    private javax.swing.JLabel jRID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel jTele;
    private javax.swing.JLabel jTele1;
    private javax.swing.JLabel jVille;
    private javax.swing.JLabel jVille1;
    private javax.swing.JTextField txtAdr;
    private javax.swing.JTextField txtAdrp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailp;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDm;
    private javax.swing.JTextField txtIDp;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNomm;
    private javax.swing.JTextField txtNomp;
    private javax.swing.JTextField txtPays;
    private javax.swing.JTextField txtPaysp;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtPrenomp;
    private javax.swing.JTextField txtRID;
    private javax.swing.JTextField txtRespo;
    private javax.swing.JTextField txtSpecialite;
    private javax.swing.JTextField txtStatusp;
    private javax.swing.JTextField txtTele;
    private javax.swing.JTextField txtTelep;
    private javax.swing.JTextField txtVille;
    private javax.swing.JTextField txtVillep;
    // End of variables declaration//GEN-END:variables

    private void profDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("select * from prof");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable3.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("id_prof"));
                    columnData.add(rs.getString("nom"));
                    columnData.add(rs.getString("prenom"));
                    columnData.add(rs.getString("statut"));
                    columnData.add(rs.getString("specialite"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("tel"));
                    columnData.add(rs.getString("adresse"));
                    columnData.add(rs.getString("ville"));
                    columnData.add(rs.getString("pays"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void modDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("select M.id_mod,M.nom,M.id_prof,CONCAT(prof.nom, ' ', prof.prenom) as 'responsable' from prof inner join module M where  M.id_prof = prof.id_prof");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable2.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("id_mod"));
                    columnData.add(rs.getString("nom"));
                    columnData.add(rs.getString("id_prof"));
                    columnData.add(rs.getString("responsable"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void stDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("select * from dossier");

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
            RecordTable.setRowCount(0);
            while (rs.next()) {
                Vector columnData = new Vector();
                for (i = 1; i <= q; i++) {
                    columnData.add(rs.getString("id_doss"));
                    columnData.add(rs.getString("nom"));
                    columnData.add(rs.getString("prenom"));
                    columnData.add(rs.getString("email"));
                    columnData.add(rs.getString("tel"));
                    columnData.add(rs.getString("adresse"));
                    columnData.add(rs.getString("ville"));
                    columnData.add(rs.getString("pays"));
                }
                RecordTable.addRow(columnData);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    private void AccDB(String i, String user, String pass, String type) {
try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(connDB, userdb, passdb);
            pst = sqlConn.prepareStatement("insert into login values(?,?,?,?)");
            pst.setString(1, i);
            pst.setString(2, user);
            pst.setString(3, pass);
            pst.setString(4, type);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "His/her Login is : \n username:"+user+"\npassword:"+pass);
        } catch (SQLException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ProfInterface.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }
}
