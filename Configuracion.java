/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectomarvelstratego;

/**
 *
 * @author Gabby
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Configuracion
     */
    private SistemaUsuarios sistemaUsuarios;
    private Usuario usuario;
    MenuInicio ventanaPrincipal;   
    
    public Configuracion(SistemaUsuarios sistemaUsuarios, MenuInicio ventanaPrincipal) {
        initComponents();
        this.sistemaUsuarios = sistemaUsuarios;
        this.ventanaPrincipal = ventanaPrincipal;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
        btnModoTutorial = new javax.swing.JButton();
        btnModoClasico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(450, 337));

        btnModoTutorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/configTutorialActive.png"))); // NOI18N
        btnModoTutorial.setBorderPainted(false);
        btnModoTutorial.setContentAreaFilled(false);
        btnModoTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoTutorialActionPerformed(evt);
            }
        });

        btnModoClasico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttonIcons/configClassicActive.png"))); // NOI18N
        btnModoClasico.setBorderPainted(false);
        btnModoClasico.setContentAreaFilled(false);
        btnModoClasico.setFocusPainted(false);
        btnModoClasico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModoClasicoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel1.setText("CONFIGURACIÓN");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(25, 25, 25));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("En este modo las fichas aparecen en el tablero, pero no se les nota su identidad o personaje. Pero un jugador en su turno puede darle click a una ficha propia se muestra en algún lado de la pantalla su identidad.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setFocusable(false);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(25, 25, 25));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("En esta opción se muestran \nen todo momento las fichas \nque están en el tablero y su \nidentidad o personaje. Este \nmodo es útil para los que \nestán aprendiendo a jugar. ");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModoTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModoClasico, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModoTutorial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModoClasico, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModoClasicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoClasicoActionPerformed
        // TODO add your handling code here:
        usuario.tutorialActivo = false;
        actualizarUsuario();
        ventanaPrincipal.setSistemaUsuarios(sistemaUsuarios);
        this.dispose();
    }//GEN-LAST:event_btnModoClasicoActionPerformed

    private void btnModoTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModoTutorialActionPerformed
        // TODO add your handling code here:
        usuario.tutorialActivo = true;
        actualizarUsuario();
        ventanaPrincipal.setSistemaUsuarios(sistemaUsuarios);

        Tutorial tutorial = new Tutorial();
        tutorial.setVisible(true);
        this.dispose(); // Cerrar la ventana de configuración
    }//GEN-LAST:event_btnModoTutorialActionPerformed

    private void actualizarUsuario() {
        sistemaUsuarios.actualizarUsuario(usuario);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModoClasico;
    private javax.swing.JButton btnModoTutorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}