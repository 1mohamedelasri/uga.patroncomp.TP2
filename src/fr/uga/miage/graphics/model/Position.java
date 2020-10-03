package fr.uga.miage.graphics.model;


/**
* @generated
*/
public class Position {
    
	

    /**
    * @generated
    */
    private Integer x;
    
    /**
    * @generated
    */
    private Integer y;
    
        
    
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Position(Position p){
		this.x = p.getX();
		this.y = p.getY();
	}
	
    /**
    * @generated
    */
    public Integer getX() {
        return this.x;
    }
    
    /**
    * @generated
    */
    public void setX(Integer x) {
        this.x = x;
    }
    
    /**
    * @generated
    */
    public Integer getY() {
        return this.y;
    }
    
    /**
    * @generated
    */
    public void setY(Integer y) {
        this.y = y;
    }
    
    public void addToX(int x) {
    	if(x>= 0)
    		this.x+=  x;
    	this.x= this.x;
    }
    
    public void addToY(int y) {
    	if(y>= 0)
    		this.y+=  y;
    }
    
    public void subFromX(int x) {
    	this.x = this.x-x > 0?this.x-x:this.x;
    }
    
    public void subFromY(int y) {
    	this.y = this.y-y > 0?this.y-y:this.y;
    }


	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
    
}
