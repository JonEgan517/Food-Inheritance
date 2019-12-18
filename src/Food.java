public abstract class Food 
{
	protected String name;
	protected String nutrient;
	protected String color;
	protected int calories;
	
	public abstract void typeOf();
	public abstract void comeFrom();
	public abstract void taste();
	public abstract void nutrition();
	
	public void eat()
	{
		System.out.println("You eat the " + name + ", Chomp.");
	}
}
