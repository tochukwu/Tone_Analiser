
package ta;


import javax.swing.JFrame;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
import org.jfree.chart.LegendItem.*;
import org.jfree.chart.panel.*;
import org.jfree.chart.plot.PiePlot3D;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;
        

/**  
 * @author mr maulray
 */
public class CreateChart extends JFrame { 
/**
    public CreateChart (String chartTitle){
    PieDataset dref1 = createDataset();
    JFreeChart pc = createChart (dref1, chartTitle);
    chart Panel.setPreferredSize (new java.awt.Dimentions (500,300));
    setContentPane (chartPanel);
    } */
 /**   
private PieDataset createDataset () {

DefaultPieDataset ans = new DefaultPieDataset();
// replicate tis for all the data as this  bit  ppulates the  pie chart
/*ans.setValue ("woman "65);
ans.setValue ("man "41);*/
//return ans;

//}

/*public JFreeChart createChart (PieDataset dataset,String tile) {
/*JFreeChart pc = ChartFactory.createPieChart3D (title, dref1, true ,true,true);
PiePlot3D plot = (PiePlot3D) pc.getPlot();
plot.setStartAngle(0);
plot.setDirection (Rotation .CLOCKWISE);
plot.setForegroundAlpha (0.1f);
 return pc;
} 
*/

}
