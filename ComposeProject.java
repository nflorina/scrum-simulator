/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hakathon;

import static hakathon.Member.getRandomInteger;
import java.util.Hashtable;
import java.util.Random;

/**
 *
 * @author florence
 */
public class ComposeProject extends javax.swing.JFrame {

    /**
     * Creates new form ComposeProject
     */
    public ComposeProject() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 750));
        setMinimumSize(new java.awt.Dimension(1500, 750));
        setPreferredSize(new java.awt.Dimension(1500, 750));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/proj_desc.jpg"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-80, 0, 1500, 750);

        setSize(new java.awt.Dimension(1404, 962));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        setVisible(false);
        MakeTeam mt = new MakeTeam();
        mt.setVisible(true);
        
        Member[] allOptions = new Member[9];
        Hashtable ability = new Hashtable();
        ability.put(1,"FRONTEND");
        ability.put(2,"BACKEND");
        ability.put(3,"INTEGRATIONS");
        ability.put(4,"AI");
        
        String[] girlsName = {"ANA", "MARIA", "CORNELUSA", "BRANDUSA"};
        String[] boysName = {"MIKE", "TAYSON", "JOHN", "ROBY"};
        
        for(int i = 0; i < 4; i++) {
            Random r = new Random();
            int p = r.nextInt(4);
            int s = r.nextInt(4);
            int velocity = getRandomInteger(1, 5);
            while(s == p)
                s = r.nextInt(4);
            allOptions[i] = new Member(girlsName[i], 1, p + 1, s + 1, velocity);
        }
        
         for(int i = 0; i < 4; i++) {
            Random r = new Random();
            int p = r.nextInt(4);
            int s = r.nextInt(4);
            int velocity = getRandomInteger(1, 5);
            while(s == p)
                s = r.nextInt(4);
            allOptions[4 + i] = new Member(boysName[i], 0, p + 1 , s + 1, velocity);
        }
         
       MakeTeam.nume1.setText(allOptions[1].name);
        mt.pskill1.setText((String)ability.get(allOptions[1].primarySkill));
        mt.sskill1.setText((String)ability.get(allOptions[1].secondarySkill));
        MakeTeam.vel1.setText(Integer.toString(allOptions[1].velocity));
        
        mt.nume2.setText(allOptions[2].name);
        mt.pskill2.setText((String)ability.get(allOptions[2].primarySkill));
        mt.sskill2.setText((String)ability.get(allOptions[2].secondarySkill));
        mt.vel2.setText(Integer.toString(allOptions[2].velocity));
        
        mt.nume3.setText(allOptions[3].name);
        mt.pskill3.setText((String)ability.get(allOptions[3].primarySkill));
        mt.sskill3.setText((String)ability.get(allOptions[3].secondarySkill));
        mt.vel3.setText(Integer.toString(allOptions[3].velocity));
        
        mt.nume4.setText(allOptions[4].name);
         mt.pskill4.setText((String)ability.get(allOptions[4].primarySkill));
        mt.sskill4.setText((String)ability.get(allOptions[4].secondarySkill));
        mt.vel4.setText(Integer.toString(allOptions[4].velocity));
        
        mt.nume5.setText(allOptions[5].name);
        mt.pskill5.setText((String)ability.get(allOptions[5].primarySkill));
        mt.sskill5.setText((String)ability.get(allOptions[5].secondarySkill));
        mt.vel5.setText(Integer.toString(allOptions[5].velocity));
        
        mt.nume6.setText(allOptions[6].name);
        mt.pskill6.setText((String)ability.get(allOptions[6].primarySkill));
        mt.sskill6.setText((String)ability.get(allOptions[6].secondarySkill));
        mt.vel6.setText(Integer.toString(allOptions[6].velocity));
        
        mt.nume7.setText(allOptions[7].name);
        mt.pskill7.setText((String)ability.get(allOptions[7].primarySkill));
        mt.sskill7.setText((String)ability.get(allOptions[7].secondarySkill));
        mt.vel7.setText(Integer.toString(allOptions[7].velocity));
        
        mt.nume8.setText(allOptions[0].name);
        mt.pskill8.setText((String)ability.get(allOptions[0].primarySkill));
        mt.sskill8.setText((String)ability.get(allOptions[0].secondarySkill));
        mt.vel8.setText(Integer.toString(allOptions[0].velocity));
        
           
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(ComposeProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComposeProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComposeProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComposeProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComposeProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}