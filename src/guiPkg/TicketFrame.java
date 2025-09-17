package guiPkg;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TicketFrame extends javax.swing.JFrame
{

    public TicketFrame(String ticket)
    {

        initComponents();

        try
        {
            txaDisplay.setText(ticket);

        } catch (Exception e)
        {
            System.out.println(e.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        spDisplay = new javax.swing.JScrollPane();
        txaDisplay = new javax.swing.JTextArea();
        btnPrint = new javax.swing.JButton();
        lblHelpScreen = new javax.swing.JLabel();
        btnSendTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ticket");
        setResizable(false);

        lpBackground.setBackground(new java.awt.Color(0, 0, 0));
        lpBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txaDisplay.setEditable(false);
        txaDisplay.setColumns(20);
        txaDisplay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaDisplay.setRows(5);
        txaDisplay.setMargin(new java.awt.Insets(2, 8, 2, 6));
        spDisplay.setViewportView(txaDisplay);

        btnPrint.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnPrint.setText("Print Ticket");
        btnPrint.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPrintActionPerformed(evt);
            }
        });

        lblHelpScreen.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblHelpScreen.setText("Ticket");

        btnSendTicket.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSendTicket.setText("Send Ticket");
        btnSendTicket.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSendTicketActionPerformed(evt);
            }
        });

        lpBackground.setLayer(spDisplay, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnPrint, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblHelpScreen, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnSendTicket, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addComponent(btnSendTicket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrint))
                    .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lpBackgroundLayout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(lblHelpScreen))
                        .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblHelpScreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnSendTicket))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(421, 526));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


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

    private void btnSendTicketActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSendTicketActionPerformed
    {//GEN-HEADEREND:event_btnSendTicketActionPerformed
        JOptionPane.showMessageDialog(null, "All relevant subject staff will be notified. Thank you for your submission", "Ticket sent successfully", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_btnSendTicketActionPerformed

    public static void main(String args[])
    {
        new TicketFrame("").setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSendTicket;
    private javax.swing.JLabel lblHelpScreen;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JScrollPane spDisplay;
    private javax.swing.JTextArea txaDisplay;
    // End of variables declaration//GEN-END:variables
}
