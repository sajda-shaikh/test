package OOPs;

import java.io.IOException;

public class FunctionOverloading {

	public static void main(String[] args) throws IOException, Error {
		// TODO Auto-generated method stub
		FunctionOverloading f = new FunctionOverloading();
		int areaSquare = f.area(4);
		int areaRectangle = f.area(4, 2);
		System.out.println(areaSquare);
		System.out.println(areaRectangle);

		
	}
	
	public int area(int a, int b)
	{
		int rectangleArea = a*b;
		return rectangleArea;
	}

	public int area(int a)
	{
		int squareArea = a*a;
		return squareArea;
	}
	

}
