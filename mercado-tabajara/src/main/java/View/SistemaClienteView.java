/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Categoria;
import Model.Cliente;
import Model.Endereco;
import Model.Mercado;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Nicolas
 */
public class SistemaClienteView extends javax.swing.JFrame {

    private TableModelProdutos tableModelProdutos;
    private Cliente cliente;

    public SistemaClienteView() {
        Map<Integer, Produto> produtosMap = Mercado.getMercado().getEstoque().getProdutos();
        List<Produto> produtos = new ArrayList<Produto>(produtosMap.values());
        this.tableModelProdutos = new TableModelProdutos(produtos);

        Endereco e1 = new Endereco("26 de Abril", "Centro", "89155-000", 42);
        this.cliente = new Cliente("Camila", "895.647.826-57", "01/03/1996",
                "987648378", e1, "camila", "123");

        Categoria c4 = new Categoria ("Frios e lacticínios", "");
        
        Produto p1 = new Produto("Margarina Qualidade", 13.50, "1KG", c4, 57);
        Produto p2 = new Produto("Iogurte Charmanito", 3.75, "200ml", c4, 43);
        Produto p3 = new Produto("Leite Vida Longe", 3.75, "1L", c4, 50);
        
        //this.cliente.addCarrinho(p1);
        //this.cliente.addCarrinho(p2);
        //this.cliente.addCarrinho(p3);
        
        initComponents();
    }

    public Cliente getCliente() {
        return this.cliente;
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
        btAddCarrinho = new javax.swing.JButton();
        btCarrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbProdutos.setModel(this.tableModelProdutos);
        jScrollPane1.setViewportView(tbProdutos);

        btAddCarrinho.setText("Adicionar ao Carrinho");
        btAddCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCarrinhoActionPerformed(evt);
            }
        });

        btCarrinho.setText("Carrinho");
        btCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAddCarrinho)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCarrinho)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAddCarrinho)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCarrinhoActionPerformed
        TelaCarrinho telaCarrinho = new TelaCarrinho(this.cliente);
        telaCarrinho.setVisible(true);
    }//GEN-LAST:event_btCarrinhoActionPerformed

    private void btAddCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCarrinhoActionPerformed
        int linha = tbProdutos.getSelectedRow();
        int coluna = tbProdutos.getSelectedColumn();
        tbProdutos.getValueAt(linha, coluna);
        
        
    }//GEN-LAST:event_btAddCarrinhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddCarrinho;
    private javax.swing.JButton btCarrinho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}
