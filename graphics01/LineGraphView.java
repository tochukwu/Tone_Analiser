
package uk.ac.cardiffmet.pnangel.graphics01;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import javax.swing.*;


public class LineGraphView extends JPanel {
	
	// Data model
	ArrayList<Integer>			dataSource;
	
	public LineGraphView(ArrayList<Integer> dataSource) {
		
		this.dataSource = dataSource;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		AffineTransform restoreTransform = g2.getTransform();
		
		
		// Draw axis lines
		g2.setColor(Color.BLACK);
		g2.draw(new Line2D.Double(40.0, 20.0, 40.0, 280));
		g2.draw(new Line2D.Double(40.0, 280.0, 560.0, 280.0));
		
		
		// Draw axis labels
		Font F = new Font("Consolas", Font.PLAIN, 18);
		g2.setFont(F);
		
		// Draw label on x axis
		g2.drawString("Samples", 490, 295);
		
		// Draw rotated label on y axis
		AffineTransform R = AffineTransform.getRotateInstance(-90.0 * (Math.PI / 180.0));
		AffineTransform T = AffineTransform.getTranslateInstance(35, 80);
		g2.transform(T);
		g2.transform(R);
		
		g2.drawString("Values", 0, 0);
		
		
		// Restore transformation (since we don't want everything else rotated!)
		g2.setTransform(restoreTransform);
		
		
		// Draw data
		final float dashPattern[] = {10.0f};
		final BasicStroke dashed =
				new BasicStroke(
						3.0f, // width
						BasicStroke.CAP_BUTT, // end style
						BasicStroke.JOIN_MITER, // line join styles
						10.0f, // JOIN_MITER limit
						dashPattern,
						0.0f);

		g2.setStroke(dashed);
		
		double dist = ((560.0 - 40.0) / (double)dataSource.size());
		double x = 40.0;
		
		for (int i=0;i<dataSource.size() - 1;i++){ 
		
			double y1 = 280.0 - (double)dataSource.get(i);
			double y2 = 280.0 - (double)dataSource.get(i+1);
		
			g2.draw(new Line2D.Double(x, y1, x+dist, y2));
			
			x = x + dist;
		}
	}
}