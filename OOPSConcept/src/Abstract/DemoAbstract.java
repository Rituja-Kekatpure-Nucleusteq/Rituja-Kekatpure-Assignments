package Abstract;

abstract class Animal
{
	//Constructor
	Animal ()
	{
		System.out.println("Animal class Constructor");
	}
	
	//non-abstract method
	void animalType()
	{
		System.out.println("Domestic and Wild");
	}
	// abstract method
	abstract void voice();
}
class Lion extends Animal 
{
	void voice()
	{
		System.out.println("Lions Roars");
	}
}
class Dog extends Animal
{
	void voice()
	{
		System.out.println("Dog Barks");
	}
}
public class DemoAbstract {
    public static void main(String[] args)
    {
    	Animal a;
    
    	a = new Lion();
    	a.animalType();
    	a.voice();
    	
    	a = new Dog();
    	a.voice();
    }
}
