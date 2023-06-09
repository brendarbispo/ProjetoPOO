/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import ARMAZENAMENTO.Sessao;
import DTO.FuncionarioDTO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author brendarodrigues
 */
public class frmPrincipalVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipalVIEW
     */
    public frmPrincipalVIEW() {
        autenticado();
        initComponents();

        FuncionarioDTO funcionario = Sessao.getInstance().getFuncionario();
        txtNome.setText(funcionario.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtVerProdutos = new javax.swing.JToggleButton();
        txtVerUsuarios = new javax.swing.JToggleButton();
        txtSair = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setText("NOME");

        txtVerProdutos.setText("PRODUTOS");
        txtVerProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerProdutosActionPerformed(evt);
            }
        });

        txtVerUsuarios.setText("USUARIOS");
        txtVerUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVerUsuariosActionPerformed(evt);
            }
        });

        txtSair.setText("SAIR");
        txtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Olá ");

        jLabel2.setText("Bem vindo ao PetShop BeJão ☻");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVerProdutos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVerUsuarios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSair))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVerProdutos)
                    .addComponent(txtSair)
                    .addComponent(txtVerUsuarios))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtVerProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerProdutosActionPerformed
        verProdutos();
    }//GEN-LAST:event_txtVerProdutosActionPerformed

    private void txtVerUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVerUsuariosActionPerformed
        FuncionarioDTO funcionario = Sessao.getInstance().getFuncionario();
        
        if(funcionario.editar()){
            verUsuarios();
        }
        else{
        JOptionPane.showMessageDialog(null, " Voce não possui permissão para esta atividade");
        }
    }//GEN-LAST:event_txtVerUsuariosActionPerformed

    private void txtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSairActionPerformed
        sair(); // Função de logout
    }//GEN-LAST:event_txtSairActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipalVIEW().setVisible(true);
            }
        });

    }

    private void sair() {

        //instancia a tela que eu quero abrir
        frmLoginVIEW objfrmLoginView = new frmLoginVIEW();

        //faco com que apareça a tela que eu instanciei
        objfrmLoginView.setVisible(true);

        //fecha a tela anterior
        dispose();

    }

    private void autenticado() {
        if (!Sessao.getInstance().autenticado()) {
            //instancia a tela que eu quero abrir
            frmLoginVIEW objfrmLoginView = new frmLoginVIEW();

            //faco com que apareça a tela que eu instanciei
            objfrmLoginView.setVisible(true);

            //fecha a tela anterior
            dispose();

        }

    }

    public void verProdutos() {

        //instancia a tela que eu quero abrir
        frmProdutoVIEW objfrmProdutoView = new frmProdutoVIEW();

        //faco com que apareça a tela que eu instanciei
        objfrmProdutoView.setVisible(true);

        //fecha a tela anterior
        dispose();
    }

    public void verUsuarios() {

        //instancia a tela que eu quero abrir
        frmUsuarioVIEW objfrmUsuariosView = new frmUsuarioVIEW();

        //faco com que apareça a tela que eu instanciei
        objfrmUsuariosView.setVisible(true);

        //fecha a tela anterior
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel txtNome;
    private javax.swing.JToggleButton txtSair;
    private javax.swing.JToggleButton txtVerProdutos;
    private javax.swing.JToggleButton txtVerUsuarios;
    // End of variables declaration//GEN-END:variables

}
