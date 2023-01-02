package inheritance;

public class InheritnaceDemo {

	public static void main(String[] args) {
		Banta b = new Banta();
		b.play();
	}
}

//inheritance :- object of 1 class can access property of another class 

//there are 5 types of inheritance 

//extends keyword is used to achieve inheritance 

class Santa {
	void play() {
		System.out.println("PlaySanta");
	}
	void play(int a) {
		System.out.println("PlaySant(int)");
	}
	void game() {
		System.out.println("SantaGame");
	}

}

class Banta extends Santa {
	//overriding 
	void game() {
		System.out.println("BantaGame");
	}
}

//1 single level 
//2 multi level 
//3 hirerchical
//4 multiple  [ A -> B C ] 
//5 hybrid 

//overridding  
//overloading 



