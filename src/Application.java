import java.util.ArrayList;

public class Application {
	public void run(){
	Human numan1 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
	Human numan2 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Олеся", "Никуленко", 29,"женский");
	Human numan3 = new Human("Никуленко Марина Евгеньевна", "Никуленко Сергей Олегович", "Андрей", "Никуленко", 52,"мужской");
	Human numan4 = new Human("Микуленко Галина Алексеевна", "Микуленко Виталий Генадьевич", "Ирина", "Никуленко", 51,"женский");
	Human numan5 = new Human("Чиркова Вера Алексеевна", "Чирков Валерий Валерьевич", "Сергей", "Микуленко", 75,"мужской");
	Human numan6 = new Human("Никифорова Елена Витальевна", "Никифоров Юрий Петрович", "Галина", "Микуленко", 71,"мужской");
//	Human numan7 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan8 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan9 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan10 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan11 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan12 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan13 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan14 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
//	Human numan15 = new Human("Никуленко Ирина Витальевна", "Никуленко Андрей Сергеевич", "Дмитрий", "Никуленко", 22,"мужской");
	FamilyTree familyTree = new FamilyTree();
	familyTree.setFullName(numan1);
	ArrayList<Human> arrayList = new ArrayList<>();
	arrayList.add(numan1);
	arrayList.add(numan2);
	arrayList.add(numan3);
	arrayList.add(numan4);
	arrayList.add(numan5);
	arrayList.add(numan6);
	familyTree.fillFamilyTreeUser(arrayList);
	familyTree.printer();
	}
}