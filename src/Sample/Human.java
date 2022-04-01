package Sample;

public class Human extends Gender {
public void display() {
	System.out.println("My name is " + name);
	
}
public static void main(String[] args) {
	Human h = new Human();
	h . name = "SURYA";
h.display();
h.check();
}
}
