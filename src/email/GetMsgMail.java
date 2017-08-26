
package email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author NahumFrog
 */
public class GetMsgMail extends javax.swing.JFrame {

    /**
     * Creates new form GetMsgMail
     */
    public GetMsgMail() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private static final String MAIL_PATTERN = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$;";
    private MailLogSend eMailSend = new MailLogSend();
    private String name, mail, msg;
    ////////////////////////////////////////////////////////////////////////////
    private static boolean validaMail(String mail){
        Pattern pattern = Pattern.compile(MAIL_PATTERN);
        
        Matcher matcher = pattern.matcher(mail);
        return matcher.matches();
    }
    private boolean checkAnonymous(){
        if (checkAnonimo.isSelected()) {
            txtName.setText("Anonimo");
            txtName.setEditable(false);
            txtMail.setText("Anonimo");
            txtMail.setEditable(false);
            return true;
        }else{
            txtName.setText("");
            txtName.setEditable(true);
            txtName.requestFocus();
            txtMail.setText("");
            txtMail.setEditable(true);
            return false;
        }
    }
    private void sendMail(){
        if (txtName.getText().equalsIgnoreCase("")||txtName.getText().equalsIgnoreCase(null)||
            txtMail.getText().equalsIgnoreCase("")||txtMail.getText().equalsIgnoreCase(null)||
            txtMsg.getText().equalsIgnoreCase("")||txtMsg.getText().equalsIgnoreCase(null)) {
            JOptionPane.showMessageDialog(null,"Los campos no deben estar vacios", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            name = txtName.getText();
            mail = txtMail.getText();
            if (validaMail(mail)||checkAnonymous()) {
                msg = txtMsg.getText();
                eMailSend.sendMail(msg, name, mail);
            }else{
                JOptionPane.showMessageDialog(null,"El correo no es valido","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        checkAnonimo = new javax.swing.JCheckBox();
        bSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Comentarios");
        setResizable(false);

        jLabel1.setText("Sus comentarios son importantes para la mejora de este proyecto");

        jLabel2.setText("Nombre");

        jLabel3.setText("Correo");

        txtMsg.setColumns(20);
        txtMsg.setRows(5);
        jScrollPane1.setViewportView(txtMsg);

        checkAnonimo.setText("Prefiero ser Anónimo");
        checkAnonimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnonimoActionPerformed(evt);
            }
        });

        bSend.setText("Enviar");
        bSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(checkAnonimo)
                                            .addComponent(txtMail, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                            .addComponent(txtName)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(bSend)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkAnonimo)
                .addGap(18, 18, 18)
                .addComponent(bSend)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkAnonimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnonimoActionPerformed
        checkAnonymous();
    }//GEN-LAST:event_checkAnonimoActionPerformed

    private void bSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSendActionPerformed
        sendMail();
        this.dispose();
    }//GEN-LAST:event_bSendActionPerformed

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
            java.util.logging.Logger.getLogger(GetMsgMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetMsgMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetMsgMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetMsgMail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetMsgMail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bSend;
    private javax.swing.JCheckBox checkAnonimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextArea txtMsg;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}