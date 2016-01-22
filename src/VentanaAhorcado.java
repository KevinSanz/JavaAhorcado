
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class VentanaAhorcado extends javax.swing.JFrame {

    String palabraOculta = "CETYS";
    //contador para saber el numero de fallos
    int numeroFallos = 0;

    /**
     * Creates new form VentanaAhorcado
     */
    public VentanaAhorcado() {
        initComponents();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //con esta indicamos que vasmos a dibujar en el panel
        g = jPanel1.getGraphics();
        Image miImagen = null;
        try { 
            //cargamos una imagen
            switch(numeroFallos){
                case 0: miImagen = ImageIO.read(getClass().getResource("/ahorcado_0.png")); break;
                case 1: miImagen = ImageIO.read(getClass().getResource("/ahorcado_1.png")); break;
                case 2: miImagen = ImageIO.read(getClass().getResource("/ahorcado_2.png")); break;
                case 3: miImagen = ImageIO.read(getClass().getResource("/ahorcado_3.png")); break;
                case 4: miImagen = ImageIO.read(getClass().getResource("/ahorcado_4.png")); break;
                case 5: miImagen = ImageIO.read(getClass().getResource("/ahorcado_5.png")); break;
                case 6: miImagen = ImageIO.read(getClass().getResource("/ahorcado_fin.png")); break;
                case -100: miImagen = ImageIO.read(getClass().getResource("acertasteTodo.png")); break;
                default:miImagen = ImageIO.read(getClass().getResource("/ahorcado_fin.png")); break;
               
            }
            
        } catch (IOException ex) {

        }
        //aqui dibujo en el jPanel1

        g.drawImage(miImagen, 0, 0, jPanel1.getWidth(), jPanel1.getHeight(), null);
    }

    private void chequeaLetra(JButton boton) {
       if(boton.isEnabled()){
        
        String letra = boton.getText();
        boton.setEnabled(false);
//        System.out.println(boton.getText());
        String palabraConGuiones = jLabel1.getText();
        if (palabraOculta.contains(letra)) {
            for (int i = 0; i < palabraOculta.length(); i++) {
                if (palabraOculta.charAt(i) == letra.charAt(0)) {
                    palabraConGuiones =
                            palabraConGuiones.substring(0,2*i)
                            +letra
                            +palabraConGuiones.substring(2*i+1);
                }
            }
            jLabel1.setText(palabraConGuiones);
            //comprubeo sin en la palabra con guiones hay guiones o no ,si hay algun guion
            //no hago nada si hay algun guion indicio que he ganado la partida.
            if(!palabraConGuiones.contains("_")){
                numeroFallos=-100;
                
            }
            
        }
        else{
        numeroFallos++;
        
       
        
//        
        }
        
         repaint();
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        a = new javax.swing.JButton();
        b = new javax.swing.JButton();
        c = new javax.swing.JButton();
        d = new javax.swing.JButton();
        e = new javax.swing.JButton();
        f = new javax.swing.JButton();
        g = new javax.swing.JButton();
        n = new javax.swing.JButton();
        h = new javax.swing.JButton();
        i = new javax.swing.JButton();
        j = new javax.swing.JButton();
        k = new javax.swing.JButton();
        l = new javax.swing.JButton();
        m = new javax.swing.JButton();
        t = new javax.swing.JButton();
        ñ = new javax.swing.JButton();
        o = new javax.swing.JButton();
        p = new javax.swing.JButton();
        q = new javax.swing.JButton();
        r = new javax.swing.JButton();
        s = new javax.swing.JButton();
        z = new javax.swing.JButton();
        u = new javax.swing.JButton();
        v = new javax.swing.JButton();
        w = new javax.swing.JButton();
        x = new javax.swing.JButton();
        y = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 306, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 77, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("_ _ _ _ _ ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 358, 60));

        a.setText("A");
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aMousePressed(evt);
            }
        });
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 401, 42, 42));

        b.setText("B");
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bMousePressed(evt);
            }
        });
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 401, 42, 42));

        c.setText("C");
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cMousePressed(evt);
            }
        });
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 401, 42, 42));

        d.setText("D");
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dMousePressed(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 401, 42, 42));

        e.setText("E");
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eMousePressed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 401, 42, 42));

        f.setText("F");
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fMousePressed(evt);
            }
        });
        getContentPane().add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 401, 42, 42));

        g.setText("G");
        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                gMousePressed(evt);
            }
        });
        getContentPane().add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 401, 42, 42));

        n.setText("N");
        n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nMousePressed(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 454, 42, 42));

        h.setText("H");
        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hMousePressed(evt);
            }
        });
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 454, 42, 42));

        i.setText("I");
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iMousePressed(evt);
            }
        });
        getContentPane().add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 454, 42, 42));

        j.setText("J");
        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMousePressed(evt);
            }
        });
        getContentPane().add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 454, 42, 42));

        k.setText("K");
        k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kMousePressed(evt);
            }
        });
        getContentPane().add(k, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 454, 42, 42));

        l.setText("L");
        l.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lMousePressed(evt);
            }
        });
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 454, 42, 42));

        m.setText("M");
        m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mMousePressed(evt);
            }
        });
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 454, 42, 42));

        t.setText("T");
        t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tMousePressed(evt);
            }
        });
        getContentPane().add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 507, 42, 42));

        ñ.setText("Ñ");
        ñ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ñMousePressed(evt);
            }
        });
        getContentPane().add(ñ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 507, 42, 42));

        o.setText("O");
        o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                oMousePressed(evt);
            }
        });
        getContentPane().add(o, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 507, 42, 42));

        p.setText("P");
        p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pMousePressed(evt);
            }
        });
        getContentPane().add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 507, 42, 42));

        q.setText("Q");
        q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                qMousePressed(evt);
            }
        });
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 507, 42, 42));

        r.setText("R");
        r.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rMousePressed(evt);
            }
        });
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 507, 42, 42));

        s.setText("S");
        s.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sMousePressed(evt);
            }
        });
        getContentPane().add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 507, 42, 42));

        z.setText("Z");
        z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                zMousePressed(evt);
            }
        });
        getContentPane().add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 555, 42, 42));

        u.setText("U");
        u.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uMousePressed(evt);
            }
        });
        getContentPane().add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 555, 42, 42));

        v.setText("V");
        v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                vMousePressed(evt);
            }
        });
        getContentPane().add(v, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 555, 42, 42));

        w.setText("W");
        w.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                wMousePressed(evt);
            }
        });
        getContentPane().add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 555, 42, 42));

        x.setText("X");
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xMousePressed(evt);
            }
        });
        getContentPane().add(x, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 555, 42, 42));

        y.setText("Y");
        y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                yMousePressed(evt);
            }
        });
        getContentPane().add(y, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 555, 42, 42));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_aMousePressed

    private void bMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_bMousePressed

    private void cMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_cMousePressed

    private void dMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_dMousePressed

    private void eMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_eMousePressed

    private void fMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_fMousePressed

    private void gMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_gMousePressed

    private void nMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_nMousePressed

    private void hMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_hMousePressed

    private void iMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_iMousePressed

    private void jMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_jMousePressed

    private void kMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_kMousePressed

    private void lMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_lMousePressed

    private void mMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_mMousePressed

    private void tMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_tMousePressed

    private void ñMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ñMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_ñMousePressed

    private void oMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_oMousePressed

    private void pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_pMousePressed

    private void qMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_qMousePressed

    private void rMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_rMousePressed

    private void sMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_sMousePressed

    private void zMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_zMousePressed

    private void uMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_uMousePressed

    private void vMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_vMousePressed

    private void wMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_wMousePressed

    private void xMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_xMousePressed

    private void yMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yMousePressed
        chequeaLetra((JButton) evt.getSource());
    }//GEN-LAST:event_yMousePressed

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
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAhorcado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a;
    private javax.swing.JButton b;
    private javax.swing.JButton c;
    private javax.swing.JButton d;
    private javax.swing.JButton e;
    private javax.swing.JButton f;
    private javax.swing.JButton g;
    private javax.swing.JButton h;
    private javax.swing.JButton i;
    private javax.swing.JButton j;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton k;
    private javax.swing.JButton l;
    private javax.swing.JButton m;
    private javax.swing.JButton n;
    private javax.swing.JButton o;
    private javax.swing.JButton p;
    private javax.swing.JButton q;
    private javax.swing.JButton r;
    private javax.swing.JButton s;
    private javax.swing.JButton t;
    private javax.swing.JButton u;
    private javax.swing.JButton v;
    private javax.swing.JButton w;
    private javax.swing.JButton x;
    private javax.swing.JButton y;
    private javax.swing.JButton z;
    private javax.swing.JButton ñ;
    // End of variables declaration//GEN-END:variables
}
