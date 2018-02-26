/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import Vehiculos.Moto;

/**
 *
 * @author Estudiantes
 */
public class FichaVehiculo extends javax.swing.JFrame {
    
    Moto miMoto = new Moto();


    public FichaVehiculo() {
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

        textoMarca = new javax.swing.JTextField();
        boton1 = new javax.swing.JButton();
        textoCilindraje = new javax.swing.JTextField();
        textoModelo = new javax.swing.JTextField();
        textoAño = new javax.swing.JTextField();
        marca = new javax.swing.JLabel();
        Cilindraje = new javax.swing.JLabel();
        año = new javax.swing.JLabel();
        modelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textoMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoMarcaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoMarcaMouseExited(evt);
            }
        });
        textoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoMarcaActionPerformed(evt);
            }
        });

        boton1.setText("Guardar");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton1MouseEntered(evt);
            }
        });

        textoCilindraje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoCilindrajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoCilindrajeMouseExited(evt);
            }
        });
        textoCilindraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCilindrajeActionPerformed(evt);
            }
        });

        textoModelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoModeloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoModeloMouseExited(evt);
            }
        });

        textoAño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoAñoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoAñoMouseExited(evt);
            }
        });

        marca.setText("Marca:");

        Cilindraje.setText("Cilindraje;");

        año.setText("Año");

        modelo.setText("Modelo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(boton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(marca)
                                    .addComponent(Cilindraje))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(modelo)
                                    .addComponent(año))
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoAño, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cilindraje))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(año))
                .addGap(27, 27, 27)
                .addComponent(boton1)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoMarcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoMarcaMouseEntered

    }//GEN-LAST:event_textoMarcaMouseEntered

    private void textoMarcaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoMarcaMouseExited

    }//GEN-LAST:event_textoMarcaMouseExited

    private void boton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseEntered

    }//GEN-LAST:event_boton1MouseEntered

    private void textoCilindrajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoCilindrajeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCilindrajeMouseEntered

    private void textoCilindrajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoCilindrajeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCilindrajeMouseExited

    private void textoModeloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoModeloMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textoModeloMouseEntered

    private void textoModeloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoModeloMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textoModeloMouseExited

    private void textoAñoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAñoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAñoMouseEntered

    private void textoAñoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoAñoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textoAñoMouseExited

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        
        miMoto.marca=textoMarca.getText();
        miMoto.año=Integer.parseInt(textoAño.getText());
        miMoto.cilindraje=Integer.parseInt(textoCilindraje.getText());
        miMoto.modelo=textoModelo.getText();
        
    }//GEN-LAST:event_boton1MouseClicked

    private void textoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoMarcaActionPerformed

    private void textoCilindrajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCilindrajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCilindrajeActionPerformed

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
            java.util.logging.Logger.getLogger(FichaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FichaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FichaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FichaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FichaVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cilindraje;
    private javax.swing.JLabel año;
    private javax.swing.JButton boton1;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modelo;
    private javax.swing.JTextField textoAño;
    private javax.swing.JTextField textoCilindraje;
    private javax.swing.JTextField textoMarca;
    private javax.swing.JTextField textoModelo;
    // End of variables declaration//GEN-END:variables
}
