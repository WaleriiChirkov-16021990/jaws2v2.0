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
		
		for (Human hum :
				base) {
			if (this.getFullName().equals(hum)) continue;
			if (this.getFullName().equalsFullNameFather(hum)) {
				this.tree.put(relationship.getFATHER(), hum);
				for (Human bases : base) {
					if (hum.equalsFullNameFather(bases) && !(hum.equals(bases))) {
						this.tree.put(relationship.getGRANDFATHER(), bases);
						for (Human great_fthr: base) {
							if (bases.equalsFullNameFather(great_fthr) && !(bases.equals(great_fthr))) {
								this.tree.put(relationship.getGREAT_GRANDFATHER(), great_fthr);
							}
						}
					}
				}
			} else {
				Human unknown1 = new Human("unknown", "unknown",this.getFullName().getFather().split(" ")[1], this.getFullName().getFather().split(" ")[0], 0, "мужской");
				this.tree.put(relationship.getFATHER(), unknown1);
			}
			if (this.getFullName().equalsFullNameMother(hum)) {
				this.tree.put(relationship.getMOTHER(), hum);
				for (Human j : base) {
					if (!(hum.equals(j)) && hum.equalsFullNameFather(j)) {
						this.tree.put(relationship.getGRANDFATHER() + "2", j);
					}
				if (hum.equalsFullNameMother(j) && !(hum.equals(j)) ) {
						this.tree.put(relationship.getGRANDMOTHER(), j);
					}
				}
			} else {
				Human unknown2 = new Human("unknown", "unknown",this.getFullName().getMother().split(" ")[1], this.getFullName().getMother().split(" ")[0], 0, "женский");
				this.tree.put(relationship.getMOTHER(), unknown2);
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
					for (Human children: base) {
						if (hum.equalsFullNameChildren(children)) {
							if (children.getGender().equals("женский")) {
								this.tree.put(relationship.getGRANDDAUGHTER(), children);
//								for (Human grandChildren: base
//								) {
//									if (children.equalsFullNameChildren(grandChildren) && !(children.equals(grandChildren))) {
//										if (grandChildren.getGender().equals("женский")) {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//
//										} else {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//										}
//									}
//								}
							} else {
								this.tree.put(relationship.getGRANDSON(), children);
//								for (Human grandChildren: base
//								) {
//									if (children.equalsFullNameChildren(grandChildren) && !(children.equals(grandChildren))) {
//										if (grandChildren.getGender().equals("женский")) {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//
//										} else {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//										}
//									}
//								}
							}
						}
					}
					
				} else {
					this.tree.put(relationship.getSON(), hum);
					for (Human children: base
					) {
						if (hum.equalsFullNameChildren(children)) {
							if (children.getGender().equals("женский")) {
								this.tree.put(relationship.getGRANDDAUGHTER(), children);
//								for (Human grandChildren: base
//								) {
//									if (children.equalsFullNameChildren(grandChildren) && !(children.equals(grandChildren))) {
//										if (grandChildren.getGender().equals("мужской")) {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//
//										} else {
//											this.tree.put(relationship.getGREAT_GRANDDAUGHTER(), grandChildren);
//										}
//									}
//								}
							} else {
								this.tree.put(relationship.getGRANDSON(), children);
//								for (Human grandChildren: base
//								) {
//									if (children.equalsFullNameChildren(grandChildren) && !(children.equals(grandChildren))) {
//										if (children.getGender().equals("женский")) {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//
//										} else {
//											this.tree.put(relationship.getGREAT_GRANDSON(), grandChildren);
//										}
//									}
//								}
							}
						}
					}
				}
			}
		}
	}
	
	public void printer (){
		tree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
	}
	
}
