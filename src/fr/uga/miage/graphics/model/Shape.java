package fr.uga.miage.graphics.model;

import java.awt.Color;

/**
* @generated
*/
public class Shape {
	    
    /**
    * @generated
    */
    private Color color = Color.BLACK;
    
    /**
    * @generated
    */
    private Size size;
    
    
    /**
    * @generated
    */
    private Position position;

    /**
    * @generated
    */
    public Color getColor() {
        return this.color;
    }
    
    /**
    * @generated
    */
    public void setColor(Color color) {
        this.color = color;
    }
    
    
    /**
    * @generated
    */
    public Size getSize() {
        return this.size;
    }
    
    /**
    * @generated
    */
    public void setSize(Size size) {
        this.size = size;
    }
    
    /**
    * @generated
    */
    public Position getPosition() {
        return this.position;
    }
    
    /**
    * @generated
    */
    public void setPosition(Position position) {
        this.position = position;
    }  
    
    public void moveShape(Position p) {
    	
    	this.position.addToX(p.getX());
    	this.position.addToY(p.getY());

    }
}
