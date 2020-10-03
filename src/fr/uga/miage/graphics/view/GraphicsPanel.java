package fr.uga.miage.graphics.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.uga.miage.graphics.controller.GraphicsController;
import fr.uga.miage.graphics.controller.ShapeFactory;
import fr.uga.miage.graphics.model.Direction;
import fr.uga.miage.graphics.model.Image;
import fr.uga.miage.graphics.model.Line;
import fr.uga.miage.graphics.model.Oval;
import fr.uga.miage.graphics.model.Rectangle;
import fr.uga.miage.graphics.model.Shape;
import fr.uga.miage.graphics.model.Text;

public class GraphicsPanel extends JPanel{

	private JButton addRect;
	private JButton addLine;
	private JButton addImg;
	private JButton addOval;
	private JButton addText;
	private JButton clear;
	private JLabel graphicPostition;
	private JButton up;
	private JButton down;
	private JButton left;
	private JButton right;

	GraphicsController gController;
	private JButton adSpToimg;
	
	public GraphicsPanel(GraphicsController gController) {
		this.gController = gController;
		this.init();
	}
	
	public void init() {        
		addRect = new JButton("rectangle");
		addLine = new JButton("Line");
		addImg  = new JButton("Image");
		addOval = new JButton("Oval");
		addText = new JButton("Text");
		adSpToimg = new JButton("Add Shapes to Image");
		clear = new JButton("clear");
		graphicPostition= new JLabel("Graphic Position");
		up  = new JButton("UP");
		down = new JButton("DOWN");
		left = new JButton("LEFT");
		right = new JButton("RIGHT");

	
        ActionListener btnListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				String[] names = {"RECTANGLE","IMAGE","LINE","TEXT","OVAL"};
				if(e.getSource().equals(addRect)) {
					Shape newShape = (Shape) ShapeFactory.getShape(names[0]);
					gController.getGraphic().addShapeToGraphic(newShape);
				}
				
				if(e.getSource().equals(addImg)) {
					Shape newShape = (Shape) ShapeFactory.getShape(names[1]);
					gController.getGraphic().addShapeToGraphic(newShape);
				}
				
				if(e.getSource().equals(addLine)) {
					Shape newShape = (Shape) ShapeFactory.getShape(names[2]);
					gController.getGraphic().addShapeToGraphic(newShape);
				}
				
				if(e.getSource().equals(addText)) {
					Shape newShape = (Shape) ShapeFactory.getShape(names[3]);
					gController.getGraphic().addShapeToGraphic(newShape);
				}
				
				if(e.getSource().equals(addOval)) {
					Shape newShape = (Shape) ShapeFactory.getShape(names[4]);
					gController.getGraphic().addShapeToGraphic(newShape);
				}
				
				if(e.getSource().equals(adSpToimg)) {
					List<Shape> list =  (List<Shape>) gController.getGraphic().getShapes().stream().filter(c -> c instanceof Image).collect(Collectors.toList());;
					
					Random rand = new Random();
					int nb = rand.nextInt(4);
					list.stream().forEach(c -> ((Image)c).addShapeToImg(ShapeFactory.getShape(names[nb])));
				}
				
				if(e.getSource().equals(clear)) {
					for(Shape item: gController.getGraphic().getShapes() )
					gController.getGraphic().getShapes().clear();
				}
				
				if(e.getSource().equals(up)) {
					gController.getGraphic().move(Direction.UP);
				}
				
				if(e.getSource().equals(down)) {
					gController.getGraphic().move(Direction.DOWN);
				}
				
				if(e.getSource().equals(left)) {
					gController.getGraphic().move(Direction.LEFT);
				}
				
				if(e.getSource().equals(right)) {
					gController.getGraphic().move(Direction.RIGHT);
				}
				
				repaint();
				
			}
			
		};
		
		addRect.addActionListener(btnListener);
		addLine.addActionListener(btnListener);
		addImg.addActionListener(btnListener);
		addOval.addActionListener(btnListener);
		addText.addActionListener(btnListener);
		adSpToimg.addActionListener(btnListener);
		clear.addActionListener(btnListener);
		
		up.addActionListener(btnListener);
		down.addActionListener(btnListener);
		right.addActionListener(btnListener);
		left.addActionListener(btnListener);
		
		this.add(addText);
		this.add(addRect);
		this.add(addLine);
		this.add(addImg);
		this.add(addOval);
		this.add(clear);
		this.add(graphicPostition);
		this.add(up);
		this.add(down);
		this.add(right);
		this.add(left);
		this.add(adSpToimg);


		
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		drawGraphic((Graphics2D)g,gController.getGraphic().getShapes());

				
	}
	
	public void drawGraphic(Graphics2D graphic, List<Shape> listShapes) {
		
		for(Shape ele : listShapes) {
			int x = ele.getPosition().getX();
			int y = ele.getPosition().getY();
			int w = ele.getSize().getWidth();
			int h = ele.getSize().getHeight();

			graphic.setColor(ele.getColor());
			
			if(ele instanceof Image) {
				BufferedImage bimg = ((Image)ele).loadBufferedImage();
				if(bimg != null) {
					//graphic.drawRect(x,y,w+200,h+200);
					graphic.drawImage(bimg, x, y, w,h,this);
				}
				drawGraphic(graphic,((Image) ele).getShapes());
				
			}
			
			if(ele instanceof Rectangle) {
				graphic.drawRect(x,y,w,h);
			}
			
			if(ele instanceof Line) {
				graphic.drawLine(x, y, x+w, y+h);
			}
			
			if(ele instanceof Text)
				graphic.drawString(((Text)ele).getTextContent(), x, y);
			
			if(ele instanceof Oval)
				graphic.drawOval(x, y,w-1,h-1);

			graphic.drawRect(gController.getGraphic().getgPosition().getX(),gController.getGraphic().getgPosition().getY(),
					gController.getGraphic().getBgSize().getWidth(),gController.getGraphic().getBgSize().getHeight());

	
		}
	}

}
