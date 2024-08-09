class Area 
{
	public static void main(String[] args) 
	{
		rectangle(12,4);
		areaOfTriangle(12,5);
		circle(4);
	}
     
	public static void rectangle(float length,float width)
	{
	  float areaOfRect=length*width;
	  float circumferenceOfRect=2*(length+width);
	  System.out.println("Area of rectangle is "+areaOfRect);
	  System.out.println("circumference of rectangle is"+circumferenceOfRect);

	}

	public static void areaOfTriangle(float breadth,float height)
	{
	  float areaOfTriangle=(float)1/2*breadth*height;
	  System.out.println("Area of triangle is "+areaOfTriangle);

	}

	public static void circle(float radius)
	{
	  float areaOfCircle=3.14f*radius*radius;
	  float circumferenceOfCircle=(float)(2*3.14)*radius;
	  System.out.println("Area of circle is "+areaOfCircle);
	  System.out.println("circumference of circle is"+circumferenceOfCircle);
       
	}


}
