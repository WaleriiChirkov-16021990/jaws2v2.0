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
//		Human father = null;
//		Human mother = null;
//		Human son  = null;
//		Human daughter = null;
		
		for (Human hum :
				base) {
			if (this.getFullName().equals(hum)) continue;
			if (this.getFullName().equalsFullNameFather(hum)) {
				this.tree.put(relationship.getFATHER(), hum);
				for (Human bases : base) {
					if (hum.equalsFullNameFather(bases)) {
						this.tree.put(relationship.getGRANDFATHER(), bases);
					}
				}
			}
			if (this.getFullName().equalsFullNameMother(hum)) {
				this.tree.put(relationship.getMOTHER(), hum);
				for (Human j : base) {
//					if (hum.isNotNullHuman() && hum.equalsFullNameFather(h)) {
//						this.tree.put(relationship.getGRANDFATHER() + "2", h);
//					}
				if (hum.equalsFullNameMother(j)) {
						this.tree.put(relationship.getGRANDMOTHER(), j);
					}
				}
			}
			if (this.getFullName().equalsFullNameBrother(hum)) {
				this.tree.put(relationship.getBROTHER(), hum);
			}
			if (this.getFullName().equalsFullNameStepBrother(hum)) {
				this.tree.put(relationship.getSTEPBROTHER(), hum);
			}
			if (this.getFullName().equalsFullNameSister(hum)) {
				this.tree.put(relationship.getSISTER(), hum);
			}
			if (this.getFullName().equalsFullNameStepSister(hum)) {
				this.tree.put(relationship.getSTEPSISTER(), hum);
			}
			if (this.getFullName().equalsFullNameChildren(hum)) {
				if (hum.getGender().equals("женский")) {
					this.tree.put(relationship.getDAUGHTER(), hum);
				} else {
					this.tree.put(relationship.getSON(), hum);
				}
			}
			
		}
			
//			for (Human h : base) {
//				if (son.isNotNullHuman() && son.equalsFullNameSon(h)) {
//					this.tree.put(relationship.getGRANDSON(), h);
//				} else if (daughter.isNotNullHuman() && daughter.equalsFullNameDauther(h)) {
//					this.tree.put(relationship.getGRANDDAUGHTER(), h);
//				}
//			}
	}
	
	public void printer (){
		tree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
	}
	
}
