import java.util.ArrayList;

public class Printer {

	public void toString(ArrayList<Human> humans) {
		for (Human h: humans
		     ) {
			System.out.println(h);
			System.out.println("\n");
		}
	}
}
