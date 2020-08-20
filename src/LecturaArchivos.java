
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

public class LecturaArchivos extends javax.swing.JFrame {

    public LecturaArchivos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaContenidoArchivo = new javax.swing.JTextArea();
        btnCargaArchivo = new javax.swing.JButton();
        lblRutaArchivo = new javax.swing.JLabel();
        flchUbicarArchivo = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad 2: Lectura de archivos");

        txtareaContenidoArchivo.setEditable(false);
        txtareaContenidoArchivo.setColumns(20);
        txtareaContenidoArchivo.setRows(5);
        jScrollPane2.setViewportView(txtareaContenidoArchivo);

        btnCargaArchivo.setText("Cargar Archivo");
        btnCargaArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaArchivoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Lector de archivos - DHP");

        jLabel2.setText("Ubicación del archivo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(flchUbicarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCargaArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRutaArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCargaArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRutaArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flchUbicarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // EVENTO AL BOTON - AQUI SE BUSCARA EL ARCHIVO Y SE CARGARA EN EL AREA DE TEXTO
    private void btnCargaArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaArchivoActionPerformed
        flchUbicarArchivo.setDialogTitle("Seleccione un archivo de texto .TXT"); // titulo a la ventana de seleccion de archivo
        flchUbicarArchivo.setAcceptAllFileFilterUsed(false); // ponemos en falso la aceptacion de cualquier archivo
        // creamos un filtro para que solo acepte archivos con extencion TXT
        FileNameExtensionFilter filtrar = new FileNameExtensionFilter("Archivos .txt", "txt"); 
        flchUbicarArchivo.addChoosableFileFilter(filtrar); // añadimos el filtro a la ventana de seleccion de archivo
        // variable que guarda el valor de la eleccion de la ventana donde se busca el archivo
        int valorElegido = flchUbicarArchivo.showOpenDialog(flchUbicarArchivo);        
        if (valorElegido == JFileChooser.APPROVE_OPTION) { // si selecciono un archivo valido, ejecuta las siguientes lineas

            try { // todo el siguiente codigo dentro de un try catch para capturar errores de apertura                
                // asigno a la variable la ruta del archivo
                String rutaArchivo = flchUbicarArchivo.getSelectedFile().getAbsolutePath();
                lblRutaArchivo.setText(rutaArchivo); // al control "label(etiqueta)" le asigno la ruta
                FileInputStream archivo = new FileInputStream(rutaArchivo); // creo el stream de entrada (parametro el archivo origen)
                DataInputStream contenido = new DataInputStream(archivo); // acceso al contenido
                BufferedReader leer = new BufferedReader(new InputStreamReader(contenido)); // creo el buffer de lectura 
                String texto = ""; // variable que guardara todo lo que contiene el archivo
                String letralinea; // variable que guardara linea a linea mientras se cumpla la condicion del bucle
                while ((letralinea = leer.readLine()) != null) { // mientras haya algo que leer
                    texto += letralinea + "\n"; // lo voy asignando / guardando en la variable
                }
                txtareaContenidoArchivo.setText(texto); // cuando ya acabo de leer, lo asigno al area de texto
            } catch (IOException e) { // si hay error (no encuentra el archivo, no existe u otro
                // mensaje indicando el error
                JOptionPane.showMessageDialog(null, "Error al intentar acceder en el archivo" + e, "Error", JOptionPane.ERROR_MESSAGE);
                lblRutaArchivo.setText("No existe ese archivo"); // muestro mensaje en la etiqueta donde iria la ruta del archivo
                txtareaContenidoArchivo.setText(""); // si ya habia informacion en el area de texto, la limpio
            }
        } else { // si selecciono el boton cancelar de la ventana de busqueda
            // muestro mensaje
            JOptionPane.showMessageDialog(null, "Ha cancelado la carga del archivo", "Cancelado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCargaArchivoActionPerformed

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
            java.util.logging.Logger.getLogger(LecturaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturaArchivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LecturaArchivos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaArchivo;
    private javax.swing.JFileChooser flchUbicarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblRutaArchivo;
    private javax.swing.JTextArea txtareaContenidoArchivo;
    // End of variables declaration//GEN-END:variables
}
