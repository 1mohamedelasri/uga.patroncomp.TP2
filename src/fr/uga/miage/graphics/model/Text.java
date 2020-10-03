package fr.uga.miage.graphics.model;


/**
* @generated
*/
public class Text extends Shape {
    

    /**
    * @generated
    */
    private String textContent;
    
    
    public Text(String content,Position p,Size s) {
    	super();
    	super.setPosition(p);
    	super.setSize(s);
    	this.textContent= content;
    }
    
    /**
    * @generated
    */
    public String getTextContent() {
        return this.textContent;
    }
    
    /**
    * @generated
    */
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
    
    @Override
    public String toString() {
		return "Text N";
    	
    }
}
