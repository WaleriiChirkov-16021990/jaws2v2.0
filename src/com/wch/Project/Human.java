package com.wch.Project;

import com.wch.AbstractClass.anyHuman;
import com.wch.Interface.anyPerson;
import java.util.Objects;

/**
 * Класс описывает человека для генеологического древа наследую свойства класса anyHuman и реализуя интерфейс anyPerson
 */
public class Human extends anyHuman implements anyPerson {
	private static int id = 0;
	private String firstName;
	private String secondName;
	private int age;
	private String gender;
	
	/**
	 * переопределенный метод задает/ меняет имя человеку
	 * @param name - имя строкой
	 */
	@Override
	public void setName(String name) {
		this.firstName = name.split(" ")[1];
		this.secondName = name.split(" ")[0];
	}
	
	/**
	 * переопределенный метод задает/ меняет возраст человеку
	 * @param age -положительное числовое значение.
	 */
	@Override
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * переопределенный метод задает/ меняет пол человеку
	 * @param gender - мужской или женский.
	 */
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	/**
	 * Конструктор человека, каждый человек хранит уникальный ID
	 * @param mother - полное имя матери строкой
	 * @param father - полное имя отца строкой
	 * @param firstName - свое имя строкой
	 * @param secondName - своя фамилия строкой
	 * @param age- свой возраст числом
	 * @param gender - свой пол
	 */
	public Human(String mother, String father, String firstName, String secondName, int age, String gender) {
		this.id = ++id;
		super.setMother(mother);
		super.setFather(father);
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.gender = gender;
	}
	public Human() {
		this.id = ++id;
	}
	public Human(Human human){
		this.id = ++id;
		super.setMother(human.getMother());
		super.setFather(human.getFather());
		this.firstName = human.getFirstName();
		this.secondName = human.getSecondName();
		this.age = human.getAge();
		this.gender = human.getGender();
	}
	
	/**
	 * немного Getter & Setter
	 * @return
	 */
	public static int getId() {
		return id;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return this.secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return this.age;
	}
	public String getGender() {
		return this.gender;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getAge() == human.getAge() && this.getMother().equals(human.getMother()) && this.getFather().equals(human.getFather()) && this.getFirstName().equals(human.getFirstName()) && this.getSecondName().equals(human.getSecondName()) && this.getGender().equals(human.getGender());
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.getMother(), this.getFather(), this.getFirstName(), this.getSecondName(), this.getAge(), this.getGender());
	}
	
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он ребенком текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameChildren(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[] father = human.getFather().toLowerCase().split(" ");
		String[] mother = human.getMother().toLowerCase().split(" ");
		return this.getSecondName().toLowerCase().equals(father[0]) &&
				this.getFirstName().toLowerCase().equals(father[1]) ||
						this.getSecondName().toLowerCase().equals(mother[0]) &&
						this.getFirstName().toLowerCase().equals(mother[1]);
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он сыном текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameSon(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullName = human.getFather().toLowerCase().split(" ");
		String secondName = this.getSecondName();
		return secondName.equals(fullName[0]) &&
				this.getFirstName().equals(fullName[1]) &&
				human.getGender().equals("мужской");
	}
	
	/**
	 * toString...
	 * @return строка с полями и параметрами человека.
	 */
	@Override
	public String toString() {
		return "Human{" +
				"mother='" + super.getMother() + '\'' +
				", father='" + super.getFather() + '\'' +
				", firstName='" + firstName + '\'' +
				", secondName='" + secondName + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				'}';
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он братом текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameBrother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getFather().equals(human.getFather()) &&
				this.getMother().equals(human.getMother()) &&
				human.getGender().equals("мужской");
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он сводным братом текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameStepBrother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getFather().equals(human.getFather())&&
				human.getGender().equals("мужской") &&
				!(this.getMother().equals(human.getMother()) &&
						human.getGender().equals("мужской")) ||
				!(this.getFather().equals(human.getFather())&&
						human.getGender().equals("мужской")) &&(
						this.getMother().equals(human.getMother()) &&
								human.getGender().equals("мужской")) ;
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он сестрой текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameSister(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getFather().equals(human.getFather()) &&
				this.getMother().equals(human.getMother()) &&
				human.getGender().equals("женский");
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он сводной сестрой текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameStepSister(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getFather().equals(human.getFather())&&
				human.getGender().equals("женский") && !(
				this.getMother().equals(human.getMother()) &&
						human.getGender().equals("женский")) ||
				!(this.getFather().equals(human.getFather())&&
						human.getGender().equals("женский")) &&(
						this.getMother().equals(human.getMother()) &&
						human.getGender().equals("женский")) ;
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он отцом текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameFather(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullName = this.getFather().toLowerCase().split(" ");
		return fullName[0].equals(human.getSecondName().toLowerCase()) &&
				fullName[1].equals(human.getFirstName().toLowerCase());
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он дочерью текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameDauther(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullNameFather = human.getFather().toLowerCase().split(" ");
		return this.getSecondName().toLowerCase().equals(fullNameFather[0]) &&
				this.getFirstName().toLowerCase().equals(fullNameFather[1]) &&
				human.getGender().equals("женский");
	}
	/**
	 * метод анализа объекта "о"(в частности человека), на предмет, является ли он мамой текущего человека.
	 * @param o - человек переданный для анализа
	 * @return - boolean истина или ложь
	 */
	public boolean equalsFullNameMother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullNameMother = this.getMother().toLowerCase().split(" ");
		return fullNameMother[0].equals(human.getSecondName().toLowerCase()) &&
				fullNameMother[1].equals(human.getFirstName().toLowerCase());
	}
}
