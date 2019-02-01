public class ProxyPatternDemo
{

	public static void main(String[] args)
	{
		Image image = new ProxyImage("Pac_Man.png");
		image.display();
		System.out.println(" ");
		
		image.display();
	}

}
