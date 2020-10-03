package fr.uga.miage.graphics.model;


/**
* @generated
*/
public class Size {
    
    /**
    * @generated
    */
    private Integer height;
    
    /**
    * @generated
    */
    private Integer width;
    
    
    /**
    * @generated
    */
    private Shape shape;
    
    
	public Size(int height, int width){
		this.height = height;
		this.width = width;
	}
	
	public Size(Size s) {
	    this.height = s.getHeight();
	    this.width = s.getWidth();
	}
	
    public Size() {
    	height = width = 0;
	}

	/**
    * @generated
    */
    public Integer getHeight() {
        return this.height;
    }
    
    /**
    * @generated
    */
    public void setHeight(Integer height) {
        this.height = height;
    }
    
    /**
    * @generated
    */
    public Integer getWidth() {
        return this.width;
    }
    
    /**
    * @generated
    */
    public void setWidth(Integer width) {
        this.width = width;
    }
    
    
    /**
    * @generated
    */
    public Shape getShape() {
        return this.shape;
    }
    
    /**
    * @generated
    */
    public void setShape(Shape shape) {
        this.shape = shape;
    }

	@Override
	public String toString() {
		return "Size [height=" + height + ", width=" + width + "]";
	}
   
}
