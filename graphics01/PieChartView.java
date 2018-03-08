
package uk.ac.cardiffmet.pnangel.graphics01;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.ArrayList;

public class PieChartView extends JPanel {
	
	//
	// Example data model
	//
		
	final int numSlices = 6;
	final double pcValues[] = {24.0, 48.0, 11.0, 24.0, 8.0, 16.0};
	final Color pcColors[] = {Color.RED, Color.GREEN, Color.ORANGE, Color.MAGENTA, Color.blue, Color.ORANGE};
		
	// *** Offsets
	final double pcOffsets[] = {30.0, 0.0, 0.0, 10.0, 10.0, 0.0};
	
	
	// Constructor
	public PieChartView() {
		
		super();
	}
	
	@Override
	public void paintComponent(Graphics g) {
				
		Graphics2D g2 = (Graphics2D) g;

		int canvasWidth = this.getWidth();
		int canvasHeight = this.getHeight();
		
		
		// Gradient fill
		GradientPaint G = new GradientPaint(100, 0, Color.WHITE, 100, canvasHeight, Color.BLUE);
		g2.setPaint(G);
		g2.fillRect(0, 0, canvasWidth, canvasHeight);
		
		
		// Normalise slices to span 0..360 degree range
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
		
			// Draw outline arc
			g2.setPaint(Color.BLACK);
			g2.setStroke(new BasicStroke(4.0f));
			g2.draw(A);
			
			// Move startDegree to next segment
			startDegree = startDegree + degreeSpan;
		}
	}
}
