package project.school;
 
public class Sector {
 
	private int id;
	private String code;
	private String label;
 
	private static int count;
 
	public Sector(String code, String label) {
		this.id = ++count;
		this.code = code;
		this.label = label;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public String getCode() {
		return code;
	}
 
	public void setCode(String code) {
		this.code = code;
	}
 
	public String getLabel() {
		return label;
	}
 
	public void setLabel(String label) {
		this.label = label;
	}
 
	public String toString() {
		return "\tFiliere : " + this.label;
	}
 
}
