package com.wch.Project;

import java.util.ArrayList;

/**
 * Класс коллекции генеологических деревьев людей с обозначенным человеком, через призму которого построено дерево. и коллекцию людей , в которой проводили анализ.
 */
public class ConnectionPeople {
	private ArrayList<FamilyTree> treeFamily;
	private BData family;
	
	public ConnectionPeople(ArrayList<FamilyTree> treeFamily, BData family) {
		this.treeFamily = treeFamily;
		this.family = family;
	}
	
	public ConnectionPeople() {
	}
	
	public ArrayList<FamilyTree> getTreeFamily() {
		return treeFamily;
	}
	/**
	 * Setter
	 * @param treeFamily - коллекция деревьев
	 */
	public void setTreeFamily(ArrayList<FamilyTree> treeFamily) {
		this.treeFamily = treeFamily;
	}
	
	/**
	 * Метод добавляет в коллекцию очередное дерево.
	 * @param treeFamily
	 */
	public void addTreeFamily(FamilyTree treeFamily) {
		this.treeFamily.add(treeFamily);
	}
	/**
	 * Getter коллекции людей
	 * @return BData
	 */
	public BData getFamily() {
		return family;
	}
	/**
	 * Setter колекции людей
	 * @param family - коллекция людей BData
	 */
	public void setFamily(BData family) {
		this.family = family;
	}
	/**
	 * toString
	 * @return
	 */
	@Override
	public String toString() {
		return "ConnectionPeople{" +
				"treeFamily=" + treeFamily +
				", family=" + family +
				'}';
	}
}
