package fr.uga.miage.graphics.model;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
* @generated
*/
public class Graphic {
    
	List<Shape> shapes;
	
    /**
    * @generated
    */
    private Color bgColor;
    
    /**
    * @generated
    */
    private Size bgSize;
    
    
    private Position gPosition;

    
    
	public Graphic(Size bgSize,Position gPosition, Color bgColor) {
		this.shapes = new ArrayList<>();
		this.bgSize = bgSize;
		this.gPosition = gPosition;
	}
	
    /**
    * @generated
    */
    public Color getBgColor() {
        return this.bgColor;
    }
    
    /**
    * @generated
    */
    public void setBgColor(Color bgColor) {
        this.bgColor = bgColor;
    }
    
    /**
    * @generated
    */
    public Size getBgSize() {
        return this.bgSize;
    }
    
    /**
    * @generated
    */
    public void setBgSize(Size bgSize) {
        this.bgSize = bgSize;
    }
     

    public List<Shape> getShapes() {
        return this.shapes;
    }
    
    public void addShapeToGraphic(Shape shape) {
    	if((this.bgSize.getWidth()+this.gPosition.getX()) >= (shape.getPosition().getX()+shape.getSize().getWidth()) 
    			&& (this.bgSize.getHeight()+this.gPosition.getY()) >= (shape.getPosition().getY()+shape.getSize().getHeight())
    			&& this.gPosition.getX() <= (shape.getPosition().getX())
    			&& this.gPosition.getY() <= (shape.getPosition().getY())

    	){
    		System.out.println(shape.getSize()+""+shape.getPosition());
    		System.out.println(this);

    		this.shapes.add(shape);
    	}
    }

	@Override
	public String toString() {
		return "Graphic [bgSize=" + bgSize + ", gPosition=" + gPosition + "]";
	}

	public Position getgPosition() {
		return gPosition;
	}
	
	
	public void move(Direction d,int distance) {
		switch(d) {
		case DOWN:
			this.gPosition.addToY(distance);
			for(Shape item: this.shapes )	item.getPosition().addToY(distance);
			break;
		case UP:
			this.gPosition.subFromY(distance);
			for(Shape item: this.shapes )	item.getPosition().subFromY(distance);
			break;
		case RIGHT:
			this.gPosition.addToX(distance);
			for(Shape item: this.shapes )	item.getPosition().addToX(distance);
			break;
		case LEFT :
			this.gPosition.subFromX(distance);
			for(Shape item: this.shapes )	item.getPosition().subFromX(distance);
			break;
		}
	}
	
	public void move(Direction d) {
		move(d,10);
	}

    
}
