package guiPkg;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HelpFrame extends javax.swing.JFrame
{

    public HelpFrame(String fileName)
    {

        initComponents();

        try
        {
            //Scanner inputStream = new Scanner(new FileInputStream(filename));
            Scanner inputStream = new Scanner(new FileInputStream(fileName));

            while (inputStream.hasNextLine())
            {

                txaDisplay.append(inputStream.nextLine() + "\n");
            }

            inputStream.close();

        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }

//    public Help(String filename)
//    {
//        try
//        {
//            initComponents();
//
//            Scanner inputStream = new Scanner(new FileInputStream(filename));
//
//            while (inputStream.hasNextLine())
//            {
//                txaDisplay.append(inputStream.nextLine() + "\n");
//            }
//
//            inputStream.close();
//        } catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Text file not found", "Error", HEIGHT);
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        spDisplay = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        lblHelpScreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaDisplay.setRows(5);
        txaDisplay.setMargin(new java.awt.Insets(2, 8, 2, 6));
        spDisplay.setViewportView(txaDisplay);

        btnPrint.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCloseActionPerformed(evt);
            }
        });

        lblHelpScreen.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHelpScreen.setText("Help Screen");

        lpBackground.setLayer(spDisplay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnClose, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblHelpScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(lblHelpScreen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblHelpScreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnClose))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(696, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCloseActionPerformed
    {//GEN-HEADEREND:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPrintActionPerformed
    {//GEN-HEADEREND:event_btnPrintActionPerformed
        try
        {
            txaDisplay.print();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Printing Failed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    public static void main(String args[])
    {
        new HelpFrame("testHelp.txt").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPrint;
    private javax.swing.JLabel lblHelpScreen;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JScrollPane spDisplay;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
