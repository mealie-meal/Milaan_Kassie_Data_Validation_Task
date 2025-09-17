package guiPkg;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import dataPkg.DVT_Validation;
import java.time.LocalDate;

public class DVTFrame extends javax.swing.JFrame
{

    //private int numLessonsMissed;
    //private Date dateOfAbsence;
    public DVTFrame()
    {
        initComponents();

        txfStudentID.requestFocus();

        //sets the default value to today's date.
        jdcDateOfAbsence.setDate(new Date());

        //sets the max to todays date
        jdcDateOfAbsence.setMaxSelectableDate(new Date());

        //now you cant type in to date chooser
        JTextFieldDateEditor editor = (JTextFieldDateEditor) jdcDateOfAbsence.getDateEditor();
        editor.setEditable(false);

        //makes it so that the spinner value can only be changed with arrows, no typing into it 
        //spnNumLessonsAttended.setEditor(new JSpinner.DefaultEditor(spnNumLessonsAttended));
        txfNumLessonsAttended.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        lpBackground = new javax.swing.JLayeredPane();
        lblTitle = new javax.swing.JLabel();
        lpDetails = new javax.swing.JLayeredPane();
        lblStudentIDCheck = new javax.swing.JLabel();
        jdcDateOfAbsence = new com.toedter.calendar.JDateChooser();
        lblNumLessonsAttended = new javax.swing.JLabel();
        lblStudentID = new javax.swing.JLabel();
        lblOnlineAttendance = new javax.swing.JLabel();
        txfStudentID = new javax.swing.JTextField();
        lblDateOfAbsence = new javax.swing.JLabel();
        cbOnlineAttendance = new javax.swing.JCheckBox();
        lblNumLessonsAttendedCheck = new javax.swing.JLabel();
        lblDateOfAbsenceCheck = new javax.swing.JLabel();
        lblOnlineAttendance1 = new javax.swing.JLabel();
        spReason = new javax.swing.JScrollPane();
        txaReason = new javax.swing.JTextArea();
        lblReasonCheck = new javax.swing.JLabel();
        lblStudentIDErrorMessage = new javax.swing.JLabel();
        lblDateOfAbsenceErrorMessage = new javax.swing.JLabel();
        lblDateOfAbsenceCheck1 = new javax.swing.JLabel();
        lblOnlineAttendanceErrorMessage = new javax.swing.JLabel();
        lblReasonErrorMessage = new javax.swing.JLabel();
        lblNumberOfLessonsAttendedErrorMessage = new javax.swing.JLabel();
        txfNumLessonsAttended = new javax.swing.JTextField();
        btnHelp = new javax.swing.JButton();
        lblSubmissionCheck = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lpBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 38)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Absentee Form");

        lpDetails.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Please enter attendance details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 24))); // NOI18N

        lblStudentIDCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentIDCheck.setForeground(new java.awt.Color(255, 0, 0));
        lblStudentIDCheck.setText("*entry required");

        jdcDateOfAbsence.setDateFormatString("dd/MM/yyyy");
        jdcDateOfAbsence.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jdcDateOfAbsence.setMaxSelectableDate(new Date());
        jdcDateOfAbsence.setMinSelectableDate(new Date(new Date().getTime() - 7L * 24 * 60 * 60 * 1000));

        lblNumLessonsAttended.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblNumLessonsAttended.setText("Number of lessons attended");

        lblStudentID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblStudentID.setText("Student ID");
        lblStudentID.setMaximumSize(new java.awt.Dimension(93, 26));
        lblStudentID.setMinimumSize(new java.awt.Dimension(93, 26));
        lblStudentID.setPreferredSize(new java.awt.Dimension(93, 26));

        lblOnlineAttendance.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblOnlineAttendance.setText("Online attendance");

        txfStudentID.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txfStudentID.setPreferredSize(new java.awt.Dimension(68, 35));

        lblDateOfAbsence.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblDateOfAbsence.setText("Date of absence");

        cbOnlineAttendance.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        cbOnlineAttendance.setText("present?");
        cbOnlineAttendance.setPreferredSize(new java.awt.Dimension(99, 35));
        cbOnlineAttendance.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbOnlineAttendanceActionPerformed(evt);
            }
        });

        lblNumLessonsAttendedCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumLessonsAttendedCheck.setForeground(new java.awt.Color(255, 0, 0));
        lblNumLessonsAttendedCheck.setText("*entry required");

        lblDateOfAbsenceCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDateOfAbsenceCheck.setForeground(new java.awt.Color(60, 179, 113));
        lblDateOfAbsenceCheck.setText("entry valid");

        lblOnlineAttendance1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblOnlineAttendance1.setText("Reason of absence:");

        txaReason.setColumns(20);
        txaReason.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txaReason.setLineWrap(true);
        txaReason.setRows(5);
        txaReason.setMargin(new java.awt.Insets(2, 8, 2, 6));
        spReason.setViewportView(txaReason);

        lblReasonCheck.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReasonCheck.setForeground(new java.awt.Color(255, 0, 0));
        lblReasonCheck.setText("*entry required");

        lblStudentIDErrorMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblStudentIDErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblStudentIDErrorMessage.setText("-");

        lblDateOfAbsenceErrorMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDateOfAbsenceErrorMessage.setForeground(new java.awt.Color(60, 179, 113));
        lblDateOfAbsenceErrorMessage.setText("-");

        lblDateOfAbsenceCheck1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDateOfAbsenceCheck1.setForeground(new java.awt.Color(60, 179, 113));
        lblDateOfAbsenceCheck1.setText("entry valid");

        lblOnlineAttendanceErrorMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblOnlineAttendanceErrorMessage.setForeground(new java.awt.Color(60, 179, 113));
        lblOnlineAttendanceErrorMessage.setText("-");

        lblReasonErrorMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblReasonErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblReasonErrorMessage.setText("-");

        lblNumberOfLessonsAttendedErrorMessage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumberOfLessonsAttendedErrorMessage.setForeground(new java.awt.Color(255, 0, 0));
        lblNumberOfLessonsAttendedErrorMessage.setText("-");

        txfNumLessonsAttended.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txfNumLessonsAttended.setEnabled(false);
        txfNumLessonsAttended.setPreferredSize(new java.awt.Dimension(68, 35));

        lpDetails.setLayer(lblStudentIDCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(jdcDateOfAbsence, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblNumLessonsAttended, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblStudentID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblOnlineAttendance, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(txfStudentID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblDateOfAbsence, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(cbOnlineAttendance, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblNumLessonsAttendedCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblDateOfAbsenceCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblOnlineAttendance1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(spReason, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblReasonCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblStudentIDErrorMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblDateOfAbsenceErrorMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblDateOfAbsenceCheck1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblOnlineAttendanceErrorMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblReasonErrorMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(lblNumberOfLessonsAttendedErrorMessage, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpDetails.setLayer(txfNumLessonsAttended, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpDetailsLayout = new javax.swing.GroupLayout(lpDetails);
        lpDetails.setLayout(lpDetailsLayout);
        lpDetailsLayout.setHorizontalGroup(
            lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpDetailsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblOnlineAttendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDateOfAbsence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNumLessonsAttended))
                        .addGap(37, 37, 37)
                        .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpDetailsLayout.createSequentialGroup()
                                .addComponent(txfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lpDetailsLayout.createSequentialGroup()
                                        .addComponent(lblStudentIDCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblStudentIDErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(lpDetailsLayout.createSequentialGroup()
                                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txfNumLessonsAttended, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbOnlineAttendance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdcDateOfAbsence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDateOfAbsenceCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDateOfAbsenceCheck1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOnlineAttendanceErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(lpDetailsLayout.createSequentialGroup()
                                        .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNumLessonsAttendedCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNumberOfLessonsAttendedErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDateOfAbsenceErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 30, Short.MAX_VALUE))))))
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addComponent(lblOnlineAttendance1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addComponent(spReason, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReasonCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblReasonErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        lpDetailsLayout.setVerticalGroup(
            lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpDetailsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStudentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txfStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addComponent(lblStudentIDCheck)
                        .addGap(0, 0, 0)
                        .addComponent(lblStudentIDErrorMessage)))
                .addGap(25, 25, 25)
                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addComponent(lblDateOfAbsenceCheck)
                        .addGap(0, 0, 0)
                        .addComponent(lblDateOfAbsenceErrorMessage))
                    .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDateOfAbsence, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jdcDateOfAbsence, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbOnlineAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOnlineAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblDateOfAbsenceCheck1)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblOnlineAttendanceErrorMessage)))
                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfNumLessonsAttended, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lpDetailsLayout.createSequentialGroup()
                                .addComponent(lblNumLessonsAttendedCheck)
                                .addGap(0, 0, 0)
                                .addComponent(lblNumberOfLessonsAttendedErrorMessage)))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumLessonsAttended, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(lblOnlineAttendance1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(lpDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lpDetailsLayout.createSequentialGroup()
                        .addComponent(lblReasonCheck)
                        .addGap(0, 0, 0)
                        .addComponent(lblReasonErrorMessage)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnHelp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnHelp.setText("Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHelpActionPerformed(evt);
            }
        });

        lblSubmissionCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblSubmissionCheck.setForeground(new java.awt.Color(255, 0, 0));
        lblSubmissionCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubmissionCheck.setText("Please fill in all required fields");

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });

        lpBackground.setLayer(lblTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lpDetails, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnHelp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(lblSubmissionCheck, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lpBackground.setLayer(btnSubmit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lpBackgroundLayout = new javax.swing.GroupLayout(lpBackground);
        lpBackground.setLayout(lpBackgroundLayout);
        lpBackgroundLayout.setHorizontalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lpDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(lpBackgroundLayout.createSequentialGroup()
                        .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lpBackgroundLayout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(lblSubmissionCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lpBackgroundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(118, 118, 118)))
                        .addComponent(btnHelp)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        lpBackgroundLayout.setVerticalGroup(
            lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lpBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(btnHelp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(lpDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(lblSubmissionCheck))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnHelpActionPerformed
    {//GEN-HEADEREND:event_btnHelpActionPerformed
        new guiPkg.HelpFrame("Help.txt").setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSubmitActionPerformed
    {//GEN-HEADEREND:event_btnSubmitActionPerformed

        //StudentID
        String studentID = txfStudentID.getText().trim();
        
        //DateOfAbsence as a Date value
        Date dateOfAbsence = jdcDateOfAbsence.getDate();        
        //Date formatting line
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyy");
        //DateOfAbsence as a String for the ticket
        String dateOfAbsenceString = df.format(dateOfAbsence);

        //OnlineAttendance as a boolean value
        boolean onlineAttendance = false;
        if (cbOnlineAttendance.isSelected())
        {
            onlineAttendance = true;
        }

        //OnlineAttendance as a String value
        String onlineAttendanceString = "No";
        if (onlineAttendance)
        {
            onlineAttendanceString = "Yes";
        }
        String numLessonsAttended = txfNumLessonsAttended.getText().trim();

        //Reason as a String
        String reason = txaReason.getText().trim();

        //will be used to check variable validity in the final if
        boolean isStudentIDValid = false;      
        boolean isNumLessonsAttendedValid = false;       
        boolean isReasonValid = false;
        
        
        //Validation for Reason
        if (DVT_Validation.vStringRange(reason, 1, 50, "Reason of Absence", lblReasonErrorMessage))
        {
            //lblReasonCheck.setForeground(Color.GREEN);
            lblReasonCheck.setForeground(new Color(60, 179, 113));
            lblReasonCheck.setText("entry valid");
            isReasonValid = true;
        } else
        {
            txaReason.setText("");
            txaReason.requestFocus(); 

            lblReasonCheck.setForeground(Color.RED);
            lblReasonCheck.setText("*entry required");
        }
        
        //Validation for NumLessonsAttended - Its logical. I'm not removing this, it only makes sense        
        //DVT_Validation.vInteger(numLessonsAttended, "Number of Lessons Attended", lblNumberOfLessonsAttendedErrorMessage) 
        if (cbOnlineAttendance.isSelected())
        {
            if (DVT_Validation.vInteger(numLessonsAttended, "Number of Lessons Attended", lblNumberOfLessonsAttendedErrorMessage) && DVT_Validation.vIntegerRange(numLessonsAttended, 1, 8, "Number of Lessons Attended", lblNumberOfLessonsAttendedErrorMessage))
            {
                lblNumLessonsAttendedCheck.setForeground(new Color(60, 179, 113));
                lblNumLessonsAttendedCheck.setText("entry valid");
                isNumLessonsAttendedValid = true;
            } else
            {
                txfNumLessonsAttended.setText("");
                txfNumLessonsAttended.requestFocus(); 

                lblNumLessonsAttendedCheck.setForeground(Color.RED);
                lblNumLessonsAttendedCheck.setText("*entry required");
            }
        } else
        {
            lblNumLessonsAttendedCheck.setForeground(new Color(60, 179, 113));
            lblNumLessonsAttendedCheck.setText("entry valid");
            isNumLessonsAttendedValid = true;
        }

        
        //Validation of StudentID - DONE
        //if (DVT_Validation.vStringPresenceCheck(studentID, "StudentID", lblStudentIDErrorMessage) && DVT_Validation.vInitialsCheck(studentID, 3, "SID", "Student ID", lblStudentIDErrorMessage) && DVT_Validation.vStringLengthCheck(studentID, 11, "StudentID", lblStudentIDErrorMessage))
        if (DVT_Validation.vStringLengthCheck(studentID, 11, "StudentID", lblStudentIDErrorMessage) && DVT_Validation.vInitialsCheck(studentID, 3, "SID", "Student ID", lblStudentIDErrorMessage))
        {
            //lblStudentIDCheck.setForeground(Color.GREEN);
            lblStudentIDCheck.setForeground(new Color(60, 179, 113));
            lblStudentIDCheck.setText("entry valid");           
            isStudentIDValid = true;
        } else
        {
            txfStudentID.setText("");
            txfStudentID.requestFocus();

            lblStudentIDCheck.setForeground(Color.RED);
            lblStudentIDCheck.setText("*entry required");
        }
        
        //final check for all validations
        if (isStudentIDValid && isNumLessonsAttendedValid && isReasonValid)
        {
            lblSubmissionCheck.setForeground(new Color(60, 179, 113));
            lblSubmissionCheck.setText("Ticket sent successfully");
                            
            int numLessonsMissed = 8 - Integer.parseInt(numLessonsAttended);
            Date dateOfAbsenceRaw = jdcDateOfAbsence.getDate();

            String ticket = "Absentee ticket:\n\n";

            ticket += "Student ID:" + "\t\t" + studentID + "\n";
            ticket += "Date of Absence:" + "\t" + dateOfAbsenceString + "\n";
            ticket += "Online Attendance:" + "\t" + onlineAttendanceString + "\n";
            ticket += "Lessons Attended:" + "\t" + numLessonsAttended + "\n";
            ticket += "Lessons Missed:" + "\t" + numLessonsMissed + "\n";
            ticket += "\n" + "Reason for Absence: " + "\n" + reason;

            new guiPkg.TicketFrame(ticket).setVisible(true);

        } else
        {
            //at least one input is invalid, set appropriate message
            lblSubmissionCheck.setForeground(Color.RED);
            lblSubmissionCheck.setText("Please fill in all required fields");
            //btnTicket.setEnabled(false); //disable ticket button
        }


    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbOnlineAttendanceActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cbOnlineAttendanceActionPerformed
    {//GEN-HEADEREND:event_cbOnlineAttendanceActionPerformed
        if (cbOnlineAttendance.isSelected())
        {
            txfNumLessonsAttended.setEnabled(true);

        } else
        {
            //lblStudentIDCheck.setForeground(new Color(60, 179, 113))
            txfNumLessonsAttended.setEnabled(false);
            txfNumLessonsAttended.setText("0");
            
            lblNumLessonsAttendedCheck.setForeground(new Color(60, 179, 113));
            lblNumLessonsAttendedCheck.setText("entry valid");
            
            lblNumberOfLessonsAttendedErrorMessage.setForeground(new Color(60, 179, 113));
            lblNumberOfLessonsAttendedErrorMessage.setText("-");
        }
    }//GEN-LAST:event_cbOnlineAttendanceActionPerformed

    public static void main(String args[])
    {
        new DVTFrame().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbOnlineAttendance;
    private com.toedter.calendar.JDateChooser jdcDateOfAbsence;
    private javax.swing.JLabel lblDateOfAbsence;
    private javax.swing.JLabel lblDateOfAbsenceCheck;
    private javax.swing.JLabel lblDateOfAbsenceCheck1;
    private javax.swing.JLabel lblDateOfAbsenceErrorMessage;
    private javax.swing.JLabel lblNumLessonsAttended;
    private javax.swing.JLabel lblNumLessonsAttendedCheck;
    private javax.swing.JLabel lblNumberOfLessonsAttendedErrorMessage;
    private javax.swing.JLabel lblOnlineAttendance;
    private javax.swing.JLabel lblOnlineAttendance1;
    private javax.swing.JLabel lblOnlineAttendanceErrorMessage;
    private javax.swing.JLabel lblReasonCheck;
    private javax.swing.JLabel lblReasonErrorMessage;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JLabel lblStudentIDCheck;
    private javax.swing.JLabel lblStudentIDErrorMessage;
    private javax.swing.JLabel lblSubmissionCheck;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLayeredPane lpBackground;
    private javax.swing.JLayeredPane lpDetails;
    private javax.swing.JScrollPane spReason;
    private javax.swing.JTextArea txaReason;
    private javax.swing.JTextField txfNumLessonsAttended;
    private javax.swing.JTextField txfStudentID;
    // End of variables declaration//GEN-END:variables
}
