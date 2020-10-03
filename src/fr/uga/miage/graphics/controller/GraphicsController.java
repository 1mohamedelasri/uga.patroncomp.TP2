package fr.uga.miage.graphics.controller;

import java.awt.Color;

import fr.uga.miage.graphics.model.Graphic;
import fr.uga.miage.graphics.model.Position;
import fr.uga.miage.graphics.model.Size;
import fr.uga.miage.graphics.view.GraphicsFrame;

public class GraphicsController {
	
	private Graphic myGraphic ;
	
	public GraphicsController() {
		this.myGraphic = new Graphic(new Size(500,800),new Position(0,0),Color.BLACK);
	}
	
	public Graphic getGraphic() {
		return myGraphic;
	}


}
