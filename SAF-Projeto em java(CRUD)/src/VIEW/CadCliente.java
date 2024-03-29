/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DAO.CadClienteDAO;
import DTO.CadClienteDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 55889
 */
public class CadCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadCliente
     */
    public CadCliente() {
        initComponents();
        listarValores();
        this.setResizable(false);
        //nao permite maximizar a tela
        this.setLocationRelativeTo(null);
        //coloca a tela centralizada no sistema
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        btnsair = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        btndeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btneditar = new javax.swing.JButton();
        cbxselecione = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SAF");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Endereço:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CADASTRAR CLIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("CPF:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Planos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 50, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefone:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));
        getContentPane().add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 130, -1));

        txtid.setEditable(false);
        txtid.setBackground(new java.awt.Color(153, 255, 255));
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 30, -1));

        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 280, -1));

        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 220, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 210, -1));
        getContentPane().add(txtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, -1));

        btnsair.setText("Sair");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        getContentPane().add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        btndeletar.setText("Deletar");
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btndeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Email", "Endereço", "Plano"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 480, 100));

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        cbxselecione.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OURO", "PRATA ", "DIAMANTE", " " }));
        cbxselecione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxselecioneActionPerformed(evt);
            }
        });
        getContentPane().add(cbxselecione, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fundo maior.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        // TODO add your handling code here:
        CadastrarClientes();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        AlterarClientes();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btneditarActionPerformed

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed
        // TODO add your handling code here:
        DeletarClientes();
        listarValores();
        LimparCampos();
    }//GEN-LAST:event_btndeletarActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        telaprincipal nomeVariavel = new telaprincipal();
        nomeVariavel.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void cbxselecioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxselecioneActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxselecioneActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:
        CarregarCampos();
    }//GEN-LAST:event_tabelaMouseClicked

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox<String> cbxselecione;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables

    private void listarValores() {
        try {
            CadClienteDAO objCadClienteDAO = new CadClienteDAO();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);

            ArrayList<CadClienteDTO> lista = objCadClienteDAO.ListarClientes();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_cliente(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getEmail(),
                    lista.get(num).getEndereco(),
                    lista.get(num).getPlanos(),
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "listar Valores CadCliente: " + erro);
        }
    }

    private void CarregarCampos() {
        int setar = tabela.getSelectedRow();

        txtid.setText(tabela.getModel().getValueAt(setar, 0).toString());
        txtnome.setText(tabela.getModel().getValueAt(setar, 1).toString());
        txtcpf.setText(tabela.getModel().getValueAt(setar, 2).toString());
        txttelefone.setText(tabela.getModel().getValueAt(setar, 3).toString());
        txtemail.setText(tabela.getModel().getValueAt(setar, 4).toString());
        txtendereco.setText(tabela.getModel().getValueAt(setar, 5).toString());
        //cbxselecione.setSelectedItem(tabela.getModel().getValueAt(setar ,6).toString());
        cbxselecione.setSelectedItem(tabela.getModel().getValueAt(setar,6).toString());
    }

    private void CadastrarClientes() {
        
        if (txtnome.getText().isEmpty() && txtcpf.getText().isEmpty() && txttelefone.getText().isEmpty() && txtemail.getText().isEmpty() && txtendereco.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
        
        String nome, cpf, telefone, email, endereco, planos;

        nome = txtnome.getText();
        cpf = txtcpf.getText();
        telefone = txttelefone.getText();
        email = txtemail.getText();
        endereco = txtendereco.getText();
        planos = (String) cbxselecione.getSelectedItem();

        CadClienteDTO objcadclientedto = new CadClienteDTO();
        objcadclientedto.setNome(nome);
        objcadclientedto.setCpf(cpf);
        objcadclientedto.setTelefone(telefone);
        objcadclientedto.setEmail(email);
        objcadclientedto.setEndereco(endereco);
        objcadclientedto.setPlanos(planos);
      //  objcadclientedto.
        CadClienteDAO objcadclientedao = new CadClienteDAO();
        objcadclientedao.cadastrarCliente(objcadclientedto);
        
        JOptionPane.showMessageDialog(null, "Cliente " + txtnome.getText() + " inserido com sucesso! ");
    }
        }

    private void LimparCampos() {
        txtid.setText("");
        txtnome.setText("");
        txtcpf.setText("");
        txttelefone.setText("");
        txtemail.setText("");
        txtendereco.setText("");
        cbxselecione.setSelectedIndex(-1);
        txtcpf.requestFocus();
        
    }

private void AlterarClientes(){
    int id_cliente;
    String nome, cpf, telefone, email, endereco, planos;
    
    id_cliente = Integer.parseInt(txtid.getText());
    nome = txtnome.getText();
    cpf = txtcpf.getText();
    telefone = txttelefone.getText();
    email = txtemail.getText();
    endereco= txtendereco.getText();
    planos = (String) cbxselecione.getSelectedItem();
    
    CadClienteDTO objcadclientedto = new CadClienteDTO();
    objcadclientedto.setId_cliente(id_cliente);
    objcadclientedto.setNome(nome);
    objcadclientedto.setCpf(cpf);
    objcadclientedto.setTelefone(telefone);
    objcadclientedto.setEmail(email);
    objcadclientedto.setEndereco(endereco);
    objcadclientedto.setPlanos(planos);
    
    CadClienteDAO objcadclientedao = new CadClienteDAO();
    objcadclientedao.AlterarClientes(objcadclientedto);
   
    JOptionPane.showMessageDialog(null, "Cliente " + txtnome.getText() + " Editado com sucesso! ");
}

private void DeletarClientes(){
    int id_cliente = Integer.parseInt(txtid.getText());
    
    CadClienteDTO objcadclientedto = new CadClienteDTO();
    objcadclientedto.setId_cliente(id_cliente);
    
    CadClienteDAO objcadclientedao = new CadClienteDAO();
    objcadclientedao.DeletarClientes(objcadclientedto);
    
    JOptionPane.showMessageDialog(null, "Cliente " + txtnome.getText() + " Deletado com sucesso! ");
}

   }


