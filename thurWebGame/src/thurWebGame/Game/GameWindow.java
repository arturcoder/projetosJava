package thurWebGame.Game;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	GameWindow(){
		
		this.add(new GamePanel());
		this.setTitle("Bools");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
