package forloop;

public class ifelse {

	public static void main(String[] args) {
		double a, b, c;
		int d;
		a = 4.0;
		b = 9.0;
		c = 15.0;
		d = 0;
		if (a + b * 2.0 > c + b)
		{
			d = 5;
		}
		else 
		{
			d = 10;
		}
		d++;
		System.out.println("d = " + d);
	}

}
