package fr.uga.miage.graphics.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;

/**
* @generated
*/
public class Image extends Shape {
    
    /**
    * @generated
    */
    private String url;
    
    
    /**
    * @generated
    */
    private List<Shape> shapes;
   
    
    
    public Image(String url,Position p,Size s) {
    	super();
    	this.url= url;
    	super.setPosition(p);
    	super.setSize(s);
    	this.shapes = new ArrayList<Shape>();
    	
    }
    
    /**
    * @generated
    */
    public String getUrl() {
        return this.url;
    }
    
    /**
    * @generated
    */
    public String setUrl(String url) {
        return this.url = url;
    }
    
    
    /**
    * @generated
    */
    public Shape setShapeList() {
        return (Shape) this.shapes;
    }
    
    /**
    * @generated
    */
    public void setShapeList(List<Shape> shape) {
        this.shapes =  shape;
    }
    
   
    public void addShapeToImg(Shape e) {
    	    	
    	if(e.getPosition().getX() > this.getPosition().getX() 
    			&&  e.getPosition().getY() > this.getPosition().getY())    		
    		
    		this.shapes.add(e);


    }
    
    @Override
    public String toString() {
		return "image";
    	
    }
    
    public List<Shape> getShapes() {
        return this.shapes;
    }
    
    public BufferedImage loadBufferedImage()
    {
        try
        {
        	ClassLoader classLoader = getClass().getClassLoader();
        	File file = new File(classLoader.getResource(this.url).getFile());
        	
            BufferedImage bi = ImageIO.read(file);
            return bi;
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
}
