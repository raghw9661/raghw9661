
import java.awt.Color;
import static java.awt.Color.LIGHT_GRAY;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dell
 */
public class TicTacToeFrame extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TicTacToeFrame.class.getName());

    /**
     * Creates new form TicTacToeFrame
     */
    public TicTacToeFrame() {
        initComponents();
    }
    
     private void gameScore()
       { 
         jlblplayerX.setText(String.valueOf(xCount));
         jlblplayerO.setText(String.valueOf(oCount));
       }  
     private void disableButtons() {
    jbtnTic1.setEnabled(false);
    jbtnTic2.setEnabled(false);
    jbtnTic3.setEnabled(false);
    jbtnTic4.setEnabled(false);
    jbtnTic5.setEnabled(false);
    jbtnTic6.setEnabled(false);
    jbtnTic7.setEnabled(false);
    jbtnTic8.setEnabled(false);
    jbtnTic9.setEnabled(false);
}
     private void choose_a_Player()
        { 
         if(startGame.equalsIgnoreCase("X"))
             {
             startGame="O";
             }
         else
             startGame="X";
       }
     
     private void winningGame()
            {
            String b1 = jbtnTic1.getText();
            String b2 = jbtnTic2.getText();
            String b3 = jbtnTic3.getText();
            String b4 = jbtnTic4.getText();
            String b5 = jbtnTic5.getText();
            String b6 = jbtnTic6.getText();
            String b7 =  jbtnTic7.getText();
            String b8 = jbtnTic8.getText();
            String b9 = jbtnTic9.getText();
            
            if(b1.equals("X") && b2.equals("X") && b3.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.ORANGE);
            jbtnTic2.setBackground(Color.ORANGE);
            jbtnTic3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b4.equals("X") && b5.equals("X") && b6.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.CYAN);
            jbtnTic5.setBackground(Color.CYAN);
            jbtnTic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b7.equals("X") && b8.equals("X") && b9.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b7.equals("O") && b8.equals("O") && b9.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic7.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b4.equals("O") && b5.equals("O") && b6.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b1.equals("O")&& b2.equals("O") && b3.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic3.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b1.equals("O") && b5.equals("O") && b9.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
            if(b3.equals("O") && b5.equals("O") && b7.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();disableButtons();
             return;
          }
             if(b3.equals("X") && b5.equals("X") && b7.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
            xCount++;
            gameScore();disableButtons();
             return;
          }
              
             if(b1.equals("X") && b5.equals("X") && b9.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();disableButtons();
             return;
          }
              if(b1.equals("O") && b4.equals("O") && b7.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
               if(b2.equals("O") && b5.equals("O") && b8.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
                if(b3.equals("O") && b6.equals("O") && b9.equals("O"))
          {
            JOptionPane.showMessageDialog(this,"player O win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            disableButtons();
             return;
          }
                 if(b2.equals("X") && b5.equals("X") && b8.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic2.setBackground(Color.GREEN);
            jbtnTic5.setBackground(Color.GREEN);
            jbtnTic8.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            disableButtons();
             return;
          }
                 if(b1.equals("X") && b4.equals("X") && b7.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic1.setBackground(Color.GREEN);
            jbtnTic4.setBackground(Color.GREEN);
            jbtnTic7.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            disableButtons();
             return;
          }
                   if(b3.equals("X") && b6.equals("X") && b9.equals("X"))
          {
            JOptionPane.showMessageDialog(this,"player X win","tic tac toe",
               JOptionPane.INFORMATION_MESSAGE);
            jbtnTic3.setBackground(Color.GREEN);
            jbtnTic6.setBackground(Color.GREEN);
            jbtnTic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            disableButtons();
             return;
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblplayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblplayerX = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jbtnTic2 = new javax.swing.JButton();
        jbtnTic1 = new javax.swing.JButton();
        jbtnTic4 = new javax.swing.JButton();
        jbtnTic5 = new javax.swing.JButton();
        jbtnTic6 = new javax.swing.JButton();
        jbtnTic7 = new javax.swing.JButton();
        jbtnTic8 = new javax.swing.JButton();
        jbtnTic9 = new javax.swing.JButton();
        jbtnTic3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel1.setText("Player X:");

        jlblplayerO.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jlblplayerO.setText("0");
        jlblplayerO.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player O:");

        jlblplayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jlblplayerX.setText("0");
        jlblplayerX.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblplayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jlblplayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlblplayerX))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jlblplayerO))
                        .addGap(41, 41, 41))))
        );

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton12.setText("reset");
        jButton12.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton12.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton12.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 45)); // NOI18N
        jButton14.setText("new game");
        jButton14.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton14.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton14.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton14.addActionListener(this::jButton14ActionPerformed);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jButton15.setText("exit");
        jButton15.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton15.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton15.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton15.addActionListener(this::jButton15ActionPerformed);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jbtnTic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic2.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic2.addActionListener(this::jbtnTic2ActionPerformed);

        jbtnTic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic1.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic1.addActionListener(this::jbtnTic1ActionPerformed);

        jbtnTic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic4.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic4.addActionListener(this::jbtnTic4ActionPerformed);

        jbtnTic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic5.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic5.addActionListener(this::jbtnTic5ActionPerformed);

        jbtnTic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic6.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic6.addActionListener(this::jbtnTic6ActionPerformed);

        jbtnTic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic7.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic7.addActionListener(this::jbtnTic7ActionPerformed);

        jbtnTic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic8.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic8.addActionListener(this::jbtnTic8ActionPerformed);

        jbtnTic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic9.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic9.addActionListener(this::jbtnTic9ActionPerformed);

        jbtnTic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnTic3.setMaximumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setMinimumSize(new java.awt.Dimension(200, 158));
        jbtnTic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnTic3.addActionListener(this::jbtnTic3ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnTic2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnTic3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtnTic4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnTic6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jbtnTic7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jbtnTic9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jbtnTic5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnTic8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Java Advance Tic Tac Toe");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 910, 45));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1500, 810));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private JFrame frame;
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       frame = new JFrame("Exit");
       if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","tic tac toe",
               JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
           {
        System.exit(0);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       jbtnTic1.setEnabled(true);
       jbtnTic2.setEnabled(true);
       jbtnTic3.setEnabled(true);
       jbtnTic4.setEnabled(true);
       jbtnTic5.setEnabled(true);
       jbtnTic6.setEnabled(true);
       jbtnTic7.setEnabled(true);
       jbtnTic8.setEnabled(true);
       jbtnTic9.setEnabled(true);
       
       jbtnTic1.setText("");
       jbtnTic2.setText("");
       jbtnTic3.setText("");
       jbtnTic4.setText("");
       jbtnTic5.setText("");
       jbtnTic6.setText("");
       jbtnTic7.setText("");
       jbtnTic8.setText("");
       jbtnTic9.setText("");
       
        jbtnTic1.setBackground(LIGHT_GRAY);
        jbtnTic2.setBackground(LIGHT_GRAY);
        jbtnTic3.setBackground(LIGHT_GRAY);
        jbtnTic4.setBackground(LIGHT_GRAY);
        jbtnTic5.setBackground(LIGHT_GRAY);
        jbtnTic6.setBackground(LIGHT_GRAY);
        jbtnTic7.setBackground(LIGHT_GRAY);
        jbtnTic8.setBackground(LIGHT_GRAY);
        jbtnTic9.setBackground(LIGHT_GRAY);
       
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jbtnTic1.setEnabled(true);
       jbtnTic2.setEnabled(true);
       jbtnTic3.setEnabled(true);
       jbtnTic4.setEnabled(true);
       jbtnTic5.setEnabled(true);
       jbtnTic6.setEnabled(true);
       jbtnTic7.setEnabled(true);
       jbtnTic8.setEnabled(true);
       jbtnTic9.setEnabled(true);
       
       jlblplayerO.setText("0");
       jlblplayerX.setText("0");
       xCount = 0;
       oCount = 0;
       startGame = "X";
       jbtnTic1.setText("");
       jbtnTic2.setText("");
       jbtnTic3.setText("");
       jbtnTic4.setText("");
       jbtnTic5.setText("");
       jbtnTic6.setText("");
       jbtnTic7.setText("");
       jbtnTic8.setText("");
       jbtnTic9.setText("");
       
        jbtnTic1.setBackground(LIGHT_GRAY);
        jbtnTic2.setBackground(LIGHT_GRAY);
        jbtnTic3.setBackground(LIGHT_GRAY);
        jbtnTic4.setBackground(LIGHT_GRAY);
        jbtnTic5.setBackground(LIGHT_GRAY);
        jbtnTic6.setBackground(LIGHT_GRAY);
        jbtnTic7.setBackground(LIGHT_GRAY);
        jbtnTic8.setBackground(LIGHT_GRAY);
        jbtnTic9.setBackground(LIGHT_GRAY);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jbtnTic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic1ActionPerformed
        
        if(jbtnTic1.getText().equals("")) {
    jbtnTic1.setText(startGame);
    choose_a_Player();
    winningGame();
}
    }//GEN-LAST:event_jbtnTic1ActionPerformed

    private void jbtnTic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic2ActionPerformed
       
       if(jbtnTic2.getText().equals("")) {
   jbtnTic2.setText(startGame);
    choose_a_Player();
    winningGame();
}
    }//GEN-LAST:event_jbtnTic2ActionPerformed

    private void jbtnTic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic3ActionPerformed
        
        if(jbtnTic3.getText().equals("")) {
    jbtnTic3.setText(startGame);
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic3ActionPerformed
} 
    private void jbtnTic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic4ActionPerformed
        
        if(jbtnTic4.getText().equals("")) {
    jbtnTic4.setText(startGame);
    choose_a_Player();
    winningGame();
    } 
    }//GEN-LAST:event_jbtnTic4ActionPerformed

    private void jbtnTic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic5ActionPerformed
        
        if(jbtnTic5.getText().equals("")) {
    jbtnTic5.setText(startGame);
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic5ActionPerformed
} 
    private void jbtnTic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic6ActionPerformed
       
        if(jbtnTic6.getText().equals("")) {
    jbtnTic6.setText(startGame);
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic6ActionPerformed
} 
    private void jbtnTic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic7ActionPerformed
       
       if(jbtnTic7.getText().equals("")) {
     jbtnTic7.setText(startGame);
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic7ActionPerformed
} 
    private void jbtnTic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic8ActionPerformed
        
       if(jbtnTic8.getText().equals("")) {
    jbtnTic8.setText(startGame);
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic8ActionPerformed
} 
    private void jbtnTic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTic9ActionPerformed
      
        if(jbtnTic9.getText().equals("")) {
     jbtnTic9.setText(startGame);
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jbtnTic9ActionPerformed
} 
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TicTacToeFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnTic1;
    private javax.swing.JButton jbtnTic2;
    private javax.swing.JButton jbtnTic3;
    private javax.swing.JButton jbtnTic4;
    private javax.swing.JButton jbtnTic5;
    private javax.swing.JButton jbtnTic6;
    private javax.swing.JButton jbtnTic7;
    private javax.swing.JButton jbtnTic8;
    private javax.swing.JButton jbtnTic9;
    private javax.swing.JLabel jlblplayerO;
    private javax.swing.JLabel jlblplayerX;
    // End of variables declaration//GEN-END:variables
}
