/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Fede
 */
public class Mesas extends javax.swing.JFrame {

    /**
     * Creates new form Mesas
     */
    public Mesas() {
        initComponents();
        agregarBotones();
        habilitarMesas();
        setLocationRelativeTo(null);
    }
    //VARIABLES
    ArrayList<JButton> botones= new ArrayList<JButton>();
    ArrayList<MesaTomada> mesasTomadas= new ArrayList<MesaTomada>();
    //VARIABLES
   
    //FUNCIONES
    public void agarrarMesa(int n){
        if(botones.get(n-1).getBackground().equals(Color.green)){
            JOptionPane.showMessageDialog(null, "La mesa no esta ocupada");
        }else{
            txtMesero.setText(mesasTomadas.get(buscarMesa(n)).getMesero());
            txtCuenta.setText(""+mesasTomadas.get(buscarMesa(n)).getImporte());
            txtMesa.setText(""+mesasTomadas.get(buscarMesa(n)).getNumeroMesa());
            
        }
    }
    
    public int buscarMesa(int n){
        for(int i=0;i<mesasTomadas.size();i++){
            int aux=mesasTomadas.get(i).getNumeroMesa();
            if(aux==n){
                return i;
            }
        }
        return -1;
    }
    
    public void agregarPlata(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mesa"));
        double plata=0;
        boolean existe=false;
        int posi=-1;
        for(int i=0;i<mesasTomadas.size();i++){
            int aux=mesasTomadas.get(i).getNumeroMesa();
            if(aux==num){
                existe=true;
                posi=i;
            }
        }//fin for
        
        if(existe){
            plata=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el importe a agregar"));
            mesasTomadas.get(posi).setImporte(plata+mesasTomadas.get(posi).getImporte());
            JOptionPane.showMessageDialog(null, "Cuenta actualizada con exito");
        }else{
            JOptionPane.showMessageDialog(null, "La mesa no esta tomada.");
        }
        
    }
    public void TomarMesa(){
        int mesa=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mesa"));
        if(mesa<1 || mesa>20){
            JOptionPane.showMessageDialog(null, "La mesa no existe");
            return;
        }
        for(int i=0;i<mesasTomadas.size();i++){
            int aux=mesasTomadas.get(i).getNumeroMesa();
            if(aux==mesa){
                JOptionPane.showMessageDialog(null, "La mesa que quiere seleccionar ya esta tomada");
                return;
            }
        }
        String mesero=JOptionPane.showInputDialog("Ingrese el nombre del mesero");
        double cuenta=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el importe a pagar de la mesa"));
        mesasTomadas.add(new MesaTomada(mesa,mesero,cuenta));
        JOptionPane.showMessageDialog(null, "Mesa agregada con exito");
        int posiMesa= mesa-1;
        botones.get(posiMesa).setBackground(Color.red);
    }
    
    public void habilitarMesas(){
        for(int i=0;i<botones.size();i++){
            botones.get(i).setBackground(Color.green);
        }
    }
    
    public void agregarBotones(){
        botones.add(m1);
        botones.add(m2);
        botones.add(m3);
        botones.add(m4);
        botones.add(m5);
        botones.add(m6);
        botones.add(m7);
        botones.add(m8);
        botones.add(m9);
        botones.add(m10);
        botones.add(m11);
        botones.add(m12);
        botones.add(m13);
        botones.add(m14);
        botones.add(m15);
        botones.add(m16);
        botones.add(m17);
        botones.add(m18);
        botones.add(m19);
        botones.add(m20);
    }
    //FUNCIONES
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        m4 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m5 = new javax.swing.JButton();
        m7 = new javax.swing.JButton();
        m8 = new javax.swing.JButton();
        m9 = new javax.swing.JButton();
        m6 = new javax.swing.JButton();
        m10 = new javax.swing.JButton();
        m12 = new javax.swing.JButton();
        m13 = new javax.swing.JButton();
        m14 = new javax.swing.JButton();
        m11 = new javax.swing.JButton();
        m15 = new javax.swing.JButton();
        m17 = new javax.swing.JButton();
        m18 = new javax.swing.JButton();
        m19 = new javax.swing.JButton();
        m16 = new javax.swing.JButton();
        m20 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMesero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMesa = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Planta Baja");
        setMinimumSize(new java.awt.Dimension(940, 450));
        getContentPane().setLayout(null);

        m2.setForeground(new java.awt.Color(0, 0, 0));
        m2.setText("Mesa 2");
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });
        getContentPane().add(m2);
        m2.setBounds(143, 55, 112, 47);

        m3.setForeground(new java.awt.Color(0, 0, 0));
        m3.setText("Mesa 3");
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });
        getContentPane().add(m3);
        m3.setBounds(267, 55, 112, 47);

        m4.setForeground(new java.awt.Color(0, 0, 0));
        m4.setText("Mesa 4");
        m4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m4ActionPerformed(evt);
            }
        });
        getContentPane().add(m4);
        m4.setBounds(391, 55, 112, 47);

        m1.setForeground(new java.awt.Color(0, 0, 0));
        m1.setText("Mesa 1");
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });
        getContentPane().add(m1);
        m1.setBounds(19, 55, 112, 47);

        m5.setForeground(new java.awt.Color(0, 0, 0));
        m5.setText("Mesa 5");
        m5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m5ActionPerformed(evt);
            }
        });
        getContentPane().add(m5);
        m5.setBounds(515, 55, 112, 47);

        m7.setForeground(new java.awt.Color(0, 0, 0));
        m7.setText("Mesa 7");
        m7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m7ActionPerformed(evt);
            }
        });
        getContentPane().add(m7);
        m7.setBounds(143, 108, 112, 47);

        m8.setForeground(new java.awt.Color(0, 0, 0));
        m8.setText("Mesa 8");
        m8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m8ActionPerformed(evt);
            }
        });
        getContentPane().add(m8);
        m8.setBounds(267, 108, 112, 47);

        m9.setForeground(new java.awt.Color(0, 0, 0));
        m9.setText("Mesa 9");
        m9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m9ActionPerformed(evt);
            }
        });
        getContentPane().add(m9);
        m9.setBounds(391, 108, 112, 47);

        m6.setForeground(new java.awt.Color(0, 0, 0));
        m6.setText("Mesa 6");
        m6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m6ActionPerformed(evt);
            }
        });
        getContentPane().add(m6);
        m6.setBounds(19, 108, 112, 47);

        m10.setForeground(new java.awt.Color(0, 0, 0));
        m10.setText("Mesa 10");
        m10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m10ActionPerformed(evt);
            }
        });
        getContentPane().add(m10);
        m10.setBounds(515, 108, 112, 47);

        m12.setForeground(new java.awt.Color(0, 0, 0));
        m12.setText("Mesa 12");
        m12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m12ActionPerformed(evt);
            }
        });
        getContentPane().add(m12);
        m12.setBounds(143, 161, 112, 47);

        m13.setForeground(new java.awt.Color(0, 0, 0));
        m13.setText("Mesa 13");
        m13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m13ActionPerformed(evt);
            }
        });
        getContentPane().add(m13);
        m13.setBounds(267, 161, 112, 47);

        m14.setForeground(new java.awt.Color(0, 0, 0));
        m14.setText("Mesa 14");
        m14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m14ActionPerformed(evt);
            }
        });
        getContentPane().add(m14);
        m14.setBounds(391, 161, 112, 47);

        m11.setForeground(new java.awt.Color(0, 0, 0));
        m11.setText("Mesa 11");
        m11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m11ActionPerformed(evt);
            }
        });
        getContentPane().add(m11);
        m11.setBounds(19, 161, 112, 47);

        m15.setForeground(new java.awt.Color(0, 0, 0));
        m15.setText("Mesa 15");
        m15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m15ActionPerformed(evt);
            }
        });
        getContentPane().add(m15);
        m15.setBounds(515, 161, 112, 47);

        m17.setForeground(new java.awt.Color(0, 0, 0));
        m17.setText("Mesa 17");
        m17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m17ActionPerformed(evt);
            }
        });
        getContentPane().add(m17);
        m17.setBounds(143, 214, 112, 47);

        m18.setForeground(new java.awt.Color(0, 0, 0));
        m18.setText("Mesa 18");
        m18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m18ActionPerformed(evt);
            }
        });
        getContentPane().add(m18);
        m18.setBounds(267, 214, 112, 47);

        m19.setForeground(new java.awt.Color(0, 0, 0));
        m19.setText("Mesa 19");
        m19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m19ActionPerformed(evt);
            }
        });
        getContentPane().add(m19);
        m19.setBounds(391, 214, 112, 47);

        m16.setForeground(new java.awt.Color(0, 0, 0));
        m16.setText("Mesa 16");
        m16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m16ActionPerformed(evt);
            }
        });
        getContentPane().add(m16);
        m16.setBounds(19, 214, 112, 47);

        m20.setForeground(new java.awt.Color(0, 0, 0));
        m20.setText("Mesa 20");
        m20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m20ActionPerformed(evt);
            }
        });
        getContentPane().add(m20);
        m20.setBounds(515, 214, 112, 47);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cuenta:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(648, 129, 69, 47);

        txtMesero.setEditable(false);
        txtMesero.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtMesero);
        txtMesero.setBounds(735, 68, 153, 24);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mesero:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(645, 55, 72, 47);

        txtCuenta.setEditable(false);
        txtCuenta.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtCuenta);
        txtCuenta.setBounds(735, 142, 153, 24);

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Tomar Mesa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(6, 280, 169, 32);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mesa:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(648, 195, 53, 47);

        txtMesa.setEditable(false);
        txtMesa.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtMesa);
        txtMesa.setBounds(735, 208, 153, 24);

        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(6, 356, 169, 32);

        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar Plata");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(6, 318, 169, 32);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed
        agarrarMesa(1);
        
    }//GEN-LAST:event_m1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TomarMesa();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed
        agarrarMesa(2);
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed
        agarrarMesa(3);
    }//GEN-LAST:event_m3ActionPerformed

    private void m4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m4ActionPerformed
        agarrarMesa(4);
    }//GEN-LAST:event_m4ActionPerformed

    private void m5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m5ActionPerformed
        agarrarMesa(5);
    }//GEN-LAST:event_m5ActionPerformed

    private void m6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m6ActionPerformed
        agarrarMesa(6);
    }//GEN-LAST:event_m6ActionPerformed

    private void m7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m7ActionPerformed
        agarrarMesa(7);
    }//GEN-LAST:event_m7ActionPerformed

    private void m8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m8ActionPerformed
        agarrarMesa(8);
    }//GEN-LAST:event_m8ActionPerformed

    private void m19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m19ActionPerformed
        agarrarMesa(19);
    }//GEN-LAST:event_m19ActionPerformed

    private void m9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m9ActionPerformed
        agarrarMesa(9);
    }//GEN-LAST:event_m9ActionPerformed

    private void m10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m10ActionPerformed
        agarrarMesa(10);
    }//GEN-LAST:event_m10ActionPerformed

    private void m11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m11ActionPerformed
        agarrarMesa(11);
    }//GEN-LAST:event_m11ActionPerformed

    private void m12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m12ActionPerformed
        agarrarMesa(12);
    }//GEN-LAST:event_m12ActionPerformed

    private void m13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m13ActionPerformed
        agarrarMesa(13);
    }//GEN-LAST:event_m13ActionPerformed

    private void m14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m14ActionPerformed
        agarrarMesa(14);
    }//GEN-LAST:event_m14ActionPerformed

    private void m15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m15ActionPerformed
        agarrarMesa(15);
    }//GEN-LAST:event_m15ActionPerformed

    private void m16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m16ActionPerformed
        agarrarMesa(16);
    }//GEN-LAST:event_m16ActionPerformed

    private void m17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m17ActionPerformed
        agarrarMesa(17);
    }//GEN-LAST:event_m17ActionPerformed

    private void m18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m18ActionPerformed
        agarrarMesa(18);
    }//GEN-LAST:event_m18ActionPerformed

    private void m20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m20ActionPerformed
        agarrarMesa(20);
    }//GEN-LAST:event_m20ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarPlata();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton m1;
    private javax.swing.JButton m10;
    private javax.swing.JButton m11;
    private javax.swing.JButton m12;
    private javax.swing.JButton m13;
    private javax.swing.JButton m14;
    private javax.swing.JButton m15;
    private javax.swing.JButton m16;
    private javax.swing.JButton m17;
    private javax.swing.JButton m18;
    private javax.swing.JButton m19;
    private javax.swing.JButton m2;
    private javax.swing.JButton m20;
    private javax.swing.JButton m3;
    private javax.swing.JButton m4;
    private javax.swing.JButton m5;
    private javax.swing.JButton m6;
    private javax.swing.JButton m7;
    private javax.swing.JButton m8;
    private javax.swing.JButton m9;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtMesa;
    private javax.swing.JTextField txtMesero;
    // End of variables declaration//GEN-END:variables
}
