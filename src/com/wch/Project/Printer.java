package com.wch.Project;

/**
 * Класс вывода информации.
 */
public class Printer {
	/**
	 * Метод выводит полученную базу данных humans в консоль.
	 * @param humans - база данных(class BData) экземпляров людей(class Human).
	 */
	public void toString(BData humans) {
		for (Human h: humans.getHumanFamilyCollection()) {
			System.out.println(h);
		}
	}
	
	/**
	 * Метод финальной печати результатов исследования генеологического древа, по переданной базе людей
	 * @param connectionPeople - коллекция генеологических деревьев каждого человека из базы данных.
	 */
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
