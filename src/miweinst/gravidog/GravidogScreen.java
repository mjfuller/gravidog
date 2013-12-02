package miweinst.gravidog;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import miweinst.engine.App;
import miweinst.engine.screen.Screen;
import miweinst.engine.shape.AARectShape;
import miweinst.engine.shape.PolygonShape;
import cs195n.Vec2f;
import cs195n.Vec2i;

public class GravidogScreen extends Screen {
	protected App app;
	private PolygonShape _background;
	
	public GravidogScreen(App a) {
		super(a);
		app = a;
		_background = new AARectShape(new Vec2f(0, 0), a.getDimensions()).rectToPoly();
		_background.setColor(Color.BLACK);
		//SYSTEM FONTS
/*		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (int i=0; i<fonts.length; i++) {
			System.out.println(fonts[i]);
		}	
*/
	}
	
	protected void setBackgroundColor(Color col) {
		_background.setColor(col);
	}

	@Override
	public void onTick(long nanosSincePreviousTick) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onDraw(Graphics2D g) {
		_background.draw(g);	
	}

	@Override
	public void onKeyTyped(KeyEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onKeyPressed(KeyEvent e) {
		if (e.getKeyChar() == 'q') System.exit(0);
		if (e.getKeyChar() == 'r') app.setScreen(new MainMenuScreen(app));
	}

	@Override
	public void onKeyReleased(KeyEvent e) {
	}

	@Override
	public void onMouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onMousePressed(MouseEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onMouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onMouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onMouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onMouseWheelMoved(MouseWheelEvent e) {
		// TODO Auto-generated method stub		
	}

	@Override
	public void onResize(Vec2i newSize) {
		// TODO Auto-generated method stub		
	}
}
