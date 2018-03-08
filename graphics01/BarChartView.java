
package uk.ac.cardiffmet.pnangel.graphics01;

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

public class BarChartView extends JPanel {
	
	// Data model
	ArrayList<Integer>			dataSource;
	
	public BarChartView(ArrayList<Integer> dataSource) {
		
		this.dataSource = dataSource;
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
		
		double barSpace = (560.0 - 40.0) / (double)dataSource.size();
		double barWidth = barSpace * barWidthFactor;
		double barMargin = barSpace * ((1.0 - barWidthFactor) / 2.0);
		
		double baseX = 40.0;
		
		for (int i=0;i<dataSource.size();i++, baseX = baseX + barSpace) {
			
			g2.fill(new Rectangle2D.Double(
					baseX + barMargin,
					280.0 - dataSource.get(i),
					barWidth,
					dataSource.get(i)));
		}
	}
}
