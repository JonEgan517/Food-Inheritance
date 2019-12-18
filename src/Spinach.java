
public class Spinach extends Vegetables
{

	@Override
	public void comeFrom() 
	{
		System.out.println("You see a " + color + " plant. You grab the the " + name + " leaves.");
	}

	@Override
	public void taste() 
	{
		System.out.println("The " + name + " tastes like " + name + ".");
	}

	@Override
	public void nutrition() 
	{
		System.out.println("The " + name + " has " + calories + " calories, and the main source of nutrition is " + nutrient + ".");
	}
	
	public void eat()
	{
		System.out.println("You eat the " + name + ", mmmmmm.");
	}
	
	public Spinach()
	{
		name = "Savoy Spinach";
		nutrient = "Iron";
		color = "green";
		calories = 7;
	}
	
}
