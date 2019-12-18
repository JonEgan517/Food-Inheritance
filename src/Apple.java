public class Apple extends Fruit
{
	@Override
	public void comeFrom() 
	{
		System.out.println("You see a " + color + " fruit. You grab the " + name + " off the tree.");
	}

	@Override
	public void taste() 
	{
		System.out.println("The " + name + " tastes sweet and sour.");
	}
	
	@Override
	public void nutrition() 
	{
		System.out.println("The " + name + " has " + calories + " calories, and the main source of nutrition is " + nutrient + ".");
	}
	
	public void eat()
	{
		System.out.println("You eat the " + name + ", Crunch.");
	}
	
	public Apple()
	{
		name = "Granny Smith Apple";
		nutrient = "Vitamin A";
		color = "green";
		calories = 102;	
	}
}
