package studentmanagementsystem;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DashBoard extends javax.swing.JFrame {
    
    public static int flag;
    
    public DashBoard() {
        initComponents();
        //Date d=new Date();
        //SimpleDateFormat formatin=new SimpleDateFormat("dd MMMM yyyy");
        //this.Date.setText(formatin.format(d));
         showDateandTime();
    }
     void showDateandTime()
     {
          Thread datetimeday = new Thread() {
            public void run() {
                try {
                    for (;;) {
                        Calendar cal = new GregorianCalendar();
                        int date = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        DateLabel.setText(date + "/" + (month + 1) + "/" + year);

                        int hour = cal.get(Calendar.HOUR);
                        int minute = cal.get(Calendar.MINUTE);
                        int second = cal.get(Calendar.SECOND);
                        TimeLabel.setText(hour + ":" + minute + ":" + second);

                        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
                        int day = cal.get(Calendar.DAY_OF_WEEK);
                        //System.out.println(day);
                        DayLabel.setText(days[day - 1]);
                        sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        datetimeday.start();

     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        DayLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ParsonalInfoButton = new javax.swing.JButton();
        NewStudentButton = new javax.swing.JButton();
        AttendenceButton = new javax.swing.JButton();
        ScheduleButton = new javax.swing.JButton();
        Parformance = new javax.swing.JButton();
        ResultButton = new javax.swing.JButton();
        AllStudent = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        HomeMenu = new javax.swing.JMenuItem();
        FileMenu = new javax.swing.JMenuItem();
        EditOptions = new javax.swing.JMenu();
        EditParsonalInfoOption = new javax.swing.JMenuItem();
        Update_Student_Info = new javax.swing.JMenuItem();
        Delete_Stud_ = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(26, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Home");

        DateLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        TimeLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        DayLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(181, 231, 146));

        ParsonalInfoButton.setBackground(new java.awt.Color(232, 242, 225));
        ParsonalInfoButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ParsonalInfoButton.setText("Personal Info");
        ParsonalInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParsonalInfoButtonActionPerformed(evt);
            }
        });

        NewStudentButton.setBackground(new java.awt.Color(232, 242, 225));
        NewStudentButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NewStudentButton.setText("New Student");
        NewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudentButtonActionPerformed(evt);
            }
        });

        AttendenceButton.setBackground(new java.awt.Color(232, 242, 225));
        AttendenceButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AttendenceButton.setText("Attendence");
        AttendenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendenceButtonActionPerformed(evt);
            }
        });

        ScheduleButton.setBackground(new java.awt.Color(232, 242, 225));
        ScheduleButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ScheduleButton.setText("Schedule");
        ScheduleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScheduleButtonActionPerformed(evt);
            }
        });

        Parformance.setBackground(new java.awt.Color(232, 242, 225));
        Parformance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Parformance.setText("Performance");
        Parformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParformanceActionPerformed(evt);
            }
        });

        ResultButton.setBackground(new java.awt.Color(232, 242, 225));
        ResultButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ResultButton.setText("Result");
        ResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultButtonActionPerformed(evt);
            }
        });

        AllStudent.setBackground(new java.awt.Color(232, 242, 225));
        AllStudent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        AllStudent.setText("All Students");
        AllStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ParsonalInfoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addComponent(NewStudentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AttendenceButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ScheduleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Parformance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ResultButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AllStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ParsonalInfoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NewStudentButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AttendenceButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScheduleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Parformance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ResultButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AllStudent)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        File.setText("File");

        HomeMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        HomeMenu.setText("Home ");
        File.add(HomeMenu);

        FileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        FileMenu.setText("Log out");
        FileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileMenuActionPerformed(evt);
            }
        });
        File.add(FileMenu);

        jMenuBar1.add(File);

        EditOptions.setText("Edit");

        EditParsonalInfoOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        EditParsonalInfoOption.setText("Edit Personal Info");
        EditParsonalInfoOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditParsonalInfoOptionActionPerformed(evt);
            }
        });
        EditOptions.add(EditParsonalInfoOption);

        Update_Student_Info.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Update_Student_Info.setText("Update Student Info");
        Update_Student_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_Student_InfoActionPerformed(evt);
            }
        });
        EditOptions.add(Update_Student_Info);

        Delete_Stud_.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Delete_Stud_.setText("Delete Student");
        Delete_Stud_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Stud_ActionPerformed(evt);
            }
        });
        EditOptions.add(Delete_Stud_);

        jMenuBar1.add(EditOptions);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileMenuActionPerformed
        this.setVisible(false);
        StudentLogin sl=new StudentLogin();
        sl.show();
    }//GEN-LAST:event_FileMenuActionPerformed

    private void ParsonalInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParsonalInfoButtonActionPerformed
        
        flag=1;
        
        Search se=new Search();
        se.setVisible(true);
    }//GEN-LAST:event_ParsonalInfoButtonActionPerformed

    private void EditParsonalInfoOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditParsonalInfoOptionActionPerformed
        
        
    }//GEN-LAST:event_EditParsonalInfoOptionActionPerformed

    private void NewStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudentButtonActionPerformed
        EditInfo ed=new EditInfo();
        ed.setVisible(true);
    }//GEN-LAST:event_NewStudentButtonActionPerformed

    private void AllStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllStudentActionPerformed
        this.setVisible(false);
        AllStudentShow as=new AllStudentShow();
        as.setVisible(true);
    }//GEN-LAST:event_AllStudentActionPerformed

    private void Update_Student_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_Student_InfoActionPerformed
       flag=2;
        Search se=new Search();
        se.setVisible(true);
    }//GEN-LAST:event_Update_Student_InfoActionPerformed

    private void Delete_Stud_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Stud_ActionPerformed
        this.hide();
        DeleteStud ds=new DeleteStud();
        ds.setVisible(true);
    }//GEN-LAST:event_Delete_Stud_ActionPerformed

    private void ResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultButtonActionPerformed
       ResultOptions res=new ResultOptions();
       //this.hide();
       res.setVisible(true);
    }//GEN-LAST:event_ResultButtonActionPerformed

    private void ParformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParformanceActionPerformed
        Parformance par=new Parformance();
        this.hide();
        par.setVisible(true);
    }//GEN-LAST:event_ParformanceActionPerformed

    private void AttendenceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendenceButtonActionPerformed
        this.hide();
        Attendence at=new Attendence();
        at.setVisible(true);
        
    }//GEN-LAST:event_AttendenceButtonActionPerformed

    private void ScheduleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScheduleButtonActionPerformed
        this.hide();
        Routine ro=new Routine();
        ro.setVisible(true);
    }//GEN-LAST:event_ScheduleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AllStudent;
    private javax.swing.JButton AttendenceButton;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DayLabel;
    private javax.swing.JMenuItem Delete_Stud_;
    private javax.swing.JMenu EditOptions;
    private javax.swing.JMenuItem EditParsonalInfoOption;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem FileMenu;
    private javax.swing.JMenuItem HomeMenu;
    private javax.swing.JButton NewStudentButton;
    private javax.swing.JButton Parformance;
    private javax.swing.JButton ParsonalInfoButton;
    private javax.swing.JButton ResultButton;
    private javax.swing.JButton ScheduleButton;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JMenuItem Update_Student_Info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
