class Book
{
	String name;
	String color;
	double price;

	Book(String name,String color, double price)
	{
		this.name = name;
		this.color = color;
		this.price = price;
	}


	public void displayBook()
	{
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}

}