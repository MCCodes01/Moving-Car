/////////////////////////////////////////////
//Michael Cunningham
//Professor Mohammad Morovati
//Spring 2022 Introduction to Java (CIS-2571-NET01)
//Unit 15 "Racing Car"
/////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
This program implements an animation that moves
a car shape.
 */
public class AnimationTester
{
	private static final int ICON_WIDTH = 300;
	private static final int ICON_HEIGHT = 200;
	private static final int CAR_WIDTH = 100;
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();

		final MoveableShape shape
		= new CarShape(0, 0, CAR_WIDTH);

		ShapeIcon icon = new ShapeIcon(shape,
				ICON_WIDTH, ICON_HEIGHT);

		final JLabel label = new JLabel(icon);
		frame.setLayout(new FlowLayout());
		frame.add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		final int DELAY = 10; //100
		// Milliseconds between timer ticks
		Timer t = new Timer(DELAY, new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				shape.translate(5, 0);
				label.repaint();

			}
		});
		t.start();
	}


}