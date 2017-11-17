package javabasic;

class Birds {
	public String bird;
	public String color;
	
	Birds(String bird, String color){
		this.bird = bird;
		this.color = color;
	}
	
	public String birdData() {
		return ("Bird: " + bird + "\nColor: " + color);
	}
}

class FlyingBird extends Birds {
	public String haveWings;

	FlyingBird(String bird, String color, String haveWings) {
		super(bird, color);
		this.haveWings = haveWings;
		// TODO Auto-generated constructor stub
	}
	
	public String birdData() {
		return (super.birdData() + "\nhaveWings: " + haveWings);
	}
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyingBird fb = new FlyingBird("Parrot", "Green", "Yes");
		FlyingBird fb2 = new FlyingBird("Ostrich", "Pink", "No");
		System.out.println(fb.birdData());
		System.out.println("\n" + fb2.birdData());

	}

}
