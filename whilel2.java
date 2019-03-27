package forloop;

public class whilel2 {

	public static void main(String[] args) {
		int i, a;
		i = 0;
		a = 1;
		
		while (i < 3)
		{
			System.out.println("a = " + a + " + " + "i = " + i);
			a = a + i;
			i++;
			System.out.println("a = " + a);
		}

	}

}
