public class Tomato extends Fruit
{

	@Override
	public void comeFrom() 
	{
		System.out.println("You see a " + color + " fruit. You grab the " + name + " off the bush.");
	}
	
	@Override
	public void taste() 
	{
		System.out.println("The " + name + " tastes sweet.");
	}
	
	@Override
	public void nutrition() 
	{
		System.out.println("The " + name + " has " + calories + " calories, and the main source of nutrition is " + nutrient + ".");
	}
	
	public void eat()
	{
		System.out.println("You eat the " + name + ", yum yum.");
	}
	
	public Tomato()
	{
		name = "Cherry Tomatoes";
		nutrient = "Vitamin C";
		color = "red";
		calories = 22;
	}
}
