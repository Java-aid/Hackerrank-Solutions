/**
 * 
 */
package com.javaaid.hackerrank.solutions.languages.java.advanced;

/**
 * @author Kanahaiya Gupta
 *
 */
public class CovariantReturnTypes {
/**
 * main code starts from here** */
	class Flower{
	    
	    public String whatsYourName(){
	        return "I have many names and types.";
	    }
	}
	class Jasmine extends Flower{
	    public String whatsYourName(){
	        return "Jasmine";
	    }
	}
	class Lily extends Flower{
	    public String whatsYourName(){
	        return "Lily";
	    }
	}
	class Lotus extends Flower{
	    public String whatsYourName(){
	        return "Lotus";
	    }
	}
	class State{
	    Flower yourNationalFlower(){
	        return new Flower();
	    }
	}
	class WestBengal extends State{
	    Jasmine yourNationalFlower(){
	        return new Jasmine();
	    }
	}
	class Karnataka extends State{
	    Lotus yourNationalFlower(){
	        return new Lotus();
	    }
	}
	class AndhraPradesh extends State{
	    Lily yourNationalFlower(){
	        return new Lily();
	    }
	    /**
	     * main code ends here  */
	}
}
