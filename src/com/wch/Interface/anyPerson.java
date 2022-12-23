package com.wch.Interface;

/**
 * Описание любой персоны обладающей именем, возрастом, и гендерной принадлежностью.
 */
public interface anyPerson {
	/**
	 * Метод задает имя персоны.
	 * @param name
	 */
	void setName(String name);
	
	/**
	 * Метод задает возраст персоны.
	 * @param age -положительное числовое значение.
	 */
	void setAge(int age);
	
	/**
	 * Метод задает гендер персоны.
	 * @param gender - мужской или женский.
	 */
	void setGender(String gender);
	
}
