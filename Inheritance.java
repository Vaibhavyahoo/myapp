class Whatsappv1
{
	void texting()
	{
		System.out.println("texting feature in v1");
	}
}
class Whatsappv2 extends Whatsappv1
{
	void multimedia()
	{
		System.out.println("multimedia feature in v2");

	}
}
class Whatsappv3 extends Whatsappv2

{
	void calling()
	{
	
		System.out.println("calling feature in v3");
	}
}

public class Inheritance
{
	public static void main(String []args)
	{
		Whatsappv3 v1=new Whatsappv3();
		v1.texting();
      		v1.multimedia();
		v1.calling();
	}
}


