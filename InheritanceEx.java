package 4; 

public class InheritanceEx {
	// one class is allows to another class
	// immidiate to the parent clss or child class
	// inheritance implement by using extence keyword
	// the class who features are inheritance is known as parent class or base class.
	// the clas sthat inherits the other class its sub class or derived class or exteded class or child class
	// main reason for inheritance using Abstraction
	// super is a keyword that referencing a parent class or super class of a subclass in java .returns the objects that represents from parent class.
	
	public int gear;
	public int speed;
	InheritanceEx(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	public void speedUp(int increment)
	{
		speed+=increment;
		}
	
	
	

}
