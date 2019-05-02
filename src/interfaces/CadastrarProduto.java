/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import infinitystore.com.LojaAdmin;
import infinitystore.com.Produto;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author marcio
 */
public class CadastrarProduto extends javax.swing.JFrame {
    private LojaAdmin admin = new LojaAdmin();
    /**
     * Creates new form CadastrarProduto
     */
    public CadastrarProduto() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        marca = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        valor = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descricao = new javax.swing.JTextArea();
        quantidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        diretorio = new javax.swing.JTextField();
        modaAcessorio = new javax.swing.JRadioButton();
        eletrodomesticos = new javax.swing.JRadioButton();
        informatica = new javax.swing.JRadioButton();
        moveisDecoracao = new javax.swing.JRadioButton();
        industriaComercio = new javax.swing.JRadioButton();
        esporteLazer = new javax.swing.JRadioButton();
        games = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(683, 291));
        setResizable(false);
        getContentPane().setLayout(null);

        marca.setText("Marca");
        marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaActionPerformed(evt);
            }
        });
        getContentPane().add(marca);
        marca.setBounds(80, 80, 185, 20);

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 160, 81, 23);

        valor.setText("Valor");
        getContentPane().add(valor);
        valor.setBounds(80, 260, 80, 20);

        nome.setText("Nome");
        getContentPane().add(nome);
        nome.setBounds(80, 30, 185, 20);

        descricao.setColumns(20);
        descricao.setLineWrap(true);
        descricao.setRows(5);
        descricao.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 120, 270, 90);

        quantidade.setText("Quantidade");
        getContentPane().add(quantidade);
        quantidade.setBounds(80, 220, 100, 20);

        jButton1.setText("Arquivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 260, 80, 23);

        diretorio.setEditable(false);
        getContentPane().add(diretorio);
        diretorio.setBounds(230, 260, 170, 20);

        modaAcessorio.setBackground(new java.awt.Color(245, 127, 42));
        modaAcessorio.setBorder(null);
        modaAcessorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modaAcessorioActionPerformed(evt);
            }
        });
        getContentPane().add(modaAcessorio);
        modaAcessorio.setBounds(500, 84, 13, 13);

        eletrodomesticos.setBackground(new java.awt.Color(245, 127, 42));
        eletrodomesticos.setBorder(null);
        eletrodomesticos.setFocusPainted(false);
        getContentPane().add(eletrodomesticos);
        eletrodomesticos.setBounds(500, 100, 13, 13);

        informatica.setBackground(new java.awt.Color(245, 127, 42));
        informatica.setBorder(null);
        informatica.setFocusPainted(false);
        getContentPane().add(informatica);
        informatica.setBounds(500, 117, 13, 13);

        moveisDecoracao.setBackground(new java.awt.Color(245, 127, 42));
        moveisDecoracao.setBorder(null);
        moveisDecoracao.setFocusPainted(false);
        getContentPane().add(moveisDecoracao);
        moveisDecoracao.setBounds(500, 135, 13, 13);

        industriaComercio.setBackground(new java.awt.Color(245, 127, 42));
        industriaComercio.setBorder(null);
        industriaComercio.setFocusPainted(false);
        getContentPane().add(industriaComercio);
        industriaComercio.setBounds(500, 153, 13, 13);

        esporteLazer.setBackground(new java.awt.Color(245, 127, 42));
        esporteLazer.setBorder(null);
        esporteLazer.setFocusPainted(false);
        getContentPane().add(esporteLazer);
        esporteLazer.setBounds(500, 187, 13, 13);

        games.setBackground(new java.awt.Color(245, 127, 42));
        games.setBorder(null);
        games.setFocusPainted(false);
        getContentPane().add(games);
        games.setBounds(500, 170, 13, 13);

        setSize(new java.awt.Dimension(694, 414));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String nomeProduto = nome.getText();
        String marcaProduto = marca.getText();
        String descricaoProduto = descricao.getText();
        
        String url = diretorio.getText();
        BufferedImage imagem = null;
        String urlGravada = "C:\\Users\\wylli\\Documents\\NetBeansProjects\\InfinityStore\\src\\imagensProdutos"+nomeProduto+".png";
        try {
            imagem = ImageIO.read(new File(url));
            ImageIO.write(imagem, "jpg", new File(urlGravada));
        } catch (IOException ex) {
            System.out.println("Erro na imagem");;
        }
        
        try{
            int quant = Integer.parseInt(quantidade.getText());
            double valorProduto = Double.parseDouble(valor.getText());
            if(!nomeProduto.equals("") && !marcaProduto.equals("") && !url.equals("")){   
                Produto produto = new Produto(nomeProduto, marcaProduto,"", descricaoProduto, quant, urlGravada, valorProduto);
                String status = admin.addProduto(produto);
                admin.gravaDados();
                String mensagem = String.format(" no valor de R$ %.2f", valorProduto);
                JOptionPane.showMessageDialog(null, "Produto " + status + mensagem + "."); 
            } else{
                JOptionPane.showMessageDialog(null, "Dados inválidos!");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }     
    }//GEN-LAST:event_jButton2ActionPerformed
       
    private void marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Procurar imagem");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagem", "jpg", "png");
        fileChooser.setFileFilter(filter);
        int retorno = fileChooser.showOpenDialog(this);
        if(retorno == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            diretorio.setText(file.getPath());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void modaAcessorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modaAcessorioActionPerformed
        // TODO add your handling code here:
        informatica.setSelected(false);
    }//GEN-LAST:event_modaAcessorioActionPerformed
        
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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextArea descricao;
    private javax.swing.JTextField diretorio;
    private javax.swing.JRadioButton eletrodomesticos;
    private javax.swing.JRadioButton esporteLazer;
    private javax.swing.JRadioButton games;
    private javax.swing.JRadioButton industriaComercio;
    private javax.swing.JRadioButton informatica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marca;
    private javax.swing.JRadioButton modaAcessorio;
    private javax.swing.JRadioButton moveisDecoracao;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField quantidade;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}