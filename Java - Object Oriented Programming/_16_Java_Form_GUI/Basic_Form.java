package _16_Java_Form_GUI;
import javax.swing.JFrame;

public class Basic_Form extends javax.swing.JPanel {

    public Basic_Form() {
        initComponents();
    }

    public static void main(String[] args) {
        JFrame j=new JFrame();
        j.setVisible(true);
        
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //j.setSize(200,200);
        //j.setLocation(500,300);
        j.setBounds(400,400,400,400);
        j.setTitle("Zeeshan App");
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        My_Buttton = new javax.swing.JButton();

        My_Buttton.setText("Click here");
        My_Buttton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                My_ButttonMouseClicked(evt);
            }
        });
        My_Buttton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                My_ButttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(My_Buttton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(My_Buttton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void My_ButttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_My_ButttonMouseClicked

    }//GEN-LAST:event_My_ButttonMouseClicked

    private void My_ButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_My_ButttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_My_ButttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton My_Buttton;
    // End of variables declaration//GEN-END:variables
}
