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
	
	// When implemented the new method, we need to do write the test cases again for new implemetation.
	public String sing(String sound){
		System.out.println("Singing....."+sound);
		return "true";
	}
}

class Duck extends Bird {
	public String swim(){
		System.out.println("I am Swiming");
		return "true";
	}
}

class Chicken extends Duck {}


public class Solution {     
	public static void main(String[] args) {         
		Bird bird = new Bird();         
		bird.walk();         
		bird.fly();         
		bird.sing("keelk keelk");   // Incase if this method is added without implementation, we can get the compile time error.
		Duck duck = new Duck();
		duck.sing("Quack Quack");
		duck.swim();
		Chicken chicken = new Chicken();
		chicken.sing("Cluck Cluck");
		
		} 
	} 
