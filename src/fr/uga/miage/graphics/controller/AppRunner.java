package fr.uga.miage.graphics.controller;

import fr.uga.miage.graphics.view.GraphicsFrame;

public class AppRunner {
	public static void main( String[] arr) {
		
		GraphicsController graphicsController = new GraphicsController();
		GraphicsFrame g = new  GraphicsFrame(graphicsController);
	}
}
