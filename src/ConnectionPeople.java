import java.util.ArrayList;

public class ConnectionPeople {
	ArrayList<Relationship> treeFamily;
	ArrayList<Human> family;
	
	public ConnectionPeople(ArrayList<Relationship> treeFamily, ArrayList<Human> family) {
		this.treeFamily = treeFamily;
		this.family = family;
	}
	
	public ConnectionPeople() {
	}
	
	public ArrayList<Relationship> getTreeFamily() {
		return treeFamily;
	}
	
	public void setTreeFamily(ArrayList<Relationship> treeFamily) {
		this.treeFamily = treeFamily;
	}
	
	public ArrayList<Human> getFamily() {
		return family;
	}
	
	public void setFamily(ArrayList<Human> family) {
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
