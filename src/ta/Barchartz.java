package ta;
///////////////////////////////////////////////////
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.*;
//import org.jfree.data.general.PieDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartPanel;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.renderer.xy.*;
//import org.jfree.chart.ChartPanel;
import org.jfree.chart.LegendItem.*;
import org.jfree.chart.panel.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.panel.*;
//import org.jfree.data.general.

////////////////////////////////////////////////////


/**
 * @author st20063247 Tochukwu
 */

// append to  janel in  class PL
public class Barchartz  extends JPanel{
    //Plot3D plot = (barPlot3D) brchrt.getPlot();
    ArrayList <Integer>    blz;
    public Barchartz(ArrayList<Integer> blz) {
		
		this.blz = blz;
	}
    
    
    @Override
	public void paintComponent(Graphics g) { 
            
		Graphics2D g2 = (Graphics2D) g;
		
		// Save transformations
		AffineTransform restoreTransform = g2.getTransform();
		
		// Clear background
		g2.setBackground(Color.WHITE);
		g2.clearRect(0, 0, 600, 300);
		
		
		// Draw axis lines
		g2.setColor(Color.BLACK);
		g2.draw(new Line2D.Double(40.0, 20.0, 40.0, 280.0));
		g2.draw(new Line2D.Double(40.0, 280.0, 560.0, 280.0));
		
		
		// Draw axis labels
		Font F = new Font("Consolas", Font.PLAIN, 18);
		g2.setFont(F);
		
		// Draw label on x axis
		g2.drawString("Samples", 490, 295);
		
		// Draw rotated label on y axis		
		g2.transform(AffineTransform.getTranslateInstance(35, 80));
		g2.transform(AffineTransform.getRotateInstance(-90.0 * (Math.PI / 180.0)));		
		g2.drawString("Values", 0, 0);
		
		
		// Reset transformations		
		g2.setTransform(restoreTransform);
		
		
		// Draw bars
		
		// Gradient fill
		GradientPaint G = new GradientPaint(0, 0, Color.WHITE, 0, 300, Color.BLUE);
		g2.setPaint(G);
		
		
		final double barWidthFactor = 0.8;
		
		double barSpace = (560.0 - 40.0) / (double)blz.size();
		double barWidth = barSpace * barWidthFactor;
		double barMargin = barSpace * ((1.0 - barWidthFactor) / 2.0);
		
		double baseX = 40.0;
		
		for (int i=0;i<blz.size();i++, baseX = baseX + barSpace) {
                    
                    g2.fill(new Rectangle2D.Double(
					baseX + barMargin,
					280.0 - blz.get(i),
					barWidth,
					blz.get(i)));
        }
}
}