import java.util.ArrayList;

public class Printer {

	public void toString(BData humans) {
		for (Human h: humans.getHumanFamilyCollection()) {
			System.out.println(h);
//			System.out.println("\n");
		}
	}
	
	public void printerFamilyFree(ConnectionPeople connectionPeople){
		System.out.println("\nТекущая база данных: ");
		new Printer().toString(connectionPeople.getFamily());
		for (FamilyTree familyTree: connectionPeople.getTreeFamily()
		     ) {
			System.out.println("\nДля человека:\n" + familyTree.getFullName() + "\nИИ нашёл следующие родственные связи: ");
			familyTree.printer();
		}
	}
}
