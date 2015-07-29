import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ClockPanel extends JPanel implements ActionListener {

	int hourTime;
	int minuteTime;

	JTextField timeIsHere;

	public ClockPanel(JTextField timeField) {
		timeIsHere = timeField;
		this.setPreferredSize(new Dimension(300,300));
	}

	public void bumpTime() {
		minuteTime++;
		if (minuteTime == 60) {
			minuteTime =0;
			hourTime++;
			if (hourTime == 13)
				hourTime =1;
		}
		repaint();
	}

	public void actionPerformed(ActionEvent e) {

		String time = timeIsHere.getText();
		int colon = time.indexOf(':');

		String hours = time.substring(0,colon);
		String minutes = time.substring(colon+1);

		hourTime = Integer.parseInt(hours);
		minuteTime = Integer.parseInt(minutes);

		System.out.println(hourTime+" "+minuteTime);

		repaint();

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.fillOval(140,140,20,20);

		double hour = hourTime;
		if (hour == 12)
			hour = 0;

		drawHand(g, hour, 70, 12, 0.2);

		drawHand(g, minuteTime, 100, 60, 0.1);


	}

	private void drawHand(Graphics g, double hour, int length, int max, double width) {

		double hourAngle = hour/max*2.0*Math.PI- Math.PI/2;
		int[] hourHandX = new int[3];
		int[] hourHandY = new int[3];

		hourHandX[0] = 150;
		hourHandY[0] = 150;

		hourHandX[1] = (int) (150 + length*Math.cos(hourAngle+width));
		hourHandY[1] = (int) (150 + length*Math.sin(hourAngle+width));

		hourHandX[2] = (int) (150 + length*Math.cos(hourAngle-width));
		hourHandY[2] = (int) (150 + length*Math.sin(hourAngle-width));

		g.fillPolygon(hourHandX,hourHandY,3);
	}


}
