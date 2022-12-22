import java.util.ArrayList;
import java.util.Objects;

public class BData {
	private ArrayList<Human> humanFamilyCollection;
	
	public BData(ArrayList<Human> humanFamilyCollection) {
		this.humanFamilyCollection = humanFamilyCollection;
	}
	
	public BData() {
	}
	
	public ArrayList<Human> getHumanFamilyCollection() {
		return humanFamilyCollection;
	}
	
	public void setHumanFamilyCollection(ArrayList<Human> humanFamilyCollection) {
		this.humanFamilyCollection = humanFamilyCollection;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof BData bData)) return false;
		return getHumanFamilyCollection().equals(bData.getHumanFamilyCollection());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getHumanFamilyCollection());
	}
	
	@Override
	public String toString() {
		return "BData{" +
				"humanFamilyCollection=" + humanFamilyCollection +
				'}';
	}
	
	public ConnectionPeople findFamilyTree(){
		ConnectionPeople cp = new ConnectionPeople(new ArrayList<FamilyTree>(), this);
			for (Human human : this.getHumanFamilyCollection()) {
				FamilyTree familyTree = new FamilyTree();
				familyTree.setFullName(human);
				familyTree.fillFamilyTreeUser(this);
				cp.getTreeFamily().add(familyTree);
			}
			cp.setFamily(this);
			return cp;
		}
}

