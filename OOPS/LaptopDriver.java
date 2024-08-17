class LaptopDriver 
{
	public static void main(String[] args) 
	{
		Laptop l1 =new Laptop();
		l1.brand="Lenovo";
		l1.price=70000;
		l1.processor="i7";
		l1.ram=32;
		l1.rom=1;
		l1.model="IdeaPad";
		l1.color="black";
		l1.wt=2;
		System.out.println("Brand is "+l1.brand);
		System.out.println("Price is "+l1.price);
	    System.out.println("Processor is "+l1.processor);
		System.out.println("Ram "+l1.ram+"GB");
		System.out.println("Rom " +l1.rom+"TB");	
		System.out.println("Model"+l1.model);
		System.out.println("Color "+l1.color);
		System.out.println("Weight "+l1.wt+"kg");

          Laptop l2=new Laptop();
		l2.brand="HP";
		l2.price=40000;
		l2.processor="i5";
		l2.ram=16;
		l2.rom=1;
		l2.model="pavillion";
		l2.color="GRAY";
		l2.wt=1.5;
		System.out.println("Brand is "+l2.brand);
		System.out.println("Price is "+l2.price);
	    System.out.println("Processor is "+l2.processor);
		System.out.println("Ram "+l2.ram+"GB");
		System.out.println("Rom " +l2.rom+"TB");	
		System.out.println("Model"+l2.model);
		System.out.println("Color "+l2.color);
		System.out.println("Weight "+l2.wt+"kg");


	}
}
