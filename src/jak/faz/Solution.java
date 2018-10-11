package jak.faz;


class Animal {   
	public String walk(){     
		System.out.println("I am walking...");
		return "true";
		}
	}

class Bird extends Animal {     
	public String fly() {         
		System.out.println("I am flying....");     
		return "true";
		}
	
	// When implementented the new method, we need to do write the test cases again for new implemetation.
	public String sing(){
		System.out.println("I am Singing.....");
		return "true";
	}
}

public class Solution {     
	public static void main(String[] args) {         
		Bird bird = new Bird();         
		bird.walk();         
		bird.fly();         
		bird.sing();   // Incase if this method is added without implementation, we can get the compile time error.  
		} 
	} 
