package graphicsTesting;


import java.awt.Color;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import fr.uga.miage.graphics.model.Direction;
import fr.uga.miage.graphics.model.Graphic;
import fr.uga.miage.graphics.model.Oval;
import fr.uga.miage.graphics.model.Position;
import fr.uga.miage.graphics.model.Rectangle;
import fr.uga.miage.graphics.model.Shape;
import fr.uga.miage.graphics.model.Size;

class TestGraphic {

	@Test
	void AddShapesToGraphics () {
		// Test if graphic doesn't add shapes that overflows its borders
		

			Graphic myGraphic = new Graphic(new Size(500,800),new Position(20,20),Color.BLACK);

		   Size size = new Size(500,800);
		   int gWidth = myGraphic.getBgSize().getWidth();
		   int gHeight = myGraphic.getBgSize().getHeight();
		   int gPosX = myGraphic.getgPosition().getX();
		   int gPosY = myGraphic.getgPosition().getY();

		   Position pos = new Position(gPosX+gWidth+300 , gPosY+gHeight+200) ;
		   
		   Shape rectangle = new Rectangle(pos,size);
		   Shape oval = new Oval(pos,size);  
		   
		   
		   myGraphic.addShapeToGraphic(rectangle);
		   myGraphic.addShapeToGraphic(oval);

		   // this assert that shapes above were not added because their size is much larger than graphic size
		 	assertTrue(myGraphic.getShapes().size() == 0);

	}
	
	@Test
	void moveGraphicWithShapes () {
		// Test if graphic doesn't add shapes that overflows its borders
		

		   Graphic myGraphic = new Graphic(new Size(500,800),new Position(20,20),Color.BLACK);

		   Size size = new Size(50,50);
		   Position pos = new Position(myGraphic.getgPosition().getX()+100 , myGraphic.getgPosition().getY()+100) ;
		   
		   Shape rectangle = new Rectangle(new Position(pos),size);
		   Shape oval = new Oval(new Position(pos),size);  
		   
		   Position recInitialPos =  new Position(rectangle.getPosition());
		   Position ovalInitialPos = new Position(oval.getPosition());

		   myGraphic.addShapeToGraphic(rectangle);
		   myGraphic.addShapeToGraphic(oval);

		   // this assert that shapes above were added 
		 	assertTrue(myGraphic.getShapes().size() != 0);
		 	
		 	// let's move graphic with 30 distance to the Right direction with 30 distance.
		 	myGraphic.move(Direction.RIGHT, 30);
		 	
		 	// now let's check if shapes inside the graphic were also moved
		 	
		 	
		 	assertEquals(recInitialPos.getX()+30,rectangle.getPosition().getX());

		    assertEquals(ovalInitialPos.getX()+30,oval.getPosition().getX());

	}

}
