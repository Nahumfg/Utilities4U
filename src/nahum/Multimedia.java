/*
 * 
 */

/*
 * Multimedia.java
 *
 * Created on 31/10/2012, 01:59:59 PM
 */

package nahum;


import java.util.Date;

/**
 *
 * @author Nahum Flores Gómez
 */
public class Multimedia extends javax.swing.JDialog {
        private Ejecutar ejec = new Ejecutar();
    /** Creates new form Multimedia */
    public Multimedia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Multimedia");
        Breproductor.setBorder(null);
        Breproductor.setOpaque(false);
        Bvideo.setBorder(null);
        Bvideo.setOpaque(false);
        Bpaint.setBorder(null);
        Bpaint.setOpaque(false);
        lMusic.setVisible(false);
        lVideo.setVisible(false);
        lPaint.setVisible(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Breproductor = new javax.swing.JButton();
        Bvideo = new javax.swing.JButton();
        Bpaint = new javax.swing.JButton();
        lVideo = new javax.swing.JLabel();
        lPaint = new javax.swing.JLabel();
        lMusic = new javax.swing.JLabel();
        fondomultimedia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Multimedia");
        setMaximumSize(new java.awt.Dimension(364, 364));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Breproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my music.png"))); // NOI18N
        Breproductor.setContentAreaFilled(false);
        Breproductor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BreproductorMouseMoved(evt);
            }
        });
        Breproductor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BreproductorMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BreproductorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BreproductorMouseReleased(evt);
            }
        });
        Breproductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreproductorActionPerformed(evt);
            }
        });
        getContentPane().add(Breproductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 110, 110));

        Bvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ico_film_128.png"))); // NOI18N
        Bvideo.setContentAreaFilled(false);
        Bvideo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BvideoMouseMoved(evt);
            }
        });
        Bvideo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BvideoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BvideoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BvideoMouseReleased(evt);
            }
        });
        Bvideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BvideoActionPerformed(evt);
            }
        });
        getContentPane().add(Bvideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 100, 90));

        Bpaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint.png"))); // NOI18N
        Bpaint.setBorderPainted(false);
        Bpaint.setContentAreaFilled(false);
        Bpaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BpaintMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BpaintMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BpaintMouseExited(evt);
            }
        });
        Bpaint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BpaintMouseMoved(evt);
            }
        });
        Bpaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BpaintActionPerformed(evt);
            }
        });
        getContentPane().add(Bpaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 120, 120));

        lVideo.setText("Video");
        getContentPane().add(lVideo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        lPaint.setText("Pintar");
        getContentPane().add(lPaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        lMusic.setText("Música");
        getContentPane().add(lMusic, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        fondomultimedia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/multimedia.jpg"))); // NOI18N
        getContentPane().add(fondomultimedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BvideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BvideoActionPerformed
        WriteRead leeEsc = new WriteRead();
        Date fecha = new Date();
        String registro="",os=System.getProperty("os.name");
        if (os.equalsIgnoreCase("Windos 7")||os.equalsIgnoreCase("Windows 8")||os.equalsIgnoreCase("Windows 8.1")) {
            registro = registro + "Registro fecha: "+fecha+"\n";
            registro = registro + "--------------------------------------\n";
            registro = registro + "Fue presionado el botón Video \nSe ejecuta Reproductor multimedia\n";
            registro = registro + "--------------------------------------\n";
            leeEsc.escribeReg(registro);
        }
        this.dispose();
        ejec.movie();
        System.gc();
    }//GEN-LAST:event_BvideoActionPerformed

    private void BreproductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreproductorActionPerformed
        WriteRead leeEsc = new WriteRead();
        Date fecha = new Date();
        String registro="",os=System.getProperty("os.name");
        if (os.equalsIgnoreCase("Windos 7")||os.equalsIgnoreCase("Windows 8")||os.equalsIgnoreCase("Windows 8.1")) {
            registro = registro + "Registro fecha: "+fecha+"\n";
            registro = registro + "--------------------------------------\n";
            registro = registro + "Fue presionado el botón Reproductor \nSe ejecuta Reproductor multimedia\n";
            registro = registro + "--------------------------------------\n";
            leeEsc.escribeReg(registro);
        }
        this.dispose();
        ejec.mediaPlayer();
        
    }//GEN-LAST:event_BreproductorActionPerformed

    private void BpaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BpaintActionPerformed
        WriteRead leeEsc = new WriteRead();
        Date fecha = new Date();
        String registro="",os=System.getProperty("os.name");
        if (os.equalsIgnoreCase("Windos 7")||os.equalsIgnoreCase("Windows 8")||os.equalsIgnoreCase("Windows 8.1")) {
            registro = registro + "Registro fecha: "+fecha+"\n";
            registro = registro + "--------------------------------------\n";
            registro = registro + "Fue presionado el botón Pintura \nSe ejecuta Paint\n";
            registro = registro + "--------------------------------------\n";
            leeEsc.escribeReg(registro);
        }
        this.dispose();
        ejec.pintura();
        
    }//GEN-LAST:event_BpaintActionPerformed

    private void BpaintMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BpaintMousePressed
        Bpaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint1.png")));
    }//GEN-LAST:event_BpaintMousePressed

    private void BpaintMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BpaintMouseReleased
        Bpaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint.png")));
    }//GEN-LAST:event_BpaintMouseReleased

    private void BpaintMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BpaintMouseMoved
        Bpaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paintL.png")));
        lPaint.setVisible(true);
    }//GEN-LAST:event_BpaintMouseMoved

    private void BpaintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BpaintMouseExited
        Bpaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paint.png")));
        lPaint.setVisible(false);
    }//GEN-LAST:event_BpaintMouseExited

    private void BvideoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvideoMouseMoved
        Bvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ico_filmL.png")));
        lVideo.setVisible(true);
    }//GEN-LAST:event_BvideoMouseMoved

    private void BvideoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvideoMouseExited
        Bvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ico_film_128.png")));
        lVideo.setVisible(false);
    }//GEN-LAST:event_BvideoMouseExited

    private void BvideoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvideoMousePressed
        Bvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ico_filmP.png")));
    }//GEN-LAST:event_BvideoMousePressed

    private void BvideoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BvideoMouseReleased
        Bvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ico_film_128.png")));
    }//GEN-LAST:event_BvideoMouseReleased

    private void BreproductorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreproductorMouseMoved
        Breproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my musicL.png")));
        lMusic.setVisible(true);
    }//GEN-LAST:event_BreproductorMouseMoved

    private void BreproductorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreproductorMouseExited
        Breproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my music.png")));
        lMusic.setVisible(false);
    }//GEN-LAST:event_BreproductorMouseExited

    private void BreproductorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreproductorMousePressed
        Breproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my musicP.png")));
    }//GEN-LAST:event_BreproductorMousePressed

    private void BreproductorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BreproductorMouseReleased
        Breproductor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my music.png")));
    }//GEN-LAST:event_BreproductorMouseReleased

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Multimedia dialog = new Multimedia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bpaint;
    private javax.swing.JButton Breproductor;
    private javax.swing.JButton Bvideo;
    private javax.swing.JLabel fondomultimedia;
    private javax.swing.JLabel lMusic;
    private javax.swing.JLabel lPaint;
    private javax.swing.JLabel lVideo;
    // End of variables declaration//GEN-END:variables

}
