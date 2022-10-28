package project.school;
 
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Student {
 
	private int id;
	private String name;
	private Date birth;
	private Sector sector;
 
	private static int count;
 
	public Student(String name, Date birth, Sector sector) {
		this.id = ++count;
		this.name = name;
		this.birth = birth;
		this.sector = sector;
	}
 
	public Sector getSector() {
		return this.sector;
	}
 
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		return "Je suis l'etudiant " + this.name
				+ " ma date de naissance est : " + sdf.format(this.birth);
	}
 
}
