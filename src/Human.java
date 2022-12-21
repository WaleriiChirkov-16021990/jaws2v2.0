import java.util.Objects;

public class Human {
	private static int id = 0;
	private String mother;
	private String father;
	private String firstName;
	private String secondName;
	private int age;
	private String gender;
	
	public Human(String mother, String father, String firstName, String secondName, int age, String gender) {
		this.id = ++id;
		this.mother = mother;
		this.father = father;
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.gender = gender;
	}
	
	public Human() {
		this.id = ++id;
	}
	
	public static int getId() {
		return id;
	}
	
	public String getMother() {
		return mother;
	}
	
	public void setMother(String mother) {
		this.mother = mother;
	}
	
	public String getFather() {
		return father;
	}
	
	public void setFather(String father) {
		this.father = father;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getAge() == human.getAge() && getMother().equals(human.getMother()) && getFather().equals(human.getFather()) && getFirstName().equals(human.getFirstName()) && getSecondName().equals(human.getSecondName()) && getGender().equals(human.getGender());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getMother(), getFather(), getFirstName(), getSecondName(), getAge(), getGender());
	}
	
	public boolean equalsFullNameChildren(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getSecondName().equals(human.getFather().toLowerCase().split("")[0]) &&
				getFirstName().equals(human.getFather().toLowerCase().split("")[1]);
	}
	
	public boolean equalsFullNameSon(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getSecondName().equals(human.getFather().toLowerCase().split("")[0]) &&
				getFirstName().equals(human.getFather().toLowerCase().split("")[1]) &&
				human.getGender().toLowerCase().equals("мужской");
	}
	
	public boolean equalsFullNameBrother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getFather().toLowerCase().equals(human.getFather().toLowerCase()) &&
				getMother().equals(human.getFather().toLowerCase()) &&
				human.getGender().toLowerCase().equals("мужской");
	}
	
	public boolean equalsFullNameStepBrother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getFather().toLowerCase().equals(human.getFather().toLowerCase()) &&
				human.getGender().toLowerCase().equals("мужской")   ||
				getMother().equals(human.getFather().toLowerCase()) &&
				human.getGender().toLowerCase().equals("мужской");
	}
	
	public boolean equalsFullNameSister(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getFather().equals(human.getFather()) &&
				getMother().equals(human.getFather().toLowerCase()) &&
				human.getGender().equals("женский");
	}
	public boolean equalsFullNameStepSister(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getFather().equals(human.getFather())&&
				human.getGender().equals("женский") ||
				getMother().equals(human.getFather().toLowerCase()) &&
				human.getGender().equals("женский");
	}
	
	public boolean equalsFullNameFather(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getFather().toLowerCase().split("")[0].equals(human.getSecondName()) &&
				getFather().toLowerCase().split("")[1].equals(human.getFirstName());
	}
	
	public boolean equalsFullNameDauther(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getSecondName().equals(human.getFather().toLowerCase().split("")[0]) &&
				getFirstName().equals(human.getFather().toLowerCase().split("")[1]) &&
				human.getGender().toLowerCase().equals("женский");
	}
	public boolean equalsFullNameMother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return getMother().split("")[0].equals(human.getSecondName()) &&
				getMother().split("")[1].equals(human.getFirstName());
	}
	
}
