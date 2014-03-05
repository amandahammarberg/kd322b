import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Bargraph extends JComponent {

	private int women;
	private int men;
	private float total;

	int x = 0;
	int y = 0;

	public void updateValues(int women, int men) {
		this.women = women;
		this.men = men;

		total = women + men;
		invalidate();
		repaint();
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		int height = getHeight();
		int width = getWidth();

		float percentage; // procent för män
		float percentage1; // procent för kvinnor

		System.out.println("Enter the total, or men, or women");

		//total = 236;
		//men = 200;
		//women = 36;

		percentage = (float) (this.men / this.total);
		percentage1 = (float) (this.women / this.total);

		float percentagePixel =  height* percentage ;
		float percentagePixel1 = height*percentage1;
		
		int posyw = (int) (height-percentagePixel1);
		int posym = (int) (height-percentagePixel);

		System.out.println("The percentage of men are" + percentage + "%");

		System.out.println("The percentage of women are" + percentage1 + "%");

		System.out.println("Enter the score obtained");

		g.setColor(Color.BLUE);
		
		g.fillRect(30, posym, 50, (int)percentagePixel);
		g.setColor(Color.RED);
		g.fillRect(100, posyw, 50,(int) percentagePixel1);

	}
}
