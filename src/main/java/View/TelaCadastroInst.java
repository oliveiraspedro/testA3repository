package View;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pedro
 */
public class TelaCadastroInst extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroInst
     */
    public TelaCadastroInst() {
        initComponents();
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
        LBcep = new javax.swing.JLabel();
        LBnameinst = new javax.swing.JLabel();
        LBtextomenor = new javax.swing.JLabel();
        LBInstitucional = new javax.swing.JLabel();
        LBcadastro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1160, 720));
        jPanel1.setLayout(null);

        LBcep.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBcep.setForeground(new java.awt.Color(76, 111, 192));
        LBcep.setText("CEP");
        jPanel1.add(LBcep);
        LBcep.setBounds(470, 270, 50, 30);

        LBnameinst.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBnameinst.setForeground(new java.awt.Color(76, 111, 192));
        LBnameinst.setText("Nome da instituição");
        jPanel1.add(LBnameinst);
        LBnameinst.setBounds(470, 190, 160, 20);

        LBtextomenor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBtextomenor.setForeground(new java.awt.Color(76, 111, 191));
        LBtextomenor.setText("Cadastre sua instituição em nosso sistema");
        jPanel1.add(LBtextomenor);
        LBtextomenor.setBounds(630, 90, 340, 22);

        LBInstitucional.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBInstitucional.setForeground(new java.awt.Color(76, 111, 191));
        LBInstitucional.setText("institucional");
        jPanel1.add(LBInstitucional);
        LBInstitucional.setBounds(700, 30, 210, 70);

        LBcadastro.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBcadastro.setForeground(new java.awt.Color(76, 111, 191));
        LBcadastro.setText("Cadastro");
        jPanel1.add(LBcadastro);
        LBcadastro.setBounds(720, 0, 150, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Untitled (1).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1160, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroInst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroInst().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBInstitucional;
    private javax.swing.JLabel LBcadastro;
    private javax.swing.JLabel LBcep;
    private javax.swing.JLabel LBnameinst;
    private javax.swing.JLabel LBtextomenor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
