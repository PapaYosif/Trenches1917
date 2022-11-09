import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	// screen settings
	
	final int originalTileSize = 64;
	final int scale = 1;
	final int tileSize = originalTileSize * scale;
	final int maxScreenCol = 32;
	final int maxScreenRow = 16;
	final int screenWidth = tileSize * maxScreenCol; // 8192
	final int screenHeight = tileSize * maxScreenRow; // 6144
	
	Thread gameThread = new Thread();
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
	}
	
	public void startGameThread()
	{
		gameThread = new Thread(this);
		gameThread.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (gameThread != null)
		{
			
		}
		
	}

}
