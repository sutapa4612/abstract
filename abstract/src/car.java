

abstract class car
{
	abstract void run();
}
class BMW extends car
{
	void run()
	{
		System.out.println("moving fastly");
	}

	public static void main(String[] args) {
		car ob=new BMW();
		ob.run();
	
		// TODO Auto-generated method stub

	}

}
