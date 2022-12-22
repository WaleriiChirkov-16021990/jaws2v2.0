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
	
	public void fillFamilyTreeUser(BData base) {
		Relationship relationship = new Relationship();
		
		for (Human hum :
				base.getHumanFamilyCollection()) {
			if (this.getFullName().equals(hum)) continue;
			if (this.getFullName().equalsFullNameFather(hum)) {
				this.tree.put(relationship.getFATHER(), hum);
				for (Human bases : base.getHumanFamilyCollection()) {
					if (hum.equalsFullNameFather(bases) && !(hum.equals(bases))) {
						this.tree.put(relationship.getGRANDFATHER(), bases);
						for (Human great_fthr: base.getHumanFamilyCollection()) {
							if (bases.equalsFullNameFather(great_fthr) && !(bases.equals(great_fthr))) {
								this.tree.put(relationship.getGREAT_GRANDFATHER(), great_fthr);
							}
						}
					}
					if (hum.equalsFullNameMother(bases) && !(bases.equals(hum))){
						this.tree.put(relationship.getGRANDMOTHER(), bases);
						for (Human great_fthr: base.getHumanFamilyCollection()) {
							if (bases.equalsFullNameMother(great_fthr) && !(bases.equals(great_fthr))) {
								this.tree.put(relationship.getGREAT_GRANDMOTHER(), great_fthr);
							}
						}
					}
				}
			} else {
				if (!this.tree.containsKey(relationship.getFATHER())) {
					Human unknown1 = new Human("unknown", "unknown", this.getFullName().getFather().split(" ")[1], this.getFullName().getFather().split(" ")[0], 0, "мужской");
					this.tree.put(relationship.getFATHER(), unknown1);
				}
			}
			if (this.getFullName().equalsFullNameMother(hum)) {
				this.tree.put(relationship.getMOTHER(), hum);
				for (Human j : base.getHumanFamilyCollection()) {
					if (!(hum.equals(j)) && hum.equalsFullNameFather(j)) {
						this.tree.put(relationship.getGRANDFATHER() + "2", j);
					}
					if (hum.equalsFullNameMother(j) && !(hum.equals(j)) ) {
						this.tree.put(relationship.getGRANDMOTHER() + "2", j);
					}
				}
			} else {
				if (!this.tree.containsKey(relationship.getMOTHER())) {
					Human unknown2 = new Human("unknown", "unknown", this.getFullName().getMother().split(" ")[1], this.getFullName().getMother().split(" ")[0], 0, "женский");
					this.tree.put(relationship.getMOTHER(), unknown2);
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
	}
	
	public void printer (){
		tree.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		});
	}
	
}
