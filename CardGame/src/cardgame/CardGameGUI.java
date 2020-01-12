
package cardgame;

                                                   
         
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.io.*;


public class CardGameGUI extends javax.swing.JFrame {
      
    ArrayList<ImageIcon> deck = cdeck();
    ArrayList <Integer> integers = new ArrayList();
    ArrayList<JButton> buttons = new ArrayList<>();
    ButtonValues button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, 
            button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27,
            button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, button40, button41,
            button42, button43, button44, button45, button46, button47, button48, button49, button50, button51, button52;
    boolean fail = false;
 
    int cardindex = deck.size(); 
    int counter = 0, flips = 0, matches = 0;
    int firstValue, secondValue, firstIndex, secondIndex;
    javax.swing.JButton firstButton, secondButton,thirdButton;

 
 
    public CardGameGUI() { 
        initComponents();
        for (int i = 0; i <= 51; i++) {
            integers.add(i);
        }
        Collections.shuffle(integers);
        initialize();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn30 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn40 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btn44 = new javax.swing.JButton();
        btn45 = new javax.swing.JButton();
        btn46 = new javax.swing.JButton();
        btn47 = new javax.swing.JButton();
        btn48 = new javax.swing.JButton();
        btn49 = new javax.swing.JButton();
        btn50 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn52 = new javax.swing.JButton();
        lblSentence = new javax.swing.JLabel();
        lblFlipsOutput = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn5.setAlignmentY(0.0F);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });

        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn18ActionPerformed(evt);
            }
        });

        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn19ActionPerformed(evt);
            }
        });

        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });

        btn21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn24ActionPerformed(evt);
            }
        });

        btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn25ActionPerformed(evt);
            }
        });

        btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn26ActionPerformed(evt);
            }
        });

        btn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn27ActionPerformed(evt);
            }
        });

        btn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn28ActionPerformed(evt);
            }
        });

        btn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn29ActionPerformed(evt);
            }
        });

        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn30ActionPerformed(evt);
            }
        });

        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn34ActionPerformed(evt);
            }
        });

        btn35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn35ActionPerformed(evt);
            }
        });

        btn36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn36ActionPerformed(evt);
            }
        });

        btn37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn37ActionPerformed(evt);
            }
        });

        btn38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn38ActionPerformed(evt);
            }
        });

        btn39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn39ActionPerformed(evt);
            }
        });

        btn40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn40ActionPerformed(evt);
            }
        });

        btn41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        btn43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });

        btn44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn44ActionPerformed(evt);
            }
        });

        btn45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn45ActionPerformed(evt);
            }
        });

        btn46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn46ActionPerformed(evt);
            }
        });

        btn47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn47ActionPerformed(evt);
            }
        });

        btn48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn48ActionPerformed(evt);
            }
        });

        btn49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn49ActionPerformed(evt);
            }
        });

        btn50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn50ActionPerformed(evt);
            }
        });

        btn51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });

        btn52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg"))); // NOI18N
        btn52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn52ActionPerformed(evt);
            }
        });

        lblSentence.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblSentence.setText("Number of Flips:");

        lblFlipsOutput.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn17, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn18, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn20, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn24, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn25, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn26, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSentence, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFlipsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btn16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(btn17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btn18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(btn19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(btn20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btn23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn39, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn27, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn28, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn29, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn30, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn34, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn35, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn37, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn38, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn40, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn44, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn45, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn46, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn47, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn48, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn51, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn50, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn49, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn52, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSentence, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFlipsOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jButton1)
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        String[] args = null;
        MatchGameMainMenu.main(args);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        int index = integers.get(0);
        btn1.setIcon(deck.get(index));
        checkFlip(button1, btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        int index = integers.get(1);
        btn2.setIcon(deck.get(index));
        checkFlip(button2, btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        int index = integers.get(2);
        btn3.setIcon(deck.get(index));
        checkFlip(button3, btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        int index = integers.get(3);
        btn4.setIcon(deck.get(index));
        checkFlip(button4, btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        int index = integers.get(4);
        btn5.setIcon(deck.get(index));
        checkFlip(button5, btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        int index = integers.get(5);
        btn6.setIcon(deck.get(index));
        checkFlip(button6, btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        int index = integers.get(6);
        btn7.setIcon(deck.get(index));
        checkFlip(button7, btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        int index = integers.get(7);
        btn8.setIcon(deck.get(index));
        checkFlip(button8, btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        int index = integers.get(8);
        btn9.setIcon(deck.get(index));
        checkFlip(button9, btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        int index = integers.get(9);
        btn10.setIcon(deck.get(index));
        checkFlip(button10, btn10);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        int index = integers.get(13);
        btn14.setIcon(deck.get(index));
        checkFlip(button14, btn14);
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        int index = integers.get(14);
        btn15.setIcon(deck.get(index));
        checkFlip(button15, btn15);
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        int index = integers.get(15);
        btn16.setIcon(deck.get(index));
        checkFlip(button16, btn16);
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        int index = integers.get(16);
        btn17.setIcon(deck.get(index));
        checkFlip(button17, btn17);
    }//GEN-LAST:event_btn17ActionPerformed

    private void btn18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn18ActionPerformed
        int index = integers.get(17);
        btn18.setIcon(deck.get(index));
        checkFlip(button18, btn18);
    }//GEN-LAST:event_btn18ActionPerformed

    private void btn19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn19ActionPerformed
        int index = integers.get(18);
        btn19.setIcon(deck.get(index));
        checkFlip(button19, btn19);
    }//GEN-LAST:event_btn19ActionPerformed

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        int index = integers.get(19);
        btn20.setIcon(deck.get(index));
        checkFlip(button20, btn20);
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        int index = integers.get(20);
        btn21.setIcon(deck.get(index));
        checkFlip(button21, btn21);
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        int index = integers.get(21);
        btn22.setIcon(deck.get(index));
        checkFlip(button22, btn22);
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        int index = integers.get(22);
        btn23.setIcon(deck.get(index));
        checkFlip(button23, btn23);
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn27ActionPerformed
        int index = integers.get(26);
        btn27.setIcon(deck.get(index));
        checkFlip(button27, btn27);
    }//GEN-LAST:event_btn27ActionPerformed

    private void btn28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn28ActionPerformed
        int index = integers.get(27);
        btn28.setIcon(deck.get(index));
        checkFlip(button28, btn28);
    }//GEN-LAST:event_btn28ActionPerformed

    private void btn29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn29ActionPerformed
        int index = integers.get(28);
        btn29.setIcon(deck.get(index));
        checkFlip(button29, btn29);
    }//GEN-LAST:event_btn29ActionPerformed

    private void btn30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn30ActionPerformed
        int index = integers.get(29);
        btn30.setIcon(deck.get(index));
        checkFlip(button30, btn30);
    }//GEN-LAST:event_btn30ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        int index = integers.get(30);
        btn31.setIcon(deck.get(index));
        checkFlip(button31, btn31);
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        int index = integers.get(31);
        btn32.setIcon(deck.get(index));
        checkFlip(button32, btn32);
    }//GEN-LAST:event_btn32ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        int index = integers.get(32);        
        btn33.setIcon(deck.get(index));        
        checkFlip(button33, btn33);
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn34ActionPerformed
        int index = integers.get(33);        
        btn34.setIcon(deck.get(index));        
        checkFlip(button34, btn34);
    }//GEN-LAST:event_btn34ActionPerformed

    private void btn35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn35ActionPerformed
        int index = integers.get(34);        
        btn35.setIcon(deck.get(index));        
        checkFlip(button35, btn35);
    }//GEN-LAST:event_btn35ActionPerformed

    private void btn36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn36ActionPerformed
        int index = integers.get(35);        
        btn36.setIcon(deck.get(index));        
        checkFlip(button36, btn36);
    }//GEN-LAST:event_btn36ActionPerformed

    private void btn40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn40ActionPerformed
        int index = integers.get(39);        
        btn40.setIcon(deck.get(index));        
        checkFlip(button40, btn40);
    }//GEN-LAST:event_btn40ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        int index = integers.get(40);        
        btn41.setIcon(deck.get(index));
        checkFlip(button41, btn41);
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        int index = integers.get(41);      
        btn42.setIcon(deck.get(index));     
        checkFlip(button42, btn42);
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        int index = integers.get(42);       
        btn43.setIcon(deck.get(index));      
        checkFlip(button43, btn43);
    }//GEN-LAST:event_btn43ActionPerformed

    private void btn44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn44ActionPerformed
        int index = integers.get(43);       
        btn44.setIcon(deck.get(index));      
        checkFlip(button44, btn44);
    }//GEN-LAST:event_btn44ActionPerformed

    private void btn45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn45ActionPerformed
        int index = integers.get(44);       
        btn45.setIcon(deck.get(index));      
        checkFlip(button45, btn45);
    }//GEN-LAST:event_btn45ActionPerformed

    private void btn46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn46ActionPerformed
        int index = integers.get(45);       
        btn46.setIcon(deck.get(index));      
        checkFlip(button46, btn46);
    }//GEN-LAST:event_btn46ActionPerformed

    private void btn47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn47ActionPerformed
        int index = integers.get(46);       
        btn47.setIcon(deck.get(index));       
        checkFlip(button47, btn47);
    }//GEN-LAST:event_btn47ActionPerformed

    private void btn48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn48ActionPerformed
        int index = integers.get(47);        
        btn48.setIcon(deck.get(index));       
        checkFlip(button48, btn48);
    }//GEN-LAST:event_btn48ActionPerformed

    private void btn49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn49ActionPerformed
        int index = integers.get(48);       
        btn49.setIcon(deck.get(index));       
        checkFlip(button49, btn49);
    }//GEN-LAST:event_btn49ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        int index = integers.get(10);       
        btn11.setIcon(deck.get(index));       
        checkFlip(button11, btn11);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        int index = integers.get(11);       
        btn12.setIcon(deck.get(index));       
        checkFlip(button12, btn12);
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        int index = integers.get(12);       
        btn13.setIcon(deck.get(index));       
        checkFlip(button13, btn13);
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn24ActionPerformed
        int index = integers.get(23);       
        btn24.setIcon(deck.get(index));       
        checkFlip(button24, btn24);
    }//GEN-LAST:event_btn24ActionPerformed

    private void btn25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn25ActionPerformed
        int index = integers.get(24);       
        btn25.setIcon(deck.get(index));       
        checkFlip(button25, btn25);
    }//GEN-LAST:event_btn25ActionPerformed

    private void btn26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn26ActionPerformed
        int index = integers.get(25);       
        btn26.setIcon(deck.get(index));       
        checkFlip(button26, btn26);
    }//GEN-LAST:event_btn26ActionPerformed

    private void btn37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn37ActionPerformed
        int index = integers.get(36);       
        btn37.setIcon(deck.get(index));       
        checkFlip(button37, btn37);
    }//GEN-LAST:event_btn37ActionPerformed

    private void btn38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn38ActionPerformed
        int index = integers.get(37);       
        btn38.setIcon(deck.get(index));       
        checkFlip(button38, btn38);
    }//GEN-LAST:event_btn38ActionPerformed

    private void btn39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn39ActionPerformed
        int index = integers.get(38);       
        btn39.setIcon(deck.get(index));       
        checkFlip(button39, btn39);
    }//GEN-LAST:event_btn39ActionPerformed

    private void btn50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn50ActionPerformed
        int index = integers.get(49);       
        btn50.setIcon(deck.get(index));       
        checkFlip(button50, btn50);
    }//GEN-LAST:event_btn50ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        int index = integers.get(50);       
        btn51.setIcon(deck.get(index));       
        checkFlip(button51, btn51);
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn52ActionPerformed
        int index = integers.get(51);       
        btn52.setIcon(deck.get(index));       
        checkFlip(button52, btn52);
    }//GEN-LAST:event_btn52ActionPerformed
    
    public void actionPerformed(java.awt.event.ActionEvent evt) {                               


    }
    private void checkFlip(ButtonValues buttonNumber, javax.swing.JButton button) {
        flips += 1;
        if (flips % 2 != 0) {
            //code to reset unmatched cards
            if (secondButton != null)secondButton.setIcon(new ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg")));
            if (thirdButton !=null) thirdButton.setIcon(new ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg")));
            secondButton = null;
            thirdButton = null;
            firstValue = buttonNumber.value;
            firstButton = button;
            firstIndex = buttonNumber.imageIndex;
        }   else {
            lblFlipsOutput.setText (Integer.toString(flips/2));
            secondValue = buttonNumber.value;
            secondButton = button;
            secondIndex = buttonNumber.imageIndex;
            int isTrue = checkMatch();
            switch (isTrue) {
                case 1:
                        button.setEnabled(false);
                        firstButton.setEnabled(false);
                        firstButton = null;
                        secondButton = null;
                        thirdButton = null;
                        button = null;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this, "Please do not click the same card again", "Card Reclicked", JOptionPane.INFORMATION_MESSAGE);
                    if(secondButton != null) secondButton.setIcon(new ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg")));
                    if(thirdButton !=null) thirdButton.setIcon(new ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg")));
                    if(firstButton !=null) firstButton.setIcon(new ImageIcon(getClass().getResource("/cardgame/CardBack/CardBack.jpg")));
                    break;
                default:
                    thirdButton=firstButton;
                    secondButton = button;
                   
                    
                    break;
            }
            if (matches >= 26) {
                JOptionPane.showMessageDialog(this, "Congratulations. You got all the cards in " + flips/2 + " flips!", "Game Won", JOptionPane.ERROR_MESSAGE);
                dispose();
                String[] args = null;
                MatchGameMainMenu.main(args);
            }
        }
    }
    private int checkMatch() {
        if (firstValue == secondValue && firstIndex != secondIndex) {
            matches += 1;
            return 1;
        }   else if (firstIndex == secondIndex) {
            return 2;
        }   else {
            return 3;
        }
    }
    private void initialize() {
        for (int i = 0; i <= 51; i++) {
            int a = integers.get(i);
            switch(i) {
                case 0:
                    button1 = new ButtonValues(a);
                    break;
                case 1:
                    button2 = new ButtonValues(a);
                    break;
                case 2:
                    button3 = new ButtonValues(a);
                    break;
                case 3:
                    button4 = new ButtonValues(a);
                    break;
                case 4:
                    button5 = new ButtonValues(a);
                    break;
                case 5:
                    button6 = new ButtonValues(a);
                    break;
                case 6:
                    button7 = new ButtonValues(a);
                    break;
                case 7:
                    button8 = new ButtonValues(a);
                    break;
                 case 8:
                    button9 = new ButtonValues(a);
                    break;
                case 9:
                    button10 = new ButtonValues(a);
                    break;
                case 10:
                    button11 = new ButtonValues(a);
                    break;
                case 11:
                    button12 = new ButtonValues(a);
                    break;
                case 12:
                    button13 = new ButtonValues(a);
                    break;
                case 13:
                    button14 = new ButtonValues(a);
                    break;
                case 14:
                    button15 = new ButtonValues(a);
                    break;
                case 15:
                    button16 = new ButtonValues(a);
                    break;
                case 16:
                    button17 = new ButtonValues(a);
                    break;
                case 17:
                    button18 = new ButtonValues(a);
                    break;
                case 18:
                    button19 = new ButtonValues(a);
                    break;
                case 19:
                    button20 = new ButtonValues(a);
                    break;
                case 20:
                    button21 = new ButtonValues(a);
                    break;
                case 21:
                    button22 = new ButtonValues(a);
                    break;
                case 22:
                    button23 = new ButtonValues(a);
                    break;
                case 23:
                    button24 = new ButtonValues(a);
                    break;
                case 24:
                    button25 = new ButtonValues(a);
                    break;
                case 25:
                    button26 = new ButtonValues(a);
                    break;
                case 26:
                    button27 = new ButtonValues(a);
                    break;
                case 27:
                    button28 = new ButtonValues(a);
                    break;
                case 28:
                    button29 = new ButtonValues(a);
                    break;
                case 29:
                    button30 = new ButtonValues(a);
                    break;
                case 30:
                    button31 = new ButtonValues(a);
                    break;
                case 31:
                    button32 = new ButtonValues(a);
                    break;
                case 32:
                    button33 = new ButtonValues(a);
                    break;
                case 33:
                    button34 = new ButtonValues(a);
                    break;
                case 34:
                    button35 = new ButtonValues(a);
                    break;
                case 35:
                    button36 = new ButtonValues(a);
                    break;
                case 36:
                    button37 = new ButtonValues(a);
                    break;
                case 37:
                    button38 = new ButtonValues(a);
                    break;
                case 38:
                    button39 = new ButtonValues(a);
                    break;
                case 39:
                    button40 = new ButtonValues(a);
                    break;
                case 40:
                    button41 = new ButtonValues(a);
                    break;
                case 41:
                    button42 = new ButtonValues(a);
                    break;
                case 42:
                    button43 = new ButtonValues(a);
                    break;
                case 43:
                    button44 = new ButtonValues(a);
                    break;
                case 44:
                    button45 = new ButtonValues(a);
                    break;
                case 45:
                    button46 = new ButtonValues(a);
                    break;
                case 46:
                    button47 = new ButtonValues(a);
                    break;
                case 47:
                    button48 = new ButtonValues(a);
                    break;
                case 48:
                    button49 = new ButtonValues(a);
                    break;
                case 49:
                    button50 = new ButtonValues(a);
                    break;
                case 50:
                    button51 = new ButtonValues(a);
                    break;
                case 51:
                    button52 = new ButtonValues(a);
                    break;
                    
                    
            }
        }
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new CardGameGUI().setVisible(false);
                new Start().setVisible(true); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn30;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn40;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btn44;
    private javax.swing.JButton btn45;
    private javax.swing.JButton btn46;
    private javax.swing.JButton btn47;
    private javax.swing.JButton btn48;
    private javax.swing.JButton btn49;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn50;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn52;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblFlipsOutput;
    private javax.swing.JLabel lblSentence;
    // End of variables declaration//GEN-END:variables
    
    public ArrayList <ImageIcon> cdeck() {
        int cards = 52; 
        ArrayList<ImageIcon> deck = new ArrayList<>();              
                
        for(int i = 0; i < cards ; i++)
        {
            deck.add(new ImageIcon(getClass().getResource("/cardgame/CardNames2/"+i+".jpg"))); 
        }
                
       return deck; 
    }

    
    
}