/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import infinitystore.com.JTableRenderer;
import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author wylli
 */
public class Usuario extends javax.swing.JFrame {

    private LojaAdmin admin = new LojaAdmin();
    private int[] indices;
    private List<Produto> produtosAdicionados = new ArrayList<Produto>();
    private List<Produto> produtoFavorito = new ArrayList<Produto>();

    /**
     * Creates new form Usuario2
     */
    public Usuario() {
        admin.recuperaDados();
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        botaoCarrinho = new javax.swing.JButton();
        botaoProcurar = new javax.swing.JButton();
        nomeProduto = new javax.swing.JTextField();
        adicionaCarrinho = new javax.swing.JButton();
        addFavorito = new javax.swing.JButton();
        configUsuario = new javax.swing.JButton();
        adicionarFavorito = new javax.swing.JButton();
        comprarAgora = new javax.swing.JButton();
        modaAcessorios = new javax.swing.JButton();
        eletrodomesticos = new javax.swing.JButton();
        informatica = new javax.swing.JButton();
        moveisDecoracao = new javax.swing.JButton();
        industriaComercio = new javax.swing.JButton();
        games = new javax.swing.JButton();
        esporteLazer = new javax.swing.JButton();
        backgroundUser = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setResizable(false);
        getContentPane().setLayout(null);

        tabelaUsuario.setBackground(new java.awt.Color(26, 26, 26));
        tabelaUsuario.setFont(new java.awt.Font("Helvetica-Normal", 0, 11)); // NOI18N
        tabelaUsuario.setForeground(new java.awt.Color(255, 127, 42));
        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Imagem", "Nome", "Marca", "Descrição", "Qtd", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelaUsuario.setGridColor(new java.awt.Color(26, 26, 26));
        tabelaUsuario.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabelaUsuario.setRequestFocusEnabled(false);
        tabelaUsuario.setRowHeight(70);
        tabelaUsuario.setSelectionBackground(new java.awt.Color(255, 127, 42));
        jScrollPane1.setViewportView(tabelaUsuario);
        if (tabelaUsuario.getColumnModel().getColumnCount() > 0) {
            tabelaUsuario.getColumnModel().getColumn(0).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabelaUsuario.getColumnModel().getColumn(2).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(3).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(4).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(5).setResizable(false);
            tabelaUsuario.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 110, 470, 180);

        botaoCarrinho.setBorderPainted(false);
        botaoCarrinho.setContentAreaFilled(false);
        botaoCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCarrinho.setFocusPainted(false);
        botaoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCarrinho);
        botaoCarrinho.setBounds(270, 30, 30, 30);

        botaoProcurar.setBorder(null);
        botaoProcurar.setBorderPainted(false);
        botaoProcurar.setContentAreaFilled(false);
        botaoProcurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoProcurar.setFocusPainted(false);
        botaoProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProcurarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoProcurar);
        botaoProcurar.setBounds(470, 20, 30, 30);

        nomeProduto.setBackground(new java.awt.Color(51, 51, 51));
        nomeProduto.setForeground(new java.awt.Color(255, 255, 255));
        nomeProduto.setBorder(null);
        nomeProduto.setOpaque(false);
        nomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(nomeProduto);
        nomeProduto.setBounds(500, 27, 140, 20);

        adicionaCarrinho.setBorderPainted(false);
        adicionaCarrinho.setContentAreaFilled(false);
        adicionaCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionaCarrinho.setFocusPainted(false);
        adicionaCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionaCarrinhoActionPerformed(evt);
            }
        });
        getContentPane().add(adicionaCarrinho);
        adicionaCarrinho.setBounds(625, 320, 30, 30);

        addFavorito.setBorderPainted(false);
        addFavorito.setContentAreaFilled(false);
        addFavorito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addFavorito.setFocusPainted(false);
        addFavorito.setMaximumSize(new java.awt.Dimension(49, 23));
        addFavorito.setMinimumSize(new java.awt.Dimension(49, 23));
        addFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFavoritoActionPerformed(evt);
            }
        });
        getContentPane().add(addFavorito);
        addFavorito.setBounds(230, 30, 30, 30);

        configUsuario.setBorderPainted(false);
        configUsuario.setContentAreaFilled(false);
        configUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        configUsuario.setFocusPainted(false);
        configUsuario.setMaximumSize(new java.awt.Dimension(49, 23));
        configUsuario.setMinimumSize(new java.awt.Dimension(49, 23));
        configUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(configUsuario);
        configUsuario.setBounds(190, 30, 30, 30);

        adicionarFavorito.setBorderPainted(false);
        adicionarFavorito.setContentAreaFilled(false);
        adicionarFavorito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adicionarFavorito.setFocusPainted(false);
        adicionarFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarFavoritoActionPerformed(evt);
            }
        });
        getContentPane().add(adicionarFavorito);
        adicionarFavorito.setBounds(572, 320, 30, 30);

        comprarAgora.setBackground(new java.awt.Color(26, 26, 26));
        comprarAgora.setForeground(new java.awt.Color(26, 26, 26));
        comprarAgora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Comprar agora.png"))); // NOI18N
        comprarAgora.setBorderPainted(false);
        comprarAgora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comprarAgora.setFocusPainted(false);
        getContentPane().add(comprarAgora);
        comprarAgora.setBounds(448, 320, 100, 30);

        modaAcessorios.setBorderPainted(false);
        modaAcessorios.setContentAreaFilled(false);
        modaAcessorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modaAcessorios.setFocusPainted(false);
        getContentPane().add(modaAcessorios);
        modaAcessorios.setBounds(60, 150, 130, 10);

        eletrodomesticos.setBorderPainted(false);
        eletrodomesticos.setContentAreaFilled(false);
        eletrodomesticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eletrodomesticos.setFocusPainted(false);
        getContentPane().add(eletrodomesticos);
        eletrodomesticos.setBounds(60, 170, 130, 10);

        informatica.setBorderPainted(false);
        informatica.setContentAreaFilled(false);
        informatica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informatica.setFocusPainted(false);
        getContentPane().add(informatica);
        informatica.setBounds(60, 190, 130, 10);

        moveisDecoracao.setBorderPainted(false);
        moveisDecoracao.setContentAreaFilled(false);
        moveisDecoracao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moveisDecoracao.setFocusPainted(false);
        getContentPane().add(moveisDecoracao);
        moveisDecoracao.setBounds(60, 210, 130, 10);

        industriaComercio.setBorderPainted(false);
        industriaComercio.setContentAreaFilled(false);
        industriaComercio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        industriaComercio.setFocusPainted(false);
        getContentPane().add(industriaComercio);
        industriaComercio.setBounds(60, 230, 130, 10);

        games.setBorderPainted(false);
        games.setContentAreaFilled(false);
        games.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        games.setFocusPainted(false);
        getContentPane().add(games);
        games.setBounds(60, 250, 130, 10);

        esporteLazer.setBorderPainted(false);
        esporteLazer.setContentAreaFilled(false);
        esporteLazer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esporteLazer.setFocusPainted(false);
        getContentPane().add(esporteLazer);
        esporteLazer.setBounds(60, 270, 130, 10);

        backgroundUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Background User 3.png"))); // NOI18N
        backgroundUser.setPreferredSize(new java.awt.Dimension(698, 200));
        backgroundUser.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                backgroundUserComponentHidden(evt);
            }
        });
        getContentPane().add(backgroundUser);
        backgroundUser.setBounds(0, -1, 698, 380);

        setSize(new java.awt.Dimension(713, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeProdutoActionPerformed
        // TODO add your handling code here:
        botaoProcurar.doClick();
    }//GEN-LAST:event_nomeProdutoActionPerformed
    
    public List<Produto> getProdutoSelecionado() {
        return this.produtosAdicionados;
    }
    
    private void botaoProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProcurarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());

        if (tabelaUsuario.getRowCount() > 0) {
            while (tabelaUsuario.getRowCount() > 0) {
                modelo.removeRow(0);
            }
        }

        List<Integer> index = admin.indiceProduto(nomeProduto.getText());
        indices = new int[index.size()];
        for (int k = 0; k < index.size(); k++) {
            indices[k] = index.get(k);
        }
        
        TableColumnModel columnModel = tabelaUsuario.getColumnModel();
        JTableRenderer renderer = new JTableRenderer();
        columnModel.getColumn(0).setCellRenderer(renderer);
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());

        List<Produto> produtosAchados = admin.procurarProduto(nomeProduto.getText());
        if (produtosAchados.size() > 0) {
            for (Produto p : produtosAchados) {
                ImageIcon imagem = new ImageIcon(p.getImagem());
                Object[] dados = {imagem, p.getNome(), p.getMarca(), p.getDescricao(), p.getQuantidade(), p.getValor()};
                modelo.addRow(dados);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto(s) não encontrado(s)!");
        }
    }//GEN-LAST:event_botaoProcurarActionPerformed

    private void botaoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCarrinhoActionPerformed
        // TODO add your handling code here:
        new Carrinho().setVisible(true);
    }//GEN-LAST:event_botaoCarrinhoActionPerformed

    private void adicionaCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionaCarrinhoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());

        if (tabelaUsuario.getSelectedRow() != -1) {
            Produto produto = admin.analisaProduto(indices[tabelaUsuario.getSelectedRow()]);
            produtosAdicionados.add(produto);
        }
    }//GEN-LAST:event_adicionaCarrinhoActionPerformed

    private void addFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFavoritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFavoritoActionPerformed

    private void configUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configUsuarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_configUsuarioActionPerformed

    private void backgroundUserComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_backgroundUserComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_backgroundUserComponentHidden

    private void adicionarFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarFavoritoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabelaUsuario.getModel();
        tabelaUsuario.setDefaultRenderer(Object.class, new CellRenderer());
        
        if (tabelaUsuario.getSelectedRow() != -1) {
            Produto produto = admin.analisaProduto(indices[tabelaUsuario.getSelectedRow()]);
            produtoFavorito.add(produto);
        }
        
    }//GEN-LAST:event_adicionarFavoritoActionPerformed


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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFavorito;
    private javax.swing.JButton adicionaCarrinho;
    private javax.swing.JButton adicionarFavorito;
    private javax.swing.JLabel backgroundUser;
    private javax.swing.JButton botaoCarrinho;
    private javax.swing.JButton botaoProcurar;
    private javax.swing.JButton comprarAgora;
    private javax.swing.JButton configUsuario;
    private javax.swing.JButton eletrodomesticos;
    private javax.swing.JButton esporteLazer;
    private javax.swing.JButton games;
    private javax.swing.JButton industriaComercio;
    private javax.swing.JButton informatica;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modaAcessorios;
    private javax.swing.JButton moveisDecoracao;
    private javax.swing.JTextField nomeProduto;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables
}