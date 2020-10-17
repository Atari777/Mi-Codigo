
package Interfaz;


import Fuentes.Pais;
import Fuentes.Provincia;
import javax.swing.JOptionPane;
public class JFPaises extends javax.swing.JFrame {

    /**
     * Creates new form JFPaises
     */
    Provincia provincia;
    Pais pais;
    public JFPaises() {
        initComponents();
        pais = new Pais();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFNumero = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFNumHabitantes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAIngresado = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBProvinciaMayorNumHabitantes = new javax.swing.JButton();
        jBProvinciaMenorNumHabitantes = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTAProvinciaMasHabitantes = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAProvinciaLessHabitantes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTFProvinciaBuscada = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTAProvinciaEncontrada = new javax.swing.JTextArea();
        jBBuscarProvincia = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFNumHabitantesBuscado = new javax.swing.JTextField();
        jBBuscarNumHabitantes = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTANumHabitantesEncontrado = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTFNombreABorrar = new javax.swing.JTextField();
        jBEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTALista = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jBClasificarPorNombre = new javax.swing.JButton();
        jBClasificarPorNumHabitantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Numero");

        jLabel2.setText("Nombre");

        jLabel3.setText("Num-Habitantes");

        jTFNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNumeroActionPerformed(evt);
            }
        });

        jTAIngresado.setColumns(20);
        jTAIngresado.setRows(5);
        jScrollPane1.setViewportView(jTAIngresado);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Provincia Ingresada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(jTFNumero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFNumHabitantes)))
                        .addComponent(jButton1)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNumHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Nueva", jPanel1);

        jBProvinciaMayorNumHabitantes.setText("Provincia-Mayor-Numero-Habitantes");
        jBProvinciaMayorNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProvinciaMayorNumHabitantesActionPerformed(evt);
            }
        });

        jBProvinciaMenorNumHabitantes.setText("Provincia-Menor-Numero-Habitantes");
        jBProvinciaMenorNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProvinciaMenorNumHabitantesActionPerformed(evt);
            }
        });

        jTAProvinciaMasHabitantes.setColumns(20);
        jTAProvinciaMasHabitantes.setRows(5);
        jScrollPane3.setViewportView(jTAProvinciaMasHabitantes);

        jTAProvinciaLessHabitantes.setColumns(20);
        jTAProvinciaLessHabitantes.setRows(5);
        jScrollPane4.setViewportView(jTAProvinciaLessHabitantes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBProvinciaMayorNumHabitantes)
                    .addComponent(jBProvinciaMenorNumHabitantes)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jBProvinciaMayorNumHabitantes)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jBProvinciaMenorNumHabitantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Mayor-Menor", jPanel2);

        jLabel7.setText("Busqueda por Provincia");

        jLabel8.setText("Ingresar Provincia:");

        jTAProvinciaEncontrada.setColumns(20);
        jTAProvinciaEncontrada.setRows(5);
        jScrollPane5.setViewportView(jTAProvinciaEncontrada);

        jBBuscarProvincia.setText("Buscar");
        jBBuscarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarProvinciaActionPerformed(evt);
            }
        });

        jLabel9.setText("Busqueda Por Número de Habitantes:");

        jLabel10.setText("Ingresar Numero de Habitantes:");

        jBBuscarNumHabitantes.setText("Buscar");
        jBBuscarNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarNumHabitantesActionPerformed(evt);
            }
        });

        jTANumHabitantesEncontrado.setColumns(20);
        jTANumHabitantesEncontrado.setRows(5);
        jScrollPane6.setViewportView(jTANumHabitantesEncontrado);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTFProvinciaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscarProvincia))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTFNumHabitantesBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBBuscarNumHabitantes))
                    .addComponent(jScrollPane6))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFProvinciaBuscada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarProvincia))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNumHabitantesBuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarNumHabitantes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Búsqueda Binaria", jPanel3);

        jLabel5.setText("Nombre Provincia");

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEliminar)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(jTFNombreABorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFNombreABorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jBEliminar)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Borrar", jPanel4);

        jTALista.setColumns(20);
        jTALista.setRows(5);
        jScrollPane2.setViewportView(jTALista);

        jLabel4.setText("Lista de los  Paises en el sistema:");

        jBClasificarPorNombre.setText("Clasificar-Nombre");
        jBClasificarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClasificarPorNombreActionPerformed(evt);
            }
        });

        jBClasificarPorNumHabitantes.setText("Clasificar-NumHabitantes");
        jBClasificarPorNumHabitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClasificarPorNumHabitantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBClasificarPorNumHabitantes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jBClasificarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBClasificarPorNombre)
                        .addGap(18, 18, 18)
                        .addComponent(jBClasificarPorNumHabitantes)
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       provincia = new Provincia(this.jTFNombre.getText(),
               Integer.parseInt(this.jTFNumero.getText()),Integer.parseInt(this.jTFNumHabitantes.getText()));
       this.jTAIngresado.setText(provincia.toString());
       pais.addProvincia(provincia);
       this.jTALista.setText(pais.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBClasificarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClasificarPorNombreActionPerformed
        pais.ordenarProvincias();
        jTALista.setText(pais.toString());
    }//GEN-LAST:event_jBClasificarPorNombreActionPerformed

    private void jTFNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNumeroActionPerformed
        
    }//GEN-LAST:event_jTFNumeroActionPerformed

    private void jBProvinciaMenorNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProvinciaMenorNumHabitantesActionPerformed

          jTAProvinciaLessHabitantes.setText(pais.ordenarMinHabitantes().toString());
    }//GEN-LAST:event_jBProvinciaMenorNumHabitantesActionPerformed

    private void jBClasificarPorNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClasificarPorNumHabitantesActionPerformed
        pais.ordenarPorNumHabitantes();
        jTALista.setText(pais.toString());
    }//GEN-LAST:event_jBClasificarPorNumHabitantesActionPerformed

    private void jBProvinciaMayorNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProvinciaMayorNumHabitantesActionPerformed
        jTAProvinciaMasHabitantes.setText(pais.ordenarMaxNumHabitantes().toString());
    }//GEN-LAST:event_jBProvinciaMayorNumHabitantesActionPerformed

    private void jBBuscarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarProvinciaActionPerformed
        Provincia provinciaBuscada = new Provincia(this.jTFProvinciaBuscada.getText(),0,0);
        int indice = pais.busquedaBinariaPorProvincia(provinciaBuscada);
        if(indice >= 0)
        {
            Provincia provinciaEncontrada = pais.getProvincia(indice);
            this.jTAProvinciaEncontrada.setText(provinciaEncontrada.toString());
        }else{
            JOptionPane.showMessageDialog(null, " No se ha encontrado " + this.jTFProvinciaBuscada.getText());
        }
    }//GEN-LAST:event_jBBuscarProvinciaActionPerformed

    private void jBBuscarNumHabitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarNumHabitantesActionPerformed
        int numHabitantes = Integer.parseInt(this.jTFNumHabitantesBuscado.getText());
        Provincia provinciaBuscada = new Provincia("",0,numHabitantes);
        int indice = pais.busquedaBinariaNumHabitantes(provinciaBuscada);
        if(indice >= 0)
        {
            Provincia provinciaEncontrada = pais.getProvincia(indice);
            this.jTANumHabitantesEncontrado.setText(provinciaEncontrada.toString());
        }else{
            JOptionPane.showMessageDialog(null, "No se ha encontrado una provincia con " + 
                    this.jTFNumHabitantesBuscado.getText() + " habitantes");
        }
    }//GEN-LAST:event_jBBuscarNumHabitantesActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        pais.BorrarElemento(this.jTFNombreABorrar.getText());
        jTALista.setText(pais.toString());
    }//GEN-LAST:event_jBEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(JFPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPaises.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPaises().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarNumHabitantes;
    private javax.swing.JButton jBBuscarProvincia;
    private javax.swing.JButton jBClasificarPorNombre;
    private javax.swing.JButton jBClasificarPorNumHabitantes;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBProvinciaMayorNumHabitantes;
    private javax.swing.JButton jBProvinciaMenorNumHabitantes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTAIngresado;
    private javax.swing.JTextArea jTALista;
    private javax.swing.JTextArea jTANumHabitantesEncontrado;
    private javax.swing.JTextArea jTAProvinciaEncontrada;
    private javax.swing.JTextArea jTAProvinciaLessHabitantes;
    private javax.swing.JTextArea jTAProvinciaMasHabitantes;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNombreABorrar;
    private javax.swing.JTextField jTFNumHabitantes;
    private javax.swing.JTextField jTFNumHabitantesBuscado;
    private javax.swing.JTextField jTFNumero;
    private javax.swing.JTextField jTFProvinciaBuscada;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
