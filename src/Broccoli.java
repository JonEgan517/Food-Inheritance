public class Broccoli extends Vegetables
{
	@Override
	public void comeFrom() 
	{
		System.out.println("You see a " + color + " plant. You grab the " +name+ " flower off the plant.");
		
	}

	@Override
	public void taste() 
	{
		System.out.println("The " + name + " tastes a little bitter.");
	}
	
	@Override
	public void nutrition() 
	{
		System.out.println("The " + name + " has " + calories + " calories, and the main source of nutrition is " + nutrient + ".");
	}	
	
	public Broccoli()
	{
		name = "Sprouting broccoli";
		nutrient = "Vitamin K";
		color = "green";
		calories = 50;	
	}
}
