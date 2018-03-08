package ta;

/**
 * @creation IN_God_Mode I use "/////////" to demarcate segments of my
 * application
 */
import java.awt.Graphics;
import javax.swing.Timer;
import javax.swing.JLabel;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.google.gson.Gson;
import com.ibm.watson.developer_cloud.personality_insights.v2.PersonalityInsights;
import com.ibm.watson.developer_cloud.personality_insights.v2.model.Profile;
////////////////////////////////
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;
import com.ibm.watson.developer_cloud.util.GsonSingleton;
import com.ibm.watson.developer_cloud.util.BooleanToStringTypeAdapter;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.*;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.HashMap;
import com.ibm.watson.developer_cloud.util.RequestUtils;
import com.ibm.watson.developer_cloud.util.ResponseUtils;
import com.ibm.watson.developer_cloud.util.Validator;
import demo.PieChartDemo1.*;
import static demo.orsoncharts.PieChart3D2.createDataset;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer.*;
import javax.swing.Timer;
import javax.swing.UnsupportedLookAndFeelException;

// remove  all comments with this (##) before submitting
/**
 * @version 001
 * @author Tochukwu Nwanwko st20063247.
 */
public class PL extends javax.swing.JFrame {

    /**
     * Creates new form PL
     */
    public PL() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        usript = new javax.swing.JTextPane();
        ul = new javax.swing.JButton();
        stat = new javax.swing.JLabel();
        LG = new javax.swing.JPanel();
        PG = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        clr.setText("Clear Text");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        usript.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usriptKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(usript);

        ul.setText("Analyse");
        ul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ulMouseClicked(evt);
            }
        });
        ul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ulActionPerformed(evt);
            }
        });

        stat.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        stat.setText(".");

        LG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LGMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LGLayout = new javax.swing.GroupLayout(LG);
        LG.setLayout(LGLayout);
        LGLayout.setHorizontalGroup(
            LGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 295, Short.MAX_VALUE)
        );
        LGLayout.setVerticalGroup(
            LGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PGLayout = new javax.swing.GroupLayout(PG);
        PG.setLayout(PGLayout);
        PGLayout.setHorizontalGroup(
            PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
        );
        PGLayout.setVerticalGroup(
            PGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(clr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(ul, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addComponent(LG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ul, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 ////////////////////////////////////////////
public static ArrayList <Integer> blz = new ArrayList<Integer>();// barchartz
public  static ArrayList <String> prk = new ArrayList<String>();
    
    
   /////////////////////////////////////// 
    /* @return : void
    * clears  Jlabel "stat" after 3secs
     */
    public void clrJl() {
        Timer s = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stat.setText(null);
            }
        });
        //s.setRepeats(false);
        s.start();
    }

    /**
     * cearljTextArea
     */
    public void clearField() {
        usript.setText("");
    }

    // Draw line graph method
    public void drawLP() {
        Graphics lg = LG.getGraphics();
        // lg.getdrawLine (180,180,600,);
    }

    /*public  PG (String chrtTitle ) {
      @SuppressWarnings("ThrowableResultIgnored")
       /**
        had to suppress this  have to fix this at uni
     */
    // pieDataset daref1 =createDataset();
    // Graphics pg = PG .getGraphics();
    // pg.get (,,,);
    //} 
    /*@apend*/
   
    
    
    
    
    public void pm() {
        // searching for  bolean  :(
        // appends  error to stat labale  instead of a  JOption Pane :P
        if (!(Pattern.matches("\\D*", usript.getText()))) {
            stat.setText("Letters only please");
            //showMessage(stat,"The error"); 
            usript.setText(null);
        }
    }

    public void showMessage(JLabel label, String text) {
        label.setText(text);
    }

    ////////////////////////////////////////

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        clearField();
    }//GEN-LAST:event_clrActionPerformed

//##  button
    private void ulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ulActionPerformed
        pm();
        if (usript == null) {
            throw new IllegalArgumentException("Missing_Input");
        } else {
            // jsonFuction.jr (usript.getText());
         PersonalityInsights service = new PersonalityInsights();
            //IBM BLUEMIX USER CREDENTIALS  
            //service.setUsernameAndPassword("dc93d3a6-5c6e-44cb-94dc-e11602ceff02", "4MoxPkDsfyB3");// re new this ##
            service.setUsernameAndPassword("c8f5b26d-d029-48aa-97b1-703a9496dd04", "A7V3H8YysmFO");

            /*@creating  connection*/
// user data
 
            Profile profile = service.getProfile(usript.getText()).execute();
//usript .setText (profile.toString()); //push this  straight into the  graphs
            Gson gson = new Gson();
            RootObject r = gson.fromJson(profile.toString(), RootObject.class);
            Tree tr = r.getTree();
            List<Child> Childprop = tr.getChildren(); // called  tree vrable  tr
            for (Child Child1 : Childprop) {
                System.out.println(Child1.getName());
                //////////////////////////////////////
                List<Child2> Child2prop = Child1.getChildren(); //  calling the  above child  ie child1
                for (Child2 Child2 : Child2prop) {
                    System.out.println(Child2.getName());
                    ////////////////////////////
                    List<Child3> Child3prop = Child2.getChildren(); //  calling the  above child  ie child1
                    for (Child3 Child3 : Child3prop) {
                        System.out.println(Child3.getName()); // calling the  above child  ie child2
                        ///////////////////////////////////
                        List<Child4> Child4prop = Child3.getChildren(); //  calling the  above child  ie child1
                        for (Child4 Child4 : Child4prop) {
                            System.out.println(Child4.getName());
                            ////////////////////////////////////////////
                            String name = (String)(Child4.getName());
                           prk.add(name);
                           int percentage = (int)(Child4.getPercentage()*100);
                           blz.add(percentage);
                           
                           //////////////////////////////////////
                        }

                    }
                    System.out.println(r.getTree());

                    System.out.println(profile);

                    //return profile; );
                }
            }
        }
         //String text = usript.getTetxt();
        //ArrayList<Integer> profile;
         
         // Barchartz bz = new Barchartz(profile);
        // Chartz cz = new Chartz (profile);
          //bz. setvsible (true);
          //JFrame jf  = new JFrame ();
          //jf .add  (bz); 
          //jf.setSize (700,760);
          //jf.setVisible (true);
                 
    }//GEN-LAST:event_ulActionPerformed

    private void ulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulMouseClicked

    }//GEN-LAST:event_ulMouseClicked

    private void usriptKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usriptKeyPressed

    }//GEN-LAST:event_usriptKeyPressed

    private void LGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LGMouseClicked


    }//GEN-LAST:event_LGMouseClicked

    //private static final String URL = "https://gateway.watsonplatform.net/personality-insights/api"; 
    /*public Profile json_connect (String s) {
          
    }*/
 /* catch (Throwable e) {e.printStackTrace();}
    return profile;*/
    /////////////////////////////////////////////
    /* public String getProfileAsCSV(final Map<String, Object> parameters) { 
  Map<String, Object> doo = new HashMap<String, Object>(); 
  doo.putAll(parameters); 
  doo.put(CSV, true); 
 
  return getProfileAsString(doo); 
  
    public Profile getProfile(final String text) { 
  Validator.notEmpty(text,"Missing_Input"); 
  Map<String, Object>cns = new HashMap<String,Object>(); 
  cns.put(TEXT, text); 
  return getProfile(cns); 
    
    /////////////////////////////////////////////
      private static class filewiter {

        public filewiter() {
        }
    }
    public boolean jsontwritr (String s){
        filewiter fr;
        
        
        
      return true;} */
    /////////////////////////////////////
    
    
    
   
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
            java.util.logging.Logger.getLogger(PL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PL().setVisible(true);
                //new JPanel LG ().setVisible (true);
                //new JPanel PG ().set Visible (true);

                /*
                CreateChart nc = new createChart("Physolinguistics", "feelings_%");
                Barchart br = new barchart("Physolinguistics", "feelings_%");
                nc.pack();
                br.pack();
                nc.setVisible(true);
                br.setVisible(true);
                LG = br.Barchart(chartTitle);
                PG = nc.createChart(chartTite);
                 */
                
                
                // Barchartz bz = new Barchartz(profile);
        // Chartz cz = new Chartz (profile);
          //bz. setvsible (true);
          //JFrame jf  = new JFrame ();
          //jf .add  (bz); 
          //jf.setSize (700,760);
          //jf.setVisible (true);
            }
        });

        ////////////////////////////////////////////
        ///////////////////////////////////////////
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LG;
    private javax.swing.JPanel PG;
    private javax.swing.JButton clr;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel stat;
    public javax.swing.JButton ul;
    private javax.swing.JTextPane usript;
    // End of variables declaration//GEN-END:variables

}
