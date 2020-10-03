package fr.uga.miage.graphics.view;

import javax.swing.JFrame;

import fr.uga.miage.graphics.controller.GraphicsController;
import javax.swing.JButton;

public class GraphicsFrame extends JFrame{
	
	private GraphicsPanel gPanel;
	private GraphicsController gController ; 
	
	public GraphicsFrame(GraphicsController gController) {
		this.gController = gController;
		this.gPanel = new GraphicsPanel(gController);		
		this.init();
	}
	
	public void init() {
		this.setContentPane(gPanel);
		this.setTitle("Graphics Drawing App");
		this.setSize(gController.getGraphic().getBgSize().getWidth()+100,gController.getGraphic().getBgSize().getHeight()+100);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
