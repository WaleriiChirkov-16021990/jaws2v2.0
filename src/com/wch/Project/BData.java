package com.wch.Project;

import java.util.ArrayList;
import java.util.Objects;

/**
 * класс хранения коллекции людей
 */
public class BData {
	private ArrayList<Human> humanFamilyCollection;
	
	
	public BData(ArrayList<Human> humanFamilyCollection) {
		this.humanFamilyCollection = humanFamilyCollection;
	}
	public BData() {
	}
	public ArrayList<Human> getHumanFamilyCollection() {
		return humanFamilyCollection;
	}
	
	/**
	 * сравнение обьектов класса
	 * @param o - второй объект
	 * @return
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BData bData)) return false;
		return getHumanFamilyCollection().equals(bData.getHumanFamilyCollection());
	}
	
	/**
	 * новый хэшкод обьектов класса
	 * @return
	 */
	@Override
	public int hashCode() {
		return Objects.hash(getHumanFamilyCollection());
	}
	
	/**
	 *  актуальный toString
	 * @return
	 */
	@Override
	public String toString() {
		return "BData{" +
				"humanFamilyCollection=" + humanFamilyCollection +
				'}';
	}
	
	/**
	 * метод перебирает людей из коллекции проводит по ним исследование, создает индивидуальное гениалогическое дерево и добавляет его в коллекцию таких деревьев
	 * @return - коллекция гениалогических деревьев.
	 */
	public ConnectionPeople findFamilyTree(){
		ConnectionPeople cp = new ConnectionPeople(new ArrayList<FamilyTree>(), this);
			for (Human human : this.getHumanFamilyCollection()) {
				FamilyTree familyTree = new FamilyTree();
				familyTree.setFullName(human);
				familyTree.fillFamilyTreeUser(this);
				cp.getTreeFamily().add(familyTree);
			}
			cp.setFamily(this);
			return cp;
		}
}

