import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FamilyTree {
	private Map<String,Human> tree;
	private Human fullName;
	
	public FamilyTree(Map<String, Human> tree, Human fullName) {
		this.tree = tree;
		this.fullName = fullName;
	}
	
	public FamilyTree() {
		this.tree = new HashMap<>();
	}
	
	public Map<String, Human> getTree() {
		return tree;
	}
	
	public void setTree(Map<String, Human> tree) {
		this.tree = tree;
	}
	
	public Human getFullName() {
		return fullName;
	}
	
	public void setFullName(Human fullName) {
		this.fullName = fullName;
	}
	
	public void fillFamilyTreeUser(ArrayList<Human> base) {
		Relationship relationship = new Relationship();
		Human father = new Human();
		Human mother = new Human();
		Human son = new Human();
		Human daughter = new Human();
		
		for (Human hum :
				base) {
			if (this.getFullName().equalsFullNameFather(hum)) {
				this.tree.put(relationship.getFATHER(), hum);
				father = hum;
			} else if (this.getFullName().equalsFullNameMother(hum)) {
				this.tree.put(relationship.getMOTHER(), hum);
				mother = hum;
			} else if (this.getFullName().equalsFullNameBrother(hum)) {
				this.tree.put(relationship.getBROTHER(), hum);
			} else if (this.getFullName().equalsFullNameStepBrother(hum)) {
				this.tree.put(relationship.getSTEPBROTHER(), hum);
			} else if (this.getFullName().equalsFullNameSister(hum)) {
				this.tree.put(relationship.getSISTER(), hum);
			} else if (this.getFullName().equalsFullNameStepSister(hum)) {
				this.tree.put(relationship.getSTEPSISTER(), hum);
			} else if (this.getFullName().equalsFullNameChildren(hum)) {
				if (hum.getGender().toLowerCase().equals("женский")) {
					this.tree.put(relationship.getDAUGHTER(), hum);
					daughter = hum;
				} else {
					this.tree.put(relationship.getSON(), hum);
					son = hum;
				}
			}
			
		}
		
//		if (father.hashCode() != new Human().hashCode() && ) {
			for (Human h : base
			) {
				if (father.equalsFullNameFather(h)) {
					this.tree.put(relationship.getGRANDFATHER(), h);
				} else if (mother.equalsFullNameMother(h)) {
					this.tree.put(relationship.getGRANDMOTHER(), h);
				}
			}
//		}
//		if (father.hashCode() != new Human().hashCode()) {
			for (Human h : base
			) {
				if (son.equalsFullNameSon(h)) {
					this.tree.put(relationship.getGRANDSON(), h);
				} else if (mother.equalsFullNameDauther(h)) {
					this.tree.put(relationship.getGRANDDAUGHTER(), h);
				}
			}
//		}
		
	}
	
	public void printer (){
//		for (:
//		     ) {
//
//		}
		tree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " " + entry.getValue());
		});
	}
	
}
