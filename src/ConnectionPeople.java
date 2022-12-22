import java.util.ArrayList;

public class ConnectionPeople {
	private ArrayList<FamilyTree> treeFamily;
	private BData family;
	
	public ConnectionPeople(ArrayList<FamilyTree> treeFamily, BData family) {
		this.treeFamily = treeFamily;
		this.family = family;
	}
	
	public ConnectionPeople() {
	}
	
	public ArrayList<FamilyTree> getTreeFamily() {
		return treeFamily;
	}
	
	public void setTreeFamily(ArrayList<FamilyTree> treeFamily) {
		this.treeFamily = treeFamily;
	}
	public void addTreeFamily(FamilyTree treeFamily) {
		this.treeFamily.add(treeFamily);
	}
	
	public BData getFamily() {
		return family;
	}
	
	public void setFamily(BData family) {
		this.family = family;
	}
	
	@Override
	public String toString() {
		return "ConnectionPeople{" +
				"treeFamily=" + treeFamily +
				", family=" + family +
				'}';
	}
}
