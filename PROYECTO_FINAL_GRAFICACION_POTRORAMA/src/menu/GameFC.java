
package menu;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Duraznilla
 */
public class GameFC extends javax.swing.JFrame {

    /**
     * Creates new form GameFC
     */

    private ContadorF log = new ContadorF();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;
    
    public GameFC() {
        initComponents();
       
         setCards();
    }     
    
   
    
    private void setCards() {
        int[] numero = log.getCardNumbers();
     
        c1.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[0]+".png")));
        c2.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[1]+".png")));
        c3.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[2]+".png")));
        c4.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[3]+".png")));
        c5.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[4]+".png")));
        c6.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[5]+".png")));
        c7.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[6]+".png")));
        c8.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[7]+".png")));
        c9.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[8]+".png")));
        c10.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[9]+".png")));
        c11.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[10]+".png")));
        c12.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[11]+".png")));
        c13.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[12]+".png")));
        c14.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[13]+".png")));
        c15.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[14]+".png")));
        c16.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[15]+".png")));
        c17.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[16]+".png")));
        c18.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[17]+".png")));
        c19.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[18]+".png")));
        c20.setDisabledIcon(new ImageIcon(getClass().getResource("../icon/c"+numero[19]+".png")));
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
            puntaje += 20;
            Ganador();
        }
    }
    
    private void compare() {
        if(caraUp && primerc) {
            
            if(im1.getDescription().compareTo(im2.getDescription()) != 0) {
                pbtn[0].setEnabled(true);
                pbtn[1].setEnabled(true);
                if(puntaje > 10 ) puntaje -= 10;
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
        
        primerc = false;
        caraUp = false;
        puntaje = 0;
    }
    
    private void Ganador() {
        if(!c1.isEnabled() && !c2.isEnabled() && !c3.isEnabled() && !c4.isEnabled() && !c5.isEnabled() && !c6.isEnabled() && 
                !c7.isEnabled() && !c8.isEnabled() && !c9.isEnabled() && !c10.isEnabled() && !c11.isEnabled() && 
                !c12.isEnabled() && !c13.isEnabled() && !c14.isEnabled() && !c15.isEnabled() && !c16.isEnabled()&& !c17.isEnabled()&& !c18.isEnabled()&& !c19.isEnabled()&& !c20.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Felicidades, usted ha ganado. Su puntaje es: "+puntaje, "Win!!", JOptionPane.INFORMATION_MESSAGE);
        }
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        monitoPanelMoy1 = new org.yourorghere.MonitoPanelMoy();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MEMORAMA NIVEL: FACIL");
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

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

        Salir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 204, 0));
        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/S1.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

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

        btnReiniciar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnReiniciar1.setForeground(new java.awt.Color(255, 204, 0));
        btnReiniciar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/R2.png"))); // NOI18N
        btnReiniciar1.setText("Reiniciar  ");
        btnReiniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(monitoPanelMoy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(monitoPanelMoy1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReiniciar1)
                                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReiniciar1)
                        .addGap(38, 38, 38)
                        .addComponent(Salir)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        Vtn3C frame = new Vtn3C();
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

 

    public static void main(String args[]) {
          
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GameFC().setVisible(true);
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
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton c6;
    private javax.swing.JButton c7;
    private javax.swing.JButton c8;
    private javax.swing.JButton c9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private org.yourorghere.MonitoPanelMoy monitoPanelMoy1;
    // End of variables declaration//GEN-END:variables

    
}
