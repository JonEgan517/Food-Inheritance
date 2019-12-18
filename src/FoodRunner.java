public class FoodRunner 
{
	public static void main(String[] args)
	{
		Food[] garden = new Food[4];
		garden[0] = new Apple();
		garden[1] = new Tomato();
		garden[2] = new Broccoli();
		garden[3] = new Spinach();
		
		for(Food f : garden)
		{
			f.typeOf();
			f.comeFrom();
			f.eat();
			f.taste();
			f.nutrition();
			System.out.println();
		}
	}
}
