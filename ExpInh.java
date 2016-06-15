import java.io.*;
class Rectangle
{
	protected int a,b;
	public Rectangle(int p,int q)
	{
		a=p;
		b=q;
	}
	public void area ()
	{
		System.out.println("Area of Rectangle is :"+a*b);
	}
}
 class Triangle extends Rectangle
{
	int c;	
	public Triangle(int p,int q, int r)
	{
		super(p,q);
		c=r;
	}
	public void area()
	{
		float s=(a+b+c)/2;
		double d=s*(s-a)*(s-b)*(s-c);
		double k=Math.sqrt(d);
		System.out.println("Area of Triangle is :"+k);
	}	
}

public class ExpInh
{
	public static void main(String args[]) throws Exception
	{	int a,b,c;
		String str;	
		try
		{ 
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length and breath of Rectangle :");
		str=br.readLine();
		a=Integer.parseInt(str);
		str=br.readLine();
		b=Integer.parseInt(str);
		Rectangle R1=new Rectangle(a,b);
		System.out.println("Enter length of all three sides of Triangle :");
		str=br.readLine();
		a=Integer.parseInt(str);
		str=br.readLine();
		b=Integer.parseInt(str);
		str=br.readLine();
		c=Integer.parseInt(str);
		Triangle T1=new Triangle(a,b,c);
		R1.area();
		T1.area();

		} 
		catch (IOException e)
		{	e.printStackTrace();
		}
	
	}
}