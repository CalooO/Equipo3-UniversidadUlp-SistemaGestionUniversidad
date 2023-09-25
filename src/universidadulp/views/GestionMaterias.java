
package universidadulp.views;

import javax.swing.JOptionPane;
import universidadulp.Entidades.Materia;
import universidadulp.accesoADatos.MateriaData;

public class GestionMaterias extends javax.swing.JInternalFrame {

    MateriaData matData = new MateriaData();
    int resp;
    
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 38, 113));

        jPanel1.setMinimumSize(new java.awt.Dimension(690, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 440, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Materias");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Año");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));
        jPanel1.add(jtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 280, -1));
        jPanel1.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 280, -1));
        jPanel1.add(jtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 160, -1));

        jrbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jrbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.jpg"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 40, 40));

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.jpg"))); // NOI18N
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 40, 40));

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.jpg"))); // NOI18N
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jbEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 40, 40));

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar.jpg"))); // NOI18N
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(jbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 40, 40));

        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir.jpg"))); // NOI18N
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 40, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 40, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nuevo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Guardar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Eliminar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Salir");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

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
        
        resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea salir?", "Salir", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        
        if(resp == 0)
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
                
                JOptionPane.showMessageDialog(this, "Hay campos vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
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
                    
                    resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea guardar esta materia?", "Guardar", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    if(resp == 0)
                    matData.guardarMateria(materia);
                
                }else{
                    
                    codigo = matData.buscarNombre(nombre).getIdMateria();
                    materia.setIdMateria(codigo);
                    resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea modificar esta materia?", "Modificar", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    if(resp == 0)
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
                    
                    resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea modificar esta materia?", "Modificar", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    if(resp == 0)
                    matData.modificarMateria(materia);
                
                }else if(matData.buscarMateria(codigo) == null && matData.buscarNombre(nombre) == null){
                    
                    resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea guardar esta materia?", "Guardar", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    if(resp == 0)
                    matData.guardarMateria(materia);
                    
                }else if(matData.buscarNombre(nombre) != null){
                    
                    codigo = matData.buscarNombre(nombre).getIdMateria();
                    materia.setIdMateria(codigo);
                    
                    resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea modificar esta materia?", "Modificar", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                    
                    if(resp == 0)
                    matData.modificarMateria(materia);
                }
            }
                
        }catch(NumberFormatException ex){
            
                
            JOptionPane.showMessageDialog(this, "El Codigo y el Año deben ser un numeros enteros", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
//            if(jtCodigo.getText().isEmpty() || jtAnio.getText().isEmpty() || jtNombre.getText().isEmpty()){
//                
//                JOptionPane.showMessageDialog(this, "Hay campos vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
//            
//            }
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
            
            if(/*!jtCodigo.getText().isEmpty() && */jrbEstado.isSelected() && !jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()){
                
                resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar esta materia?", "Eliminar", 
                         JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
                
                if(resp == 0){
                    
                    jrbEstado.setSelected(false);
                    matData.eliminarMateria(Integer.parseInt(jtCodigo.getText()));
                }
                
            }else if(/*!jtCodigo.getText().isEmpty() && */!jrbEstado.isSelected() && !jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(this, "La materia ya fue eliminada", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                
            }
            
        }catch(NumberFormatException ex){
            
            if(!jtCodigo.getText().isEmpty()){
            
                JOptionPane.showMessageDialog(this, "El Codigo debe ser un numero entero", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            
            }else if(jrbEstado.isSelected() && !jtNombre.getText().isEmpty() && !jtAnio.getText().isEmpty()){
                
                try{
                    resp = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar esta materia?", "Eliminar", 
                             JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);

                    if(resp == 0){

                        jrbEstado.setSelected(false);
                        matData.eliminarMateria(Integer.parseInt(jtCodigo.getText()));
                    }
                }catch(NumberFormatException e){
                    
                }
            }
            /*else {
                
                JOptionPane.showMessageDialog(this, "No se puede eliminar si hay campos vacios", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }*/
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jrbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbEstadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
