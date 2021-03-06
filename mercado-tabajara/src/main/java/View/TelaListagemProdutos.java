/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Produto;
import Model.Mercado;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Nicolas
 */
public class TelaListagemProdutos extends javax.swing.JFrame {

    private List<Produto> produtos;

    //Modelo da tabela
    private TableModelProdutos tableModelProdutos;

    //Organizador da tabela
    private TableRowSorter myTableSorter;

    public TelaListagemProdutos() {
        //Conversão de map para ArrayList.
        Map<Integer, Produto> produtosMap = Mercado.getMercado().getEstoque().getProdutos();
        this.produtos = new ArrayList<Produto>(produtosMap.values());
        this.tableModelProdutos = new TableModelProdutos(produtos);

        initComponents();

        myTableSorter = new TableRowSorter(this.tableModelProdutos);
        tbProdutos.setRowSorter(myTableSorter);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cbFiltro = new javax.swing.JComboBox<>();
        btnFiltrarProduto = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btComparable = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem Produtos");

        tbProdutos.setModel(this.tableModelProdutos);
        jScrollPane1.setViewportView(tbProdutos);

        jLabel1.setText("Filtrar por:");

        cbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome" }));

        btnFiltrarProduto.setText("Pesquisar");
        btnFiltrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarProdutoActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");

        btComparable.setText("Comparable (Preço)");
        btComparable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComparableActionPerformed(evt);
            }
        });

        jButton2.setText("Comparator (Nome)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarProduto)
                .addContainerGap(459, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btComparable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditar)
                        .addGap(29, 29, 29)
                        .addComponent(btExcluir)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarProduto)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btEditar)
                    .addComponent(btComparable)
                    .addComponent(jButton2))
                .addGap(5, 5, 5))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarProdutoActionPerformed
        String searchText = tfPesquisar.getText();
        int filtro = cbFiltro.getSelectedIndex();

        try {
            if (tfPesquisar.getText().equals("")) {
                throw new IllegalArgumentException("Campo vazio");
            }

            if (filtro == 0) {
                myTableSorter.setRowFilter(new MyRowFilter(searchText));
            } else if (filtro == 1) {
                myTableSorter.setRowFilter(new MyRowFilterNome(searchText));
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Digite algo para pesquisar!");
        }

    }//GEN-LAST:event_btnFiltrarProdutoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        int linha = tbProdutos.getSelectedRow();
        tableModelProdutos.removeRow(linha);
        
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btComparableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComparableActionPerformed

        Collections.sort(produtos);
        this.tableModelProdutos.refresh();

    }//GEN-LAST:event_btComparableActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Collections.sort(produtos, new Comparator<Produto>() {
            public int compare(Produto p1, Produto p2) {
                return p1.getNome().compareToIgnoreCase(p2.getNome());
            }
        });
         
        this.tableModelProdutos.refresh();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComparable;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btnFiltrarProduto;
    private javax.swing.JComboBox<String> cbFiltro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
