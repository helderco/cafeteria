package pt.uac.cafeteria.ui;

import java.awt.*;
import javax.swing.*;

/**
 * 
 * Represents the Back Office user interface.
 */
public class Backend extends javax.swing.JFrame {

    /** Creates new form Backend */
    public Backend() {
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(screenSize.width/2 - 400, screenSize.height/2 - 300);
        
        menuPanel.setVisible(false);
        warningFrame.setVisible(false);
    }
    
    /**
     * Method that cleans all JtextField on a component
     * 
     * @param component The component that will be cleaned, i.e: A Panel
     */
    private void cleanPanel(JComponent component){
        for (int i = 0; i < component.getComponents().length; i++) {
            if (component.getComponent(i) instanceof JTextField) {
                JTextField textField = (JTextField)component.getComponent(i);
                textField.setText(null);
            }
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scholarshipChoose = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        confirm = new javax.swing.JButton();
        lblBackBK = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        warningLogFrame = new javax.swing.JInternalFrame();
        lblLogMessage = new javax.swing.JLabel();
        btnLogYes = new javax.swing.JButton();
        btnLogNo = new javax.swing.JButton();
        studentPanel = new javax.swing.JTabbedPane();
        addPanel = new javax.swing.JPanel();
        informationFrame = new javax.swing.JInternalFrame();
        lblMessage1 = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        warningFrame = new javax.swing.JInternalFrame();
        lblMessage = new javax.swing.JLabel();
        btnWarningYes = new javax.swing.JButton();
        btnWarningNo = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblPostalCode = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblScholarship = new javax.swing.JLabel();
        lblIfen = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        street = new javax.swing.JTextField();
        postalCode = new javax.swing.JTextField();
        postalCode1 = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        rdoYes = new javax.swing.JRadioButton();
        rdoNo = new javax.swing.JRadioButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        updatePanel = new javax.swing.JPanel();
        deletePanel = new javax.swing.JPanel();
        searchPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        btnStudent = new javax.swing.JButton();
        btnAccount = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnMeal = new javax.swing.JButton();
        btnTerminate = new javax.swing.JButton();
        lblBackBK1 = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafeteria");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        mainPanel.setMinimumSize(new java.awt.Dimension(800, 600));
        mainPanel.setLayout(null);

        lblUsername.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsername.setText("Username:");
        mainPanel.add(lblUsername);
        lblUsername.setBounds(350, 144, 110, 20);

        username.setFont(new java.awt.Font("Tahoma", 1, 11));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        mainPanel.add(username);
        username.setBounds(350, 170, 110, 30);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("Password:");
        mainPanel.add(lblPassword);
        lblPassword.setBounds(350, 240, 110, 20);
        mainPanel.add(password);
        password.setBounds(350, 265, 110, 30);

        confirm.setText("Confirmar");
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                confirmMouseReleased(evt);
            }
        });
        mainPanel.add(confirm);
        confirm.setBounds(360, 340, 90, 30);

        lblBackBK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/uac/cafeteria/ui/images/backBK.png"))); // NOI18N
        mainPanel.add(lblBackBK);
        lblBackBK.setBounds(0, 0, 800, 600);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        org.jdesktop.layout.GroupLayout loginPanelLayout = new org.jdesktop.layout.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 196, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 396, Short.MAX_VALUE)
        );

        mainPanel.add(loginPanel);
        loginPanel.setBounds(300, 100, 200, 400);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 800, 600);

        menuPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        menuPanel.setLayout(null);

        warningLogFrame.setTitle("Aviso");
        warningLogFrame.setPreferredSize(new java.awt.Dimension(220, 160));

        lblLogMessage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblLogMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogMessage.setText("Tem a certeza que quer Terminar?");

        btnLogYes.setText("Sim");
        btnLogYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogYesMouseReleased(evt);
            }
        });

        btnLogNo.setText("Não");
        btnLogNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLogNoMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout warningLogFrameLayout = new org.jdesktop.layout.GroupLayout(warningLogFrame.getContentPane());
        warningLogFrame.getContentPane().setLayout(warningLogFrameLayout);
        warningLogFrameLayout.setHorizontalGroup(
            warningLogFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, warningLogFrameLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .add(btnLogYes)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnLogNo)
                .add(43, 43, 43))
            .add(lblLogMessage, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );
        warningLogFrameLayout.setVerticalGroup(
            warningLogFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(warningLogFrameLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(lblLogMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(warningLogFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnLogNo)
                    .add(btnLogYes))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.add(warningLogFrame);
        warningLogFrame.setBounds(300, 150, 220, 160);

        studentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        addPanel.setLayout(null);

        informationFrame.setTitle("Informação");
        informationFrame.setPreferredSize(new java.awt.Dimension(220, 160));
        informationFrame.setSize(new java.awt.Dimension(220, 160));

        lblMessage1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblMessage1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage1.setText("Dados guardados com sucesso!");

        btnOk.setText("OK");
        btnOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOkMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout informationFrameLayout = new org.jdesktop.layout.GroupLayout(informationFrame.getContentPane());
        informationFrame.getContentPane().setLayout(informationFrameLayout);
        informationFrameLayout.setHorizontalGroup(
            informationFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(lblMessage1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
            .add(informationFrameLayout.createSequentialGroup()
                .add(80, 80, 80)
                .add(btnOk)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        informationFrameLayout.setVerticalGroup(
            informationFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(informationFrameLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(lblMessage1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnOk)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        addPanel.add(informationFrame);
        informationFrame.setBounds(100, 150, 220, 160);

        warningFrame.setTitle("Aviso");
        warningFrame.setPreferredSize(new java.awt.Dimension(220, 160));
        warningFrame.setSize(new java.awt.Dimension(220, 160));

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 11));
        lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMessage.setText("Tem a certeza que quer Cancelar?");

        btnWarningYes.setText("Sim");
        btnWarningYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnWarningYesMouseReleased(evt);
            }
        });

        btnWarningNo.setText("Não");
        btnWarningNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnWarningNoMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout warningFrameLayout = new org.jdesktop.layout.GroupLayout(warningFrame.getContentPane());
        warningFrame.getContentPane().setLayout(warningFrameLayout);
        warningFrameLayout.setHorizontalGroup(
            warningFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, warningFrameLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnWarningYes)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(btnWarningNo)
                .add(43, 43, 43))
            .add(lblMessage, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        warningFrameLayout.setVerticalGroup(
            warningFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(warningFrameLayout.createSequentialGroup()
                .add(27, 27, 27)
                .add(lblMessage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(warningFrameLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnWarningNo)
                    .add(btnWarningYes))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addPanel.add(warningFrame);
        warningFrame.setBounds(100, 150, 220, 160);

        lblName.setText("Nome:");
        addPanel.add(lblName);
        lblName.setBounds(20, 26, 41, 16);

        lblStreet.setText("Rua:");
        addPanel.add(lblStreet);
        lblStreet.setBounds(20, 62, 27, 16);

        lblPostalCode.setText("Código Postal:");
        addPanel.add(lblPostalCode);
        lblPostalCode.setBounds(20, 98, 91, 16);

        lblCity.setText("Cidade:");
        addPanel.add(lblCity);
        lblCity.setBounds(20, 134, 47, 16);

        lblPhone.setText("Telefone:");
        addPanel.add(lblPhone);
        lblPhone.setBounds(20, 170, 58, 16);

        lblEmail.setText("Email:");
        addPanel.add(lblEmail);
        lblEmail.setBounds(20, 206, 38, 16);

        lblCourse.setText("Curso:");
        addPanel.add(lblCourse);
        lblCourse.setBounds(20, 242, 41, 16);

        lblScholarship.setText("Bolseiro:");
        addPanel.add(lblScholarship);
        lblScholarship.setBounds(20, 272, 54, 16);

        lblIfen.setText("-");
        addPanel.add(lblIfen);
        lblIfen.setBounds(175, 97, 8, 16);
        addPanel.add(name);
        name.setBounds(121, 20, 406, 28);
        addPanel.add(street);
        street.setBounds(121, 56, 406, 28);
        addPanel.add(postalCode);
        postalCode.setBounds(121, 92, 50, 28);
        addPanel.add(postalCode1);
        postalCode1.setBounds(186, 92, 40, 28);
        addPanel.add(city);
        city.setBounds(121, 128, 406, 28);

        phone.setMaximumSize(new java.awt.Dimension(14, 28));
        addPanel.add(phone);
        phone.setBounds(121, 164, 90, 28);
        addPanel.add(email);
        email.setBounds(121, 200, 406, 28);
        addPanel.add(course);
        course.setBounds(121, 236, 406, 28);

        scholarshipChoose.add(rdoYes);
        rdoYes.setText("Sim");
        addPanel.add(rdoYes);
        rdoYes.setBounds(121, 268, 55, 23);

        scholarshipChoose.add(rdoNo);
        rdoNo.setText("Não");
        addPanel.add(rdoNo);
        rdoNo.setBounds(182, 268, 57, 23);

        btnCancel.setText("Cancelar");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelMouseReleased(evt);
            }
        });
        addPanel.add(btnCancel);
        btnCancel.setBounds(430, 480, 98, 29);

        btnSave.setText("Guardar");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSaveMouseReleased(evt);
            }
        });
        addPanel.add(btnSave);
        btnSave.setBounds(340, 480, 93, 29);

        studentPanel.addTab("Adicionar", addPanel);

        org.jdesktop.layout.GroupLayout updatePanelLayout = new org.jdesktop.layout.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 547, Short.MAX_VALUE)
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 532, Short.MAX_VALUE)
        );

        studentPanel.addTab("Actualizar", updatePanel);

        org.jdesktop.layout.GroupLayout deletePanelLayout = new org.jdesktop.layout.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 547, Short.MAX_VALUE)
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 532, Short.MAX_VALUE)
        );

        studentPanel.addTab("Eliminar", deletePanel);

        org.jdesktop.layout.GroupLayout searchPanelLayout = new org.jdesktop.layout.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 547, Short.MAX_VALUE)
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 532, Short.MAX_VALUE)
        );

        studentPanel.addTab("Pesquisa", searchPanel);

        menuPanel.add(studentPanel);
        studentPanel.setBounds(220, 10, 570, 580);

        buttonsPanel.setOpaque(false);

        btnStudent.setText("Estudantes");
        btnStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnStudentMouseReleased(evt);
            }
        });

        btnAccount.setText("Contas");

        btnAdmin.setText("Administradores");

        btnMeal.setText("Refeições");

        btnTerminate.setText("Terminar");
        btnTerminate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnTerminateMouseReleased(evt);
            }
        });

        org.jdesktop.layout.GroupLayout buttonsPanelLayout = new org.jdesktop.layout.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(buttonsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnStudent, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .add(btnAccount, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .add(btnAdmin, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .add(btnTerminate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnMeal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(buttonsPanelLayout.createSequentialGroup()
                .add(29, 29, 29)
                .add(btnStudent, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(19, 19, 19)
                .add(btnAccount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(20, 20, 20)
                .add(btnAdmin, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnMeal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(318, 318, 318)
                .add(btnTerminate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        menuPanel.add(buttonsPanel);
        buttonsPanel.setBounds(0, 0, 200, 600);

        lblBackBK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pt/uac/cafeteria/ui/images/backBK.png"))); // NOI18N
        menuPanel.add(lblBackBK1);
        lblBackBK1.setBounds(0, 0, 800, 600);

        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        menuPanel.add(separator);
        separator.setBounds(205, 0, 10, 611);

        getContentPane().add(menuPanel);
        menuPanel.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseReleased
        mainPanel.setVisible(false);
        menuPanel.setVisible(true);
        btnStudent.setEnabled(true);
        btnAccount.setEnabled(true);
        btnAdmin.setEnabled(true);
        btnMeal.setEnabled(true);
        btnTerminate.setEnabled(true);
        studentPanel.setVisible(false);
    }//GEN-LAST:event_confirmMouseReleased

    private void btnStudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStudentMouseReleased
        studentPanel.setVisible(true);
        studentPanel.setEnabled(true);
        btnCancel.setEnabled(true);
        btnSave.setEnabled(true);
        btnStudent.setEnabled(false);
        scholarshipChoose.clearSelection();
    }//GEN-LAST:event_btnStudentMouseReleased

    private void btnCancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseReleased
        warningFrame.setVisible(true);
        studentPanel.setEnabled(false);
        btnCancel.setEnabled(false);
        btnSave.setEnabled(false);
        informationFrame.setVisible(false);
    }//GEN-LAST:event_btnCancelMouseReleased

    private void btnWarningNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarningNoMouseReleased
        btnCancel.setEnabled(true);
        btnSave.setEnabled(true);
        studentPanel.setEnabled(true);
        warningFrame.setVisible(false);
    }//GEN-LAST:event_btnWarningNoMouseReleased

    private void btnWarningYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWarningYesMouseReleased
        warningFrame.setVisible(false);
        studentPanel.setVisible(false);
        btnStudent.setEnabled(true);
        cleanPanel(addPanel);
    }//GEN-LAST:event_btnWarningYesMouseReleased

    private void btnSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseReleased
        studentPanel.setEnabled(false);
        informationFrame.setVisible(true);
        btnCancel.setEnabled(false);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveMouseReleased

    private void btnOkMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkMouseReleased
        informationFrame.setVisible(false);
        cleanPanel(addPanel);
        scholarshipChoose.clearSelection();
        studentPanel.setEnabled(true);
        btnSave.setEnabled(true);
        btnCancel.setEnabled(true);
    }//GEN-LAST:event_btnOkMouseReleased

    private void btnLogYesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogYesMouseReleased
        warningLogFrame.setVisible(false);
        warningFrame.setVisible(false);
        informationFrame.setVisible(false);
        menuPanel.setVisible(false);
        mainPanel.setVisible(true);
        cleanPanel(addPanel);
    }//GEN-LAST:event_btnLogYesMouseReleased

    private void btnLogNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogNoMouseReleased
        btnTerminate.setEnabled(true);
        warningLogFrame.setVisible(false);
        btnCancel.setEnabled(true);
        btnSave.setEnabled(true);
        studentPanel.setEnabled(true);
    }//GEN-LAST:event_btnLogNoMouseReleased

    private void btnTerminateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTerminateMouseReleased
        btnTerminate.setEnabled(false);
        warningLogFrame.setVisible(true);
        warningFrame.setVisible(false);
        informationFrame.setVisible(false);
    }//GEN-LAST:event_btnTerminateMouseReleased

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
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Backend().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JButton btnAccount;
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogNo;
    private javax.swing.JButton btnLogYes;
    private javax.swing.JButton btnMeal;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTerminate;
    private javax.swing.JButton btnWarningNo;
    private javax.swing.JButton btnWarningYes;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JTextField city;
    private javax.swing.JButton confirm;
    private javax.swing.JTextField course;
    private javax.swing.JPanel deletePanel;
    private javax.swing.JTextField email;
    private javax.swing.JInternalFrame informationFrame;
    private javax.swing.JLabel lblBackBK;
    private javax.swing.JLabel lblBackBK1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblIfen;
    private javax.swing.JLabel lblLogMessage;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessage1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPostalCode;
    private javax.swing.JLabel lblScholarship;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField postalCode;
    private javax.swing.JTextField postalCode1;
    private javax.swing.JRadioButton rdoNo;
    private javax.swing.JRadioButton rdoYes;
    private javax.swing.ButtonGroup scholarshipChoose;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JSeparator separator;
    private javax.swing.JTextField street;
    private javax.swing.JTabbedPane studentPanel;
    private javax.swing.JPanel updatePanel;
    private javax.swing.JTextField username;
    private javax.swing.JInternalFrame warningFrame;
    private javax.swing.JInternalFrame warningLogFrame;
    // End of variables declaration//GEN-END:variables
}