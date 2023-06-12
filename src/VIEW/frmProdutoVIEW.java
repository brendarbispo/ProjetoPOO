package VIEW;

import ARMAZENAMENTO.Sessao;
import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class frmProdutoVIEW extends javax.swing.JFrame {

    public frmProdutoVIEW() {
        autenticado();
        initComponents();
        setFuncionarioID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JLabel();
        btnCarregarCampos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtValor.setToolTipText("");
        txtValor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel3.setText("CADASTRO PRODUTO");

        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor:");

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Produto", "Valor"
            }
        ));
        tabelaProduto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(1).setResizable(false);
        }

        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel6.setText("id:");

        txtId.setText("0");

        btnCarregarCampos.setText("SELECIONAR");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtVoltar.setText("VOLTAR");
        txtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId))
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCarregarCampos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtVoltar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                                .addComponent(btnPesquisar))
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtId))
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnPesquisar)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregarCampos)
                    .addComponent(txtVoltar))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        CadastrarProduto();
        listarValores();
        limparCampos();

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        listarValores();
        tabelaResize(tabelaProduto);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarProduto();
        listarValores();
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVoltarActionPerformed
        voltar();
    }//GEN-LAST:event_txtVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProdutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProdutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JLabel txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtValor;
    private javax.swing.JButton txtVoltar;
    // End of variables declaration//GEN-END:variables

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
    
        public void voltar() {

            //instancia a tela que eu quero abrir
            frmPrincipalVIEW objfrmPrincipalView = new frmPrincipalVIEW();

            //faco com que apareça a tela que eu instanciei
            objfrmPrincipalView.setVisible(true);
            

            //fecha a tela anterior
            dispose();
    }

    private void setFuncionarioID() {
        ProdutoDAO objProdutoDao = new ProdutoDAO();
        int ultimoid = objProdutoDao.buscarUltimoId();

        txtId.setText(String.valueOf(ultimoid + 1));
    }

    private void listarValores() {
        try {

            ProdutoDAO objProdutoDao = new ProdutoDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setNumRows(0);

            List<ProdutoDTO> lista = objProdutoDao.pesquisarProdutos();

            for (int num = 0; num < lista.size(); num++) {

                model.addRow(new Object[]{
                    lista.get(num).getId_produto(),
                    lista.get(num).getNome_produto(),
                    lista.get(num).getValor()
                });

            }
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Listar VIEW: " + erro);
        }
    }

    private void tabelaResize(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }

    private void CarregarCampos() {
        int setar = tabelaProduto.getSelectedRow();

        //pegando da tabela o valor do id do funcionario
        txtId.setText(tabelaProduto.getModel().getValueAt(setar, 0).toString());
        txtNome.setText(tabelaProduto.getModel().getValueAt(setar, 1).toString());
        txtValor.setText(tabelaProduto.getModel().getValueAt(setar, 2).toString());
    }

    private void CadastrarProduto() {
        //enviando informacoes para o dto
        String nome;
        float valor;

        nome = txtNome.getText();
        valor = Float.parseFloat(txtValor.getText());

        ProdutoDTO objProdutoDto = new ProdutoDTO();

        objProdutoDto.setNome_produto(nome);
        objProdutoDto.setValor(valor);

        ProdutoDAO objProdutoDao = new ProdutoDAO();
        objProdutoDao.cadastrarProduto(objProdutoDto);
        JOptionPane.showMessageDialog(this, "Cadastrado", "mensagem", JOptionPane.INFORMATION_MESSAGE);
    }

    private void limparCampos() {
        txtNome.setText("");
        txtValor.setText("");
    }

    private void alterarProduto() {

        int id;
        String nome;
        float valor;

        id = Integer.parseInt(txtId.getText());
        nome = txtNome.getText();
        valor = Float.parseFloat(txtValor.getText());

        ProdutoDTO objProdutoDto = new ProdutoDTO();

        objProdutoDto.setId_produto(id);
        objProdutoDto.setNome_produto(nome);
        objProdutoDto.setValor(valor);

        ProdutoDAO objProdutoDao = new ProdutoDAO();
        objProdutoDao.alterarProduto(objProdutoDto);
    }

}
