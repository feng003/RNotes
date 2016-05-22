package shapes;

import java.awt.Graphics;

public class Circle extends Shape {
	private int x;
	private int y;
	private int radius;

	/**
	 * [Circle description]
	 * @param   [description]
	 * @param   [description]
	 * @param   [description]
	 * @return  [description]
	 */
	public Circle(int x, int y, int radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	@Override
	/**
	 * [draw description]
	 * @param g [description]
	 */
	public void draw(Graphics g) {
		g.drawOval(x-radius, y-radius, radius*2, radius*2);
	}
}
