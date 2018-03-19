/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tbdzombie;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author Rogier
 */
public class TBDZGame extends javax.swing.JFrame {

    private Point offset;
    private Point cardOrigin = new Point(91, 292);
    private boolean choiceDistanceReached;

    /**
     * Creates new form TBDZGame
     */
    public TBDZGame() {
        initComponents();
        getContentPane().setBackground(new Color(163, 159, 156));
        characterNamePane.setBackground(new Color(255, 255, 255, 0));
        GameFlow.main();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        cardPanel = new javax.swing.JPanel();
        cardLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        characterNamePane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        storyPanel = new javax.swing.JTextArea();
        screenTop = new javax.swing.JPanel();
        iconIndicatorBar = new javax.swing.JPanel();
        foodIconIndicator = new javax.swing.JLabel();
        peopleIconIndicator = new javax.swing.JLabel();
        foodIconIndicator2 = new javax.swing.JLabel();
        foodIconIndicator3 = new javax.swing.JLabel();
        ResourceBar = new javax.swing.JLayeredPane();
        foodResource = new javax.swing.JPanel();
        foodIconPanel = new javax.swing.JPanel();
        foodIcon = new javax.swing.JLabel();
        foodBar = new javax.swing.JProgressBar();
        peopleResource = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar4 = new javax.swing.JProgressBar();
        screenBottom = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 0, 51));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                showLauncher(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ShowLaucher(evt);
            }
        });

        cardPanel.setPreferredSize(new java.awt.Dimension(250, 250));
        cardPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cardPanelMouseReleased(evt);
            }
        });
        cardPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                cardPanelMouseDragged(evt);
            }
        });

        cardLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Characters/SpaceZombie.png"))); // NOI18N
        cardLabel.setText("picture");
        cardLabel.setPreferredSize(new java.awt.Dimension(253, 253));

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        characterNamePane.setEditable(false);
        characterNamePane.setBorder(null);
        characterNamePane.setContentType("text/html"); // NOI18N
        characterNamePane.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        characterNamePane.setText("<HTML><BODY><CENTER>Dat boi Trump</CENTER></BODY></HTML>");
        characterNamePane.setDisabledTextColor(new java.awt.Color(255, 0, 153));
        jScrollPane1.setViewportView(characterNamePane);

        jScrollPane3.setBackground(new java.awt.Color(163, 159, 156));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        storyPanel.setEditable(false);
        storyPanel.setBackground(new java.awt.Color(163, 159, 156));
        storyPanel.setColumns(20);
        storyPanel.setLineWrap(true);
        storyPanel.setRows(5);
        jScrollPane3.setViewportView(storyPanel);

        screenTop.setBackground(new java.awt.Color(0, 0, 0));
        screenTop.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

        iconIndicatorBar.setBackground(new java.awt.Color(0, 0, 0));

        foodIconIndicator.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        foodIconIndicator.setForeground(new java.awt.Color(255, 255, 255));
        foodIconIndicator.setText("•");
        foodIconIndicator.setToolTipText("");

        peopleIconIndicator.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        peopleIconIndicator.setForeground(new java.awt.Color(255, 255, 255));
        peopleIconIndicator.setText("•");
        peopleIconIndicator.setToolTipText("");

        foodIconIndicator2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        foodIconIndicator2.setForeground(new java.awt.Color(255, 255, 255));
        foodIconIndicator2.setText("•");
        foodIconIndicator2.setToolTipText("");

        foodIconIndicator3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        foodIconIndicator3.setForeground(new java.awt.Color(255, 255, 255));
        foodIconIndicator3.setText("•");
        foodIconIndicator3.setToolTipText("");

        javax.swing.GroupLayout iconIndicatorBarLayout = new javax.swing.GroupLayout(iconIndicatorBar);
        iconIndicatorBar.setLayout(iconIndicatorBarLayout);
        iconIndicatorBarLayout.setHorizontalGroup(
            iconIndicatorBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconIndicatorBarLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(foodIconIndicator)
                .addGap(86, 86, 86)
                .addComponent(peopleIconIndicator)
                .addGap(93, 93, 93)
                .addComponent(foodIconIndicator2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(foodIconIndicator3)
                .addGap(41, 41, 41))
        );
        iconIndicatorBarLayout.setVerticalGroup(
            iconIndicatorBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iconIndicatorBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(foodIconIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(peopleIconIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(foodIconIndicator2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addComponent(foodIconIndicator3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        screenTop.add(iconIndicatorBar);

        ResourceBar.setPreferredSize(new java.awt.Dimension(400, 100));
        ResourceBar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 5));

        foodResource.setBackground(new java.awt.Color(255, 255, 255));
        foodResource.setMinimumSize(new java.awt.Dimension(100, 100));

        foodIconPanel.setBackground(new java.awt.Color(255, 255, 255));
        foodIconPanel.setAlignmentX(0.0F);
        foodIconPanel.setAlignmentY(0.0F);
        foodIconPanel.setOpaque(false);
        foodIconPanel.setPreferredSize(new java.awt.Dimension(100, 100));

        foodIcon.setBackground(new java.awt.Color(255, 255, 255));
        foodIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/FoodIconSmall.png"))); // NOI18N
        foodIcon.setText("jLabel1");
        foodIcon.setMaximumSize(new java.awt.Dimension(100, 100));
        foodIcon.setMinimumSize(new java.awt.Dimension(100, 100));
        foodIcon.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout foodIconPanelLayout = new javax.swing.GroupLayout(foodIconPanel);
        foodIconPanel.setLayout(foodIconPanelLayout);
        foodIconPanelLayout.setHorizontalGroup(
            foodIconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodIconPanelLayout.createSequentialGroup()
                .addComponent(foodIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        foodIconPanelLayout.setVerticalGroup(
            foodIconPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, foodIconPanelLayout.createSequentialGroup()
                .addComponent(foodIcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        foodBar.setBackground(new java.awt.Color(255, 255, 255));
        foodBar.setForeground(new java.awt.Color(0, 255, 0));
        foodBar.setOrientation(1);
        foodBar.setValue(50);
        foodBar.setMaximumSize(new java.awt.Dimension(100, 120));
        foodBar.setMinimumSize(new java.awt.Dimension(100, 120));
        foodBar.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout foodResourceLayout = new javax.swing.GroupLayout(foodResource);
        foodResource.setLayout(foodResourceLayout);
        foodResourceLayout.setHorizontalGroup(
            foodResourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(foodBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        foodResourceLayout.setVerticalGroup(
            foodResourceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(foodIconPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(foodBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        ResourceBar.add(foodResource);

        peopleResource.setPreferredSize(new java.awt.Dimension(100, 100));
        peopleResource.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setAlignmentX(0.0F);
        jPanel4.setAlignmentY(0.0F);
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PeopleIconSmall.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        peopleResource.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jProgressBar1.setBackground(new java.awt.Color(102, 102, 102));
        jProgressBar1.setOrientation(1);
        jProgressBar1.setValue(50);
        jProgressBar1.setMaximumSize(new java.awt.Dimension(100, 120));
        jProgressBar1.setMinimumSize(new java.awt.Dimension(100, 120));
        jProgressBar1.setPreferredSize(new java.awt.Dimension(100, 100));
        peopleResource.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ResourceBar.add(peopleResource);

        jPanel7.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setAlignmentX(0.0F);
        jPanel8.setAlignmentY(0.0F);
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/FoodIconSmall.png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jProgressBar3.setOrientation(1);
        jProgressBar3.setValue(50);
        jProgressBar3.setMaximumSize(new java.awt.Dimension(100, 120));
        jProgressBar3.setMinimumSize(new java.awt.Dimension(100, 120));
        jProgressBar3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel7.add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ResourceBar.add(jPanel7);

        jPanel9.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setAlignmentX(0.0F);
        jPanel10.setAlignmentY(0.0F);
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/FoodIconSmall.png"))); // NOI18N
        jLabel4.setText("jLabel1");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jProgressBar4.setOrientation(1);
        jProgressBar4.setValue(50);
        jProgressBar4.setMaximumSize(new java.awt.Dimension(100, 120));
        jProgressBar4.setMinimumSize(new java.awt.Dimension(100, 120));
        jProgressBar4.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel9.add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ResourceBar.add(jPanel9);

        screenTop.add(ResourceBar);

        screenBottom.setBackground(new java.awt.Color(0, 0, 0));
        screenBottom.setPreferredSize(new java.awt.Dimension(400, 100));

        javax.swing.GroupLayout screenBottomLayout = new javax.swing.GroupLayout(screenBottom);
        screenBottom.setLayout(screenBottomLayout);
        screenBottomLayout.setHorizontalGroup(
            screenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        screenBottomLayout.setVerticalGroup(
            screenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(cardPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(screenTop, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(screenBottom, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(screenTop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(screenBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(91, Short.MAX_VALUE)
                    .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(91, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(screenTop, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(screenBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(293, Short.MAX_VALUE)
                    .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(164, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showLauncher(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_showLauncher
        TBDZLauncher.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_showLauncher

    private void ShowLaucher(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ShowLaucher
        TBDZLauncher.getFrames()[0].setVisible(true);
    }//GEN-LAST:event_ShowLaucher

    private void cardPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPanelMouseDragged
        int x = evt.getPoint().x - offset.x;
        int y = evt.getPoint().y - offset.y;
        Component component = evt.getComponent();
        Point location = component.getLocation();
        location.x += x;
        location.y += y;
        component.setLocation(location);
        if (location.x > offset.x + 130 || location.x < offset.x - 130) {
            choiceDistanceReached = true;
        } else {
            choiceDistanceReached = false;
        }
    }//GEN-LAST:event_cardPanelMouseDragged

    private void cardPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPanelMousePressed
        offset = evt.getPoint();
        System.out.println("pressed");
    }//GEN-LAST:event_cardPanelMousePressed

    private void cardPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardPanelMouseReleased
        if (choiceDistanceReached) {
            System.out.println("CHOICEMADE");
            GameFlow.main3();
        }
        Component component = evt.getComponent();
        component.setLocation(cardOrigin.x, cardOrigin.y);
        
    }//GEN-LAST:event_cardPanelMouseReleased

    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        //UIManager.put("nimbusBase", Color.white);
        UIManager.put("nimbusBlueGrey", new Color(100, 101, 105));
        //UIManager.put("control", Color.WHITE);
        UIManager.put("nimbusOrange", Color.WHITE);
        UIManager.put("TextPane.background", new Color(163, 159, 156));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TBDZGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TBDZGame().setVisible(true);
            }
        });
    }
    
    public static void putCard(Card card){
        ImageIcon icon = card.getCharacter();
        System.out.println("ICOM: "+icon.toString());
        cardLabel.setIcon(icon);
        characterNamePane.setText(card.getCharachterName());
        storyPanel.setText(card.getCardStory());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane ResourceBar;
    public static javax.swing.JLabel cardLabel;
    private javax.swing.JPanel cardPanel;
    public static javax.swing.JTextPane characterNamePane;
    private javax.swing.JProgressBar foodBar;
    private javax.swing.JLabel foodIcon;
    private javax.swing.JLabel foodIconIndicator;
    private javax.swing.JLabel foodIconIndicator2;
    private javax.swing.JLabel foodIconIndicator3;
    private javax.swing.JPanel foodIconPanel;
    private javax.swing.JPanel foodResource;
    private javax.swing.JPanel iconIndicatorBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel peopleIconIndicator;
    private javax.swing.JPanel peopleResource;
    private javax.swing.JPanel screenBottom;
    private javax.swing.JPanel screenTop;
    private static javax.swing.JTextArea storyPanel;
    // End of variables declaration//GEN-END:variables
}
