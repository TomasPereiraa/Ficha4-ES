package pt.ipleiria.estg.es1.financaspessoais.vista;

import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pt.ipleiria.estg.es1.financaspessoais.modelo.Conta;
import pt.ipleiria.estg.es1.financaspessoais.modelo.GestaoFinancas;
import pt.ipleiria.estg.es1.financaspessoais.modelo.TipoConta;
import pt.ipleiria.estg.es1.financaspessoais.modelo.Utilizador;

public class FinancasPessoais extends javax.swing.JFrame {

    private DefaultListModel modeloListaContas;
    
    /**
     * Creates new form FinancasPessoais
     */
    public FinancasPessoais() {
        initComponents();
        
        GestaoFinancas gestor=GestaoFinancas.getGestor();
        Utilizador utilizador=gestor.getUtilizador();

        actualizarLabelsUtilizador(utilizador);
        
        actualizarListaContas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterarUtilizador = new javax.swing.JButton();
        btnAdicionarConta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstContas = new javax.swing.JList();
        btnEditarConta = new javax.swing.JButton();
        btnEliminarConta = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblMorada = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnGuardarFicheiro = new javax.swing.JButton();
        btnLerFicheiro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAlterarUtilizador.setText("Alterar");
        btnAlterarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUtilizadorActionPerformed(evt);
            }
        });

        btnAdicionarConta.setText("Adicionar Conta");
        btnAdicionarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarContaActionPerformed(evt);
            }
        });

        lstContas.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstContas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstContasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstContas);

        btnEditarConta.setText("Editar Conta");
        btnEditarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarContaActionPerformed(evt);
            }
        });

        btnEliminarConta.setText("Eliminar Conta");
        btnEliminarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarContaActionPerformed(evt);
            }
        });

        lblNome.setText("jLabel1");

        lblMorada.setText("jLabel2");

        lblEmail.setText("jLabel3");

        jLabel4.setText("Contas:");

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMorada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarUtilizador))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardarFicheiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLerFicheiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                                .addComponent(btnSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdicionarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                    .addComponent(btnEditarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminarConta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMorada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail))
                    .addComponent(btnAlterarUtilizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarConta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSair)
                    .addComponent(btnGuardarFicheiro)
                    .addComponent(btnLerFicheiro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUtilizadorActionPerformed
        Utilizador user=GestaoFinancas.getGestor().getUtilizador();
        DadosUtilizador dialog=new DadosUtilizador(this, user);
        dialog.setVisible(true);
        GestaoFinancas.getGestor().setUtilizador(user);
        actualizarLabelsUtilizador(user);
    }//GEN-LAST:event_btnAlterarUtilizadorActionPerformed

    private void btnAdicionarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarContaActionPerformed
        Conta c=new Conta(TipoConta.ORDEM, "", 0);
        DadosConta dialog=new DadosConta(this, c);
        dialog.setVisible(true);
        
        if (dialog.isAceitado()) {
            GestaoFinancas.getGestor().adicionarConta(c);
            actualizarListaContas();
        }
    }//GEN-LAST:event_btnAdicionarContaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEditarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarContaActionPerformed
        Conta c=(Conta)lstContas.getSelectedValue();
        DadosConta dialog=new DadosConta(this, c);
        dialog.setVisible(true);
        
        actualizarListaContas();
    }//GEN-LAST:event_btnEditarContaActionPerformed

    private void btnEliminarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarContaActionPerformed
        Conta c=(Conta)lstContas.getSelectedValue();
        if (JOptionPane.showConfirmDialog(this, "Tem a certeza que quer apagar a conta\n"+c.toString()+"?")==JOptionPane.YES_OPTION){
            GestaoFinancas.getGestor().removerConta(c);
            actualizarListaContas();
        }
    }//GEN-LAST:event_btnEliminarContaActionPerformed

    private void lstContasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstContasMouseClicked
        if (evt.getClickCount()>=2) {
            Conta c=(Conta)lstContas.getSelectedValue();
            MovimentosConta dialog=new MovimentosConta(this, c);
            dialog.setVisible(true);
            actualizarListaContas();
        }
    }//GEN-LAST:event_lstContasMouseClicked

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
            java.util.logging.Logger.getLogger(FinancasPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinancasPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinancasPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinancasPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinancasPessoais().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarConta;
    private javax.swing.JButton btnAlterarUtilizador;
    private javax.swing.JButton btnEditarConta;
    private javax.swing.JButton btnEliminarConta;
    private javax.swing.JButton btnGuardarFicheiro;
    private javax.swing.JButton btnLerFicheiro;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMorada;
    private javax.swing.JLabel lblNome;
    private javax.swing.JList lstContas;
    // End of variables declaration//GEN-END:variables

    private void actualizarLabelsUtilizador(Utilizador utilizador) {
        lblNome.setText(utilizador.getNome());
        lblMorada.setText(utilizador.getMorada());
        lblEmail.setText(utilizador.getEmail());
    }

    private void actualizarListaContas() {
        modeloListaContas=new DefaultListModel();
        for (Conta c:GestaoFinancas.getGestor().getContas())
            modeloListaContas.addElement(c);
        
        lstContas.setModel(modeloListaContas);
    }
}
