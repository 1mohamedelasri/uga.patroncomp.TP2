package fr.uga.miage.graphics.controller;

import java.awt.Color;
import java.util.Random;
import fr.uga.miage.graphics.model.Image;
import fr.uga.miage.graphics.model.Line;
import fr.uga.miage.graphics.model.Oval;
import fr.uga.miage.graphics.model.Position;
import fr.uga.miage.graphics.model.Rectangle;
import fr.uga.miage.graphics.model.Shape;
import fr.uga.miage.graphics.model.Size;
import fr.uga.miage.graphics.model.Text;

public class ShapeFactory {
	
	  //use getShape method to get object of type shape 
	   public static Shape getShape(String shapeType){
		   
		   Shape newShape = null;
		   Random rand = new Random();
		   
		   Position randomPos = new Position(rand.nextInt(300),rand.nextInt(300));
		   Size size = new Size(rand.nextInt(400)+200,rand.nextInt(400)+200);
		   
		
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("RECTANGLE")){
	    	  newShape = new Rectangle(new Position(randomPos),size);  
	      } else if(shapeType.equalsIgnoreCase("TEXT")){
	    	  newShape =  new Text("someText",randomPos,size);
	      } else if(shapeType.equalsIgnoreCase("IMAGE")){
	    	  newShape = new Image(rand.nextInt(5)+".png",new Position(rand.nextInt(600),rand.nextInt(600)),new Size(rand.nextInt(100)+30,rand.nextInt(100)+30));
	     
	      }else if(shapeType.equalsIgnoreCase("LINE")){
	    	  newShape = new Line(new Position(randomPos),size);
		   }else if(shapeType.equalsIgnoreCase("OVAL")){
			   newShape = new Oval(new Position(randomPos),size);  
		    }
	      
		   Color[] colors = {Color.BLACK,Color.BLUE,Color.GREEN,Color.YELLOW,Color.RED};
		   newShape.setColor(colors[rand.nextInt(colors.length)]);
	     
		   return newShape;
	   }

}
