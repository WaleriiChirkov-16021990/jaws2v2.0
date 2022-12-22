import java.util.ArrayList;

public class Application {
	public void run(){
	Human numan1 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
	Human numan2 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Олеся", "Никуленко", 29,"женский");
	Human numan3 = new Human("Микуленко Марина Евгеньевна", "Микуленко Сергей Олегович", "Андрей", "Никуленко", 52,"мужской");
	Human numan4 = new Human("Микуленко Галина Алексеевна", "Микуленко Виталий Генадьевич", "Ирина", "Никуленко", 51,"женский");
	Human numan5 = new Human("Чиркова Вера Алексеевна", "Чирков Валерий Валерьевич", "Сергей", "Микуленко", 75,"мужской");
	Human numan6 = new Human("Никифорова Елена Витальевна", "Никифоров Юрий Петрович", "Галина", "Микуленко", 71,"женский");
	Human numan7 = new Human("Никуленко Марина Евгеньевна", "Никуленко Дмитрий Андреевич", "Владимир", "Никуленко", 2,"мужской");
	Human numan8 = new Human("Шавшина Елена Александровна", "Микуленко Геннадий Иванович", "Виталий", "Микуленко", 70,"мужской");

	FamilyTree familyTree = new FamilyTree();
	familyTree.setFullName(numan1);
	ArrayList<Human> arrayList = new ArrayList<>();
	arrayList.add(numan1);
	arrayList.add(numan2);
	arrayList.add(numan3);
	arrayList.add(numan4);
	arrayList.add(numan5);
	arrayList.add(numan6);
	arrayList.add(numan7);
	arrayList.add(numan8);
		new Printer().toString(arrayList);
	familyTree.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree.getFullName()  + "\n");
	familyTree.printer();
	
	FamilyTree familyTree1 = new FamilyTree();
	familyTree1.setFullName(numan2);
	familyTree1.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree1.getFullName()  + "\n");
	familyTree1.printer();
	
		FamilyTree familyTree2 = new FamilyTree();
		familyTree2.setFullName(numan3);
		familyTree2.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree2.getFullName()  + "\n");
		familyTree2.printer();
		
		FamilyTree familyTree3 = new FamilyTree();
		familyTree3.setFullName(numan4);
		familyTree3.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree3.getFullName()  + "\n");
		familyTree3.printer();
		
		FamilyTree familyTree4 = new FamilyTree();
		familyTree4.setFullName(numan5);
		familyTree4.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree4.getFullName()  + "\n");
		familyTree4.printer();
		
		FamilyTree familyTree5 = new FamilyTree();
		familyTree5.setFullName(numan6);
		familyTree5.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree5.getFullName()  + "\n");
		familyTree5.printer();

		FamilyTree familyTree6 = new FamilyTree();
		familyTree6.setFullName(numan7);
		familyTree6.fillFamilyTreeUser(arrayList);
		System.out.println("\n"+familyTree6.getFullName()  + "\n");
		familyTree6.printer();
	}
}
