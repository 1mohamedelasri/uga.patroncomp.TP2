package graphicsTesting;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.uga.miage.graphics.model.Position;

class TestPosition {

	Position initalPos; 
	Position resultedPos; 

	
	@BeforeEach
	void init(){
		
		initalPos = new Position(100,200);
		resultedPos = new Position(100,200);

	}
	
	@Test
	void TestIncrementingPosition() {

		int a = 100, b = 300;
		resultedPos.addToX(a);
		resultedPos.addToY(b);
		
		// let's see if X position is moved by 100
		assertEquals(initalPos.getX()+a,resultedPos.getX());
		
		// let's see if Y position is moved by 100
		assertEquals(initalPos.getY()+b,resultedPos.getY());
		
		
		//  // let's see if we can move X position by -100,
		resultedPos.addToX(-a);
		resultedPos.addToY(-b);

		
		// in our program we can only increment X and Y with positive value
	 	assertEquals(initalPos.getX()+a,resultedPos.getX());
		
		// in our program we can only increment X and Y with positive value
	 	assertEquals(initalPos.getY()+b,resultedPos.getY());


	}
	
	
	@Test
	void TestDecrementingPosition() {
	
		int a = 50, b= 100;

		resultedPos.subFromX(50);
		resultedPos.subFromY(100);
		
		

		// let's see if we can move back X position by 100
		assertEquals(initalPos.getX()-a,resultedPos.getX());
		
		// let's see if we can move back Y position by 300
		assertEquals(initalPos.getY()-b,resultedPos.getY());
		
		
		//  // let's see if we can move X position by -100,
		resultedPos.subFromX(-a);
		resultedPos.subFromY(-b);

		
		// in our program we can only decrement X and Y with positive value
	 	assertNotEquals(initalPos.getX()-a,resultedPos.getX());
		
		// in our program we can only decrement X and Y with positive value
	 	assertNotEquals(initalPos.getY()-b,resultedPos.getY());


	}

}
