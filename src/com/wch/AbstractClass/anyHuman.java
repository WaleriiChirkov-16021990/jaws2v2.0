package com.wch.AbstractClass;

/**
 * Класс - шаблон для любого человека на земле.
 */
public abstract class anyHuman {
	private String mother;
	private String father;
	
	/**
	 * Метод задает Имя матери человека
	 * @param mother1 - Имя типа String
	 */
	 public void setMother(String mother1){
		 this.mother = mother1;
	 }
	/**
	 * Метод задает Имя отца человека
	 * @param father1 - Имя типа String
	 */
	 public void setFather(String father1){
		 this.father = father1;
	 }
	/**
	 * Метод возвращает Имя матери человека
	 */
	 public String getMother(){
		 return this.mother;
	 }
	/**
	 * Метод возващает Имя отца человека
	 */
	 public String getFather(){
		 return this.father;
	 }
	
}
