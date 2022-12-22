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
	public Human(Human human){
		this.id = ++id;
		this.mother = human.getMother();
		this.father = human.getFather();
		this.firstName = human.getFirstName();
		this.secondName = human.getSecondName();
		this.age = human.getAge();
		this.gender = human.getGender();
	}
	
	public static int getId() {
		return id;
	}
	
	public String getMother() {
		return this.mother;
	}
	
	public void setMother(String mother) {
		this.mother = mother;
	}
	
	public String getFather() {
		return this.father;
	}
	
	public void setFather(String father) {
		this.father = father;
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
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
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
	
	public boolean equalsFullNameChildren(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[] father = human.getFather().toLowerCase().split(" ");
		return this.getSecondName().toLowerCase().equals(father[0]) &&
				this.getFirstName().toLowerCase().equals(father[1]);
	}
	
	public boolean equalsFullNameSon(Human o) {
		if (this == o) return true;
//		if (!(o instanceof  human)) return false;
		String[]fullName = ((Human)o).getFather().toLowerCase().split(" ");
		String secondName = this.getSecondName();
		return secondName.equals(fullName[0]) &&
				this.getFirstName().equals(fullName[1]) &&
				((Human)o).getGender().equals("мужской");
	}
	
	@Override
	public String toString() {
		return "Human{" +
				"mother='" + mother + '\'' +
				", father='" + father + '\'' +
				", firstName='" + firstName + '\'' +
				", secondName='" + secondName + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				'}';
	}
	
	public boolean equalsFullNameBrother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getFather().equals(human.getFather()) &&
				this.getMother().equals(human.getMother()) &&
				human.getGender().equals("мужской");
	}
	
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
	
	public boolean equalsFullNameSister(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		return this.getFather().equals(human.getFather()) &&
				this.getMother().equals(human.getMother()) &&
				human.getGender().equals("женский");
	}
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
	
	public boolean equalsFullNameFather(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullName = this.getFather().toLowerCase().split(" ");
		return fullName[0].equals(human.getSecondName().toLowerCase()) &&
				fullName[1].equals(human.getFirstName().toLowerCase());
	}
	
	public boolean equalsFullNameDauther(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullNameFather = human.getFather().toLowerCase().split(" ");
		return this.getSecondName().toLowerCase().equals(fullNameFather[0]) &&
				this.getFirstName().toLowerCase().equals(fullNameFather[1]) &&
				human.getGender().equals("женский");
	}
	public boolean equalsFullNameMother(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human human)) return false;
		String[]fullNameMother = this.getMother().toLowerCase().split(" ");
		return fullNameMother[0].equals(human.getSecondName().toLowerCase()) &&
				fullNameMother[1].equals(human.getFirstName().toLowerCase());
	}
	
//	public boolean isNotNullHuman(){
//		if (getMother().equals(null)
//				&& getFather().equals(null)
//				&& getFirstName().equals(null)
//				&& getSecondName().equals(null)
//				&& getGender().equals(null) ){
//			return false;
//		} else return true;
//	}
}
