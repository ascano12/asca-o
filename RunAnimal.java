import java.util.Scanner;

	public class RunAnimal{
	public static void main(String[] args) {
	Scanner SC = new Scanner (System.in);
	String choice;
	Bird b = new Bird ();
	Cat c = new Cat();
	Dog d =new Dog ();

	System.out.print("Choose an animal. Press B for Bird, C for Cat,or D for Dog: " );
	choice = SC.nextLine();
	if (choice.equalsIgnoreCase("B")){
	b.eat();
	b.sleep();
	b.makeSound();
}
else if (choice.equalsIgnoreCase("C")){
	c.eat();
	c.sleep();
	c.makeSound();
}
	else if (choice.equalsIgnoreCase("D")){
	d.eat();
	d.sleep();
	d.makeSound();
}
	else {
	System.out.println("Invalid Input");
	}
}
}