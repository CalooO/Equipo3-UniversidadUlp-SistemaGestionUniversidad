
package universidadulp.views;

import javax.swing.JOptionPane;
import universidadulp.Entidades.Materia;
import universidadulp.accesoADatos.MateriaData;

public class GestionMaterias extends javax.swing.JInternalFrame {

    MateriaData matData = new MateriaData();
    
    public GestionMaterias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 38, 113));

        jPanel1.setMinimumSize(new java.awt.Dimension(690, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 550, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));
        jPanel1.add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 240, -1));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 240, -1));
        jPanel1.add(jtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 240, -1));

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 390, 40, 40));
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 40, 40));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 40, 40));
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 40, 40));
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 40, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
        jtCodigo.setText("");
        jtNombre.setText("");
        jtAnio.setText("");
        jrbEstado.setSelected(false);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        try{
            if(!jtCodigo.getText().isEmpty()){

                Materia materia = new Materia();
                materia = matData.buscarMateria(Integer.parseInt(jtCodigo.getText()));
                jtNombre.setText(materia.getNombre());
                jtAnio.setText(materia.getAnioMateria()+"");
                jrbEstado.setSelected(materia.isActivo());
                
            }else if(!jtNombre.getText().isEmpty()){
                
                Materia materia = new Materia();
                materia = matData.buscarNombre(jtNombre.getText());
                jtCodigo.setText(materia.getIdMateria()+"");
                //jtNombre.setText(materia.getNombre());
                jtAnio.setText(materia.getAnioMateria()+"");
                jrbEstado.setSelected(materia.isActivo());
            }else {
                
                JOptionPane.showMessageDialog(this, "Igrese el Codigo o el Nombre de la materia que desea buscar", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(this, "El Codigo de la materia debe ser un numero entero", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        
        }catch(NullPointerException ex){
            
            JOptionPane.showMessageDialog(this, "No existe la materia", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try{
            if(jtNombre.getText().isEmpty() || jtAnio.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(this, "Los campos no deben estar vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            
            if(Integer.parseInt(jtAnio.getText()) < 1){
                
                JOptionPane.showMessageDialog(this, "El año debe ser mayor a 0", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
            
            Materia materia = new Materia();
            int codigo;
            String nombre;
            int anio;
            boolean estado;
            
            if(jtCodigo.getText().isEmpty()){

                nombre = jtNombre.getText();
                
                char[] carac = nombre.toCharArray();
                carac[0] = Character.toUpperCase(carac[0]);
                for(int i = 0; i < nombre.length()-2; i++){
                    
                    if(carac[i] == ' ' || carac[i] == '.' || carac[i] == ','){
                        
                        carac[i + 1] = Character.toUpperCase(carac[i + 1]);
                    }
                }
                
                nombre = new String(carac);
                anio = Integer.parseInt(jtAnio.getText());
                if(jrbEstado.isSelected()){

                    estado = true;
                }else {

                    estado = false;
                }
                
                materia = new Materia(nombre, anio, estado);
                if(matData.buscarNombre(nombre)==null){
                    
                    
                    matData.guardarMateria(materia);
                
                }else{
                    
                    codigo = matData.buscarNombre(nombre).getIdMateria();
                    materia.setIdMateria(codigo);
                    matData.modificarMateria(materia);
                }
            }else {
                codigo = Integer.parseInt(jtCodigo.getText());
                nombre = jtNombre.getText();
                
                char[] carac = nombre.toCharArray();
                carac[0] = Character.toUpperCase(carac[0]);
                for(int i = 0; i < nombre.length()-2; i++){
                    
                    if(carac[i] == ' ' || carac[i] == '.' || carac[i] == ','){
                        
                        carac[i + 1] = Character.toUpperCase(carac[i + 1]);
                    }
                }
                nombre = new String(carac);
                anio = Integer.parseInt(jtAnio.getText());
                if(jrbEstado.isSelected()){

                    estado = true;
                }else {

                    estado = false;
                }
                
                materia = new Materia(nombre, anio, estado);
                if(matData.buscarMateria(codigo) != null){
                    
                    codigo = matData.buscarMateria(codigo).getIdMateria();
                    materia.setIdMateria(codigo);
                    matData.modificarMateria(materia);
                
                }else if(matData.buscarMateria(codigo) == null && matData.buscarNombre(nombre) == null){
                    
                    matData.guardarMateria(materia);
                    
                }else if(matData.buscarNombre(nombre) != null){
                    
                    codigo = matData.buscarNombre(nombre).getIdMateria();
                    materia.setIdMateria(codigo);
                    matData.modificarMateria(materia);
                }
            }
                
        }catch(NumberFormatException ex){
            
                
            JOptionPane.showMessageDialog(this, "El Codigo y el Año deben ser un numeros enteros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
            if(jtCodigo.getText().isEmpty() || jtAnio.getText().isEmpty() || jtNombre.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(this, "Hay campos vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        try{
            int codigo = Integer.parseInt(jtCodigo.getText());
            String nombre = jtNombre.getText();
            
            if(jtNombre.getText().isEmpty() || jtAnio.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(this, "No se puede eliminar si hay campos vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
            }else if(matData.buscarMateria(codigo) == null && matData.buscarNombre(nombre) == null){
                
                JOptionPane.showMessageDialog(this, "La materia no existe", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
            }
            
            if(!jtCodigo.getText().isEmpty() && jrbEstado.isSelected() && !jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()){
                
                matData.eliminarMateria(Integer.parseInt(jtCodigo.getText()));
            
            }else if(!jtCodigo.getText().isEmpty() && !jrbEstado.isSelected() && !jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(this, "La materia ya fue eliminada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                
            }
            
            
            
        }catch(NumberFormatException ex){
            
            if(!jtCodigo.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(this, "El Codigo debe ser un numero entero", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
            }else {
                
                JOptionPane.showMessageDialog(this, "No se puede eliminar si hay campos vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
