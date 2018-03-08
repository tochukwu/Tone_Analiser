
package ta;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;

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
       
public class chartz {
  
		
	final int numSlices = 6;
	final double pcValues[] = {24.0, 48.0, 11.0, 24.0, 8.0, 16.0};
	final Color pcColors[] = {Color.RED, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.blue, Color.ORANGE};
	final double pcOffsets[] = {30.0, 0.0, 0.0, 10.0, 10.0, 0.0};
	
	
	public chartz() {
		
		super();
	}
	
	//@Override mehod  hadd errorb##
	public void pntC(Graphics g) {
				
		Graphics2D g2 = (Graphics2D) g;

		int canvasWidth = this.getWidth();
		int canvasHeight = this.getHeight();
		
		GradientPaint G = new GradientPaint(100, 0, Color.WHITE, 100, canvasHeight, Color.BLUE);
		g2.setPaint(G);
		g2.fillRect(0, 0, canvasWidth, canvasHeight);
		
		
		double sum = 0.0;
		for (int i=0;i<numSlices;i++) {
			
			sum = sum + pcValues[i];
		}
		
		for (int i=0;i<numSlices;i++) {
		
			pcValues[i] = pcValues[i] / sum;
		}
		
		
		// Draw arcs
		double startDegree = Math.random() * 360.0;
		
		for (int i = 0; i<numSlices;i++) {
		
			double degreeSpan = pcValues[i] * 360.0;
		
			// ** offset bit
			double offsetDegree = startDegree + (degreeSpan / 2.0);
			double offsetRadian = offsetDegree * (Math.PI / 180.0);
			double offsetX = Math.cos(offsetRadian) * pcOffsets[i];
			double offsetY = Math.sin(offsetRadian) * pcOffsets[i];
			
			// Setup arc geometry and colour
			Arc2D.Double A = new Arc2D.Double(100.0+offsetX, 209.0-offsetY,
                         200.0,
                         200.0,
                         startDegree, degreeSpan,
                         Arc2D.PIE);
			
			g2.setPaint(pcColors[i]);
			// Draw filled arc
			g2.fill(A);
			g2.setPaint(Color.BLACK);
			g2.setStroke(new BasicStroke(4.0f));
			g2.draw(A);
			// Move startDegree to next segment
			startDegree = startDegree + degreeSpan;
		}
	}
/////////////////////////////////////////////////////////////////////////
        // mde  me create this  method to stop with  & highe  errors##
    private int getWidth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /////////////////////////////////////////////

    
}
