package prob6;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(int width, int height) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;

	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width = width * s;
		height = height * s;
	}

}
