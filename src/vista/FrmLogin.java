
package vista;

import Dato.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class FrmLogin extends javax.swing.JFrame {

    Usuario usuario;
    private File archivo = new File("archivo.txt");
    public FrmLogin() { 
        initComponents();
        this.setLocationRelativeTo(null);   
        actionHover();
        
        setImageBackground(login_background,"src/resource/iLogin_background.jpg"); 
    }
 
    
    public void actionHover (){
        btnLogin.addMouseListener(new MouseAdapter(){ 
             Color background = btnLogin.getBackground(); 
             
            @Override
            public void mouseEntered(MouseEvent e) {  
              btnLogin.setBackground(Color.DARK_GRAY); 
            }
             @Override 
            public void mouseExited(MouseEvent e){ 
                btnLogin.setBackground(background);
            }
        }); 
        
        btnSalir.addMouseListener(new MouseAdapter(){ 
             Color background = btnLogin.getBackground(); 
             
            @Override
            public void mouseEntered(MouseEvent e) {  
              btnSalir.setBackground(Color.DARK_GRAY); 
            }
             @Override 
            public void mouseExited(MouseEvent e){ 
                btnSalir.setBackground(background);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        login_background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login CRUD");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_background.setInheritsPopupMenu(false);
        jPanel1.add(login_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 210));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        txtUsuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 130, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Iniciar Sesion");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 170, 30));

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 120, -1));

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 50, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here
         char[] password = txtPassword.getPassword();  
         usuario = new Usuario();
         System.out.println(password); 
         
        
        if(!txtUsuario.equals("")&& !String.valueOf(txtPassword.getPassword()).equals("") ){
           
            if (usuario.validarUsuarioLogin(archivo,txtUsuario.getText(),String.valueOf(password))){
                
                FrmPrincipal frm = new FrmPrincipal();  
                 JOptionPane.showMessageDialog(null,"Acceso Permitido ! Ingresando al Sistema...");
                frm.setVisible(true);
                this.dispose();
            }
            else JOptionPane.showMessageDialog(null,"Acceso Denegado!");    
            
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here: 
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_background;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void setImageBackground(JLabel label ,String root) { 
        ImageIcon image = new ImageIcon(root); 
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_DEFAULT)
        ); 
        label.setIcon(icon);  
        label.setLayout(null);
        this.repaint();
    }
}
