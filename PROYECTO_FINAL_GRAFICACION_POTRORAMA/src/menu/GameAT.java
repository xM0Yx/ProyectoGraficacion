
package menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Duraznilla
 */
public class GameAT extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */

    private ContadorA log = new ContadorA();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public GameAT() {
        initComponents();
       
         setCards();
    }     
    
   
    
    private void setCards() {
        int[] numero2 = log.getCardNumbers();
     
        c1.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[0]+".png")));
        c2.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[1]+".png")));
        c3.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[2]+".png")));
        c4.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[3]+".png")));
        c5.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[4]+".png")));
        c6.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[5]+".png")));
        c7.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[6]+".png")));
        c8.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[7]+".png")));
        c9.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[8]+".png")));
        c10.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[9]+".png")));
        c11.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[10]+".png")));
        c12.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[11]+".png")));
        c13.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[12]+".png")));
        c14.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[13]+".png")));
        c15.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[14]+".png")));
        c16.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[15]+".png")));
        c17.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[16]+".png")));
        c18.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[17]+".png")));
        c19.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[18]+".png")));
        c20.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[19]+".png")));
        c21.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[20]+".png")));
        c22.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[21]+".png")));
        c23.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[22]+".png")));
        c24.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[23]+".png")));
        c25.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[24]+".png")));
        c26.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[25]+".png")));
        c27.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[26]+".png")));
        c28.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero2[27]+".png")));
    }    
    
    private void btnEnabled(JButton btn) {
        
        if(!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        }
        else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 28;
            Ganador();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 14 ) puntaje -= 14;
            }
            caraUp = false;
        }
    }
    
    private void reiniciar() {
        
        c1.setEnabled(true);
        c2.setEnabled(true);
        c3.setEnabled(true);
        c4.setEnabled(true);
        c5.setEnabled(true);
        c6.setEnabled(true);
        c7.setEnabled(true);
        c8.setEnabled(true);
        c9.setEnabled(true);
        c10.setEnabled(true);
        c11.setEnabled(true);
        c12.setEnabled(true);
        c13.setEnabled(true);
        c14.setEnabled(true);
        c15.setEnabled(true);
        c16.setEnabled(true);
        c17.setEnabled(true);
        c18.setEnabled(true);
        c19.setEnabled(true);
        c20.setEnabled(true);
        c21.setEnabled(true);
        c22.setEnabled(true);
        c23.setEnabled(true);
        c24.setEnabled(true);
        c25.setEnabled(true);
        c26.setEnabled(true);
        c27.setEnabled(true);
        c28.setEnabled(true);
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
    }
    
    private void Ganador() {
        if(!c1.isEnabled() && !c2.isEnabled() && !c3.isEnabled() && !c4.isEnabled() && !c5.isEnabled() && !c6.isEnabled() && 
                !c7.isEnabled() && !c8.isEnabled() && !c9.isEnabled() && !c10.isEnabled() && !c11.isEnabled() && 
                !c12.isEnabled() && !c13.isEnabled() && !c14.isEnabled() && !c15.isEnabled() && !c16.isEnabled()&& !c17.isEnabled()&& !c18.isEnabled()&& !c19.isEnabled()&& !c20.isEnabled()&& !c21.isEnabled()&& !c22.isEnabled()&& !c23.isEnabled()&& !c24.isEnabled()
                 && !c25.isEnabled()&& !c26.isEnabled()&& !c27.isEnabled()&& !c28.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: "+puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        c5 = new javax.swing.JButton();
        c6 = new javax.swing.JButton();
        c7 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c9 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c19 = new javax.swing.JButton();
        c18 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c8 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        btnReiniciar1 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c28 = new javax.swing.JButton();
        monitoPanelPaco1 = new Personaje3D.MonitoPanelPaco();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEMORAMA NIVEL: AVANZADO");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c5.setBorder(null);
        c5.setBorderPainted(false);
        c5.setContentAreaFilled(false);
        c5.setFocusable(false);
        c5.setPreferredSize(new java.awt.Dimension(180, 110));
        c5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c5MouseExited(evt);
            }
        });
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(c5, gridBagConstraints);

        c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c6.setBorder(null);
        c6.setBorderPainted(false);
        c6.setContentAreaFilled(false);
        c6.setFocusable(false);
        c6.setPreferredSize(new java.awt.Dimension(180, 110));
        c6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c6MouseExited(evt);
            }
        });
        c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c6, gridBagConstraints);

        c7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c7.setBorder(null);
        c7.setBorderPainted(false);
        c7.setContentAreaFilled(false);
        c7.setFocusable(false);
        c7.setPreferredSize(new java.awt.Dimension(180, 110));
        c7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c7MouseExited(evt);
            }
        });
        c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(c7, gridBagConstraints);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c2.setBorder(null);
        c2.setBorderPainted(false);
        c2.setContentAreaFilled(false);
        c2.setFocusable(false);
        c2.setPreferredSize(new java.awt.Dimension(180, 110));
        c2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c2MouseExited(evt);
            }
        });
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c2, gridBagConstraints);

        c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c3.setBorder(null);
        c3.setBorderPainted(false);
        c3.setContentAreaFilled(false);
        c3.setFocusable(false);
        c3.setPreferredSize(new java.awt.Dimension(180, 110));
        c3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c3MouseExited(evt);
            }
        });
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c3, gridBagConstraints);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c1.setBorder(null);
        c1.setBorderPainted(false);
        c1.setContentAreaFilled(false);
        c1.setFocusable(false);
        c1.setMaximumSize(new java.awt.Dimension(33, 9));
        c1.setPreferredSize(new java.awt.Dimension(180, 110));
        c1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c1MouseExited(evt);
            }
        });
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c1, gridBagConstraints);

        c10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c10.setBorder(null);
        c10.setBorderPainted(false);
        c10.setContentAreaFilled(false);
        c10.setFocusable(false);
        c10.setPreferredSize(new java.awt.Dimension(180, 110));
        c10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c10MouseExited(evt);
            }
        });
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c10, gridBagConstraints);

        c11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c11.setBorder(null);
        c11.setBorderPainted(false);
        c11.setContentAreaFilled(false);
        c11.setFocusable(false);
        c11.setPreferredSize(new java.awt.Dimension(180, 110));
        c11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c11MouseExited(evt);
            }
        });
        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c11, gridBagConstraints);

        c15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c15.setBorder(null);
        c15.setBorderPainted(false);
        c15.setContentAreaFilled(false);
        c15.setFocusable(false);
        c15.setPreferredSize(new java.awt.Dimension(180, 110));
        c15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c15MouseExited(evt);
            }
        });
        c15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c15ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c15, gridBagConstraints);

        c14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c14.setBorder(null);
        c14.setBorderPainted(false);
        c14.setContentAreaFilled(false);
        c14.setFocusable(false);
        c14.setPreferredSize(new java.awt.Dimension(180, 110));
        c14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c14MouseExited(evt);
            }
        });
        c14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c14ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c14, gridBagConstraints);

        c9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c9.setBorder(null);
        c9.setBorderPainted(false);
        c9.setContentAreaFilled(false);
        c9.setFocusable(false);
        c9.setPreferredSize(new java.awt.Dimension(180, 110));
        c9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c9MouseExited(evt);
            }
        });
        c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(c9, gridBagConstraints);

        c13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c13.setBorder(null);
        c13.setBorderPainted(false);
        c13.setContentAreaFilled(false);
        c13.setFocusable(false);
        c13.setPreferredSize(new java.awt.Dimension(180, 110));
        c13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c13MouseExited(evt);
            }
        });
        c13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c13, gridBagConstraints);

        c19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c19.setBorder(null);
        c19.setBorderPainted(false);
        c19.setContentAreaFilled(false);
        c19.setFocusable(false);
        c19.setPreferredSize(new java.awt.Dimension(180, 110));
        c19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c19MouseExited(evt);
            }
        });
        c19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c19ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c19, gridBagConstraints);

        c18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c18.setBorder(null);
        c18.setBorderPainted(false);
        c18.setContentAreaFilled(false);
        c18.setFocusable(false);
        c18.setPreferredSize(new java.awt.Dimension(180, 110));
        c18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c18MouseExited(evt);
            }
        });
        c18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c18ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c18, gridBagConstraints);

        c17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c17.setBorder(null);
        c17.setBorderPainted(false);
        c17.setContentAreaFilled(false);
        c17.setFocusable(false);
        c17.setPreferredSize(new java.awt.Dimension(180, 110));
        c17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c17MouseExited(evt);
            }
        });
        c17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c17ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(c17, gridBagConstraints);

        c8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c8.setBorder(null);
        c8.setBorderPainted(false);
        c8.setContentAreaFilled(false);
        c8.setFocusable(false);
        c8.setPreferredSize(new java.awt.Dimension(180, 110));
        c8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c8MouseExited(evt);
            }
        });
        c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c8, gridBagConstraints);

        c20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c20.setBorder(null);
        c20.setBorderPainted(false);
        c20.setContentAreaFilled(false);
        c20.setFocusable(false);
        c20.setPreferredSize(new java.awt.Dimension(180, 110));
        c20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c20MouseExited(evt);
            }
        });
        c20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c20ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c20, gridBagConstraints);

        c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c4.setBorder(null);
        c4.setBorderPainted(false);
        c4.setContentAreaFilled(false);
        c4.setFocusable(false);
        c4.setPreferredSize(new java.awt.Dimension(180, 110));
        c4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c4MouseExited(evt);
            }
        });
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c4, gridBagConstraints);

        c16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c16.setBorder(null);
        c16.setBorderPainted(false);
        c16.setContentAreaFilled(false);
        c16.setFocusable(false);
        c16.setPreferredSize(new java.awt.Dimension(180, 110));
        c16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c16MouseExited(evt);
            }
        });
        c16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c16ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        jPanel1.add(c16, gridBagConstraints);

        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 204, 0));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/S1.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 18, 0, 0);
        jPanel1.add(Salir, gridBagConstraints);

        c12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c12.setBorder(null);
        c12.setBorderPainted(false);
        c12.setContentAreaFilled(false);
        c12.setFocusable(false);
        c12.setPreferredSize(new java.awt.Dimension(180, 110));
        c12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c12MouseExited(evt);
            }
        });
        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        jPanel1.add(c12, gridBagConstraints);

        btnReiniciar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReiniciar1.setForeground(new java.awt.Color(255, 204, 0));
        btnReiniciar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/R2.png"))); // NOI18N
        btnReiniciar1.setText("Reiniciar  ");
        btnReiniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciar1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 0);
        jPanel1.add(btnReiniciar1, gridBagConstraints);

        c21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c21.setBorder(null);
        c21.setBorderPainted(false);
        c21.setContentAreaFilled(false);
        c21.setFocusable(false);
        c21.setPreferredSize(new java.awt.Dimension(180, 110));
        c21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c21MouseExited(evt);
            }
        });
        c21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 11, 0);
        jPanel1.add(c21, gridBagConstraints);

        c22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c22.setBorder(null);
        c22.setBorderPainted(false);
        c22.setContentAreaFilled(false);
        c22.setFocusable(false);
        c22.setPreferredSize(new java.awt.Dimension(180, 110));
        c22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c22MouseExited(evt);
            }
        });
        c22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 11, 0);
        jPanel1.add(c22, gridBagConstraints);

        c23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c23.setBorder(null);
        c23.setBorderPainted(false);
        c23.setContentAreaFilled(false);
        c23.setFocusable(false);
        c23.setPreferredSize(new java.awt.Dimension(180, 110));
        c23.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c23MouseExited(evt);
            }
        });
        c23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 11, 0);
        jPanel1.add(c23, gridBagConstraints);

        c24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c24.setBorder(null);
        c24.setBorderPainted(false);
        c24.setContentAreaFilled(false);
        c24.setFocusable(false);
        c24.setPreferredSize(new java.awt.Dimension(180, 110));
        c24.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c24MouseExited(evt);
            }
        });
        c24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c24ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 11, 0);
        jPanel1.add(c24, gridBagConstraints);

        c25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c25.setBorder(null);
        c25.setBorderPainted(false);
        c25.setContentAreaFilled(false);
        c25.setFocusable(false);
        c25.setPreferredSize(new java.awt.Dimension(180, 110));
        c25.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c25MouseExited(evt);
            }
        });
        c25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c25ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 11, 32);
        jPanel1.add(c25, gridBagConstraints);

        c26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c26.setBorder(null);
        c26.setBorderPainted(false);
        c26.setContentAreaFilled(false);
        c26.setFocusable(false);
        c26.setPreferredSize(new java.awt.Dimension(180, 110));
        c26.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c26MouseExited(evt);
            }
        });
        c26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c26ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 32);
        jPanel1.add(c26, gridBagConstraints);

        c27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c27.setBorder(null);
        c27.setBorderPainted(false);
        c27.setContentAreaFilled(false);
        c27.setFocusable(false);
        c27.setPreferredSize(new java.awt.Dimension(180, 110));
        c27.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c27MouseExited(evt);
            }
        });
        c27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c27ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 32);
        jPanel1.add(c27, gridBagConstraints);

        c28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/01.png"))); // NOI18N
        c28.setBorder(null);
        c28.setBorderPainted(false);
        c28.setContentAreaFilled(false);
        c28.setFocusable(false);
        c28.setPreferredSize(new java.awt.Dimension(180, 110));
        c28.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/02.png"))); // NOI18N
        c28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                c28MouseExited(evt);
            }
        });
        c28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c28ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 32);
        jPanel1.add(c28, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(monitoPanelPaco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(monitoPanelPaco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Memorama");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
        btnEnabled(c12);
    }//GEN-LAST:event_c12ActionPerformed

    private void c12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c12MouseExited
        compare();
    }//GEN-LAST:event_c12MouseExited

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       Vtn3P frame = new Vtn3P();
       frame.show();
       dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void c16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c16ActionPerformed
        btnEnabled(c16);
    }//GEN-LAST:event_c16ActionPerformed

    private void c16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c16MouseExited
        compare();
    }//GEN-LAST:event_c16MouseExited

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        btnEnabled(c4);
    }//GEN-LAST:event_c4ActionPerformed

    private void c4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c4MouseExited
        compare();
    }//GEN-LAST:event_c4MouseExited

    private void c20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c20ActionPerformed
        btnEnabled(c20);
    }//GEN-LAST:event_c20ActionPerformed

    private void c20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c20MouseExited
        compare();
    }//GEN-LAST:event_c20MouseExited

    private void c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c8ActionPerformed
        btnEnabled(c8);
    }//GEN-LAST:event_c8ActionPerformed

    private void c8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c8MouseExited
        compare();
    }//GEN-LAST:event_c8MouseExited

    private void c17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c17ActionPerformed
        btnEnabled(c17);
    }//GEN-LAST:event_c17ActionPerformed

    private void c17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c17MouseExited
        compare();
    }//GEN-LAST:event_c17MouseExited

    private void c18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c18ActionPerformed
        btnEnabled(c18);
    }//GEN-LAST:event_c18ActionPerformed

    private void c18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c18MouseExited
        compare();
    }//GEN-LAST:event_c18MouseExited

    private void c19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c19ActionPerformed
        btnEnabled(c19);
    }//GEN-LAST:event_c19ActionPerformed

    private void c19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c19MouseExited
        compare();
    }//GEN-LAST:event_c19MouseExited

    private void c13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13ActionPerformed
        btnEnabled(c13);
    }//GEN-LAST:event_c13ActionPerformed

    private void c13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c13MouseExited
        compare();
    }//GEN-LAST:event_c13MouseExited

    private void c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c9ActionPerformed
        btnEnabled(c9);
    }//GEN-LAST:event_c9ActionPerformed

    private void c9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c9MouseExited
        compare();
    }//GEN-LAST:event_c9MouseExited

    private void c14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c14ActionPerformed
        btnEnabled(c14);
    }//GEN-LAST:event_c14ActionPerformed

    private void c14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c14MouseExited
        compare();
    }//GEN-LAST:event_c14MouseExited

    private void c15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c15ActionPerformed
        btnEnabled(c15);
    }//GEN-LAST:event_c15ActionPerformed

    private void c15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c15MouseExited
        compare();
    }//GEN-LAST:event_c15MouseExited

    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
        btnEnabled(c11);
    }//GEN-LAST:event_c11ActionPerformed

    private void c11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c11MouseExited
        compare();
    }//GEN-LAST:event_c11MouseExited

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        btnEnabled(c10);
    }//GEN-LAST:event_c10ActionPerformed

    private void c10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c10MouseExited
        compare();
    }//GEN-LAST:event_c10MouseExited

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        btnEnabled(c1);
    }//GEN-LAST:event_c1ActionPerformed

    private void c1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseExited
        compare();
    }//GEN-LAST:event_c1MouseExited

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        btnEnabled(c3);
    }//GEN-LAST:event_c3ActionPerformed

    private void c3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c3MouseExited
        compare();
    }//GEN-LAST:event_c3MouseExited

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        btnEnabled(c2);
    }//GEN-LAST:event_c2ActionPerformed

    private void c2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseExited
        compare();
    }//GEN-LAST:event_c2MouseExited

    private void c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c7ActionPerformed
        btnEnabled(c7);
    }//GEN-LAST:event_c7ActionPerformed

    private void c7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c7MouseExited
        compare();
    }//GEN-LAST:event_c7MouseExited

    private void c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c6ActionPerformed
        btnEnabled(c6);
    }//GEN-LAST:event_c6ActionPerformed

    private void c6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c6MouseExited
        compare();
    }//GEN-LAST:event_c6MouseExited

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
        btnEnabled(c5);
    }//GEN-LAST:event_c5ActionPerformed

    private void c5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c5MouseExited
        compare();
    }//GEN-LAST:event_c5MouseExited

    private void btnReiniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciar1ActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciar1ActionPerformed

    private void c21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c21MouseExited
        compare();
    }//GEN-LAST:event_c21MouseExited

    private void c21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c21ActionPerformed
        btnEnabled(c21);
    }//GEN-LAST:event_c21ActionPerformed

    private void c22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c22MouseExited
        compare();
    }//GEN-LAST:event_c22MouseExited

    private void c22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c22ActionPerformed
        btnEnabled(c22);
    }//GEN-LAST:event_c22ActionPerformed

    private void c23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c23MouseExited
        compare();
    }//GEN-LAST:event_c23MouseExited

    private void c23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c23ActionPerformed
        btnEnabled(c23);
    }//GEN-LAST:event_c23ActionPerformed

    private void c24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c24MouseExited
        compare();
    }//GEN-LAST:event_c24MouseExited

    private void c24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c24ActionPerformed
       btnEnabled(c24);
    }//GEN-LAST:event_c24ActionPerformed

    private void c25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c25MouseExited
        compare();
    }//GEN-LAST:event_c25MouseExited

    private void c25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c25ActionPerformed
        btnEnabled(c25);
    }//GEN-LAST:event_c25ActionPerformed

    private void c26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c26MouseExited
        compare();
    }//GEN-LAST:event_c26MouseExited

    private void c26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c26ActionPerformed
        btnEnabled(c26);
    }//GEN-LAST:event_c26ActionPerformed

    private void c27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c27MouseExited
        compare();
    }//GEN-LAST:event_c27MouseExited

    private void c27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c27ActionPerformed
        btnEnabled(c27);
    }//GEN-LAST:event_c27ActionPerformed

    private void c28MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c28MouseExited
        compare();
    }//GEN-LAST:event_c28MouseExited

    private void c28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c28ActionPerformed
        btnEnabled(c28);
    }//GEN-LAST:event_c28ActionPerformed

     
 

    public static void main(String args[]) {
          
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameAT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Salir;
    private javax.swing.JButton btnReiniciar1;
    private javax.swing.JButton c1;
    private javax.swing.JButton c10;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c14;
    private javax.swing.JButton c15;
    private javax.swing.JButton c16;
    private javax.swing.JButton c17;
    private javax.swing.JButton c18;
    private javax.swing.JButton c19;
    private javax.swing.JButton c2;
    private javax.swing.JButton c20;
    private javax.swing.JButton c21;
    private javax.swing.JButton c22;
    private javax.swing.JButton c23;
    private javax.swing.JButton c24;
    private javax.swing.JButton c25;
    private javax.swing.JButton c26;
    private javax.swing.JButton c27;
    private javax.swing.JButton c28;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JPanel jPanel1;
    private Personaje3D.MonitoPanelPaco monitoPanelPaco1;
    // End of variables declaration//GEN-END:variables

    
}
